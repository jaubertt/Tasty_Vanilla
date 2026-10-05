package tastyvanilla.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.custom.*;

import java.util.function.Function;

public class ModBlocks {

    //NEW BLOCKS
    public static final Block SALT_BLOCK = registerBlock("salt_block",
            BlockBehaviour.Properties.of()
                    .strength(0.75f)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .isValidSpawn(Blocks::never));

    public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
            BlockBehaviour.Properties.of()
                    .strength(0.75f)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .isValidSpawn(Blocks::never));

    //--------------------------//

    //NEW CROPS, WITH THE SAME SETTINGS AS VANILLA CARROTS AND POTATOES
    public static final Block CABBAGE_CROP = registerBlockWithoutBlockItem("cabbage_crop", CabbageCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block CHILLI_CROP = registerBlockWithoutBlockItem("chilli_crop", ChilliCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem("eggplant_crop", EggplantCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem("garlic_crop", GarlicCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem("lettuce_crop", LettuceCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block ONION_CROP = registerBlockWithoutBlockItem("onion_crop", OnionCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block SWEET_POTATO_CROP = registerBlockWithoutBlockItem("sweet_potato_crop", SweetPotatoCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop", TomatoCropBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak()
                    .sound(SoundType.CROP).pushReaction(PushReaction.DESTROY));

    //BERRIES, WITH THE SAME SETTINGS AS THE VANILLA SWEET BERRY BUSH
    public static final Block BERRY_BLACKBERRY_BUSH = registerBlockWithoutBlockItem("berry_blackberry_bush", BlackberryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_BLUEBERRY_BUSH = registerBlockWithoutBlockItem("berry_blueberry_bush", BlueberryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_ELDERBERRY_BUSH = registerBlockWithoutBlockItem("berry_elderberry_bush", ElderberryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_GOJI_BERRY_BUSH = registerBlockWithoutBlockItem("berry_goji_berry_bush", GojiBerryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_GOOSEBERRY_BUSH = registerBlockWithoutBlockItem("berry_gooseberry_bush", GooseberryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_RASPBERRY_BUSH = registerBlockWithoutBlockItem("berry_raspberry_bush", RaspberryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_STRAWBERRY_BUSH = registerBlockWithoutBlockItem("berry_strawberry_bush", StrawberryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));
    public static final Block BERRY_WHITE_CURRANT_BERRY_BUSH = registerBlockWithoutBlockItem("berry_white_currant_berry_bush", WhiteCurrantBerryBushBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollision()
                    .sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY));



    //--------------------------//

    //Register Block Method, THE SAME AS VANILLA'S Blocks CLASS IN 1.21.11: THE BLOCK'S KEY IS MADE FROM ITS NAME

    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        ResourceKey<Block> key = keyOf(name);
        Block block = factory.apply(properties.setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    private static Block registerBlock(String name, BlockBehaviour.Properties properties) {
        Block block = registerBlockWithoutBlockItem(name, Block::new, properties);
        registerBlockItem(name, block);
        return block;
    }

    //Register Block Item Method (block. NAME, LIKE VANILLA BLOCK ITEMS)
    // NeoForge adds every registered BlockItem to Item.BY_BLOCK itself, so the Fabric branch's
    // blockItem.appendBlocks(Item.BLOCK_ITEMS, blockItem) line has no counterpart here.
    private static void registerBlockItem(String name, Block block) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(key));
        Registry.register(BuiltInRegistries.ITEM, key, blockItem);
    }

    //--------------------------//

    //Register Block Initializer
    // Loading this class registers every block above (NeoForge calls this inside its block RegisterEvent).
    // Mob pathfinding avoidance and the fire values of the bushes live in the bush classes on NeoForge
    // (getBlockPathType, getFireSpreadSpeed, getFlammability); the Fabric branch registers them here instead.
    public static void registerModBlocks() {
        TastyVanilla.LOGGER.info("Registering Mod Blocks for " + TastyVanilla.MOD_ID);
    }

    //NEW BLOCK IN BUILDING BLOCKS (mod event bus, see TastyVanilla)
    public static void addToCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(SALT_BLOCK);
            event.accept(SUGAR_BLOCK);

        }
    }
}
