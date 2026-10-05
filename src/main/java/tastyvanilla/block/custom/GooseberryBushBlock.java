//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import tastyvanilla.item.ModItems;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.pathfinder.PathType;

public class GooseberryBushBlock extends SweetBerryBushBlock {

    public GooseberryBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state, boolean includeData) {
        return new ItemStack(ModItems.BERRY_GOOSEBERRIES);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        int age = state.getValue(AGE);
        boolean isMaxAge = age == 3;
        if (age > 1) {
            int randomDropAmount = 1 + level.getRandom().nextInt(2);
            Block.popResource(level, pos, new ItemStack(ModItems.BERRY_GOOSEBERRIES, randomDropAmount + (isMaxAge ? 1 : 0)));
            level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES,
                    SoundSource.BLOCKS, 1.0F, 0.8F + level.getRandom().nextFloat() * 0.4F);
            BlockState blockState = state.setValue(AGE, Integer.valueOf(1));
            level.setBlock(pos, blockState, Block.UPDATE_CLIENTS);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockState));
            return InteractionResult.SUCCESS;
        } else {
            return super.useWithoutItem(state, level, pos, player, hit);
        }
    }
    @Override
    protected void entityInside(
            final BlockState state, final Level level, final BlockPos pos, final Entity entity, final InsideBlockEffectApplier effectApplier, final boolean isPrecise
    ) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE) {
            entity.makeStuckInBlock(state, new Vec3(0.8F, 0.75, 0.8F));
            if (level instanceof ServerLevel serverLevel && (Integer)state.getValue(AGE) != 0) {
                Vec3 movement = entity.isClientAuthoritative() ? entity.getKnownMovement() : entity.oldPosition().subtract(entity.position());
                if (movement.horizontalDistanceSqr() > 0.0) {
                    double xs = Math.abs(movement.x());
                    double zs = Math.abs(movement.z());
                    if (xs >= 0.003F || zs >= 0.003F) {
                        entity.hurtServer(serverLevel, level.damageSources().sweetBerryBush(), 1.0F);
                    }
                }
            }
        }
    }

    // NeoForge: mobs path around the bush like around vanilla's sweet berry bush
    // (the Fabric branch registers this in ModBlocks with LandPathNodeTypesRegistry, as PathNodeType.DAMAGE_OTHER).
    @Override
    public PathType getBlockPathType(BlockState state, BlockGetter level, BlockPos pos, Mob mob) {
        return PathType.DAMAGE_OTHER;
    }

    // NeoForge: the bush catches fire and burns like vanilla's sweet berry bush, ignite odds 60 and burn odds 100
    // (the Fabric branch registers this in ModBlocks with FlammableBlockRegistry.add(bush, 60, 100)).
    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 60;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 100;
    }
}
