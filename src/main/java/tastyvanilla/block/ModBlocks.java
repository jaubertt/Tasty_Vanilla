package tastyvanilla.block;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
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
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.custom.*;

import java.util.function.Function;

public class ModBlocks {
    
    //NEW BLOCKS
    
    public static final Block SALT_BLOCK = registerBlock("salt_block",
            properties -> new Block(properties
                    .strength(0.75f)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .isValidSpawn(Blocks::never)));
    public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
            properties -> new Block(properties
                    .strength(0.75f)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .isValidSpawn(Blocks::never)));

    //--------------------------//

    //NEW CROPS
  
    public static final Block CABBAGE_CROP = registerBlockWithoutBlockItem("cabbage_crop",
            properties -> new CabbageCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block CHILLI_CROP = registerBlockWithoutBlockItem("chilli_crop",
            properties -> new ChilliCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem("eggplant_crop",
            properties -> new EggplantCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem("garlic_crop",
            properties -> new GarlicCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem("lettuce_crop",
            properties -> new LettuceCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block ONION_CROP = registerBlockWithoutBlockItem("onion_crop",
            properties -> new OnionCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block SWEET_POTATO_CROP = registerBlockWithoutBlockItem("sweet_potato_crop",
            properties -> new SweetPotatoCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop",
            properties -> new TomatoCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    //BERRIES


    public static final Block BERRY_BLACKBERRY_BUSH = registerBlockWithoutBlockItem("berry_blackberry_bush",
            properties -> new BlackberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_BLUEBERRY_BUSH = registerBlockWithoutBlockItem("berry_blueberry_bush",
            properties -> new BlueberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_ELDERBERRY_BUSH = registerBlockWithoutBlockItem("berry_elderberry_bush",
            properties -> new ElderberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_GOJI_BERRY_BUSH = registerBlockWithoutBlockItem("berry_goji_berry_bush",
            properties -> new GojiBerryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_GOOSEBERRY_BUSH = registerBlockWithoutBlockItem("berry_gooseberry_bush",
            properties -> new GooseberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_RASPBERRY_BUSH = registerBlockWithoutBlockItem("berry_raspberry_bush",
            properties -> new RaspberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_STRAWBERRY_BUSH = registerBlockWithoutBlockItem("berry_strawberry_bush",
            properties -> new StrawberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_WHITE_CURRANT_BERRY_BUSH = registerBlockWithoutBlockItem("berry_white_currant_berry_bush",
            properties -> new WhiteCurrantBerryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));

    //--------------------------//

    //Register Block Method

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name), function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name), toRegister);
    }

    //Register Block Item Method
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name)))));
    }
    //--------------------------//

    //Register Block Initializer

    public static void registerModBlocks() {
        TastyVanilla.LOGGER.info("Registering Mod Blocks for " + TastyVanilla.MOD_ID);


        //--------------------------//

        //NEW BLOCK IN BUILDING BLOCKS
        //NEW ITEM IN TOOLS AND UTILITIES
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {

            output.accept(SALT_BLOCK);
            output.accept(SUGAR_BLOCK);

        });

    }
}
