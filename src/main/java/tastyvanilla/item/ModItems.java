package tastyvanilla.item;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.ModBlocks;

import java.util.function.Function;

import static net.minecraft.world.item.Items.BOWL;
import static net.minecraft.world.item.Items.BUCKET;

public class ModItems {

    //COOKIES
    public static final Item COOKIE_APPLE = registerItem("cookie_apple", new Item.Properties().food(ModFoodComponents.COOKIE_APPLE));
    public static final Item COOKIE_CARROT = registerItem("cookie_carrot", new Item.Properties().food(ModFoodComponents.COOKIE_CARROT));
    public static final Item COOKIE_GLOW_BERRY = registerItem("cookie_glow_berry", new Item.Properties().food(ModFoodComponents.COOKIE_GLOW_BERRY));
    public static final Item COOKIE_HONEY = registerItem("cookie_honey", new Item.Properties().food(ModFoodComponents.COOKIE_HONEY));
    public static final Item COOKIE_OATMEAL = registerItem("cookie_oatmeal", new Item.Properties().food(ModFoodComponents.COOKIE_OATMEAL));
    public static final Item COOKIE_POPPY_SEED = registerItem("cookie_poppy_seed", new Item.Properties().food(ModFoodComponents.COOKIE_POPPY_SEED));
    public static final Item COOKIE_PUMPKIN = registerItem("cookie_pumpkin", new Item.Properties().food(ModFoodComponents.COOKIE_PUMPKIN));
    public static final Item COOKIE_SPIDER_EYE = registerItem("cookie_spider_eye", new Item.Properties().food(ModFoodComponents.COOKIE_SPIDER_EYE));
    public static final Item COOKIE_SUGAR = registerItem("cookie_sugar", new Item.Properties().food(ModFoodComponents.COOKIE_SUGAR));
    public static final Item COOKIE_SUNFLOWER_SEED = registerItem("cookie_sunflower_seed", new Item.Properties().food(ModFoodComponents.COOKIE_SUNFLOWER_SEED));
    public static final Item COOKIE_SWEET_BERRY = registerItem("cookie_sweet_berry", new Item.Properties().food(ModFoodComponents.COOKIE_SWEET_BERRY));

    //BREAD INGREDIENTS
    public static final Item BUTTER = registerItem("butter");
    public static final Item FLOUR = registerItem("flour");
    public static final Item SALT = registerItem("salt");
    public static final Item YEAST = registerItem("yeast");

    //BREAD DOUGHS
    public static final Item DOUGH_BAGUEL = registerItem("dough_baguel", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_BAGUETTE = registerItem("dough_baguette", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_BAKED_BREAD = registerItem("dough_baked_bread", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_BROWNIE = registerItem("dough_brownie", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_CROISSANT = registerItem("dough_croissant", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_FLATBREAD = registerItem("dough_flatbread", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_FOCACCIA = registerItem("dough_focaccia", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_HONEY = registerItem("dough_honey", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_MULTIGRAIN = registerItem("dough_multigrain", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_PANCAKES = registerItem("dough_pancakes", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_SOURDOUGH = registerItem("dough_sourdough", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_SWEET_ROLL = registerItem("dough_sweet_roll", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));

    //BAKED BREAD
    public static final Item BREAD_BAGUEL = registerItem("bread_baguel", new Item.Properties().food(ModFoodComponents.BREAD_BAGUEL));
    public static final Item BREAD_BAGUETTE = registerItem("bread_baguette", new Item.Properties().food(ModFoodComponents.BREAD_BAGUETTE));
    public static final Item BREAD_BAKED = registerItem("bread_baked", new Item.Properties().food(ModFoodComponents.BREAD_BAKED));
    public static final Item BREAD_BROWNIE = registerItem("bread_brownie", new Item.Properties().food(ModFoodComponents.BREAD_BROWNIE));
    public static final Item BREAD_CROISSANT = registerItem("bread_croissant", new Item.Properties().food(ModFoodComponents.BREAD_CROISSANT));
    public static final Item BREAD_FLATBREAD = registerItem("bread_flatbread", new Item.Properties().food(ModFoodComponents.BREAD_FLATBREAD));
    public static final Item BREAD_FOCACCIA = registerItem("bread_focaccia", new Item.Properties().food(ModFoodComponents.BREAD_FOCACCIA));
    public static final Item BREAD_HONEY = registerItem("bread_honey", new Item.Properties().food(ModFoodComponents.BREAD_HONEY));
    public static final Item BREAD_MULTIGRAIN = registerItem("bread_multigrain", new Item.Properties().food(ModFoodComponents.BREAD_MULTIGRAIN));
    public static final Item BREAD_PANCAKES = registerItem("bread_pancakes", new Item.Properties().food(ModFoodComponents.BREAD_PANCAKES));
    public static final Item BREAD_SOURDOUGH = registerItem("bread_sourdough", new Item.Properties().food(ModFoodComponents.BREAD_SOURDOUGH));
    public static final Item BREAD_SWEET_ROLL = registerItem("bread_sweet_roll", new Item.Properties().food(ModFoodComponents.BREAD_SWEET_ROLL));

    //PIES
    public static final Item PIE_APPLE = registerItem("pie_apple", new Item.Properties().food(ModFoodComponents.PIE_APPLE));
    public static final Item PIE_CHICKEN = registerItem("pie_chicken", new Item.Properties().food(ModFoodComponents.PIE_CHICKEN));
    public static final Item PIE_CHOCOLATE = registerItem("pie_chocolate", new Item.Properties().food(ModFoodComponents.PIE_CHOCOLATE));
    public static final Item PIE_CHORUS_FRUIT = registerItem("pie_chorus_fruit", new Item.Properties().food(ModFoodComponents.PIE_CHORUS_FRUIT, Consumables.CHORUS_FRUIT));
    public static final Item PIE_FISH = registerItem("pie_fish", new Item.Properties().food(ModFoodComponents.PIE_FISH));
    public static final Item PIE_FUNGUS = registerItem("pie_fungus", new Item.Properties().food(ModFoodComponents.PIE_FUNGUS));
    public static final Item PIE_GLOW_BERRY = registerItem("pie_glow_berry", new Item.Properties().food(ModFoodComponents.PIE_GLOW_BERRY));
    public static final Item PIE_HONEY = registerItem("pie_honey", new Item.Properties().food(ModFoodComponents.PIE_HONEY));
    public static final Item PIE_MEAT = registerItem("pie_meat", new Item.Properties().food(ModFoodComponents.PIE_MEAT));
    public static final Item PIE_MELON = registerItem("pie_melon", new Item.Properties().food(ModFoodComponents.PIE_MELON));
    public static final Item PIE_MUSHROOM = registerItem("pie_mushroom", new Item.Properties().food(ModFoodComponents.PIE_MUSHROOM));
    public static final Item PIE_SHEPHERDS = registerItem("pie_shepherds", new Item.Properties().food(ModFoodComponents.PIE_SHEPHERDS));
    public static final Item PIE_SWEET_BERRY = registerItem("pie_sweet_berry", new Item.Properties().food(ModFoodComponents.PIE_SWEET_BERRY));
    public static final Item PIE_STRAWBERRY = registerItem("pie_strawberry", new Item.Properties().food(ModFoodComponents.PIE_STRAWBERRY));
    public static final Item PIE_VEGETABLE = registerItem("pie_vegetable", new Item.Properties().food(ModFoodComponents.PIE_VEGETABLE));

    //CROPS

    public static final Item CABBAGE = registerItem("cabbage", createBlockItemWithUniqueName(ModBlocks.CABBAGE_CROP), new Item.Properties().food(ModFoodComponents.CABBAGE));

    public static final Item CHILLI = registerItem("chilli", new Item.Properties().food(ModFoodComponents.CHILLI));
    public static final Item CHILLI_SEEDS = registerItem("chilli_seeds", createBlockItemWithUniqueName(ModBlocks.CHILLI_CROP));

    public static final Item EGGPLANT = registerItem("eggplant", createBlockItemWithUniqueName(ModBlocks.EGGPLANT_CROP), new Item.Properties().food(ModFoodComponents.EGGPLANT));

    public static final Item GARLIC = registerItem("garlic", createBlockItemWithUniqueName(ModBlocks.GARLIC_CROP), new Item.Properties().food(ModFoodComponents.GARLIC));

    public static final Item LETTUCE = registerItem("lettuce", new Item.Properties().food(ModFoodComponents.LETTUCE));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds", createBlockItemWithUniqueName(ModBlocks.LETTUCE_CROP));

    public static final Item ONION = registerItem("onion", createBlockItemWithUniqueName(ModBlocks.ONION_CROP), new Item.Properties().food(ModFoodComponents.ONION));

    public static final Item SWEET_POTATO = registerItem("sweet_potato", createBlockItemWithUniqueName(ModBlocks.SWEET_POTATO_CROP), new Item.Properties().food(ModFoodComponents.SWEET_POTATO));

    public static final Item TOMATO = registerItem("tomato", new Item.Properties().food(ModFoodComponents.TOMATO));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", createBlockItemWithUniqueName(ModBlocks.TOMATO_CROP));


    //CROP FOODS
    public static final Item FOOD_TOMATO_SOUP = registerItem("food_tomato_soup", new Item.Properties().food(ModFoodComponents.FOOD_TOMATO_SOUP).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_SALAD = registerItem("food_salad", new Item.Properties().food(ModFoodComponents.FOOD_SALAD).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_WRAP_VEGGIE = registerItem("food_wrap_veggie", new Item.Properties().food(ModFoodComponents.FOOD_WRAP_VEGGIE));
    public static final Item FOOD_WRAP = registerItem("food_wrap", new Item.Properties().food(ModFoodComponents.FOOD_WRAP));
    public static final Item FOOD_ONION_SOUP = registerItem("food_onion_soup", new Item.Properties().food(ModFoodComponents.FOOD_ONION_SOUP).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_ONION_RING = registerItem("food_onion_ring", new Item.Properties().food(ModFoodComponents.FOOD_ONION_RING));
    public static final Item FOOD_ROASTED_GARLIC = registerItem("food_roasted_garlic", new Item.Properties().food(ModFoodComponents.FOOD_ROASTED_GARLIC));
    public static final Item FOOD_BAKED_SWEET_POTATO = registerItem("food_baked_sweet_potato", new Item.Properties().food(ModFoodComponents.FOOD_BAKED_SWEET_POTATO));
    public static final Item FOOD_SWEET_POTATO_FRIES = registerItem("food_sweet_potato_fries", new Item.Properties().food(ModFoodComponents.FOOD_SWEET_POTATO_FRIES).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_POTATO_FRIES = registerItem("food_potato_fries", new Item.Properties().food(ModFoodComponents.FOOD_POTATO_FRIES).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_COLESLAW = registerItem("food_coleslaw", new Item.Properties().food(ModFoodComponents.FOOD_COLESLAW).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_CHILLI_STEW = registerItem("food_chilli_stew", new Item.Properties().food(ModFoodComponents.FOOD_CHILLI_STEW).stacksTo(16).usingConvertsTo(BOWL));
    public static final Item FOOD_BUMSBLECH_SALAD = registerItem("food_bumsblech_salad", new Item.Properties().food(ModFoodComponents.FOOD_BUMSBLECH_SALAD).stacksTo(16).usingConvertsTo(BOWL));

    public static final Item BREAD_GARLIC = registerItem("bread_garlic", new Item.Properties().food(ModFoodComponents.BREAD_GARLIC));
    public static final Item DOUGH_GARLIC = registerItem("dough_garlic", new Item.Properties().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));

    //MILK & CHEESE
    public static final Item GOAT_MILK_BUCKET = registerItem("goat_milk_bucket", new Item.Properties().craftRemainder(BUCKET).component(DataComponents.CONSUMABLE, Consumables.MILK_BUCKET).usingConvertsTo(BUCKET).stacksTo(1));

    //MEATS & DROPS
    public static final Item RAW_MEAT_BEAR = registerItem("raw_meat_bear", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_CAMEL = registerItem("raw_meat_camel", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_HORSE = registerItem("raw_meat_horse", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_VEGGIE = registerItem("raw_meat_veggie", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_2));
    public static final Item RAW_MEAT_SNIFFER = registerItem("raw_meat_sniffer", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_GOAT = registerItem("raw_meat_goat", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_LLAMA = registerItem("raw_meat_llama", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_WOLF = registerItem("raw_meat_wolf", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_2, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_FOX = registerItem("raw_meat_fox", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_PARROT = registerItem("raw_meat_parrot", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_FROG = registerItem("raw_meat_frog", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_TURTLE = registerItem("raw_meat_turtle", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_DOLPHIN = registerItem("raw_meat_dolphin", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_2, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_SQUID = registerItem("raw_meat_squid", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3));
    public static final Item RAW_MEAT_AXOLOTL = registerItem("raw_meat_axolotl", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_ARMADILLO = registerItem("raw_meat_armadillo", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_2, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_NAUTILUS = registerItem("raw_meat_nautilus", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_3));
    public static final Item RAW_MEAT_RAVAGER = registerItem("raw_meat_ravager", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_BAT = registerItem("raw_meat_bat", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_4, ModFoodComponents.BAT_WINGS));
    public static final Item RAW_MEAT_ALLAY = registerItem("raw_meat_allay", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_4, ModFoodComponents.ALLAY_WINGS));
    public static final Item RAW_MEAT_CAT = registerItem("raw_meat_cat", new Item.Properties().food(ModFoodComponents.RAW_MEAT_TIER_4, ModFoodComponents.CAT_EYE));


    public static final Item COOKED_MEAT_BEAR = registerItem("cooked_meat_bear", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_CAMEL = registerItem("cooked_meat_camel", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_HORSE = registerItem("cooked_meat_horse", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_VEGGIE = registerItem("cooked_meat_veggie", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_SNIFFER = registerItem("cooked_meat_sniffer", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_GOAT = registerItem("cooked_meat_goat", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_LLAMA = registerItem("cooked_meat_llama", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_WOLF = registerItem("cooked_meat_wolf", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_FOX = registerItem("cooked_meat_fox", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_PARROT = registerItem("cooked_meat_parrot", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_FROG = registerItem("cooked_meat_frog", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_TURTLE = registerItem("cooked_meat_turtle", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_DOLPHIN = registerItem("cooked_meat_dolphin", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_SQUID = registerItem("cooked_meat_squid", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_AXOLOTL = registerItem("cooked_meat_axolotl", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_ARMADILLO = registerItem("cooked_meat_armadillo", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_NAUTILUS = registerItem("cooked_meat_nautilus", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_RAVAGER = registerItem("cooked_meat_ravager", new Item.Properties().food(ModFoodComponents.COOKED_MEAT_TIER_1));

    //BERRIES & JAMS

    public static final Item BERRY_BLACKBERRIES = registerItem("berry_blackberries", createBlockItemWithUniqueName(ModBlocks.BERRY_BLACKBERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_BLACKBERRIES));
    public static final Item BERRY_BLUEBERRIES = registerItem("berry_blueberries", createBlockItemWithUniqueName(ModBlocks.BERRY_BLUEBERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_BLUEBERRIES));
    public static final Item BERRY_ELDERBERRIES = registerItem("berry_elderberries", createBlockItemWithUniqueName(ModBlocks.BERRY_ELDERBERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_ELDERBERRIES));
    public static final Item BERRY_GOJI_BERRIES = registerItem("berry_goji_berries", createBlockItemWithUniqueName(ModBlocks.BERRY_GOJI_BERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_GOJI_BERRIES));
    public static final Item BERRY_GOOSEBERRIES = registerItem("berry_gooseberries", createBlockItemWithUniqueName(ModBlocks.BERRY_GOOSEBERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_GOOSEBERRIES));
    public static final Item BERRY_RASPBERRIES = registerItem("berry_raspberries", createBlockItemWithUniqueName(ModBlocks.BERRY_RASPBERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_RASPBERRIES));
    public static final Item BERRY_STRAWBERRIES = registerItem("berry_strawberries", createBlockItemWithUniqueName(ModBlocks.BERRY_STRAWBERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_STRAWBERRIES));
    public static final Item BERRY_WHITE_CURRANT_BERRIES = registerItem("berry_white_currant_berries", createBlockItemWithUniqueName(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH), new Item.Properties().food(ModFoodComponents.BERRY_WHITE_CURRANT_BERRIES));

    public static final Item GLASS_JAR = registerItem("glass_jar");

    //JAMS AND MASHES ARE DRUNK LIKE THE VANILLA HONEY BOTTLE
    public static final Item JAM_BLACKBERRY = registerItem("jam_blackberry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLACKBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_BLUEBERRY = registerItem("jam_blueberry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLUEBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_ELDERBERRY = registerItem("jam_elderberry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_ELDERBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_GOJI_BERRY = registerItem("jam_goji_berry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOJI_BERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_GOOSEBERRY = registerItem("jam_gooseberry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOOSEBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_RASPBERRY = registerItem("jam_raspberry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_RASPBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_STRAWBERRY = registerItem("jam_strawberry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_STRAWBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_WHITE_CURRANT_BERRY = registerItem("jam_white_currant_berry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_WHITE_CURRANT_BERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_SWEET_BERRY = registerItem("jam_sweet_berry", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_SWEET_BERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_BLACKBERRY_MASH = registerItem("jam_blackberry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLACKBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_BLUEBERRY_MASH = registerItem("jam_blueberry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLUEBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_ELDERERRY_MASH = registerItem("jam_elderberry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_ELDERBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_GOJI_BERRY_MASH = registerItem("jam_goji_berry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOJI_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_GOOSEBERRY_MASH = registerItem("jam_gooseberry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOOSEBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_RASPBERRY_MASH = registerItem("jam_raspberry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_RASPBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_STRAWBERRY_MASH = registerItem("jam_strawberry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_STRAWBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_WHITE_CURRANT_BERRY_MASH = registerItem("jam_white_currant_berry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_WHITE_CURRANT_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));
    public static final Item JAM_SWEET_BERRY_MASH = registerItem("jam_sweet_berry_mash", new Item.Properties().craftRemainder(GLASS_JAR).food(ModFoodComponents.JAM_SWEET_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16));

    //REGISTER METHODS, THE SAME AS VANILLA'S Items CLASS IN 1.21.11: THE ITEM'S KEY IS MADE FROM ITS NAME
    private static ResourceKey<Item> keyOf(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

    //ITEMS THAT PLANT A BLOCK BUT KEEP THEIR OWN NAME (item.tastyvanilla...), LIKE VANILLA CARROT AND WHEAT SEEDS
    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Block block) {
        return properties -> new BlockItem(block, properties.useItemDescriptionPrefix());
    }

    private static Item registerItem(String name) {
        return registerItem(keyOf(name), Item::new, new Item.Properties());
    }

    private static Item registerItem(String name, Item.Properties properties) {
        return registerItem(keyOf(name), Item::new, properties);
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> factory) {
        return registerItem(keyOf(name), factory, new Item.Properties());
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        return registerItem(keyOf(name), factory, properties);
    }

    // NeoForge adds every registered BlockItem to Item.BY_BLOCK itself, so the Fabric branch's
    // blockItem.appendBlocks(Item.BLOCK_ITEMS, item) line has no counterpart here.
    private static Item registerItem(ResourceKey<Item> key, Function<Item.Properties, Item> factory, Item.Properties properties) {
        Item item = factory.apply(properties.setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    //ITEM INITIALIZER
    // Loading this class registers every item above (NeoForge calls this inside its item RegisterEvent).
    public static void registerModItems() {
        TastyVanilla.LOGGER.info("Registering Mod Items for " + TastyVanilla.MOD_ID);
    }

    //CREATIVE TABS: same items in the same vanilla tabs as the Fabric branch (there: ItemGroupEvents).
    // Listens on the mod event bus, see TastyVanilla.
    public static void addToCreativeTabs(BuildCreativeModeTabContentsEvent event) {

        //NEW ITEM IN FOOD AND DRINKS
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

            //COOKIES
            event.accept(COOKIE_APPLE);
            event.accept(COOKIE_CARROT);
            event.accept(COOKIE_GLOW_BERRY);
            event.accept(COOKIE_HONEY);
            event.accept(COOKIE_OATMEAL);
            event.accept(COOKIE_POPPY_SEED);
            event.accept(COOKIE_PUMPKIN);
            event.accept(COOKIE_SPIDER_EYE);
            event.accept(COOKIE_SUGAR);
            event.accept(COOKIE_SUNFLOWER_SEED);
            event.accept(COOKIE_SWEET_BERRY);

            //BAKED BREAD
            event.accept(BREAD_BAGUEL);
            event.accept(BREAD_BAGUETTE);
            event.accept(BREAD_BAKED);
            event.accept(BREAD_BROWNIE);
            event.accept(BREAD_CROISSANT);
            event.accept(BREAD_FLATBREAD);
            event.accept(BREAD_FOCACCIA);
            event.accept(BREAD_HONEY);
            event.accept(BREAD_MULTIGRAIN);
            event.accept(BREAD_PANCAKES);
            event.accept(BREAD_SOURDOUGH);
            event.accept(BREAD_SWEET_ROLL);

            //PIES
            event.accept(PIE_APPLE);
            event.accept(PIE_CHICKEN);
            event.accept(PIE_CHOCOLATE);
            event.accept(PIE_CHORUS_FRUIT);
            event.accept(PIE_FISH);
            event.accept(PIE_FUNGUS);
            event.accept(PIE_GLOW_BERRY);
            event.accept(PIE_HONEY);
            event.accept(PIE_MEAT);
            event.accept(PIE_MELON);
            event.accept(PIE_MUSHROOM);
            event.accept(PIE_SHEPHERDS);
            event.accept(PIE_SWEET_BERRY);
            event.accept(PIE_STRAWBERRY);
            event.accept(PIE_VEGETABLE);

            //CROPS
            event.accept(CABBAGE);
            event.accept(CHILLI);
            event.accept(GARLIC);
            event.accept(EGGPLANT);
            event.accept(LETTUCE);
            event.accept(ONION);
            event.accept(SWEET_POTATO);
            event.accept(TOMATO);

            //CROPFOODS

            event.accept(FOOD_ONION_RING);
            event.accept(FOOD_POTATO_FRIES);
            event.accept(FOOD_CHILLI_STEW);
            event.accept(FOOD_COLESLAW);
            event.accept(FOOD_BAKED_SWEET_POTATO);
            event.accept(FOOD_ROASTED_GARLIC);
            event.accept(FOOD_SALAD);
            event.accept(FOOD_TOMATO_SOUP);
            event.accept(FOOD_WRAP);
            event.accept(FOOD_WRAP_VEGGIE);
            event.accept(FOOD_ONION_SOUP);
            event.accept(FOOD_SWEET_POTATO_FRIES);
            event.accept(FOOD_BUMSBLECH_SALAD);


            event.accept(BREAD_GARLIC);



            //MILK & CHEESE
            event.accept(GOAT_MILK_BUCKET);

            //BERRIES & JAMS
            event.accept(BERRY_BLACKBERRIES);
            event.accept(BERRY_BLUEBERRIES);
            event.accept(BERRY_ELDERBERRIES);
            event.accept(BERRY_GOJI_BERRIES);
            event.accept(BERRY_GOOSEBERRIES);
            event.accept(BERRY_RASPBERRIES);
            event.accept(BERRY_STRAWBERRIES);
            event.accept(BERRY_WHITE_CURRANT_BERRIES);

            event.accept(JAM_BLACKBERRY);
            event.accept(JAM_BLUEBERRY);
            event.accept(JAM_ELDERBERRY);
            event.accept(JAM_GOJI_BERRY);
            event.accept(JAM_GOOSEBERRY);
            event.accept(JAM_RASPBERRY);
            event.accept(JAM_SWEET_BERRY);
            event.accept(JAM_STRAWBERRY);
            event.accept(JAM_WHITE_CURRANT_BERRY);

            event.accept(JAM_BLACKBERRY_MASH);
            event.accept(JAM_BLUEBERRY_MASH);
            event.accept(JAM_ELDERERRY_MASH);
            event.accept(JAM_GOJI_BERRY_MASH);
            event.accept(JAM_GOOSEBERRY_MASH);
            event.accept(JAM_RASPBERRY_MASH);
            event.accept(JAM_SWEET_BERRY_MASH);
            event.accept(JAM_STRAWBERRY_MASH);
            event.accept(JAM_WHITE_CURRANT_BERRY_MASH);

            //MEAT & DROPS
            event.accept(RAW_MEAT_BEAR);
            event.accept(RAW_MEAT_CAMEL);
            event.accept(RAW_MEAT_HORSE);
            event.accept(RAW_MEAT_VEGGIE);
            event.accept(RAW_MEAT_SNIFFER);
            event.accept(RAW_MEAT_GOAT);
            event.accept(RAW_MEAT_LLAMA);
            event.accept(RAW_MEAT_WOLF);
            event.accept(RAW_MEAT_FOX);
            event.accept(RAW_MEAT_CAT);
            event.accept(RAW_MEAT_PARROT);
            event.accept(RAW_MEAT_FROG);
            event.accept(RAW_MEAT_BAT);
            event.accept(RAW_MEAT_TURTLE);
            event.accept(RAW_MEAT_DOLPHIN);
            event.accept(RAW_MEAT_SQUID);
            event.accept(RAW_MEAT_AXOLOTL);
            event.accept(RAW_MEAT_ARMADILLO);
            event.accept(RAW_MEAT_ALLAY);
            event.accept(RAW_MEAT_NAUTILUS);
            event.accept(RAW_MEAT_RAVAGER);


            event.accept(COOKED_MEAT_BEAR);
            event.accept(COOKED_MEAT_CAMEL);
            event.accept(COOKED_MEAT_HORSE);
            event.accept(COOKED_MEAT_VEGGIE);
            event.accept(COOKED_MEAT_SNIFFER);
            event.accept(COOKED_MEAT_GOAT);
            event.accept(COOKED_MEAT_LLAMA);
            event.accept(COOKED_MEAT_WOLF);
            event.accept(COOKED_MEAT_FOX);
            event.accept(COOKED_MEAT_PARROT);
            event.accept(COOKED_MEAT_FROG);
            event.accept(COOKED_MEAT_TURTLE);
            event.accept(COOKED_MEAT_DOLPHIN);
            event.accept(COOKED_MEAT_SQUID);
            event.accept(COOKED_MEAT_AXOLOTL);
            event.accept(COOKED_MEAT_ARMADILLO);
            event.accept(COOKED_MEAT_NAUTILUS);
            event.accept(COOKED_MEAT_RAVAGER);


        }

        //NEW ITEM IN INGREDIENTS
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            //BREAD INGREDIENTS
            event.accept(BUTTER);
            event.accept(FLOUR);
            event.accept(SALT);
            event.accept(YEAST);

            //DOUGHS
            event.accept(DOUGH_BAGUEL);
            event.accept(DOUGH_BAGUETTE);
            event.accept(DOUGH_BAKED_BREAD);
            event.accept(DOUGH_BROWNIE);
            event.accept(DOUGH_CROISSANT);
            event.accept(DOUGH_FLATBREAD);
            event.accept(DOUGH_FOCACCIA);
            event.accept(DOUGH_HONEY);
            event.accept(DOUGH_MULTIGRAIN);
            event.accept(DOUGH_PANCAKES);
            event.accept(DOUGH_SOURDOUGH);
            event.accept(DOUGH_SWEET_ROLL);

            event.accept(DOUGH_GARLIC);


        }

        //NEW ITEM IN NATURAL BLOCKS
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

            //CROPS
            event.accept(CHILLI_SEEDS);
            event.accept(LETTUCE_SEEDS);
            event.accept(TOMATO_SEEDS);


        }

        //NEW ITEM IN TOOLS AND UTILITIES
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

            event.accept(GOAT_MILK_BUCKET);
            event.accept(GLASS_JAR);

        }
    }

    //VANILLA STEWS AND SOUPS STACK TO 16, LIKE THE MOD'S OWN BOWL FOODS
    // (the Fabric branch does this with DefaultItemComponentEvents.MODIFY). Mod event bus, see TastyVanilla.
    public static void modifyDefaultComponents(ModifyDefaultComponentsEvent event) {
        event.modify(Items.MUSHROOM_STEW, builder -> builder.set(DataComponents.MAX_STACK_SIZE, 16));
        event.modify(Items.RABBIT_STEW, builder -> builder.set(DataComponents.MAX_STACK_SIZE, 16));
        event.modify(Items.BEETROOT_SOUP, builder -> builder.set(DataComponents.MAX_STACK_SIZE, 16));
    }
}
