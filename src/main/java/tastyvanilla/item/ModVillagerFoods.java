package tastyvanilla.item;

import net.minecraft.world.item.Item;
import tastyvanilla.TastyVanilla;
import tastyvanilla.mixin.VillagerAccessor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ModVillagerFoods {

	//ITEM INITIALIZER
	public static void registerModVillagerFoods(){
		TastyVanilla.LOGGER.info("Registering Mod Villager Foods for " + TastyVanilla.MOD_ID);

		//VILLAGERS PICK THESE UP FROM THE GROUND, LIKE VANILLA CARROTS AND POTATOES
		Set<Item> wantedItems = new HashSet<>(VillagerAccessor.tastyvanilla$getWantedItems());
		wantedItems.add(ModItems.CHILLI);
		wantedItems.add(ModItems.CHILLI_SEEDS);
		wantedItems.add(ModItems.TOMATO);
		wantedItems.add(ModItems.TOMATO_SEEDS);
		wantedItems.add(ModItems.LETTUCE);
		wantedItems.add(ModItems.LETTUCE_SEEDS);
		wantedItems.add(ModItems.CABBAGE);
		wantedItems.add(ModItems.EGGPLANT);
		wantedItems.add(ModItems.GARLIC);
		wantedItems.add(ModItems.ONION);
		wantedItems.add(ModItems.SWEET_POTATO);
		VillagerAccessor.tastyvanilla$setWantedItems(Set.copyOf(wantedItems));

		//VILLAGERS EAT THESE, WORTH 1 POINT LIKE VANILLA CARROT, POTATO AND BEETROOT
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

		//FARMER VILLAGERS COMPOST THE SEEDS: "can_villager_compost" IN data/neoforge/data_maps/item/compostables.json
	}
}
