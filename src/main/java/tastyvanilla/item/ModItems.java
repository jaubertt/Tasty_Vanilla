package tastyvanilla.item;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumables;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
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
    public static final Item PIE_CHORUS_FRUIT = registerItem(ModItemIds.PIE_CHORUS_FRUIT, properties -> new Item(properties.food(ModFoods.PIE_CHORUS_FRUIT,Consumables.CHORUS_FRUIT)));
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
    public static final Item RAW_MEAT_BEAR = registerItem(ModItemIds.RAW_MEAT_BEAR, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_CAMEL = registerItem(ModItemIds.RAW_MEAT_CAMEL, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_HORSE = registerItem(ModItemIds.RAW_MEAT_HORSE, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_VEGGIE = registerItem(ModItemIds.RAW_MEAT_VEGGIE, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2)));
    public static final Item RAW_MEAT_SNIFFER = registerItem(ModItemIds.RAW_MEAT_SNIFFER, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_GOAT = registerItem(ModItemIds.RAW_MEAT_GOAT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_LLAMA = registerItem(ModItemIds.RAW_MEAT_LLAMA, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_WOLF = registerItem(ModItemIds.RAW_MEAT_WOLF, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_FOX = registerItem(ModItemIds.RAW_MEAT_FOX, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_PARROT = registerItem(ModItemIds.RAW_MEAT_PARROT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_FROG = registerItem(ModItemIds.RAW_MEAT_FROG, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_TURTLE = registerItem(ModItemIds.RAW_MEAT_TURTLE, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_DOLPHIN = registerItem(ModItemIds.RAW_MEAT_DOLPHIN, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_SQUID = registerItem(ModItemIds.RAW_MEAT_SQUID, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));
    public static final Item RAW_MEAT_AXOLOTL = registerItem(ModItemIds.RAW_MEAT_AXOLOTL, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_ARMADILLO = registerItem(ModItemIds.RAW_MEAT_ARMADILLO, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_2,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_NAUTILUS = registerItem(ModItemIds.RAW_MEAT_NAUTILUS, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_3)));
    public static final Item RAW_MEAT_RAVAGER = registerItem(ModItemIds.RAW_MEAT_RAVAGER, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_1,ModFoods.FOOD_POISONING)));
    public static final Item RAW_MEAT_BAT = registerItem(ModItemIds.RAW_MEAT_BAT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4,ModFoods.BAT_WINGS)));
    public static final Item RAW_MEAT_ALLAY = registerItem(ModItemIds.RAW_MEAT_ALLAY, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4,ModFoods.ALLAY_WINGS)));
    public static final Item RAW_MEAT_CAT = registerItem(ModItemIds.RAW_MEAT_CAT, properties -> new Item(properties.food(ModFoods.RAW_MEAT_TIER_4,ModFoods.CAT_EYE)));


    public static final Item COOKED_MEAT_BEAR = registerItem(ModItemIds.COOKED_MEAT_BEAR, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_CAMEL = registerItem(ModItemIds.COOKED_MEAT_CAMEL, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_HORSE = registerItem(ModItemIds.COOKED_MEAT_HORSE, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_VEGGIE = registerItem(ModItemIds.COOKED_MEAT_VEGGIE, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_SNIFFER = registerItem(ModItemIds.COOKED_MEAT_SNIFFER, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_GOAT = registerItem(ModItemIds.COOKED_MEAT_GOAT, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_LLAMA = registerItem(ModItemIds.COOKED_MEAT_LLAMA, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));
    public static final Item COOKED_MEAT_WOLF = registerItem(ModItemIds.COOKED_MEAT_WOLF, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_FOX = registerItem(ModItemIds.COOKED_MEAT_FOX, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_PARROT = registerItem(ModItemIds.COOKED_MEAT_PARROT, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_FROG = registerItem(ModItemIds.COOKED_MEAT_FROG, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_TURTLE = registerItem(ModItemIds.COOKED_MEAT_TURTLE, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_DOLPHIN = registerItem(ModItemIds.COOKED_MEAT_DOLPHIN, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_SQUID = registerItem(ModItemIds.COOKED_MEAT_SQUID, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_AXOLOTL = registerItem(ModItemIds.COOKED_MEAT_AXOLOTL, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_ARMADILLO = registerItem(ModItemIds.COOKED_MEAT_ARMADILLO, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_2)));
    public static final Item COOKED_MEAT_NAUTILUS = registerItem(ModItemIds.COOKED_MEAT_NAUTILUS, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_3)));
    public static final Item COOKED_MEAT_RAVAGER = registerItem(ModItemIds.COOKED_MEAT_RAVAGER, properties -> new Item(properties.food(ModFoods.COOKED_MEAT_TIER_1)));


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
    // Loading this class registers every item above (NeoForge calls this inside its item RegisterEvent).
    public static void registerModItems() {
        TastyVanilla.LOGGER.info("Registering Mod Items for " + TastyVanilla.MOD_ID);
    }

    //CREATIVE TABS: same items in the same vanilla tabs as the Fabric branch (there: CreativeModeTabEvents).
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
            event.modify(Items.MUSHROOM_STEW, components -> components.set(DataComponents.MAX_STACK_SIZE, 16));
            event.modify(Items.RABBIT_STEW, components -> components.set(DataComponents.MAX_STACK_SIZE, 16));
            event.modify(Items.BEETROOT_SOUP, components -> components.set(DataComponents.MAX_STACK_SIZE, 16));
    }
}
