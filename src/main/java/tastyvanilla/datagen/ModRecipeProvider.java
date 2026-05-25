package tastyvanilla.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                cookMeatRecipes("cooked_meat_bear",  ModItems.RAW_MEAT_BEAR,  ModItems.COOKED_MEAT_BEAR,  0.35f);
                cookMeatRecipes("cooked_meat_camel", ModItems.RAW_MEAT_CAMEL, ModItems.COOKED_MEAT_CAMEL, 0.35f);
                cookMeatRecipes("cooked_meat_horse", ModItems.RAW_MEAT_HORSE, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_veggie", ModItems.RAW_MEAT_VEGGIE, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_sniffer", ModItems.RAW_MEAT_SNIFFER, ModItems.COOKED_MEAT_HORSE, 1.00f);
                cookMeatRecipes("cooked_meat_goat", ModItems.RAW_MEAT_GOAT, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_llama", ModItems.RAW_MEAT_LlAMA, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_wolf", ModItems.RAW_MEAT_WOLF, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_fox", ModItems.RAW_MEAT_FOX, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_cat", ModItems.RAW_MEAT_CAT, ModItems.COOKED_MEAT_CAT, 0.35f);
                cookMeatRecipes("cooked_meat_parrot", ModItems.RAW_MEAT_PARROT, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_frog", ModItems.RAW_MEAT_FROG, ModItems.COOKED_MEAT_HORSE, 0.35f);
                cookMeatRecipes("cooked_meat_bat", ModItems.RAW_MEAT_BAT, ModItems.COOKED_MEAT_HORSE, 0.50f);
                cookMeatRecipes("cooked_meat_turtle", ModItems.RAW_MEAT_TURTLE, ModItems.COOKED_MEAT_HORSE, 0.50f);
                cookMeatRecipes("cooked_meat_dolphin", ModItems.RAW_MEAT_DOLPHIN, ModItems.COOKED_MEAT_HORSE, 0.50f);
                cookMeatRecipes("cooked_meat_squid", ModItems.RAW_MEAT_SQUID, ModItems.COOKED_MEAT_HORSE, 0.50f);
                cookMeatRecipes("cooked_meat_axolotl", ModItems.RAW_MEAT_AXOLOTL, ModItems.COOKED_MEAT_HORSE, 0.70f);
                cookMeatRecipes("cooked_meat_armadillo", ModItems.RAW_MEAT_ARMADILLO, ModItems.COOKED_MEAT_HORSE, 0.50f);
                cookMeatRecipes("cooked_meat_allay", ModItems.RAW_MEAT_ALLAY, ModItems.COOKED_MEAT_HORSE, 0.50f);
            }

            private void cookMeatRecipes(String name, ItemLike input, ItemLike result, float xp) {
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.FOOD, CookingBookCategory.FOOD, result, xp, 200)
                        .unlockedBy(getHasName(input), has(input))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name)));
                SimpleCookingRecipeBuilder.smoking(Ingredient.of(input), RecipeCategory.FOOD, result, xp, 100)
                        .unlockedBy(getHasName(input), has(input))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name + "_from_smoking")));
                SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.FOOD, result, xp, 600)
                        .unlockedBy(getHasName(input), has(input))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name + "_from_campfire_cooking")));
            }
        };
    }

    @Override
    public String getName() {
        return "Tasty Vanilla Recipes";
    }
}
