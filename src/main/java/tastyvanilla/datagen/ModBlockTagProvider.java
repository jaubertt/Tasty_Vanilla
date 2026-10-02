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
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlockItemIds.SALT_BLOCK.block())
                .add(ModBlockItemIds.SUGAR_BLOCK.block())
        ;

        //BUSHES TAGGED LIKE THE VANILLA SWEET BERRY BUSH (CROPS ARE ALREADY COVERED THROUGH BlockTags.CROPS)
        builder(BlockTags.BEE_GROWABLES)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
        ;

        //BERRY BUSHES, LIKE THE VANILLA SWEET BERRY BUSH
        builder(BlockTags.FALL_DAMAGE_RESETTING)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
        ;

        builder(BlockTags.HAPPY_GHAST_AVOIDS)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
        ;

        builder(BlockTags.PREVENT_MOB_SPAWNING_INSIDE)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
        ;

        //26.3: SOME BLOCK BEHAVIOUR COMES FROM TAGS NOW
        //SOLID, LIKE VANILLA STONE (SUFFOCATION, WATER FLOW, TELEPORTS, HEIGHTMAPS)
        builder(BlockTags.BLOCKS_MOTION_NO_LEAVES)
                .add(ModBlockItemIds.SALT_BLOCK.block())
                .add(ModBlockItemIds.SUGAR_BLOCK.block())
        ;

        //WATER AND LAVA WASH THEM AWAY, LIKE VANILLA WHEAT AND THE SWEET BERRY BUSH
        builder(BlockTags.WASHED_AWAY_BY_FLUIDS)
                .add(ModBlockIds.CABBAGE_CROP)
                .add(ModBlockIds.CHILLI_CROP)
                .add(ModBlockIds.EGGPLANT_CROP)
                .add(ModBlockIds.GARLIC_CROP)
                .add(ModBlockIds.LETTUCE_CROP)
                .add(ModBlockIds.ONION_CROP)
                .add(ModBlockIds.SWEET_POTATO_CROP)
                .add(ModBlockIds.TOMATO_CROP)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
        ;

        //ENDERMEN DON'T TELEPORT INTO THEM, LIKE THE VANILLA SWEET BERRY BUSH
        builder(BlockTags.DANGEROUS_FOR_TELEPORTATION)
                .add(ModBlockIds.BERRY_BLACKBERRY_BUSH)
                .add(ModBlockIds.BERRY_BLUEBERRY_BUSH)
                .add(ModBlockIds.BERRY_ELDERBERRY_BUSH)
                .add(ModBlockIds.BERRY_GOJI_BERRY_BUSH)
                .add(ModBlockIds.BERRY_GOOSEBERRY_BUSH)
                .add(ModBlockIds.BERRY_RASPBERRY_BUSH)
                .add(ModBlockIds.BERRY_STRAWBERRY_BUSH)
                .add(ModBlockIds.BERRY_WHITE_CURRANT_BERRY_BUSH)
        ;

    }
}