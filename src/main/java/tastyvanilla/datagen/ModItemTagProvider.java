package tastyvanilla.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import tastyvanilla.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        //VANILLA TAGS
        valueLookupBuilder(ItemTags.VILLAGER_PICKS_UP)
                .add(ModItems.CHILLI)
                .add(ModItems.CHILLI_SEEDS)
                .add(ModItems.TOMATO)
                .add(ModItems.TOMATO_SEEDS)
                .add(ModItems.LETTUCE)
                .add(ModItems.LETTUCE_SEEDS)
                .add(ModItems.CABBAGE)
                .add(ModItems.EGGPLANT)
                .add(ModItems.GARLIC)
                .add(ModItems.ONION)
                .add(ModItems.SWEET_POTATO);


        valueLookupBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ModItems.CHILLI_SEEDS)
                .add(ModItems.TOMATO_SEEDS)
                .add(ModItems.LETTUCE_SEEDS)
                .add(ModItems.CABBAGE)
                .add(ModItems.EGGPLANT)
                .add(ModItems.GARLIC)
                .add(ModItems.ONION)
                .add(ModItems.SWEET_POTATO);


        valueLookupBuilder(ItemTags.COW_FOOD)
                .add(ModItems.LETTUCE)

        ;

        valueLookupBuilder(ItemTags.SHEEP_FOOD)
                .add(ModItems.LETTUCE)

        ;

        valueLookupBuilder(ItemTags.GOAT_FOOD)
                .add(ModItems.LETTUCE)

        ;

        valueLookupBuilder(ItemTags.HORSE_FOOD)
                .add(ModItems.LETTUCE)

        ;


        valueLookupBuilder(ItemTags.PIG_FOOD)
                .add(ModItems.CABBAGE)
                .add(ModItems.EGGPLANT)
                .add(ModItems.SWEET_POTATO);
        ;


        valueLookupBuilder(ItemTags.CHICKEN_FOOD)
                .add(ModItems.CHILLI_SEEDS)
                .add(ModItems.TOMATO_SEEDS)
                .add(ModItems.LETTUCE_SEEDS)
        ;

        valueLookupBuilder(ItemTags.PARROT_FOOD)
                .add(ModItems.CHILLI_SEEDS)
                .add(ModItems.TOMATO_SEEDS)
                .add(ModItems.LETTUCE_SEEDS)
        ;

        valueLookupBuilder(ItemTags.PARROT_POISONOUS_FOOD)
                .add(ModItems.COOKIE_APPLE)
                .add(ModItems.COOKIE_CARROT)
                .add(ModItems.COOKIE_GLOW_BERRY)
                .add(ModItems.COOKIE_OATMEAL)
                .add(ModItems.COOKIE_HONEY)
                .add(ModItems.COOKIE_PUMPKIN)
                .add(ModItems.COOKIE_POPPY_SEED)
                .add(ModItems.COOKIE_SPIDER_EYE)
                .add(ModItems.COOKIE_SUNFLOWER_SEED)
                .add(ModItems.COOKIE_SWEET_BERRY)
                .add(ModItems.COOKIE_SUGAR)
        ;

        valueLookupBuilder(ItemTags.RABBIT_FOOD)
                .add(ModItems.TOMATO)
        ;

        valueLookupBuilder(ItemTags.FOX_FOOD)
                .add(ModItems.BERRY_BLUEBERRIES)
                .add(ModItems.BERRY_GOOSEBERRIES)
                .add(ModItems.BERRY_BLACKBERRIES)

        ;

    }
}
