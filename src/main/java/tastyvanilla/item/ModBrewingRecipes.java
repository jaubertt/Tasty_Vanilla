package tastyvanilla.item;

import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

// Brewing recipes for the mod's drops, added to vanilla's brewing stand.
// Longer, splash and lingering versions come from vanilla's own recipes (Redstone, Gunpowder, Dragon's Breath).
// On the game event bus (see TastyVanilla); the Fabric branch uses FabricBrewingRecipeRegistryBuilder.BUILD.
public class ModBrewingRecipes {

    public static void onRegisterBrewingRecipes(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();
        // Awkward Potion + Allay Wings = Potion of Slow Falling, like Phantom Membrane
        builder.addMix(Potions.AWKWARD, ModItems.RAW_MEAT_ALLAY, Potions.SLOW_FALLING);
        // Awkward Potion + Cat Eye = Potion of Night Vision, like Golden Carrot
        builder.addMix(Potions.AWKWARD, ModItems.RAW_MEAT_CAT, Potions.NIGHT_VISION);
    }
}
