package tastyvanilla.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import tastyvanilla.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        //VILLAGERS
        valueLookupBuilder(BlockTags.CROPS)
                .add(ModBlocks.CABBAGE_CROP)
                .add(ModBlocks.CHILLI_CROP)
                .add(ModBlocks.EGGPLANT_CROP)
                .add(ModBlocks.GARLIC_CROP)
                .add(ModBlocks.LETTUCE_CROP)
                .add(ModBlocks.ONION_CROP)
                .add(ModBlocks.SWEET_POTATO_CROP)
                .add(ModBlocks.TOMATO_CROP)
        ;

        valueLookupBuilder(BlockTags.MAINTAINS_FARMLAND)
                .add(ModBlocks.CABBAGE_CROP)
                .add(ModBlocks.CHILLI_CROP)
                .add(ModBlocks.EGGPLANT_CROP)
                .add(ModBlocks.GARLIC_CROP)
                .add(ModBlocks.LETTUCE_CROP)
                .add(ModBlocks.ONION_CROP)
                .add(ModBlocks.SWEET_POTATO_CROP)
                .add(ModBlocks.TOMATO_CROP)
        ;


        //TOOLS
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CABBAGE_CROP)
                .add(ModBlocks.CHILLI_CROP)
                .add(ModBlocks.EGGPLANT_CROP)
                .add(ModBlocks.GARLIC_CROP)
                .add(ModBlocks.LETTUCE_CROP)
                .add(ModBlocks.ONION_CROP)
                .add(ModBlocks.SWEET_POTATO_CROP)
                .add(ModBlocks.TOMATO_CROP)
                .add(ModBlocks.SALT_BLOCK)
                .add(ModBlocks.SUGAR_BLOCK)
        ;

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CABBAGE_CROP)
                .add(ModBlocks.CHILLI_CROP)
                .add(ModBlocks.EGGPLANT_CROP)
                .add(ModBlocks.GARLIC_CROP)
                .add(ModBlocks.LETTUCE_CROP)
                .add(ModBlocks.ONION_CROP)
                .add(ModBlocks.SWEET_POTATO_CROP)
                .add(ModBlocks.TOMATO_CROP)
                .add(ModBlocks.SALT_BLOCK)
                .add(ModBlocks.SUGAR_BLOCK)
        ;

        valueLookupBuilder(BlockTags.BEE_GROWABLES)
                .add(ModBlocks.BERRY_BLACKBERRY_BUSH)
                .add(ModBlocks.BERRY_BLUEBERRY_BUSH)
                .add(ModBlocks.BERRY_ELDERBERRY_BUSH)
                .add(ModBlocks.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlocks.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlocks.BERRY_RASPBERRY_BUSH)
                .add(ModBlocks.BERRY_STRAWBERRY_BUSH)
                .add(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH);
        ;



    }
}
