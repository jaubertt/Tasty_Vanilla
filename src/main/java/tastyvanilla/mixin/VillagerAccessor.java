package tastyvanilla.mixin;

import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;
import java.util.Set;

//VILLAGER FOOD VALUES AND THE ITEMS VILLAGERS PICK UP, USED BY ModVillagerFoods
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

    @Accessor("WANTED_ITEMS")
    static Set<Item> tastyvanilla$getWantedItems() {
        throw new AssertionError();
    }

    @Accessor("WANTED_ITEMS")
    @Mutable
    static void tastyvanilla$setWantedItems(Set<Item> wantedItems) {
        throw new AssertionError();
    }
}
