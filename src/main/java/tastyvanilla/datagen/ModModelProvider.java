package tastyvanilla.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.block.custom.*;
import tastyvanilla.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) { super(output);}

    //BLOCKS
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        //CROPS
        blockModelGenerators.createCropBlock(ModBlocks.CABBAGE_CROP, CabbageCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.CHILLI_CROP, ChilliCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.EGGPLANT_CROP, EggplantCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.GARLIC_CROP, GarlicCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.LETTUCE_CROP,LettuceCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.ONION_CROP,OnionCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.SWEET_POTATO_CROP,SweetPotatoCropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(ModBlocks.TOMATO_CROP,TomatoCropBlock.AGE, 0,1,2,3,4,5,6,7);

       //BERRIES
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_BLACKBERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_BLUEBERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_ELDERBERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_GOJI_BERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_GOOSEBERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_RASPBERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_STRAWBERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});
        blockModelGenerators.createCrossBlock(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BlackberryBushBlock.AGE, new int[]{0, 1, 2, 3});

    }


    //ITEMS

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        //FOOD CROPS
        itemModelGenerator.generateFlatItem(ModItems.FOOD_CHILLI_STEW, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_ROASTED_GARLIC, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_WRAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_WRAP_VEGGIE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_BAKED_SWEET_POTATO, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_ONION_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_ONION_SOUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_POTATO_FRIES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_SWEET_POTATO_FRIES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_COLESLAW, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_SALAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_BUMSBLECH_SALAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.FOOD_TOMATO_SOUP, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.BREAD_GARLIC, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DOUGH_GARLIC, ModelTemplates.FLAT_ITEM);

        //BERRIES
        itemModelGenerator.generateFlatItem(ModItems.GLASS_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_BLACKBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_BLUEBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_ELDERBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_GOJI_BERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_GOOSEBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_RASPBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_SWEET_BERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_STRAWBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_WHITE_CURRANT_BERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_BLACKBERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_BLUEBERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_ELDERERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_GOJI_BERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_GOOSEBERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_RASPBERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_SWEET_BERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_STRAWBERRY_MASH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.JAM_WHITE_CURRANT_BERRY_MASH, ModelTemplates.FLAT_ITEM);

        //CHEESE
        itemModelGenerator.generateFlatItem(ModItems.GOAT_MILK_BUCKET, ModelTemplates.FLAT_ITEM);

    }
}
