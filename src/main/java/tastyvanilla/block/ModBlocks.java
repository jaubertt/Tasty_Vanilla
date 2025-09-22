package tastyvanilla.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
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
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"salt_block")))
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.WHITE_GRAY)
                    .allowsSpawning(Blocks::never)));

    public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"sugar_block")))
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .allowsSpawning(Blocks::never)));

    //--------------------------//

    //NEW CROPS
    public static final Block CABBAGE_CROP = registerBlockWithoutBlockItem("cabbage_crop",
            new CabbageCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"cabbage_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block CHILLI_CROP = registerBlockWithoutBlockItem("chilli_crop",
            new ChilliCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"chilli_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem("eggplant_crop",
            new EggplantCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"eggplant_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem("garlic_crop",
            new GarlicCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"garlic_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem("lettuce_crop",
            new LettuceCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"lettuce_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block ONION_CROP = registerBlockWithoutBlockItem("onion_crop",
            new OnionCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"onion_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));


    public static final Block SWEET_POTATO_CROP = registerBlockWithoutBlockItem("sweet_potato_crop",
            new SweetPotatoCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"sweet_potato_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop",
            new TomatoCropBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"tomato_crop")))
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .mapColor(MapColor.DARK_GREEN)));

    //BERRIES
    public static final Block BERRY_BLACKBERRY_BUSH = registerBlockWithoutBlockItem("berry_blackberry_bush",
            new BlackberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_blackberry_bush")))
            )
    );
    public static final Block BERRY_BLUEBERRY_BUSH = registerBlockWithoutBlockItem("berry_blueberry_bush",
            new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_blueberry_bush")))
            )
    );
    public static final Block BERRY_ELDERBERRY_BUSH = registerBlockWithoutBlockItem("berry_elderberry_bush",
            new ElderberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_elderberry_bush")))
            )
    );
    public static final Block BERRY_GOJI_BERRY_BUSH = registerBlockWithoutBlockItem("berry_goji_berry_bush",
            new GojiBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_goji_berry_bush")))
            )
    );
    public static final Block BERRY_GOOSEBERRY_BUSH = registerBlockWithoutBlockItem("berry_gooseberry_bush",
            new GooseberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_gooseberry_bush")))
            )
    );
    public static final Block BERRY_RASPBERRY_BUSH = registerBlockWithoutBlockItem("berry_raspberry_bush",
            new RaspberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_raspberry_bush")))
            )
    );
    public static final Block BERRY_STRAWBERRY_BUSH = registerBlockWithoutBlockItem("berry_strawberry_bush",
            new StrawberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_strawberry_bush")))
            )
    );
    public static final Block BERRY_WHITE_CURRANT_BERRY_BUSH = registerBlockWithoutBlockItem("berry_white_currant_berry_bush",
            new WhiteCurrantBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"berry_white_currant_berry_bush")))
            )
    );



    //--------------------------//


    public static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(id));
    }

    private static Block registerBlockVanillaMethod(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(id), factory, settings);
    }



    //Register Block Method

    private static Block registerBlockWithoutBlockItem(String name,Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(TastyVanilla.MOD_ID,name),block);
    }

    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TastyVanilla.MOD_ID,name),block);
    }

    //Register Block Item Method
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TastyVanilla.MOD_ID,name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TastyVanilla.MOD_ID, name)))));
    }

    //--------------------------//

    //Register Block Initializer
    public static void registerModBlocks() {
        TastyVanilla.LOGGER.info("Registering Mod Blocks for" + TastyVanilla.MOD_ID);

        //--------------------------//

        //NEW BLOCK IN BUILDING BLOCKS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(ModBlocks.SALT_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(ModBlocks.SUGAR_BLOCK));

    }
}
