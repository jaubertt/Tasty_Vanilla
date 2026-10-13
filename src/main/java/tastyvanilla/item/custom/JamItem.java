package tastyvanilla.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.EffectCures;
import tastyvanilla.item.ModItems;

//JAMS AND MASHES ARE DRUNK LIKE THE VANILLA HONEY BOTTLE: THEY CURE POISON AND GIVE THE GLASS JAR BACK
public class JamItem extends Item {
    private static final int MAX_USE_TIME = 40;

    public JamItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        super.finishUsingItem(stack, level, user);
        if (user instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (!level.isClientSide) {
            user.removeEffectsCuredBy(EffectCures.HONEY);
        }

        if (stack.isEmpty()) {
            return new ItemStack(ModItems.GLASS_JAR);
        } else {
            if (user instanceof Player player && !player.hasInfiniteMaterials()) {
                ItemStack itemStack = new ItemStack(ModItems.GLASS_JAR);
                if (!player.getInventory().add(itemStack)) {
                    player.drop(itemStack, false);
                }
            }

            return stack;
        }
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity user) {
        return MAX_USE_TIME;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.HONEY_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.HONEY_DRINK;
    }
}
