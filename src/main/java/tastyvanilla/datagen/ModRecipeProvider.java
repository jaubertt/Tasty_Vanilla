package tastyvanilla.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                cookMeatRecipes("cooked_meat_bear",  ModItems.RAW_MEAT_BEAR,  ModItems.COOKED_MEAT_BEAR,  0.35f);
                cookMeatRecipes("cooked_meat_camel", ModItems.RAW_MEAT_CAMEL, ModItems.COOKED_MEAT_CAMEL, 0.35f);
                cookMeatRecipes("cooked_meat_horse", ModItems.RAW_MEAT_HORSE, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_veggie", ModItems.RAW_MEAT_VEGGIE, ModItems.COOKED_MEAT_VEGGIE, 0.35f);
                cookMeatRecipes("cooked_meat_sniffer", ModItems.RAW_MEAT_SNIFFER, ModItems.COOKED_MEAT_SNIFFER, 1.00f);
                cookMeatRecipes("cooked_meat_goat", ModItems.RAW_MEAT_GOAT, ModItems.COOKED_MEAT_GOAT, 0.35f);
                cookMeatRecipes("cooked_meat_llama", ModItems.RAW_MEAT_LLAMA, ModItems.COOKED_MEAT_LLAMA, 0.35f);
                cookMeatRecipes("cooked_meat_wolf", ModItems.RAW_MEAT_WOLF, ModItems.COOKED_MEAT_WOLF, 0.35f);
                cookMeatRecipes("cooked_meat_fox", ModItems.RAW_MEAT_FOX, ModItems.COOKED_MEAT_FOX, 0.35f);
                cookMeatRecipes("cooked_meat_parrot", ModItems.RAW_MEAT_PARROT, ModItems.COOKED_MEAT_PARROT, 0.35f);
                cookMeatRecipes("cooked_meat_frog", ModItems.RAW_MEAT_FROG, ModItems.COOKED_MEAT_FROG, 0.35f);
                cookMeatRecipes("cooked_meat_turtle", ModItems.RAW_MEAT_TURTLE, ModItems.COOKED_MEAT_TURTLE, 0.50f);
                cookMeatRecipes("cooked_meat_dolphin", ModItems.RAW_MEAT_DOLPHIN, ModItems.COOKED_MEAT_DOLPHIN, 0.50f);
                cookMeatRecipes("cooked_meat_squid", ModItems.RAW_MEAT_SQUID, ModItems.COOKED_MEAT_SQUID, 0.50f);
                cookMeatRecipes("cooked_meat_axolotl", ModItems.RAW_MEAT_AXOLOTL, ModItems.COOKED_MEAT_AXOLOTL, 0.70f);
                cookMeatRecipes("cooked_meat_armadillo", ModItems.RAW_MEAT_ARMADILLO, ModItems.COOKED_MEAT_ARMADILLO, 0.50f);
                cookMeatRecipes("cooked_meat_nautilus", ModItems.RAW_MEAT_NAUTILUS, ModItems.COOKED_MEAT_NAUTILUS, 0.50f);
                cookMeatRecipes("cooked_meat_ravager", ModItems.RAW_MEAT_RAVAGER, ModItems.COOKED_MEAT_RAVAGER, 0.50f);

            }

            private void cookMeatRecipes(String name, ItemConvertible input, ItemConvertible result, float xp) {
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItem(input), RecipeCategory.FOOD, result, xp, 200)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TastyVanilla.MOD_ID, name)));
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItem(input), RecipeCategory.FOOD, result, xp, 100)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TastyVanilla.MOD_ID, name + "_from_smoking")));
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItem(input), RecipeCategory.FOOD, result, xp, 600)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TastyVanilla.MOD_ID, name + "_from_campfire_cooking")));
            }
        };
    }

    @Override
    public String getName() {
        return "Tasty Vanilla Recipes";
    }
}
