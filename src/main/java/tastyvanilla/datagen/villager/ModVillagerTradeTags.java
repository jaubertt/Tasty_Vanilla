package tastyvanilla.datagen.villager;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradeTags extends FabricTagsProvider<VillagerTrade> {
    public ModVillagerTradeTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.FARMER_LEVEL_1)
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_CABBAGE_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_CHILLI_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_EGGPLANT_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_GARLIC_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_LETTUCE_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_ONION_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_TOMATO_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_SWEET_POTATO_EMERALD.identifier()));

        getOrCreateRawBuilder(VillagerTradeTags.BUTCHER_LEVEL_5)
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_BLACKBERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_BLUEBERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_ELDERBERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_GOJI_BERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_GOOSEBERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_RASPBERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_STRAWBERRIES_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_5_BERRY_WHITE_CURRANT_BERRIES_EMERALD.identifier()));
    }
}
