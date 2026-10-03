package tastyvanilla.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

// CORN: A 2 BLOCK TALL CROP PLANTED ON FARMLAND (ALL 4 COLORS USE THIS CLASS)
// AGE 0 TO 7 LIKE WHEAT. FROM AGE 4 A TOP HALF GROWS ABOVE IT AND COPIES THE BOTTOM'S AGE.
// ONLY THE BOTTOM HALF TICKS AND HOLDS THE LOOT. BREAKING EITHER HALF BREAKS THE WHOLE PLANT.
public class CornCropBlock extends CropBlock {

    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    public static final int FIRST_TALL_AGE = 4;

    private static final VoxelShape[] LOWER_SHAPES = Block.boxes(7, age -> Block.column(16.0, 0.0, age >= FIRST_TALL_AGE ? 16 : 2 + age * 2));
    private static final VoxelShape[] UPPER_SHAPES = Block.boxes(7, age -> Block.column(16.0, 0.0, Math.max(2, (age - 3) * 4)));

    private final Supplier<ItemLike> seed;

    public CornCropBlock(Properties properties, Supplier<ItemLike> seed) {
        super(properties);
        this.seed = seed;
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0).setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return seed.get();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE, HALF);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return isUpper(state) ? UPPER_SHAPES[getAge(state)] : LOWER_SHAPES[getAge(state)];
    }

    //GROWTH (BOTTOM HALF ONLY)

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return !isUpper(state) && !isMaxAge(state);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.getRawBrightness(pos, 0) >= 9 && !isMaxAge(state)) {
            float growthSpeed = getGrowthSpeed(this, level, pos);
            if (random.nextInt((int) (25.0F / growthSpeed) + 1) == 0) {
                growTo(level, pos, state, getAge(state) + 1);
            }
        }
    }

    @Override
    public void growCrops(Level level, BlockPos pos, BlockState state) {
        BlockPos lowerPos = isUpper(state) ? pos.below() : pos;
        BlockState lowerState = level.getBlockState(lowerPos);
        if (isLower(lowerState)) {
            growTo(level, lowerPos, lowerState, getAge(lowerState) + getBonemealAgeIncrease(level));
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        BlockPos lowerPos = isUpper(state) ? pos.below() : pos;
        BlockState lowerState = level.getBlockState(lowerPos);
        return isLower(lowerState) && !isMaxAge(lowerState)
                && (getAge(lowerState) + 1 < FIRST_TALL_AGE || hasRoomForTop(level, lowerPos));
    }

    // RAISES THE BOTTOM HALF TO newAge AND KEEPS THE TOP HALF IN STEP.
    // WITHOUT ROOM ABOVE, THE PLANT STOPS AT AGE 3 UNTIL THE SPACE IS FREE.
    private void growTo(Level level, BlockPos lowerPos, BlockState lowerState, int newAge) {
        int age = Math.min(newAge, getMaxAge());
        if (age >= FIRST_TALL_AGE && !hasRoomForTop(level, lowerPos)) {
            age = FIRST_TALL_AGE - 1;
        }
        if (age <= getAge(lowerState)) {
            return;
        }
        BlockState newLower = lowerState.setValue(AGE, age);
        level.setBlock(lowerPos, newLower, Block.UPDATE_CLIENTS);
        syncTop(level, lowerPos, newLower);
    }

    private boolean hasRoomForTop(LevelReader level, BlockPos lowerPos) {
        BlockPos abovePos = lowerPos.above();
        BlockState above = level.getBlockState(abovePos);
        return level.isInsideBuildHeight(abovePos) && (above.isAir() || (above.is(this) && isUpper(above)));
    }

    // ADDS, UPDATES OR REMOVES THE TOP HALF SO IT MATCHES THE BOTTOM HALF
    private void syncTop(Level level, BlockPos lowerPos, BlockState lowerState) {
        BlockPos abovePos = lowerPos.above();
        BlockState above = level.getBlockState(abovePos);
        boolean hasTop = above.is(this) && isUpper(above);
        if (getAge(lowerState) >= FIRST_TALL_AGE) {
            BlockState top = lowerState.setValue(HALF, DoubleBlockHalf.UPPER);
            if (hasTop ? above != top : (above.isAir() && level.isInsideBuildHeight(abovePos))) {
                level.setBlock(abovePos, top, Block.UPDATE_ALL);
            }
        } else if (hasTop) {
            level.setBlock(abovePos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL | Block.UPDATE_SUPPRESS_DROPS);
        }
    }

    // BEES AND SOME HARVEST MODS GROW CROPS WITH getStateForAge, WHICH ALWAYS GIVES A BOTTOM HALF.
    // THIS PUTS THE PLANT BACK TOGETHER WHEN THAT HAPPENS.
    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        if (level.isClientSide() || isUpper(state)) {
            return;
        }
        BlockPos belowPos = pos.below();
        BlockState below = level.getBlockState(belowPos);
        if (isLower(below)) {
            // A BOTTOM HALF WAS WRITTEN WHERE THE TOP HALF BELONGS
            int age = Math.min(getMaxAge(), Math.max(getAge(state), getAge(below)));
            level.setBlock(pos, below.setValue(AGE, age).setValue(HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS | Block.UPDATE_KNOWN_SHAPE);
            level.setBlock(belowPos, below.setValue(AGE, age), Block.UPDATE_CLIENTS);
        } else if (getAge(state) >= FIRST_TALL_AGE && !hasRoomForTop(level, pos)) {
            // TOO TALL WITH NO ROOM FOR A TOP HALF: BACK TO AGE 3, LIKE NORMAL GROWTH
            level.setBlock(pos, state.setValue(AGE, FIRST_TALL_AGE - 1), Block.UPDATE_CLIENTS | Block.UPDATE_KNOWN_SHAPE);
        } else {
            syncTop(level, pos, state);
        }
    }

    //SURVIVAL

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if (isUpper(state)) {
            return isLower(level.getBlockState(pos.below()));
        }
        return super.canSurvive(state, level, pos);
    }

    @Override
    protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess ticks, BlockPos pos,
                                     Direction directionToNeighbour, BlockPos neighbourPos, BlockState neighbourState, RandomSource random) {
        if (isUpper(state)) {
            return canSurvive(state, level, pos) ? state : Blocks.AIR.defaultBlockState();
        }
        // A TALL BOTTOM HALF BREAKS WHEN ITS TOP HALF IS GONE
        if (directionToNeighbour == Direction.UP && getAge(state) >= FIRST_TALL_AGE
                && !(neighbourState.is(this) && isUpper(neighbourState))) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, level, ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random);
    }

    // BREAKING THE TOP HALF DROPS THE BOTTOM HALF'S LOOT (WITH THE PLAYER'S TOOL) AND REMOVES IT.
    // IN CREATIVE THE BOTTOM HALF IS REMOVED WITHOUT DROPS, LIKE VANILLA TALL PLANTS.
    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide() && isUpper(state)) {
            BlockPos lowerPos = pos.below();
            BlockState lowerState = level.getBlockState(lowerPos);
            if (isLower(lowerState)) {
                if (!player.preventsBlockDrops()) {
                    dropResources(lowerState, level, lowerPos, null, player, player.getMainHandItem());
                }
                // UPDATE_KNOWN_SHAPE KEEPS THE TOP HALF IN PLACE SO THE NORMAL BREAK (STATS, HUNGER) STILL HAPPENS
                level.setBlock(lowerPos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL | Block.UPDATE_KNOWN_SHAPE | Block.UPDATE_SUPPRESS_DROPS);
                level.levelEvent(player, 2001, lowerPos, Block.getId(lowerState));
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    //HELPERS

    private static boolean isUpper(BlockState state) {
        return state.getValue(HALF) == DoubleBlockHalf.UPPER;
    }

    private boolean isLower(BlockState state) {
        return state.is(this) && state.getValue(HALF) == DoubleBlockHalf.LOWER;
    }
}
