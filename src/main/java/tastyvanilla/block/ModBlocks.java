package tastyvanilla.block;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.LandPathTypeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
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
import net.minecraft.world.level.pathfinder.PathType;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.custom.*;

import java.util.function.Function;

public class ModBlocks {
    
    //NEW BLOCKS
    
    public static final Block SALT_BLOCK = registerBlock(ModBlockItemIds.SALT_BLOCK,
            properties -> new Block(properties
                    .strength(0.75f)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .isValidSpawn(Blocks::never)));
    public static final Block SUGAR_BLOCK = registerBlock(ModBlockItemIds.SUGAR_BLOCK,
            properties -> new Block(properties
                    .strength(0.75f)
                    .sound(SoundType.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .isValidSpawn(Blocks::never)));

    //--------------------------//

    //NEW CROPS
  
    public static final Block CABBAGE_CROP = registerBlockWithoutBlockItem(ModBlockIds.CABBAGE_CROP,
            properties -> new CabbageCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block CHILLI_CROP = registerBlockWithoutBlockItem(ModBlockIds.CHILLI_CROP,
            properties -> new ChilliCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem(ModBlockIds.EGGPLANT_CROP,
            properties -> new EggplantCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem(ModBlockIds.GARLIC_CROP,
            properties -> new GarlicCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem(ModBlockIds.LETTUCE_CROP,
            properties -> new LettuceCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block ONION_CROP = registerBlockWithoutBlockItem(ModBlockIds.ONION_CROP,
            properties -> new OnionCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block SWEET_POTATO_CROP = registerBlockWithoutBlockItem(ModBlockIds.SWEET_POTATO_CROP,
            properties -> new SweetPotatoCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem(ModBlockIds.TOMATO_CROP,
            properties -> new TomatoCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));

    //BERRIES


    public static final Block BERRY_BLACKBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_BLACKBERRY_BUSH,
            properties -> new BlackberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_BLUEBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_BLUEBERRY_BUSH,
            properties -> new BlueberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_ELDERBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_ELDERBERRY_BUSH,
            properties -> new ElderberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_GOJI_BERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_GOJI_BERRY_BUSH,
            properties -> new GojiBerryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_GOOSEBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_GOOSEBERRY_BUSH,
            properties -> new GooseberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_RASPBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_RASPBERRY_BUSH,
            properties -> new RaspberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_STRAWBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_STRAWBERRY_BUSH,
            properties -> new StrawberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));
    public static final Block BERRY_WHITE_CURRANT_BERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH,
            properties -> new WhiteCurrantBerryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.POPPED)));

    //--------------------------//

    //Register Block Method

    private static Block registerBlockWithoutBlockItem(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, id, function.apply(BlockBehaviour.Properties.of()
                .setId(id)));
    }

    private static Block registerBlock(BlockItemId id, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(id.block()));
        registerBlockItem(id, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, id.block(), toRegister);
    }

    //Register Block Item Method
    private static void registerBlockItem(BlockItemId id, Block block) {
        Registry.register(BuiltInRegistries.ITEM, id.item(),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(id.item())));
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

        //MOBS AVOID THE BERRY BUSHES, LIKE THE VANILLA SWEET BERRY BUSH
        LandPathTypeRegistry.register(BERRY_BLACKBERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_BLUEBERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_ELDERBERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_GOJI_BERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_GOOSEBERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_RASPBERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_STRAWBERRY_BUSH, PathType.DAMAGING, null);
        LandPathTypeRegistry.register(BERRY_WHITE_CURRANT_BERRY_BUSH, PathType.DAMAGING, null);


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
