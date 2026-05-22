package tastyvanilla.item;

import net.fabricmc.fabric.api.registry.CompostableRegistry;
import tastyvanilla.TastyVanilla;

public class ModCompostableItems {

    //ITEM INITIALIZER
    public static void registerModCompostableItems(){
        TastyVanilla.LOGGER.info("Registering Mod Compostable Items for " + TastyVanilla.MOD_ID);

		//COOKIES
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_APPLE,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_CARROT,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_GLOW_BERRY,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_HONEY,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_OATMEAL,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_POPPY_SEED,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_PUMPKIN,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_SPIDER_EYE,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_SUGAR,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_SUNFLOWER_SEED,0.85f);
		CompostableRegistry.INSTANCE.add(ModItems.COOKIE_SWEET_BERRY,0.85f);

		//PIES
		CompostableRegistry.INSTANCE.add(ModItems.PIE_APPLE,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_CHICKEN,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_CHOCOLATE,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_CHORUS_FRUIT,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_FISH,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_FUNGUS,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_GLOW_BERRY,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_HONEY,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_MEAT,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_MELON,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_MUSHROOM,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_SHEPHERDS,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_SWEET_BERRY,1.0f);
		CompostableRegistry.INSTANCE.add(ModItems.PIE_VEGETABLE,1.0f);

		//BAKED BREAD
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_BAGUEL,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_BAGUETTE,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_BAKED,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_BROWNIE,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_CROISSANT,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_FLATBREAD,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_FOCACCIA,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_HONEY,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_MULTIGRAIN,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_PANCAKES,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_SOURDOUGH,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.BREAD_SWEET_ROLL,0.5f);

		CompostableRegistry.INSTANCE.add(ModItems.BREAD_GARLIC,0.5f);


		//DOUGHS
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_BAGUEL,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_BAGUETTE,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_BAKED_BREAD,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_BROWNIE,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_CROISSANT,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_FLATBREAD,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_FOCACCIA,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_HONEY,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_MULTIGRAIN,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_PANCAKES,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_SOURDOUGH,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_SWEET_ROLL,0.65f);
		CompostableRegistry.INSTANCE.add(ModItems.DOUGH_GARLIC,0.65f);


		//CROPS
        CompostableRegistry.INSTANCE.add(ModItems.CABBAGE,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.CHILLI,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.CHILLI_SEEDS,0.25f);
		CompostableRegistry.INSTANCE.add(ModItems.EGGPLANT,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.GARLIC,05f);
		CompostableRegistry.INSTANCE.add(ModItems.LETTUCE,0.25f);
		CompostableRegistry.INSTANCE.add(ModItems.LETTUCE_SEEDS,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.ONION,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.SWEET_POTATO,0.25f);
		CompostableRegistry.INSTANCE.add(ModItems.TOMATO,0.5f);
		CompostableRegistry.INSTANCE.add(ModItems.TOMATO_SEEDS,0.25f);

		//BERRIES
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_BLACKBERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_BLUEBERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_ELDERBERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_GOJI_BERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_GOOSEBERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_RASPBERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_STRAWBERRIES, 0.3F);
		CompostableRegistry.INSTANCE.add(ModItems.BERRY_WHITE_CURRANT_BERRIES, 0.3F);
    }
}
