//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import tastyvanilla.item.ModItems;

public class BlackberryBushBlock extends SweetBerryBushBlock {

    public BlackberryBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.BERRY_BLACKBERRIES);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        int i = (Integer)state.getValue(AGE);
        boolean bl = i == 3;
        if (i > 1) {
            int j = 1 + level.random.nextInt(2);
            popResource(level, pos, new ItemStack(ModItems.BERRY_BLACKBERRIES, j + (bl ? 1 : 0)));
            level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES,
                    SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
            BlockState blockState = state.setValue(AGE, 1);
            level.setBlock(pos, blockState, Block.UPDATE_CLIENTS);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockState));
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return super.useWithoutItem(state, level, pos, player, hit);
        }
    }


    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE) {
            entity.makeStuckInBlock(state, new Vec3((double)0.8F, (double)0.75F, (double)0.8F));
            //HURTS ENTITIES THAT MOVE THROUGH IT, LIKE THE VANILLA SWEET BERRY BUSH
            if (!level.isClientSide && (Integer)state.getValue(AGE) > 0 && (entity.xOld != entity.getX() || entity.zOld != entity.getZ())) {
                double d = Math.abs(entity.getX() - entity.xOld);
                double e = Math.abs(entity.getZ() - entity.zOld);
                if (d >= (double)0.003F || e >= (double)0.003F) {
                    entity.hurt(level.damageSources().sweetBerryBush(), 1.0F);
                }
            }
        }
    }

    //MOBS AVOID THE BUSH, LIKE THE VANILLA SWEET BERRY BUSH
    @Override
    public PathType getBlockPathType(BlockState state, BlockGetter level, BlockPos pos, Mob mob) {
        return PathType.DAMAGE_OTHER;
    }

    //CATCHES FIRE AND BURNS LIKE THE VANILLA SWEET BERRY BUSH (60, 100)
    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 60;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 100;
    }
}
