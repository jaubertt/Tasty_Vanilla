package tastyvanilla.block;


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
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.custom.*;
import tastyvanilla.item.ModItems;

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
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block CHILLI_CROP = registerBlockWithoutBlockItem(ModBlockIds.CHILLI_CROP,
            properties -> new ChilliCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem(ModBlockIds.EGGPLANT_CROP,
            properties -> new EggplantCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block GARLIC_CROP = registerBlockWithoutBlockItem(ModBlockIds.GARLIC_CROP,
            properties -> new GarlicCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block LETTUCE_CROP = registerBlockWithoutBlockItem(ModBlockIds.LETTUCE_CROP,
            properties -> new LettuceCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block ONION_CROP = registerBlockWithoutBlockItem(ModBlockIds.ONION_CROP,
            properties -> new OnionCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block SWEET_POTATO_CROP = registerBlockWithoutBlockItem(ModBlockIds.SWEET_POTATO_CROP,
            properties -> new SweetPotatoCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem(ModBlockIds.TOMATO_CROP,
            properties -> new TomatoCropBlock(properties
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY).mapColor(MapColor.PLANT)));

    //BERRIES


    public static final Block BERRY_BLACKBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_BLACKBERRY_BUSH,
            properties -> new BlackberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_BLUEBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_BLUEBERRY_BUSH,
            properties -> new BlueberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_ELDERBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_ELDERBERRY_BUSH,
            properties -> new ElderberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_GOJI_BERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_GOJI_BERRY_BUSH,
            properties -> new GojiBerryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_GOOSEBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_GOOSEBERRY_BUSH,
            properties -> new GooseberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_RASPBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_RASPBERRY_BUSH,
            properties -> new RaspberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_STRAWBERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_STRAWBERRY_BUSH,
            properties -> new StrawberryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final Block BERRY_WHITE_CURRANT_BERRY_BUSH = registerBlockWithoutBlockItem(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH,
            properties -> new WhiteCurrantBerryBushBlock(properties.mapColor(MapColor.PLANT).randomTicks()
                    .noCollision().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));

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
