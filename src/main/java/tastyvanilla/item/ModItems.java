package tastyvanilla.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
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
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.food.ModFoods;


import java.util.function.Function;

import static net.minecraft.world.item.Items.BOWL;

public class ModItems {


    //TUTORIAL CODE REGISTER
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name)))));
    }

    //COOKIES
    public static final Item COOKIE_APPLE = registerItem("cookie_apple", properties -> new Item(properties.food(ModFoods.COOKIE_APPLE)));
    public static final Item COOKIE_CARROT = registerItem("cookie_carrot", properties -> new Item(properties.food(ModFoods.COOKIE_CARROT)));
    public static final Item COOKIE_GLOW_BERRY = registerItem("cookie_glow_berry", properties -> new Item(properties.food(ModFoods.COOKIE_GLOW_BERRY)));
    public static final Item COOKIE_HONEY = registerItem("cookie_honey", properties -> new Item(properties.food(ModFoods.COOKIE_HONEY)));
    public static final Item COOKIE_OATMEAL = registerItem("cookie_oatmeal", properties -> new Item(properties.food(ModFoods.COOKIE_OATMEAL)));
    public static final Item COOKIE_POPPY_SEED = registerItem("cookie_poppy_seed", properties -> new Item(properties.food(ModFoods.COOKIE_POPPY_SEED)));
    public static final Item COOKIE_PUMPKIN = registerItem("cookie_pumpkin", properties -> new Item(properties.food(ModFoods.COOKIE_PUMPKIN)));
    public static final Item COOKIE_SPIDER_EYE = registerItem("cookie_spider_eye", properties -> new Item(properties.food(ModFoods.COOKIE_SPIDER_EYE)));
    public static final Item COOKIE_SUGAR = registerItem("cookie_sugar", properties -> new Item(properties.food(ModFoods.COOKIE_SUGAR)));
    public static final Item COOKIE_SUNFLOWER_SEED = registerItem("cookie_sunflower_seed", properties -> new Item(properties.food(ModFoods.COOKIE_SUNFLOWER_SEED)));
    public static final Item COOKIE_SWEET_BERRY = registerItem("cookie_sweet_berry", properties -> new Item(properties.food(ModFoods.COOKIE_SWEET_BERRY)));

    //BREAD INGREDIENTS
    public static final Item BUTTER = registerItem("butter", Item::new);
    public static final Item FLOUR = registerItem("flour", Item::new);
    public static final Item SALT = registerItem("salt", Item::new);
    public static final Item YEAST = registerItem("yeast", Item::new);

    //BREAD DOUGHS
    public static final Item DOUGH_BAGUEL = registerItem("dough_baguel", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_BAGUETTE = registerItem("dough_baguette", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_BAKED_BREAD = registerItem("dough_baked_bread", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_BROWNIE = registerItem("dough_brownie",properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_CROISSANT = registerItem("dough_croissant",properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_FLATBREAD = registerItem("dough_flatbread", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_FOCACCIA = registerItem("dough_focaccia", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_HONEY = registerItem("dough_honey", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_MULTIGRAIN = registerItem("dough_multigrain", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_PANCAKES = registerItem("dough_pancakes", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_SOURDOUGH = registerItem("dough_sourdough", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_SWEET_ROLL = registerItem("dough_sweet_roll", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));

    //BAKED BREAD
    public static final Item BREAD_BAGUEL = registerItem("bread_baguel", properties -> new Item(properties.food(ModFoods.BREAD_BAGUEL)));
    public static final Item BREAD_BAGUETTE = registerItem("bread_baguette", properties -> new Item(properties.food(ModFoods.BREAD_BAGUETTE)));
    public static final Item BREAD_BAKED = registerItem("bread_baked", properties -> new Item(properties.food(ModFoods.BREAD_BAKED)));
    public static final Item BREAD_BROWNIE = registerItem("bread_brownie", properties -> new Item(properties.food(ModFoods.BREAD_BROWNIE)));
    public static final Item BREAD_CROISSANT = registerItem("bread_croissant", properties -> new Item(properties.food(ModFoods.BREAD_CROISSANT)));
    public static final Item BREAD_FLATBREAD = registerItem("bread_flatbread", properties -> new Item(properties.food(ModFoods.BREAD_FLATBREAD)));
    public static final Item BREAD_FOCACCIA = registerItem("bread_focaccia", properties -> new Item(properties.food(ModFoods.BREAD_FOCACCIA)));
    public static final Item BREAD_HONEY = registerItem("bread_honey", properties -> new Item(properties.food(ModFoods.BREAD_HONEY)));
    public static final Item BREAD_MULTIGRAIN = registerItem("bread_multigrain", properties -> new Item(properties.food(ModFoods.BREAD_MULTIGRAIN)));
    public static final Item BREAD_PANCAKES = registerItem("bread_pancakes", properties -> new Item(properties.food(ModFoods.BREAD_PANCAKES)));
    public static final Item BREAD_SOURDOUGH = registerItem("bread_sourdough", properties -> new Item(properties.food(ModFoods.BREAD_SOURDOUGH)));
    public static final Item BREAD_SWEET_ROLL = registerItem("bread_sweet_roll", properties -> new Item(properties.food(ModFoods.BREAD_SWEET_ROLL)));

    //PIES
    public static final Item PIE_APPLE = registerItem("pie_apple", properties -> new Item(properties.food(ModFoods.PIE_APPLE)));
    public static final Item PIE_CHICKEN = registerItem("pie_chicken", properties -> new Item(properties.food(ModFoods.PIE_CHICKEN)));
    public static final Item PIE_CHOCOLATE = registerItem("pie_chocolate", properties -> new Item(properties.food(ModFoods.PIE_CHOCOLATE)));
    public static final Item PIE_CHORUS_FRUIT = registerItem("pie_chorus_fruit", properties -> new Item(properties.food(ModFoods.PIE_CHORUS_FRUIT,ModFoods.PIE_CHORUS_FRUIT_CONSUMABLE)));
    public static final Item PIE_FISH = registerItem("pie_fish", properties -> new Item(properties.food(ModFoods.PIE_FISH)));
    public static final Item PIE_FUNGUS = registerItem("pie_fungus", properties -> new Item(properties.food(ModFoods.PIE_FUNGUS)));
    public static final Item PIE_GLOW_BERRY = registerItem("pie_glow_berry", properties -> new Item(properties.food(ModFoods.PIE_GLOW_BERRY)));
    public static final Item PIE_HONEY = registerItem("pie_honey", properties -> new Item(properties.food(ModFoods.PIE_HONEY)));
    public static final Item PIE_MEAT = registerItem("pie_meat", properties -> new Item(properties.food(ModFoods.PIE_MEAT)));
    public static final Item PIE_MELON = registerItem("pie_melon", properties -> new Item(properties.food(ModFoods.PIE_MELON)));
    public static final Item PIE_MUSHROOM = registerItem("pie_mushroom", properties -> new Item(properties.food(ModFoods.PIE_MUSHROOM)));
    public static final Item PIE_SHEPHERDS = registerItem("pie_shepherds", properties -> new Item(properties.food(ModFoods.PIE_SHEPHERDS)));
    public static final Item PIE_SWEET_BERRY = registerItem("pie_sweet_berry", properties -> new Item(properties.food(ModFoods.PIE_SWEET_BERRY)));
    public static final Item PIE_STRAWBERRY = registerItem("pie_strawberry", properties -> new Item(properties.food(ModFoods.PIE_STRAWBERRY)));
    public static final Item PIE_VEGETABLE = registerItem("pie_vegetable", properties -> new Item(properties.food(ModFoods.PIE_VEGETABLE)));

    //CROPS
    public static final Item CABBAGE = registerItem("cabbage", properties -> new BlockItem(ModBlocks.CABBAGE_CROP, properties.food(ModFoods.CABBAGE).useItemDescriptionPrefix()));

    public static final Item CHILLI = registerItem("chilli", properties -> new Item(properties.food(ModFoods.CHILLI)));
    public static final Item CHILLI_SEEDS = registerItem("chilli_seeds",properties -> new BlockItem(ModBlocks.CHILLI_CROP, properties.useItemDescriptionPrefix()));

    public static final Item EGGPLANT = registerItem("eggplant", properties -> new BlockItem(ModBlocks.EGGPLANT_CROP, properties.food(ModFoods.EGGPLANT).useItemDescriptionPrefix()));

    public static final Item GARLIC = registerItem("garlic", properties -> new BlockItem(ModBlocks.GARLIC_CROP, properties.food(ModFoods.GARLIC).useItemDescriptionPrefix()));

    public static final Item LETTUCE = registerItem("lettuce", properties -> new Item(properties.food(ModFoods.LETTUCE)));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds", properties -> new BlockItem(ModBlocks.LETTUCE_CROP, properties.useItemDescriptionPrefix()));

    public static final Item ONION = registerItem("onion",properties -> new BlockItem(ModBlocks.ONION_CROP, properties.food(ModFoods.ONION).useItemDescriptionPrefix()));

    public static final Item SWEET_POTATO = registerItem("sweet_potato", properties -> new BlockItem(ModBlocks.SWEET_POTATO_CROP, properties.food(ModFoods.SWEET_POTATO).useItemDescriptionPrefix()));

    public static final Item TOMATO = registerItem("tomato", properties -> new Item(properties.food(ModFoods.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", properties -> new BlockItem(ModBlocks.TOMATO_CROP, properties.useItemDescriptionPrefix()));


    //CROP FOODS
    public static final Item FOOD_TOMATO_SOUP = registerItem("food_tomato_soup", properties -> new Item(properties.food(ModFoods.FOOD_TOMATO_SOUP).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_SALAD = registerItem("food_salad", properties -> new Item(properties.food(ModFoods.FOOD_SALAD).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_WRAP_VEGGIE = registerItem("food_wrap_veggie", properties -> new Item(properties.food(ModFoods.FOOD_WRAP_VEGGIE)));
    public static final Item FOOD_WRAP = registerItem("food_wrap", properties -> new Item(properties.food(ModFoods.FOOD_WRAP)));
    public static final Item FOOD_ONION_SOUP = registerItem("food_onion_soup", properties -> new Item(properties.food(ModFoods.FOOD_ONION_SOUP).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_ONION_RING = registerItem("food_onion_ring", properties -> new Item(properties.food(ModFoods.FOOD_ONION_RING)));
    public static final Item FOOD_ROASTED_GARLIC = registerItem("food_roasted_garlic", properties -> new Item(properties.food(ModFoods.FOOD_ROASTED_GARLIC)));
    public static final Item FOOD_BAKED_SWEET_POTATO = registerItem("food_baked_sweet_potato", properties -> new Item(properties.food(ModFoods.FOOD_BAKED_SWEET_POTATO)));
    public static final Item FOOD_SWEET_POTATO_FRIES = registerItem("food_sweet_potato_fries", properties -> new Item(properties.food(ModFoods.FOOD_SWEET_POTATO_FRIES)));
    public static final Item FOOD_POTATO_FRIES = registerItem("food_potato_fries", properties -> new Item(properties.food(ModFoods.FOOD_POTATO_FRIES).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_COLESLAW = registerItem("food_coleslaw", properties -> new Item(properties.food(ModFoods.FOOD_COLESLAW).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_CHILLI_STEW = registerItem("food_chilli_stew", properties -> new Item(properties.food(ModFoods.FOOD_CHILLI_STEW).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_BUMSBLECH_SALAD = registerItem("food_bumsblech_salad", properties -> new Item(properties.food(ModFoods.FOOD_BUMSBLECH_SALAD).stacksTo(16).usingConvertsTo(BOWL)));

    public static final Item BREAD_GARLIC = registerItem("bread_garlic", properties -> new Item(properties.food(ModFoods.BREAD_GARLIC)));
    public static final Item DOUGH_GARLIC = registerItem("dough_garlic", properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));

    //MILK & CHEESE
    public static final Item GOAT_MILK_BUCKET = registerItem("goat_milk_bucket",properties -> new Item(properties.craftRemainder(Items.BUCKET).component(DataComponents.CONSUMABLE,Consumables.MILK_BUCKET).usingConvertsTo(Items.BUCKET).stacksTo(1)));

    //MEATS & DROPS
    public static final Item RAW_MEAT_BEAR = registerItem("raw_meat_bear", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_CAMEL = registerItem("raw_meat_camel", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_HORSE = registerItem("raw_meat_horse", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_VEGGIE = registerItem("raw_meat_veggie", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2)));
    public static final Item RAW_MEAT_SNIFFER = registerItem("raw_meat_sniffer", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_GOAT = registerItem("raw_meat_goat", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_LlAMA = registerItem("raw_meat_llama", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_WOLF = registerItem("raw_meat_wolf", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_FOX = registerItem("raw_meat_fox", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_CAT = registerItem("raw_meat_cat", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_PARROT = registerItem("raw_meat_parrot", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_FROG = registerItem("raw_meat_frog", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));
    public static final Item RAW_MEAT_BAT = registerItem("raw_meat_bat", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_TURTLE = registerItem("raw_meat_turtle", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_DOLPHIN = registerItem("raw_meat_dolphin", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_SQUID = registerItem("raw_meat_squid", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));
    public static final Item RAW_MEAT_AXOLOTL = registerItem("raw_meat_axolotl", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_ARMADILLO = registerItem("raw_meat_armadillo", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2)));
    public static final Item RAW_MEAT_ALLAY = registerItem("raw_meat_allay", properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4)));

    public static final Item COOKED_MEAT_BEAR = registerItem("cooked_meat_bear", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_CAMEL = registerItem("cooked_meat_camel", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_HORSE = registerItem("cooked_meat_horse", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_VEGGIE = registerItem("cooked_meat_veggie", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_SNIFFER = registerItem("cooked_meat_sniffer", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_GOAT = registerItem("cooked_meat_goat", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_LlAMA = registerItem("cooked_meat_llama", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_WOLF = registerItem("cooked_meat_wolf", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_FOX = registerItem("cooked_meat_fox", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_CAT = registerItem("cooked_meat_cat", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_PARROT = registerItem("cooked_meat_parrot", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_FROG = registerItem("cooked_meat_frog", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_BAT = registerItem("cooked_meat_bat", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_4)));
    public static final Item COOKED_MEAT_TURTLE = registerItem("cooked_meat_turtle", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_DOLPHIN = registerItem("cooked_meat_dolphin", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_SQUID = registerItem("cooked_meat_squid", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_AXOLOTL = registerItem("cooked_meat_axolotl", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_ARMADILLO = registerItem("cooked_meat_armadillo", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_ALLAY = registerItem("cooked_meat_allay", properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_4)));

    //BERRIES & JAMS
    public static final Item BERRY_BLACKBERRIES = registerItem("berry_blackberries", properties -> new BlockItem(ModBlocks.BERRY_BLACKBERRY_BUSH,properties.food(ModFoods.BERRY_BLACKBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_BLUEBERRIES = registerItem("berry_blueberries", properties -> new BlockItem(ModBlocks.BERRY_BLUEBERRY_BUSH,properties.food(ModFoods.BERRY_BLUEBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_ELDERBERRIES = registerItem("berry_elderberries", properties -> new BlockItem(ModBlocks.BERRY_ELDERBERRY_BUSH,properties.food(ModFoods.BERRY_ELDERBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_GOJI_BERRIES = registerItem("berry_goji_berries", properties -> new BlockItem(ModBlocks.BERRY_GOJI_BERRY_BUSH,properties.food(ModFoods.BERRY_GOJI_BERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_GOOSEBERRIES = registerItem("berry_gooseberries", properties -> new BlockItem(ModBlocks.BERRY_GOOSEBERRY_BUSH,properties.food(ModFoods.BERRY_GOOSEBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_RASPBERRIES = registerItem("berry_raspberries", properties -> new BlockItem(ModBlocks.BERRY_RASPBERRY_BUSH,properties.food(ModFoods.BERRY_RASPBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_STRAWBERRIES = registerItem("berry_strawberries", properties -> new BlockItem(ModBlocks.BERRY_STRAWBERRY_BUSH,properties.food(ModFoods.BERRY_STRAWBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_WHITE_CURRANT_BERRIES = registerItem("berry_white_currant_berries", properties -> new BlockItem(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH,properties.food(ModFoods.BERRY_WHITE_CURRANT_BERRIES).useItemDescriptionPrefix()));
    
    public static final Item GLASS_JAR = registerItem("glass_jar", Item::new);

    public static final Item JAM_BLACKBERRY = registerItem("jam_blackberry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLACKBERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_BLUEBERRY = registerItem("jam_blueberry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLUEBERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_ELDERBERRY = registerItem("jam_elderberry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_ELDERBERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOJI_BERRY = registerItem("jam_goji_berry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOJI_BERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOOSEBERRY = registerItem("jam_gooseberry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOOSEBERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_RASPBERRY = registerItem("jam_raspberry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_RASPBERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_STRAWBERRY = registerItem("jam_strawberry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_STRAWBERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_WHITE_CURRANT_BERRY = registerItem("jam_white_currant_berry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_WHITE_CURRANT_BERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_SWEET_BERRY = registerItem("jam_sweet_berry", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_SWEET_BERRY, ModFoods.JAMS_CONSUMABLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_BLACKBERRY_MASH = registerItem("jam_blackberry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLACKBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_BLUEBERRY_MASH = registerItem("jam_blueberry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLUEBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_ELDERERRY_MASH = registerItem("jam_elderberry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_ELDERBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOJI_BERRY_MASH = registerItem("jam_goji_berry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOJI_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOOSEBERRY_MASH = registerItem("jam_gooseberry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOOSEBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_RASPBERRY_MASH = registerItem("jam_raspberry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_RASPBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_STRAWBERRY_MASH = registerItem("jam_strawberry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_STRAWBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_WHITE_CURRANT_BERRY_MASH = registerItem("jam_white_currant_berry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_WHITE_CURRANT_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_SWEET_BERRY_MASH = registerItem("jam_sweet_berry_mash", properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_SWEET_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));

    //GOLDEN FOODS


    //ITEM INITIALIZER
    public static void registerModItems() {
        TastyVanilla.LOGGER.info("Registering Mod Items for " + TastyVanilla.MOD_ID);

    //NEW ITEM IN FOOD AND DRINKS
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {

            //COOKIES
            output.accept(COOKIE_APPLE);
            output.accept(COOKIE_CARROT);
            output.accept(COOKIE_GLOW_BERRY);
            output.accept(COOKIE_HONEY);
            output.accept(COOKIE_OATMEAL);
            output.accept(COOKIE_POPPY_SEED);
            output.accept(COOKIE_PUMPKIN);
            output.accept(COOKIE_SPIDER_EYE);
            output.accept(COOKIE_SUGAR);
            output.accept(COOKIE_SUNFLOWER_SEED);
            output.accept(COOKIE_SWEET_BERRY);

            //BAKED BREAD
            output.accept(BREAD_BAGUEL);
            output.accept(BREAD_BAGUETTE);
            output.accept(BREAD_BAKED);
            output.accept(BREAD_BROWNIE);
            output.accept(BREAD_CROISSANT);
            output.accept(BREAD_FLATBREAD);
            output.accept(BREAD_FOCACCIA);
            output.accept(BREAD_HONEY);
            output.accept(BREAD_MULTIGRAIN);
            output.accept(BREAD_PANCAKES);
            output.accept(BREAD_SOURDOUGH);
            output.accept(BREAD_SWEET_ROLL);

            //PIES
            output.accept(PIE_APPLE);
            output.accept(PIE_CHICKEN);
            output.accept(PIE_CHOCOLATE);
            output.accept(PIE_CHORUS_FRUIT);
            output.accept(PIE_FISH);
            output.accept(PIE_FUNGUS);
            output.accept(PIE_GLOW_BERRY);
            output.accept(PIE_HONEY);
            output.accept(PIE_MEAT);
            output.accept(PIE_MELON);
            output.accept(PIE_MUSHROOM);
            output.accept(PIE_SHEPHERDS);
            output.accept(PIE_SWEET_BERRY);
            output.accept(PIE_STRAWBERRY);
            output.accept(PIE_VEGETABLE);

            //CROPS
            output.accept(CABBAGE);
            output.accept(CHILLI);
            output.accept(GARLIC);
            output.accept(EGGPLANT);
            output.accept(LETTUCE);
            output.accept(ONION);
            output.accept(SWEET_POTATO);
            output.accept(TOMATO);

            //CROPFOODS
            output.accept(FOOD_ONION_RING);
            output.accept(FOOD_POTATO_FRIES);
            output.accept(FOOD_CHILLI_STEW);
            output.accept(FOOD_COLESLAW);
            output.accept(FOOD_BAKED_SWEET_POTATO);
            output.accept(FOOD_ROASTED_GARLIC);
            output.accept(FOOD_SALAD);
            output.accept(FOOD_TOMATO_SOUP);
            output.accept(FOOD_WRAP);
            output.accept(FOOD_WRAP_VEGGIE);
            output.accept(FOOD_ONION_SOUP);
            output.accept(FOOD_SWEET_POTATO_FRIES);
            output.accept(FOOD_BUMSBLECH_SALAD);

            output.accept(BREAD_GARLIC);

            //MILK & CHEESE
            output.accept(GOAT_MILK_BUCKET);

            //BERRIES & JAMS
            output.accept(BERRY_BLACKBERRIES);
            output.accept(BERRY_BLUEBERRIES);
            output.accept(BERRY_ELDERBERRIES);
            output.accept(BERRY_GOJI_BERRIES);
            output.accept(BERRY_GOOSEBERRIES);
            output.accept(BERRY_RASPBERRIES);
            output.accept(BERRY_STRAWBERRIES);
            output.accept(BERRY_WHITE_CURRANT_BERRIES);

            output.accept(JAM_BLACKBERRY);
            output.accept(JAM_BLUEBERRY);
            output.accept(JAM_ELDERBERRY);
            output.accept(JAM_GOJI_BERRY);
            output.accept(JAM_GOOSEBERRY);
            output.accept(JAM_RASPBERRY);
            output.accept(JAM_SWEET_BERRY);
            output.accept(JAM_STRAWBERRY);
            output.accept(JAM_WHITE_CURRANT_BERRY);

            output.accept(JAM_BLACKBERRY_MASH);
            output.accept(JAM_BLUEBERRY_MASH);
            output.accept(JAM_ELDERERRY_MASH);
            output.accept(JAM_GOJI_BERRY_MASH);
            output.accept(JAM_GOOSEBERRY_MASH);
            output.accept(JAM_RASPBERRY_MASH);
            output.accept(JAM_SWEET_BERRY_MASH);
            output.accept(JAM_STRAWBERRY_MASH);
            output.accept(JAM_WHITE_CURRANT_BERRY_MASH);

            //MEAT & DROPS
            output.accept(RAW_MEAT_BEAR);
            output.accept(RAW_MEAT_CAMEL);
            output.accept(RAW_MEAT_HORSE);
            output.accept(RAW_MEAT_VEGGIE);
            output.accept(RAW_MEAT_SNIFFER);
            output.accept(RAW_MEAT_GOAT);
            output.accept(RAW_MEAT_LlAMA);
            output.accept(RAW_MEAT_WOLF);
            output.accept(RAW_MEAT_FOX);
            output.accept(RAW_MEAT_CAT);
            output.accept(RAW_MEAT_PARROT);
            output.accept(RAW_MEAT_FROG);
            output.accept(RAW_MEAT_BAT);
            output.accept(RAW_MEAT_TURTLE);
            output.accept(RAW_MEAT_DOLPHIN);
            output.accept(RAW_MEAT_SQUID);
            output.accept(RAW_MEAT_AXOLOTL);
            output.accept(RAW_MEAT_ARMADILLO);
            output.accept(RAW_MEAT_ALLAY);

            output.accept(COOKED_MEAT_BEAR);
            output.accept(COOKED_MEAT_CAMEL);
            output.accept(COOKED_MEAT_HORSE);
            output.accept(COOKED_MEAT_VEGGIE);
            output.accept(COOKED_MEAT_SNIFFER);
            output.accept(COOKED_MEAT_GOAT);
            output.accept(COOKED_MEAT_LlAMA);
            output.accept(COOKED_MEAT_WOLF);
            output.accept(COOKED_MEAT_FOX);
            output.accept(COOKED_MEAT_CAT);
            output.accept(COOKED_MEAT_PARROT);
            output.accept(COOKED_MEAT_FROG);
            output.accept(COOKED_MEAT_BAT);
            output.accept(COOKED_MEAT_TURTLE);
            output.accept(COOKED_MEAT_DOLPHIN);
            output.accept(COOKED_MEAT_SQUID);
            output.accept(COOKED_MEAT_AXOLOTL);
            output.accept(COOKED_MEAT_ARMADILLO);
            output.accept(COOKED_MEAT_ALLAY);

        });

        //NEW ITEM IN INGREDIENTS
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {

            //BREAD INGREDIENTS
            output.accept(BUTTER);
            output.accept(FLOUR);
            output.accept(SALT);
            output.accept(YEAST);

            //DOUGHS
            output.accept(DOUGH_BAGUEL);
            output.accept(DOUGH_BAGUETTE);
            output.accept(DOUGH_BAKED_BREAD);
            output.accept(DOUGH_BROWNIE);
            output.accept(DOUGH_CROISSANT);
            output.accept(DOUGH_FLATBREAD);
            output.accept(DOUGH_FOCACCIA);
            output.accept(DOUGH_HONEY);
            output.accept(DOUGH_MULTIGRAIN);
            output.accept(DOUGH_PANCAKES);
            output.accept(DOUGH_SOURDOUGH);
            output.accept(DOUGH_SWEET_ROLL);

            output.accept(DOUGH_GARLIC);


        });

        //NEW ITEM IN NATURAL BLOCKS
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {

            //CROPS
            output.accept(CHILLI_SEEDS);
            output.accept(LETTUCE_SEEDS);
            output.accept(TOMATO_SEEDS);


        });

        //NEW ITEM IN TOOLS AND UTILITIES
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {

            output.accept(GOAT_MILK_BUCKET);
            output.accept(GLASS_JAR);

        });

    }
}