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

    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_BLACKBERRIES_EMERALD = createKey("butcher/5/berry_blackberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_BLUEBERRIES_EMERALD = createKey("butcher/5/berry_blueberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_ELDERBERRIES_EMERALD = createKey("butcher/5/berry_elderberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_GOJI_BERRIES_EMERALD = createKey("butcher/5/berry_goji_berries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_GOOSEBERRIES_EMERALD = createKey("butcher/5/berry_gooseberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_STRAWBERRIES_EMERALD = createKey("butcher/5/berry_strawberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_RASPBERRIES_EMERALD = createKey("butcher/5/berry_raspberries_emerald");
    public static final ResourceKey<VillagerTrade> BUTCHER_5_BERRY_WHITE_CURRANT_BERRIES_EMERALD = createKey("butcher/5/berry_white_currant_berries_emerald");

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

            }
    
    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

    private static void register(BootstrapContext<VillagerTrade> context, ResourceKey<VillagerTrade> resourceKey, VillagerTrade trade) {
        context.register(resourceKey, trade);
    }

}
