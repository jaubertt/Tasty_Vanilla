package tastyvanilla.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.block.custom.*;
import tastyvanilla.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output);}

    //BLOCKS
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //CROPS
        blockStateModelGenerator.registerCrop(ModBlocks.CABBAGE_CROP, CabbageCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.CHILLI_CROP, ChilliCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.EGGPLANT_CROP, EggplantCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.GARLIC_CROP, GarlicCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.LETTUCE_CROP,LettuceCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.ONION_CROP,OnionCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.SWEET_POTATO_CROP,SweetPotatoCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP,TomatoCropBlock.AGE, 0,1,2,3,4,5,6,7);

       //BERRIES
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_BLACKBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_BLUEBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_ELDERBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_GOJI_BERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_GOOSEBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_RASPBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_STRAWBERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});

    }


    //ITEMS

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        //FOOD CROPS
        itemModelGenerator.register(ModItems.FOOD_CHILLI_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_ROASTED_GARLIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_WRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_WRAP_VEGGIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_BAKED_SWEET_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_ONION_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_ONION_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_POTATO_FRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_SWEET_POTATO_FRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_COLESLAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOOD_TOMATO_SOUP, Models.GENERATED);

        itemModelGenerator.register(ModItems.BREAD_GARLIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUGH_GARLIC, Models.GENERATED);

        //BERRIES
        itemModelGenerator.register(ModItems.GLASS_JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_BLACKBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_ELDERBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_GOJI_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_GOOSEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_RASPBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_SWEET_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_WHITE_CURRANT_BERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_BLACKBERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_BLUEBERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_ELDERERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_GOJI_BERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_GOOSEBERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_RASPBERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_SWEET_BERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_STRAWBERRY_MASH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAM_WHITE_CURRANT_BERRY_MASH, Models.GENERATED);

        //CHEESE
        itemModelGenerator.register(ModItems.GOAT_MILK_BUCKET, Models.GENERATED);

    }
}
