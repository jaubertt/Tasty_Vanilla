package tastyvanilla.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import tastyvanilla.item.ModItemIds;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        //VANILLA TAGS
        builder(ItemTags.VILLAGER_PICKS_UP)
                .add(ModItemIds.CHILLI)
                .add(ModItemIds.CHILLI_SEEDS)
                .add(ModItemIds.TOMATO)
                .add(ModItemIds.TOMATO_SEEDS)
                .add(ModItemIds.LETTUCE)
                .add(ModItemIds.LETTUCE_SEEDS)
                .add(ModItemIds.CABBAGE)
                .add(ModItemIds.EGGPLANT)
                .add(ModItemIds.GARLIC)
                .add(ModItemIds.ONION)
                .add(ModItemIds.SWEET_POTATO);


        builder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ModItemIds.CHILLI_SEEDS)
                .add(ModItemIds.TOMATO_SEEDS)
                .add(ModItemIds.LETTUCE_SEEDS)
                .add(ModItemIds.CABBAGE)
                .add(ModItemIds.EGGPLANT)
                .add(ModItemIds.GARLIC)
                .add(ModItemIds.ONION)
                .add(ModItemIds.SWEET_POTATO);


        builder(ItemTags.COW_FOOD)
                .add(ModItemIds.LETTUCE)
        ;

        builder(ItemTags.SHEEP_FOOD)
                .add(ModItemIds.LETTUCE)
        ;

        builder(ItemTags.GOAT_FOOD)
                .add(ModItemIds.LETTUCE)
        ;

        builder(ItemTags.PIG_FOOD)
                .add(ModItemIds.CABBAGE)
                .add(ModItemIds.EGGPLANT)
                .add(ModItemIds.SWEET_POTATO);
        ;


        builder(ItemTags.CHICKEN_FOOD)
                .add(ModItemIds.CHILLI_SEEDS)
                .add(ModItemIds.TOMATO_SEEDS)
                .add(ModItemIds.LETTUCE_SEEDS)
        ;

        builder(ItemTags.PARROT_FOOD)
                .add(ModItemIds.CHILLI_SEEDS)
                .add(ModItemIds.TOMATO_SEEDS)
                .add(ModItemIds.LETTUCE_SEEDS)
        ;

        builder(ItemTags.PARROT_POISONOUS_FOOD)
                .add(ModItemIds.COOKIE_APPLE)
                .add(ModItemIds.COOKIE_CARROT)
                .add(ModItemIds.COOKIE_GLOW_BERRY)
                .add(ModItemIds.COOKIE_OATMEAL)
                .add(ModItemIds.COOKIE_HONEY)
                .add(ModItemIds.COOKIE_PUMPKIN)
                .add(ModItemIds.COOKIE_POPPY_SEED)
                .add(ModItemIds.COOKIE_SPIDER_EYE)
                .add(ModItemIds.COOKIE_SUNFLOWER_SEED)
                .add(ModItemIds.COOKIE_SWEET_BERRY)
                .add(ModItemIds.COOKIE_SUGAR)
        ;

        builder(ItemTags.RABBIT_FOOD)
                .add(ModItemIds.TOMATO)
                .add(ModItemIds.LETTUCE)
                .add(ModItemIds.CABBAGE)
        ;

        builder(ItemTags.FOX_FOOD)
                .add(ModItemIds.BERRY_BLUEBERRIES)
                .add(ModItemIds.BERRY_GOOSEBERRIES)
                .add(ModItemIds.BERRY_BLACKBERRIES)
                .add(ModItemIds.BERRY_ELDERBERRIES)
                .add(ModItemIds.BERRY_GOJI_BERRIES)
                .add(ModItemIds.BERRY_RASPBERRIES)
                .add(ModItemIds.BERRY_STRAWBERRIES)
                .add(ModItemIds.BERRY_WHITE_CURRANT_BERRIES)
        ;

        builder(ItemTags.MEAT)
                .add(ModItemIds.RAW_MEAT_BEAR)
                .add(ModItemIds.RAW_MEAT_CAMEL)
                .add(ModItemIds.RAW_MEAT_HORSE)
                .add(ModItemIds.RAW_MEAT_SNIFFER)
                .add(ModItemIds.RAW_MEAT_GOAT)
                .add(ModItemIds.RAW_MEAT_LLAMA)
                .add(ModItemIds.RAW_MEAT_WOLF)
                .add(ModItemIds.RAW_MEAT_FOX)
                .add(ModItemIds.RAW_MEAT_PARROT)
                .add(ModItemIds.RAW_MEAT_FROG)
                .add(ModItemIds.RAW_MEAT_TURTLE)
                .add(ModItemIds.RAW_MEAT_DOLPHIN)
                .add(ModItemIds.RAW_MEAT_SQUID)
                .add(ModItemIds.RAW_MEAT_AXOLOTL)
                .add(ModItemIds.RAW_MEAT_ARMADILLO)
                .add(ModItemIds.RAW_MEAT_NAUTILUS)
                .add(ModItemIds.RAW_MEAT_RAVAGER)


                .add(ModItemIds.COOKED_MEAT_BEAR)
                .add(ModItemIds.COOKED_MEAT_CAMEL)
                .add(ModItemIds.COOKED_MEAT_HORSE)
                .add(ModItemIds.COOKED_MEAT_SNIFFER)
                .add(ModItemIds.COOKED_MEAT_GOAT)
                .add(ModItemIds.COOKED_MEAT_LLAMA)
                .add(ModItemIds.COOKED_MEAT_WOLF)
                .add(ModItemIds.COOKED_MEAT_FOX)
                .add(ModItemIds.COOKED_MEAT_PARROT)
                .add(ModItemIds.COOKED_MEAT_FROG)
                .add(ModItemIds.COOKED_MEAT_TURTLE)
                .add(ModItemIds.COOKED_MEAT_DOLPHIN)
                .add(ModItemIds.COOKED_MEAT_SQUID)
                .add(ModItemIds.COOKED_MEAT_AXOLOTL)
                .add(ModItemIds.COOKED_MEAT_ARMADILLO)
                .add(ModItemIds.COOKED_MEAT_NAUTILUS)
                .add(ModItemIds.COOKED_MEAT_RAVAGER)

        ;

        //CONVENTIONAL TAGS, SHARED WITH OTHER MODS
        builder(ConventionalItemTags.MILK_BUCKETS)
                .add(ModItemIds.GOAT_MILK_BUCKET)
        ;

        builder(ConventionalItemTags.COOKED_MEAT_FOODS)
                .add(ModItemIds.COOKED_MEAT_BEAR)
                .add(ModItemIds.COOKED_MEAT_CAMEL)
                .add(ModItemIds.COOKED_MEAT_HORSE)
                .add(ModItemIds.COOKED_MEAT_SNIFFER)
                .add(ModItemIds.COOKED_MEAT_GOAT)
                .add(ModItemIds.COOKED_MEAT_LLAMA)
                .add(ModItemIds.COOKED_MEAT_WOLF)
                .add(ModItemIds.COOKED_MEAT_FOX)
                .add(ModItemIds.COOKED_MEAT_PARROT)
                .add(ModItemIds.COOKED_MEAT_FROG)
                .add(ModItemIds.COOKED_MEAT_TURTLE)
                .add(ModItemIds.COOKED_MEAT_DOLPHIN)
                .add(ModItemIds.COOKED_MEAT_SQUID)
                .add(ModItemIds.COOKED_MEAT_AXOLOTL)
                .add(ModItemIds.COOKED_MEAT_ARMADILLO)
                .add(ModItemIds.COOKED_MEAT_NAUTILUS)
                .add(ModItemIds.COOKED_MEAT_RAVAGER)
        ;

    }
}
