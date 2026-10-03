package tastyvanilla.entity;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;

// Trades are built with vanilla's own trade types, the same way vanilla's TradeOffers class does it in 1.21.11:
// BuyItemFactory(item, how many the villager wants for 1 emerald, max uses, xp)
// SellItemFactory(item, price in emeralds, how many it sells, max uses, xp)
// Both use vanilla's price multiplier of 0.05.
public class ModVillagerTrades {

    //ITEM INITIALIZER
    public static void registerModVillagerTrades(){
        TastyVanilla.LOGGER.info("Registering Mod Villager Trades for " + TastyVanilla.MOD_ID);

        //FARMER
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.CABBAGE, 20, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.CHILLI, 22, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.EGGPLANT, 20, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.GARLIC, 20, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.LETTUCE, 26, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.ONION, 20, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.SWEET_POTATO, 22, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.TOMATO, 26, 16, 2));
        });

        //BUTCHER
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_WOLF, 4, 16, 2));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_FOX, 4, 16, 5));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_PARROT, 4, 16, 5));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_ARMADILLO, 4, 16, 5));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_BEAR, 7, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_CAMEL, 7, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_HORSE, 7, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_VEGGIE, 10, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_SNIFFER, 1, 16, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_GOAT, 7, 16, 20));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_LLAMA, 10, 16, 20));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_RAVAGER, 1, 16, 20));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_BLACKBERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_BLUEBERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_ELDERBERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_GOJI_BERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_GOOSEBERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_STRAWBERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_RASPBERRIES, 10, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10, 12, 30));
        });

        //FISHERMAN
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 4, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_TURTLE, 6, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_DOLPHIN, 4, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_SQUID, 13, 12, 30));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_AXOLOTL, 6, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_NAUTILUS, 4, 12, 30));
        });

        //CLERIC
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_FROG, 6, 12, 20));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_CAT, 2, 12, 20));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_ALLAY, 2, 12, 30));
            factories.add(new TradeOffers.BuyItemFactory(ModItems.RAW_MEAT_BAT, 4, 12, 30));
        });

        //WANDERING TRADER: ADDED TO VANILLA'S COMMON LIST, WHICH OFFERS 5 OF ITS TRADES
        //1 EMERALD FOR 1 ITEM, UP TO 12, LIKE VANILLA WHEAT SEEDS
        TradeOfferHelper.registerWanderingTraderOffers(builder -> builder.addOffersToPool(
                TradeOfferHelper.WanderingTraderOffersBuilder.SELL_COMMON_ITEMS_POOL,
                new TradeOffers.SellItemFactory(ModItems.CHILLI_SEEDS, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.LETTUCE_SEEDS, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.TOMATO_SEEDS, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.CABBAGE, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.EGGPLANT, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.GARLIC, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.ONION, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.SWEET_POTATO, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_BLACKBERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_BLUEBERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_ELDERBERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_GOJI_BERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_GOOSEBERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_RASPBERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_STRAWBERRIES, 1, 1, 12, 1),
                new TradeOffers.SellItemFactory(ModItems.BERRY_WHITE_CURRANT_BERRIES, 1, 1, 12, 1)));
    }
}
