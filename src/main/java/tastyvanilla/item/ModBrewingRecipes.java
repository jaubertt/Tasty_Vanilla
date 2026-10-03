package tastyvanilla.item;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.potion.Potions;

// Brewing recipes for the mod's drops, added to vanilla's brewing stand.
// Longer, splash and lingering versions come from vanilla's own recipes (Redstone, Gunpowder, Dragon's Breath).
public class ModBrewingRecipes {

    public static void registerModBrewingRecipes() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            // Awkward Potion + Allay Wings = Potion of Slow Falling, like Phantom Membrane
            builder.registerPotionRecipe(Potions.AWKWARD, ModItems.RAW_MEAT_ALLAY, Potions.SLOW_FALLING);
            // Awkward Potion + Cat Eye = Potion of Night Vision, like Golden Carrot
            builder.registerPotionRecipe(Potions.AWKWARD, ModItems.RAW_MEAT_CAT, Potions.NIGHT_VISION);
        });
    }
}
