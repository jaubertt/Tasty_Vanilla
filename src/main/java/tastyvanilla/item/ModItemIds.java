package tastyvanilla.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import tastyvanilla.TastyVanilla;

public class ModItemIds {

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

    //COOKIES
    public static final ResourceKey<Item> COOKIE_APPLE = create("cookie_apple");
    public static final ResourceKey<Item> COOKIE_CARROT = create("cookie_carrot");
    public static final ResourceKey<Item> COOKIE_GLOW_BERRY = create("cookie_glow_berry");
    public static final ResourceKey<Item> COOKIE_HONEY = create("cookie_honey");
    public static final ResourceKey<Item> COOKIE_OATMEAL = create("cookie_oatmeal");
    public static final ResourceKey<Item> COOKIE_POPPY_SEED = create("cookie_poppy_seed");
    public static final ResourceKey<Item> COOKIE_PUMPKIN = create("cookie_pumpkin");
    public static final ResourceKey<Item> COOKIE_SPIDER_EYE = create("cookie_spider_eye");
    public static final ResourceKey<Item> COOKIE_SUGAR = create("cookie_sugar");
    public static final ResourceKey<Item> COOKIE_SUNFLOWER_SEED = create("cookie_sunflower_seed");
    public static final ResourceKey<Item> COOKIE_SWEET_BERRY = create("cookie_sweet_berry");

    //BREAD INGREDIENTS
    public static final ResourceKey<Item> BUTTER = create("butter");
    public static final ResourceKey<Item> FLOUR = create("flour");
    public static final ResourceKey<Item> SALT = create("salt");
    public static final ResourceKey<Item> YEAST = create("yeast");

    //BREAD DOUGHS
    public static final ResourceKey<Item> DOUGH_BAGUEL = create("dough_baguel");
    public static final ResourceKey<Item> DOUGH_BAGUETTE = create("dough_baguette");
    public static final ResourceKey<Item> DOUGH_BAKED_BREAD = create("dough_baked_bread");
    public static final ResourceKey<Item> DOUGH_BROWNIE = create("dough_brownie");
    public static final ResourceKey<Item> DOUGH_CROISSANT = create("dough_croissant");
    public static final ResourceKey<Item> DOUGH_FLATBREAD = create("dough_flatbread");
    public static final ResourceKey<Item> DOUGH_FOCACCIA = create("dough_focaccia");
    public static final ResourceKey<Item> DOUGH_HONEY = create("dough_honey");
    public static final ResourceKey<Item> DOUGH_MULTIGRAIN = create("dough_multigrain");
    public static final ResourceKey<Item> DOUGH_PANCAKES = create("dough_pancakes");
    public static final ResourceKey<Item> DOUGH_SOURDOUGH = create("dough_sourdough");
    public static final ResourceKey<Item> DOUGH_SWEET_ROLL = create("dough_sweet_roll");

    //BAKED BREAD
    public static final ResourceKey<Item> BREAD_BAGUEL = create("bread_baguel");
    public static final ResourceKey<Item> BREAD_BAGUETTE = create("bread_baguette");
    public static final ResourceKey<Item> BREAD_BAKED = create("bread_baked");
    public static final ResourceKey<Item> BREAD_BROWNIE = create("bread_brownie");
    public static final ResourceKey<Item> BREAD_CROISSANT = create("bread_croissant");
    public static final ResourceKey<Item> BREAD_FLATBREAD = create("bread_flatbread");
    public static final ResourceKey<Item> BREAD_FOCACCIA = create("bread_focaccia");
    public static final ResourceKey<Item> BREAD_HONEY = create("bread_honey");
    public static final ResourceKey<Item> BREAD_MULTIGRAIN = create("bread_multigrain");
    public static final ResourceKey<Item> BREAD_PANCAKES = create("bread_pancakes");
    public static final ResourceKey<Item> BREAD_SOURDOUGH = create("bread_sourdough");
    public static final ResourceKey<Item> BREAD_SWEET_ROLL = create("bread_sweet_roll");

    //PIES
    public static final ResourceKey<Item> PIE_APPLE = create("pie_apple");
    public static final ResourceKey<Item> PIE_CHICKEN = create("pie_chicken");
    public static final ResourceKey<Item> PIE_CHOCOLATE = create("pie_chocolate");
    public static final ResourceKey<Item> PIE_CHORUS_FRUIT = create("pie_chorus_fruit");
    public static final ResourceKey<Item> PIE_FISH = create("pie_fish");
    public static final ResourceKey<Item> PIE_FUNGUS = create("pie_fungus");
    public static final ResourceKey<Item> PIE_GLOW_BERRY = create("pie_glow_berry");
    public static final ResourceKey<Item> PIE_HONEY = create("pie_honey");
    public static final ResourceKey<Item> PIE_MEAT = create("pie_meat");
    public static final ResourceKey<Item> PIE_MELON = create("pie_melon");
    public static final ResourceKey<Item> PIE_MUSHROOM = create("pie_mushroom");
    public static final ResourceKey<Item> PIE_SHEPHERDS = create("pie_shepherds");
    public static final ResourceKey<Item> PIE_SWEET_BERRY = create("pie_sweet_berry");
    public static final ResourceKey<Item> PIE_STRAWBERRY = create("pie_strawberry");
    public static final ResourceKey<Item> PIE_VEGETABLE = create("pie_vegetable");

    //CROPS
    public static final ResourceKey<Item> CABBAGE = create("cabbage");

    public static final ResourceKey<Item> CHILLI = create("chilli");
    public static final ResourceKey<Item> CHILLI_SEEDS = create("chilli_seeds");

    public static final ResourceKey<Item> EGGPLANT = create("eggplant");

    public static final ResourceKey<Item> GARLIC = create("garlic");

    public static final ResourceKey<Item> LETTUCE = create("lettuce");
    public static final ResourceKey<Item> LETTUCE_SEEDS = create("lettuce_seeds");

    public static final ResourceKey<Item> ONION = create("onion");

    public static final ResourceKey<Item> SWEET_POTATO = create("sweet_potato");

    public static final ResourceKey<Item> TOMATO = create("tomato");
    public static final ResourceKey<Item> TOMATO_SEEDS = create("tomato_seeds");

    //CORN & RICE (2.2.1)
    //CORN (HARVEST) AND CORN KERNELS (PLANTING ITEM), ONE PER COLOR
    public static final ResourceKey<Item> CORN = create("corn");
    public static final ResourceKey<Item> CORN_KERNELS = create("corn_kernels");
    public static final ResourceKey<Item> WHITE_CORN = create("white_corn");
    public static final ResourceKey<Item> WHITE_CORN_KERNELS = create("white_corn_kernels");
    public static final ResourceKey<Item> BLUE_CORN = create("blue_corn");
    public static final ResourceKey<Item> BLUE_CORN_KERNELS = create("blue_corn_kernels");
    public static final ResourceKey<Item> PURPLE_CORN = create("purple_corn");
    public static final ResourceKey<Item> PURPLE_CORN_KERNELS = create("purple_corn_kernels");
    //NIXTAMAL AND MASA (WHITE AND BLUE ONLY)
    public static final ResourceKey<Item> WHITE_NIXTAMAL = create("white_nixtamal");
    public static final ResourceKey<Item> BLUE_NIXTAMAL = create("blue_nixtamal");
    public static final ResourceKey<Item> WHITE_MASA = create("white_masa");
    public static final ResourceKey<Item> BLUE_MASA = create("blue_masa");
    //SHARED CORN INGREDIENTS
    public static final ResourceKey<Item> CAL = create("cal");
    public static final ResourceKey<Item> CORNMEAL = create("cornmeal");
    public static final ResourceKey<Item> DOUGH_CORNBREAD = create("dough_cornbread");
    //RICE PANICLES (HARVEST) AND RICE (PLANTING ITEM)
    public static final ResourceKey<Item> RAW_RICE = create("raw_rice");
    public static final ResourceKey<Item> RICE = create("rice");
    public static final ResourceKey<Item> BROWN_RICE = create("brown_rice");
    public static final ResourceKey<Item> WHITE_RICE = create("white_rice");
    public static final ResourceKey<Item> RAW_WILD_RICE = create("raw_wild_rice");
    public static final ResourceKey<Item> WILD_RICE = create("wild_rice");
    public static final ResourceKey<Item> RAW_BLACK_RICE = create("raw_black_rice");
    public static final ResourceKey<Item> BLACK_RICE = create("black_rice");


    //CROP FOODS
    public static final ResourceKey<Item> FOOD_TOMATO_SOUP = create("food_tomato_soup");
    public static final ResourceKey<Item> FOOD_SALAD = create("food_salad");
    public static final ResourceKey<Item> FOOD_WRAP_VEGGIE = create("food_wrap_veggie");
    public static final ResourceKey<Item> FOOD_WRAP = create("food_wrap");
    public static final ResourceKey<Item> FOOD_ONION_SOUP = create("food_onion_soup");
    public static final ResourceKey<Item> FOOD_ONION_RING = create("food_onion_ring");
    public static final ResourceKey<Item> FOOD_ROASTED_GARLIC = create("food_roasted_garlic");
    public static final ResourceKey<Item> FOOD_BAKED_SWEET_POTATO = create("food_baked_sweet_potato");
    public static final ResourceKey<Item> FOOD_SWEET_POTATO_FRIES = create("food_sweet_potato_fries");
    public static final ResourceKey<Item> FOOD_POTATO_FRIES = create("food_potato_fries");
    public static final ResourceKey<Item> FOOD_COLESLAW = create("food_coleslaw");
    public static final ResourceKey<Item> FOOD_CHILLI_STEW = create("food_chilli_stew");
    public static final ResourceKey<Item> FOOD_BUMSBLECH_SALAD = create("food_bumsblech_salad");

    public static final ResourceKey<Item> BREAD_GARLIC = create("bread_garlic");
    public static final ResourceKey<Item> DOUGH_GARLIC = create("dough_garlic");

    //CORN & RICE FOODS (2.2.1)
    public static final ResourceKey<Item> FOOD_ROASTED_CORN = create("food_roasted_corn");
    public static final ResourceKey<Item> FOOD_POPCORN = create("food_popcorn");
    public static final ResourceKey<Item> FOOD_TORTILLA = create("food_tortilla");
    public static final ResourceKey<Item> BREAD_CORNBREAD = create("bread_cornbread");
    public static final ResourceKey<Item> BREAD_PIKI = create("bread_piki");
    public static final ResourceKey<Item> FOOD_TACOS = create("food_tacos");
    public static final ResourceKey<Item> FOOD_TAMALES = create("food_tamales");
    public static final ResourceKey<Item> FOOD_POZOLE = create("food_pozole");
    public static final ResourceKey<Item> FOOD_TLACOYOS = create("food_tlacoyos");
    public static final ResourceKey<Item> FOOD_POLENTA = create("food_polenta");
    public static final ResourceKey<Item> FOOD_AREPA = create("food_arepa");
    public static final ResourceKey<Item> FOOD_MAZAMORRA_MORADA = create("food_mazamorra_morada");
    public static final ResourceKey<Item> FOOD_CHICHA_MORADA = create("food_chicha_morada");
    public static final ResourceKey<Item> FOOD_FRIED_RICE = create("food_fried_rice");
    public static final ResourceKey<Item> FOOD_SUSHI = create("food_sushi");
    public static final ResourceKey<Item> FOOD_RICE_PUDDING = create("food_rice_pudding");
    public static final ResourceKey<Item> FOOD_WILD_RICE_SOUP = create("food_wild_rice_soup");
    public static final ResourceKey<Item> FOOD_WILD_RICE_PILAF = create("food_wild_rice_pilaf");
    public static final ResourceKey<Item> FOOD_BLACK_RICE_CONGEE = create("food_black_rice_congee");

    //MILK & CHEESE
    public static final ResourceKey<Item> GOAT_MILK_BUCKET = create("goat_milk_bucket");

    //MEATS & DROPS
    public static final ResourceKey<Item> RAW_MEAT_BEAR = create("raw_meat_bear");
    public static final ResourceKey<Item> RAW_MEAT_CAMEL = create("raw_meat_camel");
    public static final ResourceKey<Item> RAW_MEAT_HORSE = create("raw_meat_horse");
    public static final ResourceKey<Item> RAW_MEAT_VEGGIE = create("raw_meat_veggie");
    public static final ResourceKey<Item> RAW_MEAT_SNIFFER = create("raw_meat_sniffer");
    public static final ResourceKey<Item> RAW_MEAT_GOAT = create("raw_meat_goat");
    public static final ResourceKey<Item> RAW_MEAT_LLAMA = create("raw_meat_llama");
    public static final ResourceKey<Item> RAW_MEAT_WOLF = create("raw_meat_wolf");
    public static final ResourceKey<Item> RAW_MEAT_FOX = create("raw_meat_fox");
    public static final ResourceKey<Item> RAW_MEAT_CAT = create("raw_meat_cat");
    public static final ResourceKey<Item> RAW_MEAT_PARROT = create("raw_meat_parrot");
    public static final ResourceKey<Item> RAW_MEAT_FROG = create("raw_meat_frog");
    public static final ResourceKey<Item> RAW_MEAT_BAT = create("raw_meat_bat");
    public static final ResourceKey<Item> RAW_MEAT_TURTLE = create("raw_meat_turtle");
    public static final ResourceKey<Item> RAW_MEAT_DOLPHIN = create("raw_meat_dolphin");
    public static final ResourceKey<Item> RAW_MEAT_SQUID = create("raw_meat_squid");
    public static final ResourceKey<Item> RAW_MEAT_AXOLOTL = create("raw_meat_axolotl");
    public static final ResourceKey<Item> RAW_MEAT_ARMADILLO = create("raw_meat_armadillo");
    public static final ResourceKey<Item> RAW_MEAT_ALLAY = create("raw_meat_allay");
    public static final ResourceKey<Item> RAW_MEAT_NAUTILUS = create("raw_meat_nautilus");
    public static final ResourceKey<Item> RAW_MEAT_RAVAGER = create("raw_meat_ravager");


    public static final ResourceKey<Item> COOKED_MEAT_BEAR = create("cooked_meat_bear");
    public static final ResourceKey<Item> COOKED_MEAT_CAMEL = create("cooked_meat_camel");
    public static final ResourceKey<Item> COOKED_MEAT_HORSE = create("cooked_meat_horse");
    public static final ResourceKey<Item> COOKED_MEAT_VEGGIE = create("cooked_meat_veggie");
    public static final ResourceKey<Item> COOKED_MEAT_SNIFFER = create("cooked_meat_sniffer");
    public static final ResourceKey<Item> COOKED_MEAT_GOAT = create("cooked_meat_goat");
    public static final ResourceKey<Item> COOKED_MEAT_LLAMA = create("cooked_meat_llama");
    public static final ResourceKey<Item> COOKED_MEAT_WOLF = create("cooked_meat_wolf");
    public static final ResourceKey<Item> COOKED_MEAT_FOX = create("cooked_meat_fox");
    public static final ResourceKey<Item> COOKED_MEAT_PARROT = create("cooked_meat_parrot");
    public static final ResourceKey<Item> COOKED_MEAT_FROG = create("cooked_meat_frog");
    public static final ResourceKey<Item> COOKED_MEAT_TURTLE = create("cooked_meat_turtle");
    public static final ResourceKey<Item> COOKED_MEAT_DOLPHIN = create("cooked_meat_dolphin");
    public static final ResourceKey<Item> COOKED_MEAT_SQUID = create("cooked_meat_squid");
    public static final ResourceKey<Item> COOKED_MEAT_AXOLOTL = create("cooked_meat_axolotl");
    public static final ResourceKey<Item> COOKED_MEAT_ARMADILLO = create("cooked_meat_armadillo");
    public static final ResourceKey<Item> COOKED_MEAT_NAUTILUS = create("cooked_meat_nautilus");
    public static final ResourceKey<Item> COOKED_MEAT_RAVAGER = create("cooked_meat_ravager");


    //BERRIES & JAMS
    public static final ResourceKey<Item> BERRY_BLACKBERRIES = create("berry_blackberries");
    public static final ResourceKey<Item> BERRY_BLUEBERRIES = create("berry_blueberries");
    public static final ResourceKey<Item> BERRY_ELDERBERRIES = create("berry_elderberries");
    public static final ResourceKey<Item> BERRY_GOJI_BERRIES = create("berry_goji_berries");
    public static final ResourceKey<Item> BERRY_GOOSEBERRIES = create("berry_gooseberries");
    public static final ResourceKey<Item> BERRY_RASPBERRIES = create("berry_raspberries");
    public static final ResourceKey<Item> BERRY_STRAWBERRIES = create("berry_strawberries");
    public static final ResourceKey<Item> BERRY_WHITE_CURRANT_BERRIES = create("berry_white_currant_berries");

    public static final ResourceKey<Item> GLASS_JAR = create("glass_jar");

    public static final ResourceKey<Item> JAM_BLACKBERRY = create("jam_blackberry");
    public static final ResourceKey<Item> JAM_BLUEBERRY = create("jam_blueberry");
    public static final ResourceKey<Item> JAM_ELDERBERRY = create("jam_elderberry");
    public static final ResourceKey<Item> JAM_GOJI_BERRY = create("jam_goji_berry");
    public static final ResourceKey<Item> JAM_GOOSEBERRY = create("jam_gooseberry");
    public static final ResourceKey<Item> JAM_RASPBERRY = create("jam_raspberry");
    public static final ResourceKey<Item> JAM_STRAWBERRY = create("jam_strawberry");
    public static final ResourceKey<Item> JAM_WHITE_CURRANT_BERRY = create("jam_white_currant_berry");
    public static final ResourceKey<Item> JAM_SWEET_BERRY = create("jam_sweet_berry");
    public static final ResourceKey<Item> JAM_BLACKBERRY_MASH = create("jam_blackberry_mash");
    public static final ResourceKey<Item> JAM_BLUEBERRY_MASH = create("jam_blueberry_mash");
    public static final ResourceKey<Item> JAM_ELDERERRY_MASH = create("jam_elderberry_mash");
    public static final ResourceKey<Item> JAM_GOJI_BERRY_MASH = create("jam_goji_berry_mash");
    public static final ResourceKey<Item> JAM_GOOSEBERRY_MASH = create("jam_gooseberry_mash");
    public static final ResourceKey<Item> JAM_RASPBERRY_MASH = create("jam_raspberry_mash");
    public static final ResourceKey<Item> JAM_STRAWBERRY_MASH = create("jam_strawberry_mash");
    public static final ResourceKey<Item> JAM_WHITE_CURRANT_BERRY_MASH = create("jam_white_currant_berry_mash");
    public static final ResourceKey<Item> JAM_SWEET_BERRY_MASH = create("jam_sweet_berry_mash");

    //GOLDEN FOODS

}
