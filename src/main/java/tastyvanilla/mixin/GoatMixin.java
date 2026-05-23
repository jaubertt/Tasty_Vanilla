package tastyvanilla.mixin;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import tastyvanilla.item.ModItems;

@Mixin(Goat.class)
public abstract class GoatMixin extends Animal {

    protected GoatMixin(net.minecraft.world.entity.EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }

    @Override
    public InteractionResult mobInteract(final Player player, final InteractionHand hand) {
        net.minecraft.world.item.ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.BUCKET) && !this.isBaby()) {
            player.playSound(SoundEvents.COW_MILK, 1.0F, 1.0F);
            net.minecraft.world.item.ItemStack bucketOrMilkBucket = ItemUtils.createFilledResult(itemStack, player, ModItems.GOAT_MILK_BUCKET.getDefaultInstance());
            player.setItemInHand(hand, bucketOrMilkBucket);
            return InteractionResult.SUCCESS;
        } else {
            return super.mobInteract(player, hand);
        }
    }
}
