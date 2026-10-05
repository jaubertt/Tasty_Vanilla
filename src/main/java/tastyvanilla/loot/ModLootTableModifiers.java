package tastyvanilla.loot;

import net.minecraft.advancements.predicates.DataComponentMatchers;
import net.minecraft.advancements.predicates.EnchantmentPredicate;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate;
import net.minecraft.advancements.predicates.entity.EntityFlagsPredicate;
import net.minecraft.advancements.predicates.entity.EntityPredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.component.predicates.DataComponentPredicates;
import net.minecraft.core.component.predicates.EnchantmentsPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.AnyOfCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;
import tastyvanilla.mixin.LootPoolAccessor;

import java.util.ArrayList;
import java.util.List;

// Adds Tasty Vanilla drops ON TOP of vanilla loot tables while the game loads.
// Vanilla's own loot files stay untouched, so vanilla drops can never go missing.
public class ModLootTableModifiers {

    // On the game event bus (NeoForge.EVENT_BUS, see TastyVanilla). NeoForge fires this once for every loot
    // table while the server loads its data, before the table is frozen. The Fabric branch does the same
    // with LootTableEvents.MODIFY. One difference: NeoForge gives no "built-in or data pack" flag,
    // so a data pack that overrides one of these tables gets the drops added too.
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceKey<LootTable> key = event.getKey();
        LootTable table = event.getTable();
        HolderGetter.Provider registries = event.getRegistries();
        {

            //MEAT DROPS: TINY MOBS (1)
            addMeat(key, table, registries, EntityTypes.FROG, ModItems.RAW_MEAT_FROG, 1, 1);
            addMeat(key, table, registries, EntityTypes.PARROT, ModItems.RAW_MEAT_PARROT, 1, 1);
            addMeat(key, table, registries, EntityTypes.AXOLOTL, ModItems.RAW_MEAT_AXOLOTL, 1, 1);
            addDrop(key, table, registries, EntityTypes.ALLAY, ModItems.RAW_MEAT_ALLAY, 1, 1);
            addDrop(key, table, registries, EntityTypes.BAT, ModItems.RAW_MEAT_BAT, 1, 1);


            //MEAT DROPS: MEDIUM MOBS (1-2)
            addMeat(key, table, registries, EntityTypes.FOX, ModItems.RAW_MEAT_FOX, 1, 2);
            addMeat(key, table, registries, EntityTypes.WOLF, ModItems.RAW_MEAT_WOLF, 1, 2);
            addMeat(key, table, registries, EntityTypes.ARMADILLO, ModItems.RAW_MEAT_ARMADILLO, 1, 2);
            addMeat(key, table, registries, EntityTypes.GOAT, ModItems.RAW_MEAT_GOAT, 1, 2);
            addMeat(key, table, registries, EntityTypes.TURTLE, ModItems.RAW_MEAT_TURTLE, 1, 2);
            addMeat(key, table, registries, EntityTypes.SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, table, registries, EntityTypes.GLOW_SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, table, registries, EntityTypes.NAUTILUS, ModItems.RAW_MEAT_NAUTILUS, 1, 2);
            addMeat(key, table, registries, EntityTypes.DOLPHIN, ModItems.RAW_MEAT_DOLPHIN, 1, 2);
            addDrop(key, table, registries, EntityTypes.CAT, ModItems.RAW_MEAT_CAT, 0, 2);
            addDrop(key, table, registries, EntityTypes.OCELOT, ModItems.RAW_MEAT_CAT, 0, 2);

            //MEAT DROPS: LARGE MOBS (1-3)
            addMeat(key, table, registries, EntityTypes.HORSE, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, table, registries, EntityTypes.DONKEY, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, table, registries, EntityTypes.MULE, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, table, registries, EntityTypes.CAMEL, ModItems.RAW_MEAT_CAMEL, 1, 3);
            addMeat(key, table, registries, EntityTypes.LLAMA, ModItems.RAW_MEAT_LLAMA, 1, 3);
            addMeat(key, table, registries, EntityTypes.TRADER_LLAMA, ModItems.RAW_MEAT_LLAMA, 1, 3);
            addMeat(key, table, registries, EntityTypes.POLAR_BEAR, ModItems.RAW_MEAT_BEAR, 1, 3);
            addMeat(key, table, registries, EntityTypes.PANDA, ModItems.RAW_MEAT_BEAR, 1, 3);
            addMeat(key, table, registries, EntityTypes.SNIFFER, ModItems.RAW_MEAT_SNIFFER, 1, 3);
            addMeat(key, table, registries, EntityTypes.RAVAGER, ModItems.RAW_MEAT_RAVAGER, 1, 3);

            //MOOSHROOM: NOT HERE. Its beef is replaced on purpose, so it keeps its JSON file:
            //src/main/resources/data/minecraft/loot_table/entities/mooshroom.json

            //CHESTS: item, weight, min count, max count (added to the chest's main pool, like your old JSON files)
            if (key.equals(BuiltInLootTables.VILLAGE_BUTCHER)) {
                addToMainPool(table,
                        chestItem(Items.CHICKEN, 3, 1, 3),
                        chestItem(Items.RABBIT, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_HORSE, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_BEAR, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_WOLF, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_FOX, 2, 1, 3));
            }

            // The cleric's chest (village temple): Frog Legs, Bat Wings, Cat Eye and Allay Wings, 1 to 2 of each.
            if (key.equals(BuiltInLootTables.VILLAGE_TEMPLE)) {
                addToMainPool(table,
                        chestItem(ModItems.RAW_MEAT_FROG, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_BAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_CAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_ALLAY, 1, 1, 2));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_FISHER)) {
                addToMainPool(table,
                        // Extra Cod and Salmon on top of vanilla's own entries (weights 2 and 1),
                        // so the totals stay 6 and 6 like in your old JSON file.
                        chestItem(Items.COD, 4, 1, 3),
                        chestItem(Items.SALMON, 5, 1, 3),
                        chestItem(ModItems.RAW_MEAT_SQUID, 6, 1, 3),
                        chestItem(ModItems.RAW_MEAT_TURTLE, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_DOLPHIN, 2, 1, 3));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_DESERT_HOUSE)) {
                addToMainPool(table,
                        chestItem(ModItems.CHILLI, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_PLAINS_HOUSE)) {
                addToMainPool(table,
                        chestItem(ModItems.BERRY_STRAWBERRIES, 10, 1, 7),
                        chestItem(ModItems.TOMATO, 10, 1, 7),
                        chestItem(ModItems.LETTUCE_SEEDS, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_SAVANNA_HOUSE)) {
                addToMainPool(table,
                        chestItem(ModItems.EGGPLANT, 10, 1, 7),
                        chestItem(ModItems.SWEET_POTATO, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_SNOWY_HOUSE)) {
                addToMainPool(table,
                        chestItem(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10, 1, 5),
                        chestItem(ModItems.CABBAGE, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_TAIGA_HOUSE)) {
                addToMainPool(table,
                        chestItem(ModItems.ONION, 10, 1, 7),
                        chestItem(ModItems.GARLIC, 10, 1, 7),
                        chestItem(ModItems.BERRY_BLUEBERRIES, 5, 1, 7),
                        chestItem(ModItems.BERRY_RASPBERRIES, 5, 1, 7));
            }

            if (key.equals(BuiltInLootTables.SHIPWRECK_SUPPLY)) {
                addToMainPool(table,
                        chestItem(ModItems.CABBAGE, 6, 2, 8),
                        chestItem(ModItems.CHILLI, 6, 2, 8),
                        chestItem(ModItems.EGGPLANT, 6, 2, 8),
                        chestItem(ModItems.GARLIC, 6, 2, 8),
                        chestItem(ModItems.LETTUCE_SEEDS, 6, 2, 8),
                        chestItem(ModItems.ONION, 6, 2, 8),
                        chestItem(ModItems.SWEET_POTATO, 6, 2, 8),
                        chestItem(ModItems.TOMATO, 6, 2, 8));
            }
        }
    }

    // Adds a meat pool to one mob, built exactly like vanilla's cow beef pool:
    // min-max meat, cooked if the mob was on fire or killed with Fire Aspect, +0-1 per Looting level.
    private static void addMeat(ResourceKey<LootTable> key, LootTable table, HolderGetter.Provider registries,
                                EntityType<?> mob, ItemLike meat, int min, int max) {
        if (!mob.getDefaultLootTable().map(key::equals).orElse(false)) {
            return;
        }

        table.addPool(LootPool.lootPool()
                .setRolls(ContextIntProviders.exactly(1))
                .add(LootItem.lootTableItem(meat)
                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot(registries)))
                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Registries.ENCHANTMENT), ContextFloatProviders.between(0.0F, 1.0F))))
                .build());
    }

    // Same as addMeat, but the drop is never cooked. For drops with no cooking recipe
    // (Bat Wings, Allay Wings, Cat Eye), so the game doesn't log "Couldn't smelt" when the mob burns.
    private static void addDrop(ResourceKey<LootTable> key, LootTable table, HolderGetter.Provider registries,
                                EntityType<?> mob, ItemLike drop, int min, int max) {
        if (!mob.getDefaultLootTable().map(key::equals).orElse(false)) {
            return;
        }

        table.addPool(LootPool.lootPool()
                .setRolls(ContextIntProviders.exactly(1))
                .add(LootItem.lootTableItem(drop)
                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)))
                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Registries.ENCHANTMENT), ContextFloatProviders.between(0.0F, 1.0F))))
                .build());
    }

    // Same condition vanilla uses for cooked meat drops (copied from EntityLootSubProvider.shouldSmeltLoot() in 26.2):
    // the mob is on fire, OR the killer's main-hand item has an enchantment from #minecraft:smelts_loot (Fire Aspect).
    private static AnyOfCondition.Builder shouldSmeltLoot(HolderGetter.Provider registries) {
        HolderGetter<Enchantment> enchantments = registries.lookupOrThrow(Registries.ENCHANTMENT);

        return AnyOfCondition.anyOf(
                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS,
                        EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true))),
                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.DIRECT_ATTACKER,
                        EntityPredicate.Builder.entity().equipment(EntityEquipmentPredicate.Builder.equipment().mainhand(
                                ItemPredicate.Builder.item().withComponents(DataComponentMatchers.Builder.components()
                                        .partial(DataComponentPredicates.ENCHANTMENTS, EnchantmentsPredicate.enchantments(List.of(
                                                new EnchantmentPredicate(enchantments.getOrThrow(EnchantmentTags.SMELTS_LOOT), MinMaxBounds.Ints.ANY))))
                                        .build())))));
    }

    // One chest entry: item, weight (how likely it is compared to the other items), min-max count.
    private static LootPoolEntryContainer.Builder<?> chestItem(ItemLike item, int weight, int min, int max) {
        return LootItem.lootTableItem(item)
                .setWeight(weight)
                .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)));
    }

    // Adds entries to the FIRST pool of a table, which is the main pool in every vanilla chest you use.
    // Vanilla's other pools (bundles, nautilus armor, armor trims) are left untouched.
    // NeoForge names that pool "main" when a table has one pool and "pool0" when it has several. The new
    // entries go at the end of its entry list through LootPoolAccessor, like Fabric's LootTable.Builder.modifyPools,
    // so the pool keeps its place, rolls and conditions. (26.2 rebuilt the pool through JSON; in 26.3 NeoForge
    // only hands the event a HolderGetter.Provider, which can't create the RegistryOps that would need.)
    private static void addToMainPool(LootTable table, LootPoolEntryContainer.Builder<?>... entries) {
        LootPool mainPool = table.getPool("main") != null ? table.getPool("main") : table.getPool("pool0");
        if (mainPool == null) {
            TastyVanilla.LOGGER.warn("Loot table {} has no main pool, nothing was added to it", table.getLootTableId());
            return;
        }

        LootPoolAccessor pool = (LootPoolAccessor) (Object) mainPool;
        List<LootPoolEntryContainer> combined = new ArrayList<>(pool.tastyvanilla$getEntries());
        for (LootPoolEntryContainer.Builder<?> entry : entries) {
            combined.add(entry.build());
        }
        pool.tastyvanilla$setEntries(List.copyOf(combined));
    }
}
