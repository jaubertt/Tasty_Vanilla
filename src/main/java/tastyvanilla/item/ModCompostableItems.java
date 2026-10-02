package tastyvanilla.item;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.api.registry.VillagerInteractionRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.VillagerFood;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import tastyvanilla.TastyVanilla;

public class ModCompostableItems {

	//COMPOST CHANCES, THE SAME ONES VANILLA USES (data/minecraft/context_int_provider/compostable/)
	//AN EMPTY COMPOSTER ALWAYS GETS A LAYER, LIKE BEFORE
	private static final ResourceKey<ContextIntProvider> LOW = ContextIntProviders.COMPOSTABLE_LOW;                       //30%, LIKE WHEAT SEEDS (WAS 0.3f)
	private static final ResourceKey<ContextIntProvider> MEDIUM = ContextIntProviders.COMPOSTABLE_MEDIUM;                 //65%, LIKE CARROT (WAS 0.65f)
	private static final ResourceKey<ContextIntProvider> MEDIUM_HIGH = ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH;       //85%, LIKE BREAD (WAS 0.85f)
	private static final ResourceKey<ContextIntProvider> ALWAYS_ADD_ONE = ContextIntProviders.COMPOSTABLE_ALWAYS_ADD_ONE; //100%, LIKE PUMPKIN PIE (WAS 1.0f)

	//ITEM INITIALIZER
	public static void registerModCompostableItems(){
		TastyVanilla.LOGGER.info("Registering Mod Compostable Items for " + TastyVanilla.MOD_ID);

		//26.3: COMPOSTING AND VILLAGER FOOD ARE ITEM COMPONENTS NOW, SET HERE ON THE MOD'S ITEMS
		DefaultItemComponentEvents.MODIFY.register(context -> {
			//COOKIES
			compostable(context, ModItems.COOKIE_APPLE, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_CARROT, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_GLOW_BERRY, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_HONEY, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_OATMEAL, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_POPPY_SEED, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_PUMPKIN, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_SPIDER_EYE, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_SUGAR, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_SUNFLOWER_SEED, MEDIUM_HIGH);
			compostable(context, ModItems.COOKIE_SWEET_BERRY, MEDIUM_HIGH);

			//PIES
			compostable(context, ModItems.PIE_APPLE, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_CHICKEN, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_CHOCOLATE, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_CHORUS_FRUIT, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_FISH, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_FUNGUS, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_GLOW_BERRY, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_HONEY, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_MEAT, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_MELON, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_MUSHROOM, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_SHEPHERDS, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_SWEET_BERRY, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_STRAWBERRY, ALWAYS_ADD_ONE);
			compostable(context, ModItems.PIE_VEGETABLE, ALWAYS_ADD_ONE);

			//BAKED BREAD, LIKE VANILLA BREAD
			compostable(context, ModItems.BREAD_BAGUEL, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_BAGUETTE, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_BAKED, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_BROWNIE, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_CROISSANT, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_FLATBREAD, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_FOCACCIA, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_HONEY, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_MULTIGRAIN, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_PANCAKES, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_SOURDOUGH, MEDIUM_HIGH);
			compostable(context, ModItems.BREAD_SWEET_ROLL, MEDIUM_HIGH);

			compostable(context, ModItems.BREAD_GARLIC, MEDIUM_HIGH);


			//DOUGHS
			compostable(context, ModItems.DOUGH_BAGUEL, MEDIUM);
			compostable(context, ModItems.DOUGH_BAGUETTE, MEDIUM);
			compostable(context, ModItems.DOUGH_BAKED_BREAD, MEDIUM);
			compostable(context, ModItems.DOUGH_BROWNIE, MEDIUM);
			compostable(context, ModItems.DOUGH_CROISSANT, MEDIUM);
			compostable(context, ModItems.DOUGH_FLATBREAD, MEDIUM);
			compostable(context, ModItems.DOUGH_FOCACCIA, MEDIUM);
			compostable(context, ModItems.DOUGH_HONEY, MEDIUM);
			compostable(context, ModItems.DOUGH_MULTIGRAIN, MEDIUM);
			compostable(context, ModItems.DOUGH_PANCAKES, MEDIUM);
			compostable(context, ModItems.DOUGH_SOURDOUGH, MEDIUM);
			compostable(context, ModItems.DOUGH_SWEET_ROLL, MEDIUM);
			compostable(context, ModItems.DOUGH_GARLIC, MEDIUM);


			//CROPS LIKE VANILLA CARROT AND POTATO, SEEDS LIKE VANILLA SEEDS
			compostable(context, ModItems.CABBAGE, MEDIUM);
			compostable(context, ModItems.CHILLI, MEDIUM);
			compostable(context, ModItems.CHILLI_SEEDS, LOW);
			compostable(context, ModItems.EGGPLANT, MEDIUM);
			compostable(context, ModItems.GARLIC, MEDIUM);
			compostable(context, ModItems.LETTUCE, MEDIUM);
			compostable(context, ModItems.LETTUCE_SEEDS, LOW);
			compostable(context, ModItems.ONION, MEDIUM);
			compostable(context, ModItems.SWEET_POTATO, MEDIUM);
			compostable(context, ModItems.TOMATO, MEDIUM);
			compostable(context, ModItems.TOMATO_SEEDS, LOW);

			//COOKED VEGETABLES, LIKE VANILLA BAKED POTATO
			compostable(context, ModItems.FOOD_BAKED_SWEET_POTATO, MEDIUM_HIGH);
			compostable(context, ModItems.FOOD_ROASTED_GARLIC, MEDIUM_HIGH);

			//BERRIES
			compostable(context, ModItems.BERRY_BLACKBERRIES, LOW);
			compostable(context, ModItems.BERRY_BLUEBERRIES, LOW);
			compostable(context, ModItems.BERRY_ELDERBERRIES, LOW);
			compostable(context, ModItems.BERRY_GOJI_BERRIES, LOW);
			compostable(context, ModItems.BERRY_GOOSEBERRIES, LOW);
			compostable(context, ModItems.BERRY_RASPBERRIES, LOW);
			compostable(context, ModItems.BERRY_STRAWBERRIES, LOW);
			compostable(context, ModItems.BERRY_WHITE_CURRANT_BERRIES, LOW);

			//VILLAGERS EAT THESE, WORTH 1 POINT LIKE VANILLA CARROT, POTATO AND BEETROOT
			villagerFood(context, ModItems.CABBAGE, 1);
			villagerFood(context, ModItems.CHILLI, 1);
			villagerFood(context, ModItems.EGGPLANT, 1);
			villagerFood(context, ModItems.GARLIC, 1);
			villagerFood(context, ModItems.LETTUCE, 1);
			villagerFood(context, ModItems.ONION, 1);
			villagerFood(context, ModItems.SWEET_POTATO, 1);
			villagerFood(context, ModItems.TOMATO, 1);
		});

		//FARMER VILLAGERS COMPOST THESE (replaces the old FarmerWorkTaskMixin)
		VillagerInteractionRegistries.registerCompostable(ModItems.CHILLI_SEEDS);
		VillagerInteractionRegistries.registerCompostable(ModItems.LETTUCE_SEEDS);
		VillagerInteractionRegistries.registerCompostable(ModItems.TOMATO_SEEDS);
	}

	private static void compostable(DefaultItemComponentEvents.ModifyContext context, Item item, ResourceKey<ContextIntProvider> chance) {
		context.modify(item, builder -> builder.set(DataComponents.COMPOSTABLE, new Compostable(chance)));
	}

	private static void villagerFood(DefaultItemComponentEvents.ModifyContext context, Item item, int nutrition) {
		context.modify(item, builder -> builder.set(DataComponents.VILLAGER_FOOD, new VillagerFood(nutrition)));
	}
}