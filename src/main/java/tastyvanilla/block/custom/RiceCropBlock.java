package tastyvanilla.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

import java.util.function.Supplier;

// RICE: A WATER CROP (RICE, WILD RICE AND BLACK RICE USE THIS CLASS)
// PLANTED IN WATER EXACTLY 1 BLOCK DEEP. THE BOTTOM HALF IS UNDERWATER (AGE 0 TO 3, IT HOLDS ITS OWN WATER LIKE SEAGRASS).
// AT AGE 3 IT GROWS A TOP HALF ABOVE THE WATER (AGE 0 TO 6). BREAKING THE TOP LEAVES THE BOTTOM, WHICH GROWS A NEW TOP.
// BREAKING THE BOTTOM GIVES BACK THE WATER.
public class RiceCropBlock extends CropBlock implements LiquidBlockContainer {

    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    public static final int MAX_LOWER_AGE = 3;
    public static final int MAX_UPPER_AGE = 6;

    private static final VoxelShape[] LOWER_SHAPES = Block.boxes(MAX_LOWER_AGE, age -> Block.column(14.0, 0.0, 4 + age * 4));
    private static final VoxelShape[] UPPER_SHAPES = Block.boxes(MAX_UPPER_AGE, age -> Block.column(14.0, 0.0, 2 + age * 2));

    private final Supplier<ItemLike> seed;
    private final boolean growsOnRiverbeds;

    // growsOnRiverbeds: ALSO SURVIVES ON SAND, GRAVEL AND CLAY (FOR WILD RICE, WHICH SPAWNS IN RIVERS AND SWAMPS)
    public RiceCropBlock(Properties properties, Supplier<ItemLike> seed, boolean growsOnRiverbeds) {
        super(properties);
        this.seed = seed;
        this.growsOnRiverbeds = growsOnRiverbeds;
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0).setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return seed.get();
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_UPPER_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE, HALF);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return isUpper(state) ? UPPER_SHAPES[getAge(state)] : LOWER_SHAPES[Math.min(getAge(state), MAX_LOWER_AGE)];
    }

    //WATER

    @Override
    protected FluidState getFluidState(BlockState state) {
        return isUpper(state) ? Fluids.EMPTY.defaultFluidState() : Fluids.WATER.getSource(false);
    }

    // THE BOTTOM HALF IS ALREADY WATER. THE TOP HALF IS WASHED AWAY BY FLOWING WATER OR A BUCKET, LIKE OTHER CROPS
    @Override
    public boolean canPlaceLiquid(@Nullable LivingEntity user, BlockGetter level, BlockPos pos, BlockState state, Fluid type) {
        return isUpper(state);
    }

    @Override
    public boolean placeLiquid(LevelAccessor level, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!isUpper(state)) {
            return false;
        }
        Block.dropResources(state, level, pos, null);
        level.setBlock(pos, fluidState.createLegacyBlock(), Block.UPDATE_ALL);
        return true;
    }

    //PLACING AND SURVIVAL

    // PLANTED INTO A STILL WATER BLOCK WITH AIR ABOVE IT
    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        FluidState fluid = context.getLevel().getFluidState(pos);
        boolean stillWater = fluid.is(FluidTags.WATER) && fluid.isSource();
        return stillWater && context.getLevel().getBlockState(pos.above()).isAir() ? this.defaultBlockState() : null;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        if (state.is(BlockTags.DIRT) || state.is(Blocks.FARMLAND)) {
            return true;
        }
        return growsOnRiverbeds && (state.is(BlockTags.SAND) || state.is(Blocks.GRAVEL) || state.is(Blocks.CLAY));
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if (isUpper(state)) {
            return isLower(level.getBlockState(pos.below()));
        }
        // WATER EXACTLY 1 BLOCK DEEP: NO WATER ABOVE THE BOTTOM HALF
        return !level.getFluidState(pos.above()).is(FluidTags.WATER) && super.canSurvive(state, level, pos);
    }

    @Override
    protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess ticks, BlockPos pos,
                                     Direction directionToNeighbour, BlockPos neighbourPos, BlockState neighbourState, RandomSource random) {
        if (isUpper(state)) {
            return canSurvive(state, level, pos) ? state : Blocks.AIR.defaultBlockState();
        }
        // WHEN THE BOTTOM HALF BREAKS, ITS WATER STAYS (LIKE SEAGRASS)
        BlockState result = super.updateShape(state, level, ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random);
        if (!result.isAir()) {
            ticks.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return result;
    }

    // IN CREATIVE, BREAKING THE BOTTOM HALF REMOVES THE TOP HALF WITHOUT DROPS
    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide() && !isUpper(state) && player.preventsBlockDrops()) {
            BlockPos abovePos = pos.above();
            if (isUpperOf(level.getBlockState(abovePos))) {
                level.setBlock(abovePos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL | Block.UPDATE_SUPPRESS_DROPS);
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    //GROWTH

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        // THE BOTTOM HALF ALWAYS TICKS, SO IT CAN GROW A NEW TOP AFTER A HARVEST
        return !isUpper(state) || getAge(state) < MAX_UPPER_AGE;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockPos lowerPos = isUpper(state) ? pos.below() : pos;
        if (!isLower(level.getBlockState(lowerPos)) || level.getRawBrightness(lowerPos.above(), 0) < 9) {
            return;
        }
        // STANDING IN WATER COUNTS AS WATERED FARMLAND
        float growthSpeed = Math.max(4.0F, getGrowthSpeed(this, level, lowerPos));
        if (random.nextInt((int) (25.0F / growthSpeed) + 1) == 0) {
            if (isUpper(state) || !isUpperOf(level.getBlockState(pos.above()))) {
                growOneStage(level, lowerPos);
            }
        }
    }

    @Override
    public void growCrops(Level level, BlockPos pos, BlockState state) {
        BlockPos lowerPos = isUpper(state) ? pos.below() : pos;
        int stages = getBonemealAgeIncrease(level);
        for (int i = 0; i < stages; i++) {
            if (!growOneStage(level, lowerPos)) {
                break;
            }
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        BlockPos lowerPos = isUpper(state) ? pos.below() : pos;
        BlockState lowerState = level.getBlockState(lowerPos);
        if (!isLower(lowerState)) {
            return false;
        }
        if (getAge(lowerState) < MAX_LOWER_AGE) {
            return true;
        }
        BlockPos topPos = lowerPos.above();
        BlockState top = level.getBlockState(topPos);
        return isUpperOf(top) ? getAge(top) < MAX_UPPER_AGE : top.isAir() && level.isInsideBuildHeight(topPos);
    }

    // ONE STEP: BOTTOM AGE UP TO 3, THEN A NEW TOP, THEN TOP AGE UP TO 6. RETURNS FALSE WHEN NOTHING CAN GROW.
    private boolean growOneStage(Level level, BlockPos lowerPos) {
        BlockState lowerState = level.getBlockState(lowerPos);
        if (!isLower(lowerState)) {
            return false;
        }
        int lowerAge = getAge(lowerState);
        if (lowerAge < MAX_LOWER_AGE) {
            level.setBlock(lowerPos, lowerState.setValue(AGE, lowerAge + 1), Block.UPDATE_CLIENTS);
            return true;
        }
        BlockPos topPos = lowerPos.above();
        BlockState top = level.getBlockState(topPos);
        if (isUpperOf(top)) {
            if (getAge(top) < MAX_UPPER_AGE) {
                level.setBlock(topPos, top.setValue(AGE, getAge(top) + 1), Block.UPDATE_CLIENTS);
                return true;
            }
            return false;
        }
        if (top.isAir() && level.isInsideBuildHeight(topPos)) {
            level.setBlock(topPos, this.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER), Block.UPDATE_ALL);
            return true;
        }
        return false;
    }

    // BEES AND SOME HARVEST MODS GROW CROPS WITH getStateForAge, WHICH ALWAYS GIVES A BOTTOM HALF.
    // THIS PUTS THE PLANT BACK TOGETHER WHEN THAT HAPPENS.
    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        if (level.isClientSide() || isUpper(state)) {
            return;
        }
        if (isLower(level.getBlockState(pos.below()))) {
            // A BOTTOM HALF WAS WRITTEN WHERE THE TOP HALF BELONGS
            level.setBlock(pos, state.setValue(HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS | Block.UPDATE_KNOWN_SHAPE);
        } else if (getAge(state) > MAX_LOWER_AGE) {
            level.setBlock(pos, state.setValue(AGE, MAX_LOWER_AGE), Block.UPDATE_CLIENTS | Block.UPDATE_KNOWN_SHAPE);
        }
    }

    //HELPERS

    private static boolean isUpper(BlockState state) {
        return state.getValue(HALF) == DoubleBlockHalf.UPPER;
    }

    private boolean isLower(BlockState state) {
        return state.is(this) && state.getValue(HALF) == DoubleBlockHalf.LOWER;
    }

    private boolean isUpperOf(BlockState state) {
        return state.is(this) && state.getValue(HALF) == DoubleBlockHalf.UPPER;
    }
}
