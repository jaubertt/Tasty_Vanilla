package tastyvanilla.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.custom.*;

import java.util.function.Function;

public class ModBlocks {

    //NEW BLOCKS
    public static final Block SALT_BLOCK = registerBlock("salt_block",
            AbstractBlock.Settings.create()
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .allowsSpawning(Blocks::never));

    public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
            AbstractBlock.Settings.create()
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .allowsSpawning(Blocks::never));

    //--------------------------//

    //NEW CROPS, WITH THE SAME SETTINGS AS VANILLA CARROTS AND POTATOES
    public static final Block CABBAGE_CROP = registerBlockWithoutBlockItem("cabbage_crop", CabbageCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block CHILLI_CROP = registerBlockWithoutBlockItem("chilli_crop", ChilliCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem("eggplant_crop", EggplantCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem("garlic_crop", GarlicCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem("lettuce_crop", LettuceCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block ONION_CROP = registerBlockWithoutBlockItem("onion_crop", OnionCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block SWEET_POTATO_CROP = registerBlockWithoutBlockItem("sweet_potato_crop", SweetPotatoCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop", TomatoCropBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY));

    //BERRIES, WITH THE SAME SETTINGS AS THE VANILLA SWEET BERRY BUSH
    public static final Block BERRY_BLACKBERRY_BUSH = registerBlockWithoutBlockItem("berry_blackberry_bush", BlackberryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_BLUEBERRY_BUSH = registerBlockWithoutBlockItem("berry_blueberry_bush", BlueberryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_ELDERBERRY_BUSH = registerBlockWithoutBlockItem("berry_elderberry_bush", ElderberryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_GOJI_BERRY_BUSH = registerBlockWithoutBlockItem("berry_goji_berry_bush", GojiBerryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_GOOSEBERRY_BUSH = registerBlockWithoutBlockItem("berry_gooseberry_bush", GooseberryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_RASPBERRY_BUSH = registerBlockWithoutBlockItem("berry_raspberry_bush", RaspberryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_STRAWBERRY_BUSH = registerBlockWithoutBlockItem("berry_strawberry_bush", StrawberryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block BERRY_WHITE_CURRANT_BERRY_BUSH = registerBlockWithoutBlockItem("berry_white_currant_berry_bush", WhiteCurrantBerryBushBlock::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));



    //--------------------------//

    //Register Block Method, THE SAME AS VANILLA'S Blocks CLASS IN 1.21.11: THE BLOCK'S KEY IS MADE FROM ITS NAME

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID, name));
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        RegistryKey<Block> key = keyOf(name);
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static Block registerBlock(String name, AbstractBlock.Settings settings) {
        Block block = registerBlockWithoutBlockItem(name, Block::new, settings);
        registerBlockItem(name, block);
        return block;
    }

    //Register Block Item Method (block. NAME, LIKE VANILLA BLOCK ITEMS)
    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID, name));
        BlockItem blockItem = new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(key));
        blockItem.appendBlocks(Item.BLOCK_ITEMS, blockItem);
        Registry.register(Registries.ITEM, key, blockItem);
    }

    //--------------------------//

    //Register Block Initializer
    public static void registerModBlocks() {
        TastyVanilla.LOGGER.info("Registering Mod Blocks for " + TastyVanilla.MOD_ID);

        //--------------------------//

        //NEW BLOCK IN BUILDING BLOCKS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(ModBlocks.SALT_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(ModBlocks.SUGAR_BLOCK));

        //MOBS AVOID THE BERRY BUSHES, LIKE THE VANILLA SWEET BERRY BUSH
        LandPathNodeTypesRegistry.register(BERRY_BLACKBERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_BLUEBERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_ELDERBERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_GOJI_BERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_GOOSEBERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_RASPBERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_STRAWBERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);
        LandPathNodeTypesRegistry.register(BERRY_WHITE_CURRANT_BERRY_BUSH, PathNodeType.DAMAGE_OTHER, null);


        //BERRY BUSHES CATCH FIRE AND BURN LIKE THE VANILLA SWEET BERRY BUSH (60, 100)
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_BLACKBERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_BLUEBERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_ELDERBERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_GOJI_BERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_GOOSEBERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_RASPBERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_STRAWBERRY_BUSH, 60, 100);
        FlammableBlockRegistry.getDefaultInstance().add(BERRY_WHITE_CURRANT_BERRY_BUSH, 60, 100);

    }
}
