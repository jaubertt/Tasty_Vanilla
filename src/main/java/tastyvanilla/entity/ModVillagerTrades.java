package tastyvanilla.entity;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;

public class ModVillagerTrades {

    //ITEM INITIALIZER
    public static void registerModVillagerTrades(){
        TastyVanilla.LOGGER.info("Registering Mod Villager Trades for " + TastyVanilla.MOD_ID);

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> {
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_BLACKBERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_BLUEBERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_ELDERBERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_GOJI_BERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_GOOSEBERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_STRAWBERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_RASPBERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10),
                    new ItemStack(Items.EMERALD, 1),12, 30, 0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.CABBAGE, 20),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.CHILLI, 22),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.EGGPLANT, 20),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.GARLIC, 20),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.LETTUCE, 26),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.ONION, 20),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.TOMATO, 22),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
            factories.add((entity,random) -> new TradeOffer(
                    new TradedItem(ModItems.SWEET_POTATO, 26),
                    new ItemStack(Items.EMERALD, 1),16, 2, 0.5F));
        });
    }
}
