package tastyvanilla.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.VillagerFood;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import tastyvanilla.TastyVanilla;

// NeoForge version of the Fabric branch's ModCompostableItems: since 26.3, composting and villager food are item
// components. Same items and levels as Fabric, set with ModifyDefaultComponentsEvent (mod event bus, see TastyVanilla).
// Farmer villagers composting the seeds is data on NeoForge: data/neoforge/data_maps/item/villager_compostables.json.
public class ModCompostableItems {

	//COMPOST CHANCES, THE SAME ONES VANILLA USES (data/minecraft/context_int_provider/compostable/)
	//AN EMPTY COMPOSTER ALWAYS GETS A LAYER, LIKE BEFORE
	private static final ResourceKey<ContextIntProvider> LOW = ContextIntProviders.COMPOSTABLE_LOW; //30%, LIKE WHEAT SEEDS (WAS 0.3f)
	private static final ResourceKey<ContextIntProvider> MEDIUM = ContextIntProviders.COMPOSTABLE_MEDIUM; //65%, LIKE CARROT (WAS 0.65f)
	private static final ResourceKey<ContextIntProvider> MEDIUM_HIGH = ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH; //85%, LIKE BREAD (WAS 0.85f)
	private static final ResourceKey<ContextIntProvider> ALWAYS_ADD_ONE = ContextIntProviders.COMPOSTABLE_ALWAYS_ADD_ONE; //100%, LIKE PUMPKIN PIE (WAS 1.0f)

	public static void modifyDefaultComponents(ModifyDefaultComponentsEvent event) {
		TastyVanilla.LOGGER.info("Registering Mod Compostable Items for " + TastyVanilla.MOD_ID);

		//COOKIES
		compostable(event, ModItems.COOKIE_APPLE, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_CARROT, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_GLOW_BERRY, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_HONEY, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_OATMEAL, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_POPPY_SEED, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_PUMPKIN, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_SPIDER_EYE, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_SUGAR, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_SUNFLOWER_SEED, MEDIUM_HIGH);
		compostable(event, ModItems.COOKIE_SWEET_BERRY, MEDIUM_HIGH);

		//PIES
		compostable(event, ModItems.PIE_APPLE, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_CHICKEN, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_CHOCOLATE, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_CHORUS_FRUIT, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_FISH, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_FUNGUS, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_GLOW_BERRY, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_HONEY, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_MEAT, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_MELON, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_MUSHROOM, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_SHEPHERDS, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_SWEET_BERRY, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_STRAWBERRY, ALWAYS_ADD_ONE);
		compostable(event, ModItems.PIE_VEGETABLE, ALWAYS_ADD_ONE);

		//BAKED BREAD, LIKE VANILLA BREAD
		compostable(event, ModItems.BREAD_BAGUEL, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_BAGUETTE, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_BAKED, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_BROWNIE, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_CROISSANT, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_FLATBREAD, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_FOCACCIA, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_HONEY, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_MULTIGRAIN, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_PANCAKES, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_SOURDOUGH, MEDIUM_HIGH);
		compostable(event, ModItems.BREAD_SWEET_ROLL, MEDIUM_HIGH);

		compostable(event, ModItems.BREAD_GARLIC, MEDIUM_HIGH);


		//DOUGHS
		compostable(event, ModItems.DOUGH_BAGUEL, MEDIUM);
		compostable(event, ModItems.DOUGH_BAGUETTE, MEDIUM);
		compostable(event, ModItems.DOUGH_BAKED_BREAD, MEDIUM);
		compostable(event, ModItems.DOUGH_BROWNIE, MEDIUM);
		compostable(event, ModItems.DOUGH_CROISSANT, MEDIUM);
		compostable(event, ModItems.DOUGH_FLATBREAD, MEDIUM);
		compostable(event, ModItems.DOUGH_FOCACCIA, MEDIUM);
		compostable(event, ModItems.DOUGH_HONEY, MEDIUM);
		compostable(event, ModItems.DOUGH_MULTIGRAIN, MEDIUM);
		compostable(event, ModItems.DOUGH_PANCAKES, MEDIUM);
		compostable(event, ModItems.DOUGH_SOURDOUGH, MEDIUM);
		compostable(event, ModItems.DOUGH_SWEET_ROLL, MEDIUM);
		compostable(event, ModItems.DOUGH_GARLIC, MEDIUM);


		//CROPS LIKE VANILLA CARROT AND POTATO, SEEDS LIKE VANILLA SEEDS
		compostable(event, ModItems.CABBAGE, MEDIUM);
		compostable(event, ModItems.CHILLI, MEDIUM);
		compostable(event, ModItems.CHILLI_SEEDS, LOW);
		compostable(event, ModItems.EGGPLANT, MEDIUM);
		compostable(event, ModItems.GARLIC, MEDIUM);
		compostable(event, ModItems.LETTUCE, MEDIUM);
		compostable(event, ModItems.LETTUCE_SEEDS, LOW);
		compostable(event, ModItems.ONION, MEDIUM);
		compostable(event, ModItems.SWEET_POTATO, MEDIUM);
		compostable(event, ModItems.TOMATO, MEDIUM);
		compostable(event, ModItems.TOMATO_SEEDS, LOW);

		//COOKED VEGETABLES, LIKE VANILLA BAKED POTATO
		compostable(event, ModItems.FOOD_BAKED_SWEET_POTATO, MEDIUM_HIGH);
		compostable(event, ModItems.FOOD_ROASTED_GARLIC, MEDIUM_HIGH);

		//BERRIES
		compostable(event, ModItems.BERRY_BLACKBERRIES, LOW);
		compostable(event, ModItems.BERRY_BLUEBERRIES, LOW);
		compostable(event, ModItems.BERRY_ELDERBERRIES, LOW);
		compostable(event, ModItems.BERRY_GOJI_BERRIES, LOW);
		compostable(event, ModItems.BERRY_GOOSEBERRIES, LOW);
		compostable(event, ModItems.BERRY_RASPBERRIES, LOW);
		compostable(event, ModItems.BERRY_STRAWBERRIES, LOW);
		compostable(event, ModItems.BERRY_WHITE_CURRANT_BERRIES, LOW);

		//VILLAGERS EAT THESE, WORTH 1 POINT LIKE VANILLA CARROT, POTATO AND BEETROOT
		villagerFood(event, ModItems.CABBAGE, 1);
		villagerFood(event, ModItems.CHILLI, 1);
		villagerFood(event, ModItems.EGGPLANT, 1);
		villagerFood(event, ModItems.GARLIC, 1);
		villagerFood(event, ModItems.LETTUCE, 1);
		villagerFood(event, ModItems.ONION, 1);
		villagerFood(event, ModItems.SWEET_POTATO, 1);
		villagerFood(event, ModItems.TOMATO, 1);
	}

	private static void compostable(ModifyDefaultComponentsEvent event, Item item, ResourceKey<ContextIntProvider> chance) {
		event.modify(item, (components, context, modified) -> components.set(DataComponents.COMPOSTABLE, new Compostable(chance)));
	}

	private static void villagerFood(ModifyDefaultComponentsEvent event, Item item, int nutrition) {
		event.modify(item, (components, context, modified) -> components.set(DataComponents.VILLAGER_FOOD, new VillagerFood(nutrition)));
	}
}
