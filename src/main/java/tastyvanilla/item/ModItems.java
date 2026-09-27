package tastyvanilla.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
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
    private static Item registerItem(ResourceKey<Item> id, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, id,
                function.apply(new Item.Properties().setId(id)));
    }

    //COOKIES
    public static final Item COOKIE_APPLE = registerItem(ModItemIds.COOKIE_APPLE, properties -> new Item(properties.food(ModFoods.COOKIE_APPLE)));
    public static final Item COOKIE_CARROT = registerItem(ModItemIds.COOKIE_CARROT, properties -> new Item(properties.food(ModFoods.COOKIE_CARROT)));
    public static final Item COOKIE_GLOW_BERRY = registerItem(ModItemIds.COOKIE_GLOW_BERRY, properties -> new Item(properties.food(ModFoods.COOKIE_GLOW_BERRY)));
    public static final Item COOKIE_HONEY = registerItem(ModItemIds.COOKIE_HONEY, properties -> new Item(properties.food(ModFoods.COOKIE_HONEY)));
    public static final Item COOKIE_OATMEAL = registerItem(ModItemIds.COOKIE_OATMEAL, properties -> new Item(properties.food(ModFoods.COOKIE_OATMEAL)));
    public static final Item COOKIE_POPPY_SEED = registerItem(ModItemIds.COOKIE_POPPY_SEED, properties -> new Item(properties.food(ModFoods.COOKIE_POPPY_SEED)));
    public static final Item COOKIE_PUMPKIN = registerItem(ModItemIds.COOKIE_PUMPKIN, properties -> new Item(properties.food(ModFoods.COOKIE_PUMPKIN)));
    public static final Item COOKIE_SPIDER_EYE = registerItem(ModItemIds.COOKIE_SPIDER_EYE, properties -> new Item(properties.food(ModFoods.COOKIE_SPIDER_EYE)));
    public static final Item COOKIE_SUGAR = registerItem(ModItemIds.COOKIE_SUGAR, properties -> new Item(properties.food(ModFoods.COOKIE_SUGAR)));
    public static final Item COOKIE_SUNFLOWER_SEED = registerItem(ModItemIds.COOKIE_SUNFLOWER_SEED, properties -> new Item(properties.food(ModFoods.COOKIE_SUNFLOWER_SEED)));
    public static final Item COOKIE_SWEET_BERRY = registerItem(ModItemIds.COOKIE_SWEET_BERRY, properties -> new Item(properties.food(ModFoods.COOKIE_SWEET_BERRY)));

    //BREAD INGREDIENTS
    public static final Item BUTTER = registerItem(ModItemIds.BUTTER, Item::new);
    public static final Item FLOUR = registerItem(ModItemIds.FLOUR, Item::new);
    public static final Item SALT = registerItem(ModItemIds.SALT, Item::new);
    public static final Item YEAST = registerItem(ModItemIds.YEAST, Item::new);

    //BREAD DOUGHS
    public static final Item DOUGH_BAGUEL = registerItem(ModItemIds.DOUGH_BAGUEL, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_BAGUETTE = registerItem(ModItemIds.DOUGH_BAGUETTE, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_BAKED_BREAD = registerItem(ModItemIds.DOUGH_BAKED_BREAD, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_BROWNIE = registerItem(ModItemIds.DOUGH_BROWNIE,properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_CROISSANT = registerItem(ModItemIds.DOUGH_CROISSANT,properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_FLATBREAD = registerItem(ModItemIds.DOUGH_FLATBREAD, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_FOCACCIA = registerItem(ModItemIds.DOUGH_FOCACCIA, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_HONEY = registerItem(ModItemIds.DOUGH_HONEY, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_MULTIGRAIN = registerItem(ModItemIds.DOUGH_MULTIGRAIN, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_PANCAKES = registerItem(ModItemIds.DOUGH_PANCAKES, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_SOURDOUGH = registerItem(ModItemIds.DOUGH_SOURDOUGH, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));
    public static final Item DOUGH_SWEET_ROLL = registerItem(ModItemIds.DOUGH_SWEET_ROLL, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));

    //BAKED BREAD
    public static final Item BREAD_BAGUEL = registerItem(ModItemIds.BREAD_BAGUEL, properties -> new Item(properties.food(ModFoods.BREAD_BAGUEL)));
    public static final Item BREAD_BAGUETTE = registerItem(ModItemIds.BREAD_BAGUETTE, properties -> new Item(properties.food(ModFoods.BREAD_BAGUETTE)));
    public static final Item BREAD_BAKED = registerItem(ModItemIds.BREAD_BAKED, properties -> new Item(properties.food(ModFoods.BREAD_BAKED)));
    public static final Item BREAD_BROWNIE = registerItem(ModItemIds.BREAD_BROWNIE, properties -> new Item(properties.food(ModFoods.BREAD_BROWNIE)));
    public static final Item BREAD_CROISSANT = registerItem(ModItemIds.BREAD_CROISSANT, properties -> new Item(properties.food(ModFoods.BREAD_CROISSANT)));
    public static final Item BREAD_FLATBREAD = registerItem(ModItemIds.BREAD_FLATBREAD, properties -> new Item(properties.food(ModFoods.BREAD_FLATBREAD)));
    public static final Item BREAD_FOCACCIA = registerItem(ModItemIds.BREAD_FOCACCIA, properties -> new Item(properties.food(ModFoods.BREAD_FOCACCIA)));
    public static final Item BREAD_HONEY = registerItem(ModItemIds.BREAD_HONEY, properties -> new Item(properties.food(ModFoods.BREAD_HONEY)));
    public static final Item BREAD_MULTIGRAIN = registerItem(ModItemIds.BREAD_MULTIGRAIN, properties -> new Item(properties.food(ModFoods.BREAD_MULTIGRAIN)));
    public static final Item BREAD_PANCAKES = registerItem(ModItemIds.BREAD_PANCAKES, properties -> new Item(properties.food(ModFoods.BREAD_PANCAKES)));
    public static final Item BREAD_SOURDOUGH = registerItem(ModItemIds.BREAD_SOURDOUGH, properties -> new Item(properties.food(ModFoods.BREAD_SOURDOUGH)));
    public static final Item BREAD_SWEET_ROLL = registerItem(ModItemIds.BREAD_SWEET_ROLL, properties -> new Item(properties.food(ModFoods.BREAD_SWEET_ROLL)));

    //PIES
    public static final Item PIE_APPLE = registerItem(ModItemIds.PIE_APPLE, properties -> new Item(properties.food(ModFoods.PIE_APPLE)));
    public static final Item PIE_CHICKEN = registerItem(ModItemIds.PIE_CHICKEN, properties -> new Item(properties.food(ModFoods.PIE_CHICKEN)));
    public static final Item PIE_CHOCOLATE = registerItem(ModItemIds.PIE_CHOCOLATE, properties -> new Item(properties.food(ModFoods.PIE_CHOCOLATE)));
    public static final Item PIE_CHORUS_FRUIT = registerItem(ModItemIds.PIE_CHORUS_FRUIT, properties -> new Item(properties.food(ModFoods.PIE_CHORUS_FRUIT,ModFoods.PIE_CHORUS_FRUIT_CONSUMABLE)));
    public static final Item PIE_FISH = registerItem(ModItemIds.PIE_FISH, properties -> new Item(properties.food(ModFoods.PIE_FISH)));
    public static final Item PIE_FUNGUS = registerItem(ModItemIds.PIE_FUNGUS, properties -> new Item(properties.food(ModFoods.PIE_FUNGUS)));
    public static final Item PIE_GLOW_BERRY = registerItem(ModItemIds.PIE_GLOW_BERRY, properties -> new Item(properties.food(ModFoods.PIE_GLOW_BERRY)));
    public static final Item PIE_HONEY = registerItem(ModItemIds.PIE_HONEY, properties -> new Item(properties.food(ModFoods.PIE_HONEY)));
    public static final Item PIE_MEAT = registerItem(ModItemIds.PIE_MEAT, properties -> new Item(properties.food(ModFoods.PIE_MEAT)));
    public static final Item PIE_MELON = registerItem(ModItemIds.PIE_MELON, properties -> new Item(properties.food(ModFoods.PIE_MELON)));
    public static final Item PIE_MUSHROOM = registerItem(ModItemIds.PIE_MUSHROOM, properties -> new Item(properties.food(ModFoods.PIE_MUSHROOM)));
    public static final Item PIE_SHEPHERDS = registerItem(ModItemIds.PIE_SHEPHERDS, properties -> new Item(properties.food(ModFoods.PIE_SHEPHERDS)));
    public static final Item PIE_SWEET_BERRY = registerItem(ModItemIds.PIE_SWEET_BERRY, properties -> new Item(properties.food(ModFoods.PIE_SWEET_BERRY)));
    public static final Item PIE_STRAWBERRY = registerItem(ModItemIds.PIE_STRAWBERRY, properties -> new Item(properties.food(ModFoods.PIE_STRAWBERRY)));
    public static final Item PIE_VEGETABLE = registerItem(ModItemIds.PIE_VEGETABLE, properties -> new Item(properties.food(ModFoods.PIE_VEGETABLE)));

    //CROPS
    public static final Item CABBAGE = registerItem(ModItemIds.CABBAGE, properties -> new BlockItem(ModBlocks.CABBAGE_CROP, properties.food(ModFoods.CABBAGE).useItemDescriptionPrefix()));

    public static final Item CHILLI = registerItem(ModItemIds.CHILLI, properties -> new Item(properties.food(ModFoods.CHILLI)));
    public static final Item CHILLI_SEEDS = registerItem(ModItemIds.CHILLI_SEEDS,properties -> new BlockItem(ModBlocks.CHILLI_CROP, properties.useItemDescriptionPrefix()));

    public static final Item EGGPLANT = registerItem(ModItemIds.EGGPLANT, properties -> new BlockItem(ModBlocks.EGGPLANT_CROP, properties.food(ModFoods.EGGPLANT).useItemDescriptionPrefix()));

    public static final Item GARLIC = registerItem(ModItemIds.GARLIC, properties -> new BlockItem(ModBlocks.GARLIC_CROP, properties.food(ModFoods.GARLIC).useItemDescriptionPrefix()));

    public static final Item LETTUCE = registerItem(ModItemIds.LETTUCE, properties -> new Item(properties.food(ModFoods.LETTUCE)));
    public static final Item LETTUCE_SEEDS = registerItem(ModItemIds.LETTUCE_SEEDS, properties -> new BlockItem(ModBlocks.LETTUCE_CROP, properties.useItemDescriptionPrefix()));

    public static final Item ONION = registerItem(ModItemIds.ONION,properties -> new BlockItem(ModBlocks.ONION_CROP, properties.food(ModFoods.ONION).useItemDescriptionPrefix()));

    public static final Item SWEET_POTATO = registerItem(ModItemIds.SWEET_POTATO, properties -> new BlockItem(ModBlocks.SWEET_POTATO_CROP, properties.food(ModFoods.SWEET_POTATO).useItemDescriptionPrefix()));

    public static final Item TOMATO = registerItem(ModItemIds.TOMATO, properties -> new Item(properties.food(ModFoods.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem(ModItemIds.TOMATO_SEEDS, properties -> new BlockItem(ModBlocks.TOMATO_CROP, properties.useItemDescriptionPrefix()));


    //CROP FOODS
    public static final Item FOOD_TOMATO_SOUP = registerItem(ModItemIds.FOOD_TOMATO_SOUP, properties -> new Item(properties.food(ModFoods.FOOD_TOMATO_SOUP).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_SALAD = registerItem(ModItemIds.FOOD_SALAD, properties -> new Item(properties.food(ModFoods.FOOD_SALAD).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_WRAP_VEGGIE = registerItem(ModItemIds.FOOD_WRAP_VEGGIE, properties -> new Item(properties.food(ModFoods.FOOD_WRAP_VEGGIE)));
    public static final Item FOOD_WRAP = registerItem(ModItemIds.FOOD_WRAP, properties -> new Item(properties.food(ModFoods.FOOD_WRAP)));
    public static final Item FOOD_ONION_SOUP = registerItem(ModItemIds.FOOD_ONION_SOUP, properties -> new Item(properties.food(ModFoods.FOOD_ONION_SOUP).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_ONION_RING = registerItem(ModItemIds.FOOD_ONION_RING, properties -> new Item(properties.food(ModFoods.FOOD_ONION_RING)));
    public static final Item FOOD_ROASTED_GARLIC = registerItem(ModItemIds.FOOD_ROASTED_GARLIC, properties -> new Item(properties.food(ModFoods.FOOD_ROASTED_GARLIC)));
    public static final Item FOOD_BAKED_SWEET_POTATO = registerItem(ModItemIds.FOOD_BAKED_SWEET_POTATO, properties -> new Item(properties.food(ModFoods.FOOD_BAKED_SWEET_POTATO)));
    public static final Item FOOD_SWEET_POTATO_FRIES = registerItem(ModItemIds.FOOD_SWEET_POTATO_FRIES, properties -> new Item(properties.food(ModFoods.FOOD_SWEET_POTATO_FRIES).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_POTATO_FRIES = registerItem(ModItemIds.FOOD_POTATO_FRIES, properties -> new Item(properties.food(ModFoods.FOOD_POTATO_FRIES).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_COLESLAW = registerItem(ModItemIds.FOOD_COLESLAW, properties -> new Item(properties.food(ModFoods.FOOD_COLESLAW).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_CHILLI_STEW = registerItem(ModItemIds.FOOD_CHILLI_STEW, properties -> new Item(properties.food(ModFoods.FOOD_CHILLI_STEW).stacksTo(16).usingConvertsTo(BOWL)));
    public static final Item FOOD_BUMSBLECH_SALAD = registerItem(ModItemIds.FOOD_BUMSBLECH_SALAD, properties -> new Item(properties.food(ModFoods.FOOD_BUMSBLECH_SALAD).stacksTo(16).usingConvertsTo(BOWL)));

    public static final Item BREAD_GARLIC = registerItem(ModItemIds.BREAD_GARLIC, properties -> new Item(properties.food(ModFoods.BREAD_GARLIC)));
    public static final Item DOUGH_GARLIC = registerItem(ModItemIds.DOUGH_GARLIC, properties -> new Item(properties.food(ModFoods.DOUGHS,ModFoods.DOUGH_CONSUMABLE)));

    //MILK & CHEESE
    public static final Item GOAT_MILK_BUCKET = registerItem(ModItemIds.GOAT_MILK_BUCKET,properties -> new Item(properties.craftRemainder(Items.BUCKET).component(DataComponents.CONSUMABLE,Consumables.MILK_BUCKET).usingConvertsTo(Items.BUCKET).stacksTo(1)));

    //MEATS & DROPS
    public static final Item RAW_MEAT_BEAR = registerItem(ModItemIds.RAW_MEAT_BEAR, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_CAMEL = registerItem(ModItemIds.RAW_MEAT_CAMEL, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_HORSE = registerItem(ModItemIds.RAW_MEAT_HORSE, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_VEGGIE = registerItem(ModItemIds.RAW_MEAT_VEGGIE, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2)));
    public static final Item RAW_MEAT_SNIFFER = registerItem(ModItemIds.RAW_MEAT_SNIFFER, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_GOAT = registerItem(ModItemIds.RAW_MEAT_GOAT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_LLAMA = registerItem(ModItemIds.RAW_MEAT_LLAMA, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1)));
    public static final Item RAW_MEAT_WOLF = registerItem(ModItemIds.RAW_MEAT_WOLF, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_FOX = registerItem(ModItemIds.RAW_MEAT_FOX, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_CAT = registerItem(ModItemIds.RAW_MEAT_CAT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_PARROT = registerItem(ModItemIds.RAW_MEAT_PARROT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_FROG = registerItem(ModItemIds.RAW_MEAT_FROG, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));
    public static final Item RAW_MEAT_BAT = registerItem(ModItemIds.RAW_MEAT_BAT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_TURTLE = registerItem(ModItemIds.RAW_MEAT_TURTLE, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_DOLPHIN = registerItem(ModItemIds.RAW_MEAT_DOLPHIN, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_SQUID = registerItem(ModItemIds.RAW_MEAT_SQUID, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));
    public static final Item RAW_MEAT_AXOLOTL = registerItem(ModItemIds.RAW_MEAT_AXOLOTL, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_ARMADILLO = registerItem(ModItemIds.RAW_MEAT_ARMADILLO, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2)));
    public static final Item RAW_MEAT_ALLAY = registerItem(ModItemIds.RAW_MEAT_ALLAY, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4)));
    public static final Item RAW_MEAT_NAUTILUS = registerItem(ModItemIds.RAW_MEAT_NAUTILUS, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));

    public static final Item COOKED_MEAT_BEAR = registerItem(ModItemIds.COOKED_MEAT_BEAR, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_CAMEL = registerItem(ModItemIds.COOKED_MEAT_CAMEL, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_HORSE = registerItem(ModItemIds.COOKED_MEAT_HORSE, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_VEGGIE = registerItem(ModItemIds.COOKED_MEAT_VEGGIE, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_SNIFFER = registerItem(ModItemIds.COOKED_MEAT_SNIFFER, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_GOAT = registerItem(ModItemIds.COOKED_MEAT_GOAT, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_LLAMA = registerItem(ModItemIds.COOKED_MEAT_LLAMA, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_WOLF = registerItem(ModItemIds.COOKED_MEAT_WOLF, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_FOX = registerItem(ModItemIds.COOKED_MEAT_FOX, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_CAT = registerItem(ModItemIds.COOKED_MEAT_CAT, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_PARROT = registerItem(ModItemIds.COOKED_MEAT_PARROT, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_FROG = registerItem(ModItemIds.COOKED_MEAT_FROG, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_BAT = registerItem(ModItemIds.COOKED_MEAT_BAT, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_4)));
    public static final Item COOKED_MEAT_TURTLE = registerItem(ModItemIds.COOKED_MEAT_TURTLE, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_DOLPHIN = registerItem(ModItemIds.COOKED_MEAT_DOLPHIN, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_SQUID = registerItem(ModItemIds.COOKED_MEAT_SQUID, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_AXOLOTL = registerItem(ModItemIds.COOKED_MEAT_AXOLOTL, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_ARMADILLO = registerItem(ModItemIds.COOKED_MEAT_ARMADILLO, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_ALLAY = registerItem(ModItemIds.COOKED_MEAT_ALLAY, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_4)));
    public static final Item COOKED_MEAT_NAUTILUS = registerItem(ModItemIds.COOKED_MEAT_NAUTILUS, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));

    //BERRIES & JAMS
    public static final Item BERRY_BLACKBERRIES = registerItem(ModItemIds.BERRY_BLACKBERRIES, properties -> new BlockItem(ModBlocks.BERRY_BLACKBERRY_BUSH,properties.food(ModFoods.BERRY_BLACKBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_BLUEBERRIES = registerItem(ModItemIds.BERRY_BLUEBERRIES, properties -> new BlockItem(ModBlocks.BERRY_BLUEBERRY_BUSH,properties.food(ModFoods.BERRY_BLUEBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_ELDERBERRIES = registerItem(ModItemIds.BERRY_ELDERBERRIES, properties -> new BlockItem(ModBlocks.BERRY_ELDERBERRY_BUSH,properties.food(ModFoods.BERRY_ELDERBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_GOJI_BERRIES = registerItem(ModItemIds.BERRY_GOJI_BERRIES, properties -> new BlockItem(ModBlocks.BERRY_GOJI_BERRY_BUSH,properties.food(ModFoods.BERRY_GOJI_BERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_GOOSEBERRIES = registerItem(ModItemIds.BERRY_GOOSEBERRIES, properties -> new BlockItem(ModBlocks.BERRY_GOOSEBERRY_BUSH,properties.food(ModFoods.BERRY_GOOSEBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_RASPBERRIES = registerItem(ModItemIds.BERRY_RASPBERRIES, properties -> new BlockItem(ModBlocks.BERRY_RASPBERRY_BUSH,properties.food(ModFoods.BERRY_RASPBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_STRAWBERRIES = registerItem(ModItemIds.BERRY_STRAWBERRIES, properties -> new BlockItem(ModBlocks.BERRY_STRAWBERRY_BUSH,properties.food(ModFoods.BERRY_STRAWBERRIES).useItemDescriptionPrefix()));
    public static final Item BERRY_WHITE_CURRANT_BERRIES = registerItem(ModItemIds.BERRY_WHITE_CURRANT_BERRIES, properties -> new BlockItem(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH,properties.food(ModFoods.BERRY_WHITE_CURRANT_BERRIES).useItemDescriptionPrefix()));
    
    public static final Item GLASS_JAR = registerItem(ModItemIds.GLASS_JAR, Item::new);

    public static final Item JAM_BLACKBERRY = registerItem(ModItemIds.JAM_BLACKBERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLACKBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_BLUEBERRY = registerItem(ModItemIds.JAM_BLUEBERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLUEBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_ELDERBERRY = registerItem(ModItemIds.JAM_ELDERBERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_ELDERBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOJI_BERRY = registerItem(ModItemIds.JAM_GOJI_BERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOJI_BERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOOSEBERRY = registerItem(ModItemIds.JAM_GOOSEBERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOOSEBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_RASPBERRY = registerItem(ModItemIds.JAM_RASPBERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_RASPBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_STRAWBERRY = registerItem(ModItemIds.JAM_STRAWBERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_STRAWBERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_WHITE_CURRANT_BERRY = registerItem(ModItemIds.JAM_WHITE_CURRANT_BERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_WHITE_CURRANT_BERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_SWEET_BERRY = registerItem(ModItemIds.JAM_SWEET_BERRY, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_SWEET_BERRY, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_BLACKBERRY_MASH = registerItem(ModItemIds.JAM_BLACKBERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLACKBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_BLUEBERRY_MASH = registerItem(ModItemIds.JAM_BLUEBERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_BLUEBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_ELDERERRY_MASH = registerItem(ModItemIds.JAM_ELDERERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_ELDERBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOJI_BERRY_MASH = registerItem(ModItemIds.JAM_GOJI_BERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOJI_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_GOOSEBERRY_MASH = registerItem(ModItemIds.JAM_GOOSEBERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_GOOSEBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_RASPBERRY_MASH = registerItem(ModItemIds.JAM_RASPBERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_RASPBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_STRAWBERRY_MASH = registerItem(ModItemIds.JAM_STRAWBERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_STRAWBERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_WHITE_CURRANT_BERRY_MASH = registerItem(ModItemIds.JAM_WHITE_CURRANT_BERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_WHITE_CURRANT_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));
    public static final Item JAM_SWEET_BERRY_MASH = registerItem(ModItemIds.JAM_SWEET_BERRY_MASH, properties -> new Item(properties.craftRemainder(GLASS_JAR).food(ModFoods.JAM_SWEET_BERRY_MASH, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_JAR).stacksTo(16)));

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
            output.accept(RAW_MEAT_LLAMA);
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
            output.accept(RAW_MEAT_NAUTILUS);

            output.accept(COOKED_MEAT_BEAR);
            output.accept(COOKED_MEAT_CAMEL);
            output.accept(COOKED_MEAT_HORSE);
            output.accept(COOKED_MEAT_VEGGIE);
            output.accept(COOKED_MEAT_SNIFFER);
            output.accept(COOKED_MEAT_GOAT);
            output.accept(COOKED_MEAT_LLAMA);
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
            output.accept(COOKED_MEAT_NAUTILUS);


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