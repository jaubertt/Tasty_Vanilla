package tastyvanilla.entity;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.entity.npc.villager.VillagerTrades;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import tastyvanilla.item.ModItems;

import java.util.List;

// Trades are built with vanilla's own trade types, the same way vanilla's VillagerTrades class does it in 1.21.11:
// EmeraldForItems(item, how many the villager wants for 1 emerald, max uses, xp)
// ItemsForEmeralds(item, price in emeralds, how many it sells, max uses, xp)
// Both use vanilla's price multiplier of 0.05.
// NeoForge hands out each profession's trade lists in VillagerTradesEvent and the wandering trader's in
// WandererTradesEvent (game event bus, see TastyVanilla); the Fabric branch uses TradeOfferHelper.
public class ModVillagerTrades {

    public static void onVillagerTrades(VillagerTradesEvent event) {
        ResourceKey<VillagerProfession> profession = event.getType();
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        //FARMER
        if (profession.equals(VillagerProfession.FARMER)) {
            List<VillagerTrades.ItemListing> level1 = trades.get(1);
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.CABBAGE, 20, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.CHILLI, 22, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.EGGPLANT, 20, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.GARLIC, 20, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.LETTUCE, 26, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.ONION, 20, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.SWEET_POTATO, 22, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.TOMATO, 26, 16, 2));
        }

        //BUTCHER
        if (profession.equals(VillagerProfession.BUTCHER)) {
            List<VillagerTrades.ItemListing> level1 = trades.get(1);
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_WOLF, 4, 16, 2));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_FOX, 4, 16, 5));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_PARROT, 4, 16, 5));
            level1.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_ARMADILLO, 4, 16, 5));

            List<VillagerTrades.ItemListing> level3 = trades.get(3);
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_BEAR, 7, 16, 20));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_CAMEL, 7, 16, 20));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_HORSE, 7, 16, 20));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_VEGGIE, 10, 16, 20));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_SNIFFER, 1, 16, 30));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_GOAT, 7, 16, 20));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_LLAMA, 10, 16, 20));

            List<VillagerTrades.ItemListing> level4 = trades.get(4);
            level4.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_RAVAGER, 1, 16, 20));

            List<VillagerTrades.ItemListing> level5 = trades.get(5);
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_BLACKBERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_BLUEBERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_ELDERBERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_GOJI_BERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_GOOSEBERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_STRAWBERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_RASPBERRIES, 10, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10, 12, 30));
        }

        //FISHERMAN
        if (profession.equals(VillagerProfession.FISHERMAN)) {
            List<VillagerTrades.ItemListing> level4 = trades.get(4);
            level4.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_TURTLE, 6, 12, 30));
            level4.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_DOLPHIN, 4, 12, 30));
            level4.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_SQUID, 13, 12, 30));

            List<VillagerTrades.ItemListing> level5 = trades.get(5);
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_AXOLOTL, 6, 12, 30));
            level5.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_NAUTILUS, 4, 12, 30));
        }

        //CLERIC
        if (profession.equals(VillagerProfession.CLERIC)) {
            List<VillagerTrades.ItemListing> level3 = trades.get(3);
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_FROG, 6, 12, 20));
            level3.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_CAT, 2, 12, 20));

            List<VillagerTrades.ItemListing> level4 = trades.get(4);
            level4.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_ALLAY, 2, 12, 30));
            level4.add(new VillagerTrades.EmeraldForItems(ModItems.RAW_MEAT_BAT, 4, 12, 30));
        }
    }

    //WANDERING TRADER: ADDED TO VANILLA'S COMMON LIST, WHICH OFFERS 5 OF ITS TRADES
    //(NeoForge calls it the generic list; it is the third list of vanilla's wandering trader trades, the one
    //Fabric's TradeOfferHelper calls SELL_COMMON_ITEMS_POOL)
    //1 EMERALD FOR 1 ITEM, UP TO 12, LIKE VANILLA WHEAT SEEDS
    public static void onWandererTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> common = event.getGenericTrades();
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.CHILLI_SEEDS, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.LETTUCE_SEEDS, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.TOMATO_SEEDS, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.CABBAGE, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.EGGPLANT, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.GARLIC, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.ONION, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.SWEET_POTATO, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_BLACKBERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_BLUEBERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_ELDERBERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_GOJI_BERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_GOOSEBERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_RASPBERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_STRAWBERRIES, 1, 1, 12, 1));
        common.add(new VillagerTrades.ItemsForEmeralds(ModItems.BERRY_WHITE_CURRANT_BERRIES, 1, 1, 12, 1));
    }
}
