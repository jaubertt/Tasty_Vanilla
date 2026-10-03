package tastyvanilla.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import tastyvanilla.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

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
                .add(ModItems.LETTUCE)
                .add(ModItems.CABBAGE)
        ;

        valueLookupBuilder(ItemTags.FOX_FOOD)
                .add(ModItems.BERRY_BLUEBERRIES)
                .add(ModItems.BERRY_GOOSEBERRIES)
                .add(ModItems.BERRY_BLACKBERRIES)
                .add(ModItems.BERRY_ELDERBERRIES)
                .add(ModItems.BERRY_GOJI_BERRIES)
                .add(ModItems.BERRY_RASPBERRIES)
                .add(ModItems.BERRY_STRAWBERRIES)
                .add(ModItems.BERRY_WHITE_CURRANT_BERRIES)
        ;

        valueLookupBuilder(ItemTags.MEAT)
                .add(ModItems.RAW_MEAT_BEAR)
                .add(ModItems.RAW_MEAT_CAMEL)
                .add(ModItems.RAW_MEAT_HORSE)
                .add(ModItems.RAW_MEAT_SNIFFER)
                .add(ModItems.RAW_MEAT_GOAT)
                .add(ModItems.RAW_MEAT_LLAMA)
                .add(ModItems.RAW_MEAT_WOLF)
                .add(ModItems.RAW_MEAT_FOX)
                .add(ModItems.RAW_MEAT_PARROT)
                .add(ModItems.RAW_MEAT_FROG)
                .add(ModItems.RAW_MEAT_TURTLE)
                .add(ModItems.RAW_MEAT_DOLPHIN)
                .add(ModItems.RAW_MEAT_SQUID)
                .add(ModItems.RAW_MEAT_AXOLOTL)
                .add(ModItems.RAW_MEAT_ARMADILLO)
                .add(ModItems.RAW_MEAT_NAUTILUS)
                .add(ModItems.RAW_MEAT_RAVAGER)


                .add(ModItems.COOKED_MEAT_BEAR)
                .add(ModItems.COOKED_MEAT_CAMEL)
                .add(ModItems.COOKED_MEAT_HORSE)
                .add(ModItems.COOKED_MEAT_SNIFFER)
                .add(ModItems.COOKED_MEAT_GOAT)
                .add(ModItems.COOKED_MEAT_LLAMA)
                .add(ModItems.COOKED_MEAT_WOLF)
                .add(ModItems.COOKED_MEAT_FOX)
                .add(ModItems.COOKED_MEAT_PARROT)
                .add(ModItems.COOKED_MEAT_FROG)
                .add(ModItems.COOKED_MEAT_TURTLE)
                .add(ModItems.COOKED_MEAT_DOLPHIN)
                .add(ModItems.COOKED_MEAT_SQUID)
                .add(ModItems.COOKED_MEAT_AXOLOTL)
                .add(ModItems.COOKED_MEAT_ARMADILLO)
                .add(ModItems.COOKED_MEAT_NAUTILUS)
                .add(ModItems.COOKED_MEAT_RAVAGER)

        ;

        //CONVENTIONAL TAGS, SHARED WITH OTHER MODS
        valueLookupBuilder(ConventionalItemTags.MILK_BUCKETS)
                .add(ModItems.GOAT_MILK_BUCKET)
        ;

        valueLookupBuilder(ConventionalItemTags.COOKED_MEAT_FOODS)
                .add(ModItems.COOKED_MEAT_BEAR)
                .add(ModItems.COOKED_MEAT_CAMEL)
                .add(ModItems.COOKED_MEAT_HORSE)
                .add(ModItems.COOKED_MEAT_SNIFFER)
                .add(ModItems.COOKED_MEAT_GOAT)
                .add(ModItems.COOKED_MEAT_LLAMA)
                .add(ModItems.COOKED_MEAT_WOLF)
                .add(ModItems.COOKED_MEAT_FOX)
                .add(ModItems.COOKED_MEAT_PARROT)
                .add(ModItems.COOKED_MEAT_FROG)
                .add(ModItems.COOKED_MEAT_TURTLE)
                .add(ModItems.COOKED_MEAT_DOLPHIN)
                .add(ModItems.COOKED_MEAT_SQUID)
                .add(ModItems.COOKED_MEAT_AXOLOTL)
                .add(ModItems.COOKED_MEAT_ARMADILLO)
                .add(ModItems.COOKED_MEAT_NAUTILUS)
                .add(ModItems.COOKED_MEAT_RAVAGER)
        ;

    }
}
