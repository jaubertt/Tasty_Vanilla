package tastyvanilla.item;

import net.minecraft.world.item.Item;
import tastyvanilla.TastyVanilla;
import tastyvanilla.mixin.VillagerAccessor;

import java.util.HashMap;
import java.util.Map;

// VILLAGERS EAT THESE, WORTH 1 POINT LIKE VANILLA CARROT, POTATO AND BEETROOT
// (the Fabric branch does this with VillagerInteractionRegistries.registerFood in ModCompostableItems).
// Compostables and farmer composting are data on NeoForge: data/neoforge/data_maps/item/compostables.json.
public class ModVillagerFoods {

	public static void registerModVillagerFoods() {
		TastyVanilla.LOGGER.info("Registering Mod Villager Foods for " + TastyVanilla.MOD_ID);

		Map<Item, Integer> foodPoints = new HashMap<>(VillagerAccessor.tastyvanilla$getFoodPoints());
		foodPoints.put(ModItems.CABBAGE, 1);
		foodPoints.put(ModItems.CHILLI, 1);
		foodPoints.put(ModItems.EGGPLANT, 1);
		foodPoints.put(ModItems.GARLIC, 1);
		foodPoints.put(ModItems.LETTUCE, 1);
		foodPoints.put(ModItems.ONION, 1);
		foodPoints.put(ModItems.SWEET_POTATO, 1);
		foodPoints.put(ModItems.TOMATO, 1);
		VillagerAccessor.tastyvanilla$setFoodPoints(Map.copyOf(foodPoints));
	}
}
