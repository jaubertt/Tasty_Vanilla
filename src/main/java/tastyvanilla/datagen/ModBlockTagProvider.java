package tastyvanilla.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import tastyvanilla.block.ModBlockIds;
import tastyvanilla.block.ModBlockItemIds;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        //VILLAGERS
        builder(BlockTags.CROPS)
                .add(ModBlockIds.CABBAGE_CROP)
                .add(ModBlockIds.CHILLI_CROP)
                .add(ModBlockIds.EGGPLANT_CROP)
                .add(ModBlockIds.GARLIC_CROP)
                .add(ModBlockIds.LETTUCE_CROP)
                .add(ModBlockIds.ONION_CROP)
                .add(ModBlockIds.SWEET_POTATO_CROP)
                .add(ModBlockIds.TOMATO_CROP)
        ;

        builder(BlockTags.MAINTAINS_FARMLAND)
                .add(ModBlockIds.CABBAGE_CROP)
                .add(ModBlockIds.CHILLI_CROP)
                .add(ModBlockIds.EGGPLANT_CROP)
                .add(ModBlockIds.GARLIC_CROP)
                .add(ModBlockIds.LETTUCE_CROP)
                .add(ModBlockIds.ONION_CROP)
                .add(ModBlockIds.SWEET_POTATO_CROP)
                .add(ModBlockIds.TOMATO_CROP)
        ;


        //TOOLS
        builder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlockIds.CABBAGE_CROP)
                .add(ModBlockIds.CHILLI_CROP)
                .add(ModBlockIds.EGGPLANT_CROP)
                .add(ModBlockIds.GARLIC_CROP)
                .add(ModBlockIds.LETTUCE_CROP)
                .add(ModBlockIds.ONION_CROP)
                .add(ModBlockIds.SWEET_POTATO_CROP)
                .add(ModBlockIds.TOMATO_CROP)
                .add(ModBlockItemIds.SALT_BLOCK.block())
                .add(ModBlockItemIds.SUGAR_BLOCK.block())
        ;

        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlockIds.CABBAGE_CROP)
                .add(ModBlockIds.CHILLI_CROP)
                .add(ModBlockIds.EGGPLANT_CROP)
                .add(ModBlockIds.GARLIC_CROP)
                .add(ModBlockIds.LETTUCE_CROP)
                .add(ModBlockIds.ONION_CROP)
                .add(ModBlockIds.SWEET_POTATO_CROP)
                .add(ModBlockIds.TOMATO_CROP)
                .add(ModBlockItemIds.SALT_BLOCK.block())
                .add(ModBlockItemIds.SUGAR_BLOCK.block())
        ;

        builder(BlockTags.BEE_GROWABLES)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
                .add(ModBlockIds.CABBAGE_CROP)
                .add(ModBlockIds.CHILLI_CROP)
                .add(ModBlockIds.EGGPLANT_CROP)
                .add(ModBlockIds.GARLIC_CROP)
                .add(ModBlockIds.LETTUCE_CROP)
                .add(ModBlockIds.ONION_CROP)
                .add(ModBlockIds.SWEET_POTATO_CROP)
                .add(ModBlockIds.TOMATO_CROP);

    }
}
