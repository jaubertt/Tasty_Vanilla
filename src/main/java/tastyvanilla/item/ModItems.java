package tastyvanilla.item;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.ModBlocks;

import java.util.function.Function;

import static net.minecraft.item.Items.BOWL;
import static net.minecraft.item.Items.BUCKET;

public class ModItems {

    //COOKIES
    public static final Item COOKIE_APPLE = registerItem("cookie_apple", new Item.Settings().food(ModFoodComponents.COOKIE_APPLE));
    public static final Item COOKIE_CARROT = registerItem("cookie_carrot", new Item.Settings().food(ModFoodComponents.COOKIE_CARROT));
    public static final Item COOKIE_GLOW_BERRY = registerItem("cookie_glow_berry", new Item.Settings().food(ModFoodComponents.COOKIE_GLOW_BERRY));
    public static final Item COOKIE_HONEY = registerItem("cookie_honey", new Item.Settings().food(ModFoodComponents.COOKIE_HONEY));
    public static final Item COOKIE_OATMEAL = registerItem("cookie_oatmeal", new Item.Settings().food(ModFoodComponents.COOKIE_OATMEAL));
    public static final Item COOKIE_POPPY_SEED = registerItem("cookie_poppy_seed", new Item.Settings().food(ModFoodComponents.COOKIE_POPPY_SEED));
    public static final Item COOKIE_PUMPKIN = registerItem("cookie_pumpkin", new Item.Settings().food(ModFoodComponents.COOKIE_PUMPKIN));
    public static final Item COOKIE_SPIDER_EYE = registerItem("cookie_spider_eye", new Item.Settings().food(ModFoodComponents.COOKIE_SPIDER_EYE));
    public static final Item COOKIE_SUGAR = registerItem("cookie_sugar", new Item.Settings().food(ModFoodComponents.COOKIE_SUGAR));
    public static final Item COOKIE_SUNFLOWER_SEED = registerItem("cookie_sunflower_seed", new Item.Settings().food(ModFoodComponents.COOKIE_SUNFLOWER_SEED));
    public static final Item COOKIE_SWEET_BERRY = registerItem("cookie_sweet_berry", new Item.Settings().food(ModFoodComponents.COOKIE_SWEET_BERRY));

    //BREAD INGREDIENTS
    public static final Item BUTTER = registerItem("butter");
    public static final Item FLOUR = registerItem("flour");
    public static final Item SALT = registerItem("salt");
    public static final Item YEAST = registerItem("yeast");

    //BREAD DOUGHS
    public static final Item DOUGH_BAGUEL = registerItem("dough_baguel", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_BAGUETTE = registerItem("dough_baguette", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_BAKED_BREAD = registerItem("dough_baked_bread", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_BROWNIE = registerItem("dough_brownie", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_CROISSANT = registerItem("dough_croissant", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_FLATBREAD = registerItem("dough_flatbread", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_FOCACCIA = registerItem("dough_focaccia", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_HONEY = registerItem("dough_honey", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_MULTIGRAIN = registerItem("dough_multigrain", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_PANCAKES = registerItem("dough_pancakes", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_SOURDOUGH = registerItem("dough_sourdough", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));
    public static final Item DOUGH_SWEET_ROLL = registerItem("dough_sweet_roll", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));

    //BAKED BREAD
    public static final Item BREAD_BAGUEL = registerItem("bread_baguel", new Item.Settings().food(ModFoodComponents.BREAD_BAGUEL));
    public static final Item BREAD_BAGUETTE = registerItem("bread_baguette", new Item.Settings().food(ModFoodComponents.BREAD_BAGUETTE));
    public static final Item BREAD_BAKED = registerItem("bread_baked", new Item.Settings().food(ModFoodComponents.BREAD_BAKED));
    public static final Item BREAD_BROWNIE = registerItem("bread_brownie", new Item.Settings().food(ModFoodComponents.BREAD_BROWNIE));
    public static final Item BREAD_CROISSANT = registerItem("bread_croissant", new Item.Settings().food(ModFoodComponents.BREAD_CROISSANT));
    public static final Item BREAD_FLATBREAD = registerItem("bread_flatbread", new Item.Settings().food(ModFoodComponents.BREAD_FLATBREAD));
    public static final Item BREAD_FOCACCIA = registerItem("bread_focaccia", new Item.Settings().food(ModFoodComponents.BREAD_FOCACCIA));
    public static final Item BREAD_HONEY = registerItem("bread_honey", new Item.Settings().food(ModFoodComponents.BREAD_HONEY));
    public static final Item BREAD_MULTIGRAIN = registerItem("bread_multigrain", new Item.Settings().food(ModFoodComponents.BREAD_MULTIGRAIN));
    public static final Item BREAD_PANCAKES = registerItem("bread_pancakes", new Item.Settings().food(ModFoodComponents.BREAD_PANCAKES));
    public static final Item BREAD_SOURDOUGH = registerItem("bread_sourdough", new Item.Settings().food(ModFoodComponents.BREAD_SOURDOUGH));
    public static final Item BREAD_SWEET_ROLL = registerItem("bread_sweet_roll", new Item.Settings().food(ModFoodComponents.BREAD_SWEET_ROLL));

    //PIES
    public static final Item PIE_APPLE = registerItem("pie_apple", new Item.Settings().food(ModFoodComponents.PIE_APPLE));
    public static final Item PIE_CHICKEN = registerItem("pie_chicken", new Item.Settings().food(ModFoodComponents.PIE_CHICKEN));
    public static final Item PIE_CHOCOLATE = registerItem("pie_chocolate", new Item.Settings().food(ModFoodComponents.PIE_CHOCOLATE));
    public static final Item PIE_CHORUS_FRUIT = registerItem("pie_chorus_fruit", new Item.Settings().food(ModFoodComponents.PIE_CHORUS_FRUIT, ConsumableComponents.CHORUS_FRUIT));
    public static final Item PIE_FISH = registerItem("pie_fish", new Item.Settings().food(ModFoodComponents.PIE_FISH));
    public static final Item PIE_FUNGUS = registerItem("pie_fungus", new Item.Settings().food(ModFoodComponents.PIE_FUNGUS));
    public static final Item PIE_GLOW_BERRY = registerItem("pie_glow_berry", new Item.Settings().food(ModFoodComponents.PIE_GLOW_BERRY));
    public static final Item PIE_HONEY = registerItem("pie_honey", new Item.Settings().food(ModFoodComponents.PIE_HONEY));
    public static final Item PIE_MEAT = registerItem("pie_meat", new Item.Settings().food(ModFoodComponents.PIE_MEAT));
    public static final Item PIE_MELON = registerItem("pie_melon", new Item.Settings().food(ModFoodComponents.PIE_MELON));
    public static final Item PIE_MUSHROOM = registerItem("pie_mushroom", new Item.Settings().food(ModFoodComponents.PIE_MUSHROOM));
    public static final Item PIE_SHEPHERDS = registerItem("pie_shepherds", new Item.Settings().food(ModFoodComponents.PIE_SHEPHERDS));
    public static final Item PIE_SWEET_BERRY = registerItem("pie_sweet_berry", new Item.Settings().food(ModFoodComponents.PIE_SWEET_BERRY));
    public static final Item PIE_STRAWBERRY = registerItem("pie_strawberry", new Item.Settings().food(ModFoodComponents.PIE_STRAWBERRY));
    public static final Item PIE_VEGETABLE = registerItem("pie_vegetable", new Item.Settings().food(ModFoodComponents.PIE_VEGETABLE));

    //CROPS

    public static final Item CABBAGE = registerItem("cabbage", createBlockItemWithUniqueName(ModBlocks.CABBAGE_CROP), new Item.Settings().food(ModFoodComponents.CABBAGE));

    public static final Item CHILLI = registerItem("chilli", new Item.Settings().food(ModFoodComponents.CHILLI));
    public static final Item CHILLI_SEEDS = registerItem("chilli_seeds", createBlockItemWithUniqueName(ModBlocks.CHILLI_CROP));

    public static final Item EGGPLANT = registerItem("eggplant", createBlockItemWithUniqueName(ModBlocks.EGGPLANT_CROP), new Item.Settings().food(ModFoodComponents.EGGPLANT));

    public static final Item GARLIC = registerItem("garlic", createBlockItemWithUniqueName(ModBlocks.GARLIC_CROP), new Item.Settings().food(ModFoodComponents.GARLIC));

    public static final Item LETTUCE = registerItem("lettuce", new Item.Settings().food(ModFoodComponents.LETTUCE));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds", createBlockItemWithUniqueName(ModBlocks.LETTUCE_CROP));

    public static final Item ONION = registerItem("onion", createBlockItemWithUniqueName(ModBlocks.ONION_CROP), new Item.Settings().food(ModFoodComponents.ONION));

    public static final Item SWEET_POTATO = registerItem("sweet_potato", createBlockItemWithUniqueName(ModBlocks.SWEET_POTATO_CROP), new Item.Settings().food(ModFoodComponents.SWEET_POTATO));

    public static final Item TOMATO = registerItem("tomato", new Item.Settings().food(ModFoodComponents.TOMATO));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", createBlockItemWithUniqueName(ModBlocks.TOMATO_CROP));


    //CROP FOODS
    public static final Item FOOD_TOMATO_SOUP = registerItem("food_tomato_soup", new Item.Settings().food(ModFoodComponents.FOOD_TOMATO_SOUP).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_SALAD = registerItem("food_salad", new Item.Settings().food(ModFoodComponents.FOOD_SALAD).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_WRAP_VEGGIE = registerItem("food_wrap_veggie", new Item.Settings().food(ModFoodComponents.FOOD_WRAP_VEGGIE));
    public static final Item FOOD_WRAP = registerItem("food_wrap", new Item.Settings().food(ModFoodComponents.FOOD_WRAP));
    public static final Item FOOD_ONION_SOUP = registerItem("food_onion_soup", new Item.Settings().food(ModFoodComponents.FOOD_ONION_SOUP).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_ONION_RING = registerItem("food_onion_ring", new Item.Settings().food(ModFoodComponents.FOOD_ONION_RING));
    public static final Item FOOD_ROASTED_GARLIC = registerItem("food_roasted_garlic", new Item.Settings().food(ModFoodComponents.FOOD_ROASTED_GARLIC));
    public static final Item FOOD_BAKED_SWEET_POTATO = registerItem("food_baked_sweet_potato", new Item.Settings().food(ModFoodComponents.FOOD_BAKED_SWEET_POTATO));
    public static final Item FOOD_SWEET_POTATO_FRIES = registerItem("food_sweet_potato_fries", new Item.Settings().food(ModFoodComponents.FOOD_SWEET_POTATO_FRIES).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_POTATO_FRIES = registerItem("food_potato_fries", new Item.Settings().food(ModFoodComponents.FOOD_POTATO_FRIES).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_COLESLAW = registerItem("food_coleslaw", new Item.Settings().food(ModFoodComponents.FOOD_COLESLAW).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_CHILLI_STEW = registerItem("food_chilli_stew", new Item.Settings().food(ModFoodComponents.FOOD_CHILLI_STEW).maxCount(16).useRemainder(BOWL));
    public static final Item FOOD_BUMSBLECH_SALAD = registerItem("food_bumsblech_salad", new Item.Settings().food(ModFoodComponents.FOOD_BUMSBLECH_SALAD).maxCount(16).useRemainder(BOWL));

    public static final Item BREAD_GARLIC = registerItem("bread_garlic", new Item.Settings().food(ModFoodComponents.BREAD_GARLIC));
    public static final Item DOUGH_GARLIC = registerItem("dough_garlic", new Item.Settings().food(ModFoodComponents.DOUGHS, ModFoodComponents.DOUGH_CONSUMABLE));

    //MILK & CHEESE
    public static final Item GOAT_MILK_BUCKET = registerItem("goat_milk_bucket", new Item.Settings().recipeRemainder(BUCKET).component(DataComponentTypes.CONSUMABLE, ConsumableComponents.MILK_BUCKET).useRemainder(BUCKET).maxCount(1));

    //MEATS & DROPS
    public static final Item RAW_MEAT_BEAR = registerItem("raw_meat_bear", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_CAMEL = registerItem("raw_meat_camel", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_HORSE = registerItem("raw_meat_horse", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_VEGGIE = registerItem("raw_meat_veggie", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_2));
    public static final Item RAW_MEAT_SNIFFER = registerItem("raw_meat_sniffer", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_GOAT = registerItem("raw_meat_goat", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_LLAMA = registerItem("raw_meat_llama", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_WOLF = registerItem("raw_meat_wolf", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_2, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_FOX = registerItem("raw_meat_fox", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_PARROT = registerItem("raw_meat_parrot", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_FROG = registerItem("raw_meat_frog", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_TURTLE = registerItem("raw_meat_turtle", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_DOLPHIN = registerItem("raw_meat_dolphin", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_2, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_SQUID = registerItem("raw_meat_squid", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3));
    public static final Item RAW_MEAT_AXOLOTL = registerItem("raw_meat_axolotl", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_ARMADILLO = registerItem("raw_meat_armadillo", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_2, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_NAUTILUS = registerItem("raw_meat_nautilus", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_3));
    public static final Item RAW_MEAT_RAVAGER = registerItem("raw_meat_ravager", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_1, ModFoodComponents.FOOD_POISONING));
    public static final Item RAW_MEAT_BAT = registerItem("raw_meat_bat", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_4, ModFoodComponents.BAT_WINGS));
    public static final Item RAW_MEAT_ALLAY = registerItem("raw_meat_allay", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_4, ModFoodComponents.ALLAY_WINGS));
    public static final Item RAW_MEAT_CAT = registerItem("raw_meat_cat", new Item.Settings().food(ModFoodComponents.RAW_MEAT_TIER_4, ModFoodComponents.CAT_EYE));


    public static final Item COOKED_MEAT_BEAR = registerItem("cooked_meat_bear", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_CAMEL = registerItem("cooked_meat_camel", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_HORSE = registerItem("cooked_meat_horse", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_VEGGIE = registerItem("cooked_meat_veggie", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_SNIFFER = registerItem("cooked_meat_sniffer", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_GOAT = registerItem("cooked_meat_goat", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_LLAMA = registerItem("cooked_meat_llama", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));
    public static final Item COOKED_MEAT_WOLF = registerItem("cooked_meat_wolf", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_FOX = registerItem("cooked_meat_fox", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_PARROT = registerItem("cooked_meat_parrot", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_FROG = registerItem("cooked_meat_frog", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_TURTLE = registerItem("cooked_meat_turtle", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_DOLPHIN = registerItem("cooked_meat_dolphin", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_SQUID = registerItem("cooked_meat_squid", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_AXOLOTL = registerItem("cooked_meat_axolotl", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_ARMADILLO = registerItem("cooked_meat_armadillo", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_2));
    public static final Item COOKED_MEAT_NAUTILUS = registerItem("cooked_meat_nautilus", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_3));
    public static final Item COOKED_MEAT_RAVAGER = registerItem("cooked_meat_ravager", new Item.Settings().food(ModFoodComponents.COOKED_MEAT_TIER_1));

    //BERRIES & JAMS

    public static final Item BERRY_BLACKBERRIES = registerItem("berry_blackberries", createBlockItemWithUniqueName(ModBlocks.BERRY_BLACKBERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_BLACKBERRIES));
    public static final Item BERRY_BLUEBERRIES = registerItem("berry_blueberries", createBlockItemWithUniqueName(ModBlocks.BERRY_BLUEBERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_BLUEBERRIES));
    public static final Item BERRY_ELDERBERRIES = registerItem("berry_elderberries", createBlockItemWithUniqueName(ModBlocks.BERRY_ELDERBERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_ELDERBERRIES));
    public static final Item BERRY_GOJI_BERRIES = registerItem("berry_goji_berries", createBlockItemWithUniqueName(ModBlocks.BERRY_GOJI_BERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_GOJI_BERRIES));
    public static final Item BERRY_GOOSEBERRIES = registerItem("berry_gooseberries", createBlockItemWithUniqueName(ModBlocks.BERRY_GOOSEBERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_GOOSEBERRIES));
    public static final Item BERRY_RASPBERRIES = registerItem("berry_raspberries", createBlockItemWithUniqueName(ModBlocks.BERRY_RASPBERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_RASPBERRIES));
    public static final Item BERRY_STRAWBERRIES = registerItem("berry_strawberries", createBlockItemWithUniqueName(ModBlocks.BERRY_STRAWBERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_STRAWBERRIES));
    public static final Item BERRY_WHITE_CURRANT_BERRIES = registerItem("berry_white_currant_berries", createBlockItemWithUniqueName(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH), new Item.Settings().food(ModFoodComponents.BERRY_WHITE_CURRANT_BERRIES));

    public static final Item GLASS_JAR = registerItem("glass_jar");

    //JAMS AND MASHES ARE DRUNK LIKE THE VANILLA HONEY BOTTLE
    public static final Item JAM_BLACKBERRY = registerItem("jam_blackberry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLACKBERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_BLUEBERRY = registerItem("jam_blueberry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLUEBERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_ELDERBERRY = registerItem("jam_elderberry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_ELDERBERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_GOJI_BERRY = registerItem("jam_goji_berry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOJI_BERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_GOOSEBERRY = registerItem("jam_gooseberry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOOSEBERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_RASPBERRY = registerItem("jam_raspberry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_RASPBERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_STRAWBERRY = registerItem("jam_strawberry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_STRAWBERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_WHITE_CURRANT_BERRY = registerItem("jam_white_currant_berry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_WHITE_CURRANT_BERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_SWEET_BERRY = registerItem("jam_sweet_berry", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_SWEET_BERRY, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_BLACKBERRY_MASH = registerItem("jam_blackberry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLACKBERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_BLUEBERRY_MASH = registerItem("jam_blueberry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_BLUEBERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_ELDERERRY_MASH = registerItem("jam_elderberry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_ELDERBERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_GOJI_BERRY_MASH = registerItem("jam_goji_berry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOJI_BERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_GOOSEBERRY_MASH = registerItem("jam_gooseberry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_GOOSEBERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_RASPBERRY_MASH = registerItem("jam_raspberry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_RASPBERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_STRAWBERRY_MASH = registerItem("jam_strawberry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_STRAWBERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_WHITE_CURRANT_BERRY_MASH = registerItem("jam_white_currant_berry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_WHITE_CURRANT_BERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));
    public static final Item JAM_SWEET_BERRY_MASH = registerItem("jam_sweet_berry_mash", new Item.Settings().recipeRemainder(GLASS_JAR).food(ModFoodComponents.JAM_SWEET_BERRY_MASH, ConsumableComponents.HONEY_BOTTLE).useRemainder(GLASS_JAR).maxCount(16));

    //REGISTER METHODS, THE SAME AS VANILLA'S Items CLASS IN 1.21.11: THE ITEM'S KEY IS MADE FROM ITS NAME
    private static RegistryKey<Item> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID, name));
    }

    //ITEMS THAT PLANT A BLOCK BUT KEEP THEIR OWN NAME (item.tastyvanilla...), LIKE VANILLA CARROT AND WHEAT SEEDS
    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return settings -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }

    private static Item registerItem(String name) {
        return registerItem(keyOf(name), Item::new, new Item.Settings());
    }

    private static Item registerItem(String name, Item.Settings settings) {
        return registerItem(keyOf(name), Item::new, settings);
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        return registerItem(keyOf(name), factory, new Item.Settings());
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return registerItem(keyOf(name), factory, settings);
    }

    private static Item registerItem(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, key, item);
    }

    //ITEM INITIALIZER
    public static void registerModItems(){
        TastyVanilla.LOGGER.info("Registering Mod Items for " + TastyVanilla.MOD_ID);

        //NEW ITEM IN FOOD AND DRINK
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {

            //COOKIES
            fabricItemGroupEntries.add(COOKIE_APPLE);
            fabricItemGroupEntries.add(COOKIE_CARROT);
            fabricItemGroupEntries.add(COOKIE_GLOW_BERRY);
            fabricItemGroupEntries.add(COOKIE_HONEY);
            fabricItemGroupEntries.add(COOKIE_OATMEAL);
            fabricItemGroupEntries.add(COOKIE_POPPY_SEED);
            fabricItemGroupEntries.add(COOKIE_PUMPKIN);
            fabricItemGroupEntries.add(COOKIE_SPIDER_EYE);
            fabricItemGroupEntries.add(COOKIE_SUGAR);
            fabricItemGroupEntries.add(COOKIE_SUNFLOWER_SEED);
            fabricItemGroupEntries.add(COOKIE_SWEET_BERRY);

            //BAKED BREAD
            fabricItemGroupEntries.add(BREAD_BAGUEL);
            fabricItemGroupEntries.add(BREAD_BAGUETTE);
            fabricItemGroupEntries.add(BREAD_BAKED);
            fabricItemGroupEntries.add(BREAD_BROWNIE);
            fabricItemGroupEntries.add(BREAD_CROISSANT);
            fabricItemGroupEntries.add(BREAD_FLATBREAD);
            fabricItemGroupEntries.add(BREAD_FOCACCIA);
            fabricItemGroupEntries.add(BREAD_HONEY);
            fabricItemGroupEntries.add(BREAD_MULTIGRAIN);
            fabricItemGroupEntries.add(BREAD_PANCAKES);
            fabricItemGroupEntries.add(BREAD_SOURDOUGH);
            fabricItemGroupEntries.add(BREAD_SWEET_ROLL);

            //PIES
            fabricItemGroupEntries.add(PIE_APPLE);
            fabricItemGroupEntries.add(PIE_CHICKEN);
            fabricItemGroupEntries.add(PIE_CHOCOLATE);
            fabricItemGroupEntries.add(PIE_CHORUS_FRUIT);
            fabricItemGroupEntries.add(PIE_FISH);
            fabricItemGroupEntries.add(PIE_FUNGUS);
            fabricItemGroupEntries.add(PIE_GLOW_BERRY);
            fabricItemGroupEntries.add(PIE_HONEY);
            fabricItemGroupEntries.add(PIE_MEAT);
            fabricItemGroupEntries.add(PIE_MELON);
            fabricItemGroupEntries.add(PIE_MUSHROOM);
            fabricItemGroupEntries.add(PIE_SHEPHERDS);
            fabricItemGroupEntries.add(PIE_SWEET_BERRY);
            fabricItemGroupEntries.add(PIE_STRAWBERRY);
            fabricItemGroupEntries.add(PIE_VEGETABLE);

            //CROPS
            fabricItemGroupEntries.add(CABBAGE);
            fabricItemGroupEntries.add(CHILLI);
            fabricItemGroupEntries.add(GARLIC);
            fabricItemGroupEntries.add(EGGPLANT);
            fabricItemGroupEntries.add(LETTUCE);
            fabricItemGroupEntries.add(ONION);
            fabricItemGroupEntries.add(SWEET_POTATO);
            fabricItemGroupEntries.add(TOMATO);

            //CROPFOODS

            fabricItemGroupEntries.add(FOOD_ONION_RING);
            fabricItemGroupEntries.add(FOOD_POTATO_FRIES);
            fabricItemGroupEntries.add(FOOD_CHILLI_STEW);
            fabricItemGroupEntries.add(FOOD_COLESLAW);
            fabricItemGroupEntries.add(FOOD_BAKED_SWEET_POTATO);
            fabricItemGroupEntries.add(FOOD_ROASTED_GARLIC);
            fabricItemGroupEntries.add(FOOD_SALAD);
            fabricItemGroupEntries.add(FOOD_TOMATO_SOUP);
            fabricItemGroupEntries.add(FOOD_WRAP);
            fabricItemGroupEntries.add(FOOD_WRAP_VEGGIE);
            fabricItemGroupEntries.add(FOOD_ONION_SOUP);
            fabricItemGroupEntries.add(FOOD_SWEET_POTATO_FRIES);
            fabricItemGroupEntries.add(FOOD_BUMSBLECH_SALAD);


            fabricItemGroupEntries.add(BREAD_GARLIC);



            //MILK & CHEESE
            fabricItemGroupEntries.add(GOAT_MILK_BUCKET);

            //BERRIES & JAMS
            fabricItemGroupEntries.add(BERRY_BLACKBERRIES);
            fabricItemGroupEntries.add(BERRY_BLUEBERRIES);
            fabricItemGroupEntries.add(BERRY_ELDERBERRIES);
            fabricItemGroupEntries.add(BERRY_GOJI_BERRIES);
            fabricItemGroupEntries.add(BERRY_GOOSEBERRIES);
            fabricItemGroupEntries.add(BERRY_RASPBERRIES);
            fabricItemGroupEntries.add(BERRY_STRAWBERRIES);
            fabricItemGroupEntries.add(BERRY_WHITE_CURRANT_BERRIES);

            fabricItemGroupEntries.add(JAM_BLACKBERRY);
            fabricItemGroupEntries.add(JAM_BLUEBERRY);
            fabricItemGroupEntries.add(JAM_ELDERBERRY);
            fabricItemGroupEntries.add(JAM_GOJI_BERRY);
            fabricItemGroupEntries.add(JAM_GOOSEBERRY);
            fabricItemGroupEntries.add(JAM_RASPBERRY);
            fabricItemGroupEntries.add(JAM_SWEET_BERRY);
            fabricItemGroupEntries.add(JAM_STRAWBERRY);
            fabricItemGroupEntries.add(JAM_WHITE_CURRANT_BERRY);

            fabricItemGroupEntries.add(JAM_BLACKBERRY_MASH);
            fabricItemGroupEntries.add(JAM_BLUEBERRY_MASH);
            fabricItemGroupEntries.add(JAM_ELDERERRY_MASH);
            fabricItemGroupEntries.add(JAM_GOJI_BERRY_MASH);
            fabricItemGroupEntries.add(JAM_GOOSEBERRY_MASH);
            fabricItemGroupEntries.add(JAM_RASPBERRY_MASH);
            fabricItemGroupEntries.add(JAM_SWEET_BERRY_MASH);
            fabricItemGroupEntries.add(JAM_STRAWBERRY_MASH);
            fabricItemGroupEntries.add(JAM_WHITE_CURRANT_BERRY_MASH);

            //MEAT & DROPS
            fabricItemGroupEntries.add(RAW_MEAT_BEAR);
            fabricItemGroupEntries.add(RAW_MEAT_CAMEL);
            fabricItemGroupEntries.add(RAW_MEAT_HORSE);
            fabricItemGroupEntries.add(RAW_MEAT_VEGGIE);
            fabricItemGroupEntries.add(RAW_MEAT_SNIFFER);
            fabricItemGroupEntries.add(RAW_MEAT_GOAT);
            fabricItemGroupEntries.add(RAW_MEAT_LLAMA);
            fabricItemGroupEntries.add(RAW_MEAT_WOLF);
            fabricItemGroupEntries.add(RAW_MEAT_FOX);
            fabricItemGroupEntries.add(RAW_MEAT_CAT);
            fabricItemGroupEntries.add(RAW_MEAT_PARROT);
            fabricItemGroupEntries.add(RAW_MEAT_FROG);
            fabricItemGroupEntries.add(RAW_MEAT_BAT);
            fabricItemGroupEntries.add(RAW_MEAT_TURTLE);
            fabricItemGroupEntries.add(RAW_MEAT_DOLPHIN);
            fabricItemGroupEntries.add(RAW_MEAT_SQUID);
            fabricItemGroupEntries.add(RAW_MEAT_AXOLOTL);
            fabricItemGroupEntries.add(RAW_MEAT_ARMADILLO);
            fabricItemGroupEntries.add(RAW_MEAT_ALLAY);
            fabricItemGroupEntries.add(RAW_MEAT_NAUTILUS);
            fabricItemGroupEntries.add(RAW_MEAT_RAVAGER);


            fabricItemGroupEntries.add(COOKED_MEAT_BEAR);
            fabricItemGroupEntries.add(COOKED_MEAT_CAMEL);
            fabricItemGroupEntries.add(COOKED_MEAT_HORSE);
            fabricItemGroupEntries.add(COOKED_MEAT_VEGGIE);
            fabricItemGroupEntries.add(COOKED_MEAT_SNIFFER);
            fabricItemGroupEntries.add(COOKED_MEAT_GOAT);
            fabricItemGroupEntries.add(COOKED_MEAT_LLAMA);
            fabricItemGroupEntries.add(COOKED_MEAT_WOLF);
            fabricItemGroupEntries.add(COOKED_MEAT_FOX);
            fabricItemGroupEntries.add(COOKED_MEAT_PARROT);
            fabricItemGroupEntries.add(COOKED_MEAT_FROG);
            fabricItemGroupEntries.add(COOKED_MEAT_TURTLE);
            fabricItemGroupEntries.add(COOKED_MEAT_DOLPHIN);
            fabricItemGroupEntries.add(COOKED_MEAT_SQUID);
            fabricItemGroupEntries.add(COOKED_MEAT_AXOLOTL);
            fabricItemGroupEntries.add(COOKED_MEAT_ARMADILLO);
            fabricItemGroupEntries.add(COOKED_MEAT_NAUTILUS);
            fabricItemGroupEntries.add(COOKED_MEAT_RAVAGER);


        });

        //NEW ITEM IN INGREDIENTS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            //BREAD INGREDIENTS
            fabricItemGroupEntries.add(BUTTER);
            fabricItemGroupEntries.add(FLOUR);
            fabricItemGroupEntries.add(SALT);
            fabricItemGroupEntries.add(YEAST);

            //DOUGHS
            fabricItemGroupEntries.add(DOUGH_BAGUEL);
            fabricItemGroupEntries.add(DOUGH_BAGUETTE);
            fabricItemGroupEntries.add(DOUGH_BAKED_BREAD);
            fabricItemGroupEntries.add(DOUGH_BROWNIE);
            fabricItemGroupEntries.add(DOUGH_CROISSANT);
            fabricItemGroupEntries.add(DOUGH_FLATBREAD);
            fabricItemGroupEntries.add(DOUGH_FOCACCIA);
            fabricItemGroupEntries.add(DOUGH_HONEY);
            fabricItemGroupEntries.add(DOUGH_MULTIGRAIN);
            fabricItemGroupEntries.add(DOUGH_PANCAKES);
            fabricItemGroupEntries.add(DOUGH_SOURDOUGH);
            fabricItemGroupEntries.add(DOUGH_SWEET_ROLL);

            fabricItemGroupEntries.add(DOUGH_GARLIC);


        });

        //NEW ITEM IN NATURAL
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {

            //CROPS
            fabricItemGroupEntries.add(CHILLI_SEEDS);
            fabricItemGroupEntries.add(LETTUCE_SEEDS);
            fabricItemGroupEntries.add(TOMATO_SEEDS);


        });

        //NEW ITEM IN INGREDIENTS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(GOAT_MILK_BUCKET);
            fabricItemGroupEntries.add(GLASS_JAR);

        });

        //VANILLA STEWS AND SOUPS STACK TO 16, LIKE THE MOD'S OWN BOWL FOODS
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSHROOM_STEW, builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
            context.modify(Items.RABBIT_STEW, builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
            context.modify(Items.BEETROOT_SOUP, builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });


        }
}
