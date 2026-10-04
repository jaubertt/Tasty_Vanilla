package tastyvanilla.mixin;

import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

// Opens Villager.FOOD_POINTS (private static final) so ModVillagerFoods can add the mod's vegetables.
// Fabric API does exactly this inside VillagerInteractionRegistries.registerFood; NeoForge has no API for it.
@Mixin(Villager.class)
public interface VillagerAccessor {

    @Accessor("FOOD_POINTS")
    static Map<Item, Integer> tastyvanilla$getFoodPoints() {
        throw new AssertionError();
    }

    @Accessor("FOOD_POINTS")
    @Mutable
    static void tastyvanilla$setFoodPoints(Map<Item, Integer> foodPoints) {
        throw new AssertionError();
    }
}
