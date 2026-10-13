package tastyvanilla.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

//RAW DOUGH: USED LIKE A DRINK FOR 2 SECONDS, WITH THE EATING SOUND
public class DoughItem extends Item {
    private static final int MAX_USE_TIME = 40;

    public DoughItem(Item.Properties properties) {
        super(properties);
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
        return SoundEvents.GENERIC_EAT;
    }
}
