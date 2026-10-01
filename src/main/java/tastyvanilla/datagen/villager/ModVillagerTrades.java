package tastyvanilla.datagen.villager;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;

import java.util.List;
import java.util.Optional;

public class ModVillagerTrades {

    public static final ResourceKey<VillagerTrade> FARMER_1_CABBAGE_EMERALD = createKey("farmer/1/cabbage_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_CHILLI_EMERALD = createKey("farmer/1/chilli_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_EGGPLANT_EMERALD = createKey("farmer/1/eggplant_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_GARLIC_EMERALD = createKey("farmer/1/garlic_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_LETTUCE_EMERALD = createKey("farmer/1/lettuce_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_ONION_EMERALD = createKey("farmer/1/onion_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_SWEET_POTATO_EMERALD = createKey("farmer/1/sweet_potato_emerald");
    public static final ResourceKey<VillagerTrade> FARMER_1_TOMATO_EMERALD = createKey("farmer/1/tomato_emerald");

    public static final ResourceKey<VillagerTrade> BUTCHER_1_RAW_MEAT_WOLF_EMERALD = createKey("butcher/1/raw_meat_wolf_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_1_RAW_MEAT_FOX_EMERALD = createKey("butcher/1/raw_meat_fox_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_1_RAW_MEAT_PARROT_EMERALD = createKey("butcher/1/raw_meat_parrot_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_1_RAW_MEAT_ARMADILLO_EMERALD = createKey("butcher/1/raw_meat_armadillo_emerald");

    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_BEAR_EMERALD = createKey("butcher/3/raw_meat_bear_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_CAMEL_EMERALD = createKey("butcher/3/raw_meat_camel_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_HORSE_EMERALD = createKey("butcher/3/raw_meat_horse_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_VEGGIE_EMERALD = createKey("butcher/3/raw_meat_veggie_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_SNIFFER_EMERALD = createKey("butcher/3/raw_meat_sniffer_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_GOAT_EMERALD = createKey("butcher/3/raw_meat_goat_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_3_RAW_MEAT_LLAMA_EMERALD = createKey("butcher/3/raw_meat_llama_emerald");

    public static final ResourceKey<VillagerTrade> BUTCHER_4_RAW_MEAT_RAVAGER_EMERALD = createKey("butcher/4/raw_meat_ravager_emerald");

    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_BLACKBERRIES_EMERALD = createKey("butcher/5/berry_blackberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_BLUEBERRIES_EMERALD = createKey("butcher/5/berry_blueberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_ELDERBERRIES_EMERALD = createKey("butcher/5/berry_elderberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_GOJI_BERRIES_EMERALD = createKey("butcher/5/berry_goji_berries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_GOOSEBERRIES_EMERALD = createKey("butcher/5/berry_gooseberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_STRAWBERRIES_EMERALD = createKey("butcher/5/berry_strawberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_RASPBERRIES_EMERALD = createKey("butcher/5/berry_raspberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_WHITE_CURRANT_BERRIES_EMERALD = createKey("butcher/5/berry_white_currant_berries_emerald");

    public static final ResourceKey<VillagerTrade> FISHERMAN_4_RAW_MEAT_TURTLE_EMERALD = createKey("fisherman/4/raw_meat_turtle_emerald");
    public static final ResourceKey<VillagerTrade> FISHERMAN_4_RAW_MEAT_DOLPHIN_EMERALD = createKey("fisherman/4/raw_meat_dolphin_emerald");
    public static final ResourceKey<VillagerTrade> FISHERMAN_4_RAW_MEAT_SQUID_EMERALD = createKey("fisherman/4/raw_meat_squid_emerald");

    public static final ResourceKey<VillagerTrade> FISHERMAN_5_RAW_MEAT_AXOLOTL_EMERALD = createKey("fisherman/5/raw_meat_axolotl_emerald");
    public static final ResourceKey<VillagerTrade> FISHERMAN_5_RAW_MEAT_NAUTILUS_EMERALD = createKey("fisherman/5/raw_meat_nautilus_emerald");

    public static final ResourceKey<VillagerTrade> CLERIC_3_RAW_MEAT_FROG_EMERALD = createKey("cleric/3/raw_meat_frog_emerald");
    public static final ResourceKey<VillagerTrade> CLERIC_3_RAW_MEAT_CAT_EMERALD = createKey("cleric/3/raw_meat_cat_emerald");

    public static final ResourceKey<VillagerTrade> CLERIC_4_RAW_MEAT_ALLAY_EMERALD = createKey("cleric/4/raw_meat_allay_emerald");
    public static final ResourceKey<VillagerTrade> CLERIC_4_RAW_MEAT_BAT_EMERALD = createKey("cleric/4/raw_meat_bat_emerald");

    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_CHILLI_SEEDS = createKey("wandering_trader/emerald_chilli_seeds");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_LETTUCE_SEEDS = createKey("wandering_trader/emerald_lettuce_seeds");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_TOMATO_SEEDS = createKey("wandering_trader/emerald_tomato_seeds");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_CABBAGE = createKey("wandering_trader/emerald_cabbage");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_EGGPLANT = createKey("wandering_trader/emerald_eggplant");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_GARLIC = createKey("wandering_trader/emerald_garlic");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_ONION = createKey("wandering_trader/emerald_onion");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_SWEET_POTATO = createKey("wandering_trader/emerald_sweet_potato");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_BLACKBERRIES = createKey("wandering_trader/emerald_berry_blackberries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_BLUEBERRIES = createKey("wandering_trader/emerald_berry_blueberries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_ELDERBERRIES = createKey("wandering_trader/emerald_berry_elderberries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_GOJI_BERRIES = createKey("wandering_trader/emerald_berry_goji_berries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_GOOSEBERRIES = createKey("wandering_trader/emerald_berry_gooseberries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_RASPBERRIES = createKey("wandering_trader/emerald_berry_raspberries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_STRAWBERRIES = createKey("wandering_trader/emerald_berry_strawberries");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_EMERALD_BERRY_WHITE_CURRANT_BERRIES = createKey("wandering_trader/emerald_berry_white_currant_berries");



    public static void bootstrap(BootstrapContext<VillagerTrade> context) {

        register(context, FARMER_1_CABBAGE_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.CABBAGE, 20),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_CHILLI_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.CHILLI, 22),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_EGGPLANT_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.EGGPLANT, 20),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_GARLIC_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.GARLIC, 20),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_LETTUCE_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.LETTUCE, 26),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_ONION_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.ONION, 20),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_SWEET_POTATO_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.SWEET_POTATO, 22),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, FARMER_1_TOMATO_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.TOMATO, 26),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));

        register(context, BUTCHER_1_RAW_MEAT_WOLF_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_WOLF, 4),new ItemStackTemplate(Items.EMERALD), 16, 2, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_1_RAW_MEAT_FOX_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_FOX, 4),new ItemStackTemplate(Items.EMERALD), 16, 5, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_1_RAW_MEAT_PARROT_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_PARROT, 4),new ItemStackTemplate(Items.EMERALD), 16, 5, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_1_RAW_MEAT_ARMADILLO_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_ARMADILLO, 4),new ItemStackTemplate(Items.EMERALD), 16, 5, 0.05f, Optional.empty(), List.of()));

        register(context, BUTCHER_3_RAW_MEAT_BEAR_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_BEAR, 7),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_3_RAW_MEAT_CAMEL_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_CAMEL, 7),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_3_RAW_MEAT_HORSE_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_HORSE, 7),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_3_RAW_MEAT_VEGGIE_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_VEGGIE, 10),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_3_RAW_MEAT_SNIFFER_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_SNIFFER, 1),new ItemStackTemplate(Items.EMERALD), 16, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_3_RAW_MEAT_GOAT_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_GOAT, 7),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_3_RAW_MEAT_LLAMA_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_LLAMA, 10),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));

        register(context, BUTCHER_4_RAW_MEAT_RAVAGER_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_RAVAGER, 1),new ItemStackTemplate(Items.EMERALD), 16, 20, 0.05f, Optional.empty(), List.of()));

        register(context, BUTCHER_5_BERRY_BLACKBERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_BLACKBERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_BLUEBERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_BLUEBERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_ELDERBERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_ELDERBERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_GOJI_BERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_GOJI_BERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_GOOSEBERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_GOOSEBERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_STRAWBERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_STRAWBERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_RASPBERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_RASPBERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, BUTCHER_5_BERRY_WHITE_CURRANT_BERRIES_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));

        register(context, FISHERMAN_4_RAW_MEAT_TURTLE_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_TURTLE, 6),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, FISHERMAN_4_RAW_MEAT_DOLPHIN_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_DOLPHIN, 4),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, FISHERMAN_4_RAW_MEAT_SQUID_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_SQUID, 13),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));

        register(context, FISHERMAN_5_RAW_MEAT_AXOLOTL_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_AXOLOTL, 6),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, FISHERMAN_5_RAW_MEAT_NAUTILUS_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_NAUTILUS, 4),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));

        register(context, CLERIC_3_RAW_MEAT_FROG_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_FROG, 6),new ItemStackTemplate(Items.EMERALD), 12, 20, 0.05f, Optional.empty(), List.of()));
        register(context, CLERIC_3_RAW_MEAT_CAT_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_CAT, 2),new ItemStackTemplate(Items.EMERALD), 12, 20, 0.05f, Optional.empty(), List.of()));

        register(context, CLERIC_4_RAW_MEAT_ALLAY_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_ALLAY, 6),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));
        register(context, CLERIC_4_RAW_MEAT_BAT_EMERALD, new VillagerTrade(
                new TradeCost(ModItems.RAW_MEAT_BAT, 4),new ItemStackTemplate(Items.EMERALD), 12, 30, 0.05f, Optional.empty(), List.of()));

        register(context, WANDERING_TRADER_EMERALD_CHILLI_SEEDS, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.CHILLI_SEEDS), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_LETTUCE_SEEDS, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.LETTUCE_SEEDS), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_TOMATO_SEEDS, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.TOMATO_SEEDS), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_CABBAGE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.CABBAGE), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_EGGPLANT, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.EGGPLANT), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_GARLIC, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.GARLIC), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_ONION, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.ONION), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_SWEET_POTATO, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.SWEET_POTATO), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_BLACKBERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_BLACKBERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_BLUEBERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_BLUEBERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_ELDERBERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_ELDERBERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_GOJI_BERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_GOJI_BERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_GOOSEBERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_GOOSEBERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_RASPBERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_RASPBERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_STRAWBERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_STRAWBERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));
        register(context, WANDERING_TRADER_EMERALD_BERRY_WHITE_CURRANT_BERRIES, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),new ItemStackTemplate(ModItems.BERRY_WHITE_CURRANT_BERRIES), 12, 1, 0.05f, Optional.empty(), List.of()));

    }
    
    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

    private static void register(BootstrapContext<VillagerTrade> context, ResourceKey<VillagerTrade> resourceKey, VillagerTrade trade) {
        context.register(resourceKey, trade);
    }

}
