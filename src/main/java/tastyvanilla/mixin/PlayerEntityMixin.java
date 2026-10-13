package tastyvanilla.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    //BOWL FOODS STACK TO 16: IF THE EMPTY BOWL DOESN'T FIT IN THE INVENTORY, IT IS DROPPED INSTEAD OF LOST
    @WrapOperation(method = "eatFood", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerInventory;insertStack(Lnet/minecraft/item/ItemStack;)Z"))
    private boolean dropBowlIfInventoryIsFull(PlayerInventory inventory, ItemStack stack, Operation<Boolean> original) {
        boolean inserted = original.call(inventory, stack);
        if (!inserted) {
            ((PlayerEntity) (Object) this).dropItem(stack, false);
        }
        return inserted;
    }
}
