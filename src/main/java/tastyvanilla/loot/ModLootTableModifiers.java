package tastyvanilla.loot;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.advancements.predicates.DataComponentMatchers;
import net.minecraft.advancements.predicates.EnchantmentPredicate;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate;
import net.minecraft.advancements.predicates.entity.EntityFlagsPredicate;
import net.minecraft.advancements.predicates.entity.EntityPredicate;
import net.minecraft.core.HolderLookup;
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
import tastyvanilla.TastyVanilla;
import tastyvanilla.item.ModItems;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Adds Tasty Vanilla drops ON TOP of vanilla loot tables while the game loads.
// Vanilla's own loot files stay untouched, so vanilla drops can never go missing.
public class ModLootTableModifiers {

    public static void registerModLootTableModifiers() {
        TastyVanilla.LOGGER.info("Registering Mod Loot Table Modifiers for " + TastyVanilla.MOD_ID);

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            // Only change tables that ship with the game or with mods, never a player's data pack.
            if (!source.isBuiltin()) {
                return;
            }

            //MEAT DROPS: TINY MOBS (1)
            addMeat(key, tableBuilder, registries, EntityTypes.FROG, ModItems.RAW_MEAT_FROG, 1, 1);
            addMeat(key, tableBuilder, registries, EntityTypes.PARROT, ModItems.RAW_MEAT_PARROT, 1, 1);
            addMeat(key, tableBuilder, registries, EntityTypes.AXOLOTL, ModItems.RAW_MEAT_AXOLOTL, 1, 1);
            addDrop(key, tableBuilder, registries, EntityTypes.ALLAY, ModItems.RAW_MEAT_ALLAY, 1, 1);
            addDrop(key, tableBuilder, registries, EntityTypes.BAT, ModItems.RAW_MEAT_BAT, 1, 1);


            //MEAT DROPS: MEDIUM MOBS (1-2)
            addMeat(key, tableBuilder, registries, EntityTypes.FOX, ModItems.RAW_MEAT_FOX, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.WOLF, ModItems.RAW_MEAT_WOLF, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.ARMADILLO, ModItems.RAW_MEAT_ARMADILLO, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.GOAT, ModItems.RAW_MEAT_GOAT, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.TURTLE, ModItems.RAW_MEAT_TURTLE, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.GLOW_SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.NAUTILUS, ModItems.RAW_MEAT_NAUTILUS, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.DOLPHIN, ModItems.RAW_MEAT_DOLPHIN, 1, 2);
            addDrop(key, tableBuilder, registries, EntityTypes.CAT, ModItems.RAW_MEAT_CAT, 0, 2);
            addDrop(key, tableBuilder, registries, EntityTypes.OCELOT, ModItems.RAW_MEAT_CAT, 0, 2);

            //MEAT DROPS: LARGE MOBS (1-3)
            addMeat(key, tableBuilder, registries, EntityTypes.HORSE, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.DONKEY, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.MULE, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.CAMEL, ModItems.RAW_MEAT_CAMEL, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.LLAMA, ModItems.RAW_MEAT_LLAMA, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.TRADER_LLAMA, ModItems.RAW_MEAT_LLAMA, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.POLAR_BEAR, ModItems.RAW_MEAT_BEAR, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.PANDA, ModItems.RAW_MEAT_BEAR, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.SNIFFER, ModItems.RAW_MEAT_SNIFFER, 1, 3);
            addMeat(key, tableBuilder, registries, EntityTypes.RAVAGER, ModItems.RAW_MEAT_RAVAGER, 1, 3);

            //MOOSHROOM: NOT HERE. Its beef is replaced on purpose, so it keeps its JSON file:
            //src/main/resources/data/minecraft/loot_table/entities/mooshroom.json

            //CHESTS: item, weight, min count, max count (added to the chest's main pool, like your old JSON files)
            if (key.equals(BuiltInLootTables.VILLAGE_BUTCHER)) {
                addToMainPool(tableBuilder,
                        chestItem(Items.CHICKEN, 3, 1, 3),
                        chestItem(Items.RABBIT, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_HORSE, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_BEAR, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_WOLF, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_FOX, 2, 1, 3));
            }

            // The cleric's chest (village temple): Frog Legs, Bat Wings, Cat Eye and Allay Wings, 1 to 2 of each.
            if (key.equals(BuiltInLootTables.VILLAGE_TEMPLE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.RAW_MEAT_FROG, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_BAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_CAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_ALLAY, 1, 1, 2));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_FISHER)) {
                addToMainPool(tableBuilder,
                        // Extra Cod and Salmon on top of vanilla's own entries (weights 2 and 1),
                        // so the totals stay 6 and 6 like in your old JSON file.
                        chestItem(Items.COD, 4, 1, 3),
                        chestItem(Items.SALMON, 5, 1, 3),
                        chestItem(ModItems.RAW_MEAT_SQUID, 6, 1, 3),
                        chestItem(ModItems.RAW_MEAT_TURTLE, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_DOLPHIN, 2, 1, 3));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_DESERT_HOUSE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.CHILLI, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_PLAINS_HOUSE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.BERRY_STRAWBERRIES, 10, 1, 7),
                        chestItem(ModItems.TOMATO, 10, 1, 7),
                        chestItem(ModItems.LETTUCE_SEEDS, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_SAVANNA_HOUSE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.EGGPLANT, 10, 1, 7),
                        chestItem(ModItems.SWEET_POTATO, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_SNOWY_HOUSE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10, 1, 5),
                        chestItem(ModItems.CABBAGE, 10, 1, 7));
            }

            if (key.equals(BuiltInLootTables.VILLAGE_TAIGA_HOUSE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.ONION, 10, 1, 7),
                        chestItem(ModItems.GARLIC, 10, 1, 7),
                        chestItem(ModItems.BERRY_BLUEBERRIES, 5, 1, 7),
                        chestItem(ModItems.BERRY_RASPBERRIES, 5, 1, 7));
            }

            if (key.equals(BuiltInLootTables.SHIPWRECK_SUPPLY)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.CABBAGE, 6, 2, 8),
                        chestItem(ModItems.CHILLI, 6, 2, 8),
                        chestItem(ModItems.EGGPLANT, 6, 2, 8),
                        chestItem(ModItems.GARLIC, 6, 2, 8),
                        chestItem(ModItems.LETTUCE_SEEDS, 6, 2, 8),
                        chestItem(ModItems.ONION, 6, 2, 8),
                        chestItem(ModItems.SWEET_POTATO, 6, 2, 8),
                        chestItem(ModItems.TOMATO, 6, 2, 8));
            }
        });
    }

    // Adds a meat pool to one mob, built exactly like vanilla's cow beef pool:
    // min-max meat, cooked if the mob was on fire or killed with Fire Aspect, +0-1 per Looting level.
    private static void addMeat(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, HolderLookup.Provider registries,
                                EntityType<?> mob, ItemLike meat, int min, int max) {
        if (!mob.getDefaultLootTable().map(key::equals).orElse(false)) {
            return;
        }

        tableBuilder.withPool(LootPool.lootPool()
                .setRolls(ContextIntProviders.exactly(1))
                .add(LootItem.lootTableItem(meat)
                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot(registries)))
                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Registries.ENCHANTMENT), ContextFloatProviders.between(0.0F, 1.0F)))));
    }

    // Same as addMeat, but the drop is never cooked. For drops with no cooking recipe
    // (Bat Wings, Allay Wings, Cat Eye), so the game doesn't log "Couldn't smelt" when the mob burns.
    private static void addDrop(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, HolderLookup.Provider registries,
                                EntityType<?> mob, ItemLike drop, int min, int max) {
        if (!mob.getDefaultLootTable().map(key::equals).orElse(false)) {
            return;
        }

        tableBuilder.withPool(LootPool.lootPool()
                .setRolls(ContextIntProviders.exactly(1))
                .add(LootItem.lootTableItem(drop)
                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)))
                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries.lookupOrThrow(Registries.ENCHANTMENT), ContextFloatProviders.between(0.0F, 1.0F)))));
    }

    // Same condition vanilla uses for cooked meat drops (copied from EntityLootSubProvider.shouldSmeltLoot() in 26.2):
    // the mob is on fire, OR the killer's main-hand item has an enchantment from #minecraft:smelts_loot (Fire Aspect).
    private static AnyOfCondition.Builder shouldSmeltLoot(HolderLookup.Provider registries) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = registries.lookupOrThrow(Registries.ENCHANTMENT);

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
    private static void addToMainPool(LootTable.Builder tableBuilder, LootPoolEntryContainer.Builder<?>... entries) {
        AtomicBoolean isFirstPool = new AtomicBoolean(true);

        tableBuilder.modifyPools(pool -> {
            if (isFirstPool.getAndSet(false)) {
                for (LootPoolEntryContainer.Builder<?> entry : entries) {
                    pool.add(entry);
                }
            }
        });
    }
}