package tastyvanilla.loot;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.EnchantedCountIncreaseLootFunction;
import net.minecraft.loot.function.FurnaceSmeltLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.component.ComponentPredicateTypes;
import net.minecraft.predicate.component.ComponentsPredicate;
import net.minecraft.predicate.entity.EntityEquipmentPredicate;
import net.minecraft.predicate.entity.EntityFlagsPredicate;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EnchantmentTags;
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
            addMeat(key, tableBuilder, registries, EntityType.FROG, ModItems.RAW_MEAT_FROG, 1, 1);
            addMeat(key, tableBuilder, registries, EntityType.PARROT, ModItems.RAW_MEAT_PARROT, 1, 1);
            addMeat(key, tableBuilder, registries, EntityType.AXOLOTL, ModItems.RAW_MEAT_AXOLOTL, 1, 1);
            addDrop(key, tableBuilder, registries, EntityType.ALLAY, ModItems.RAW_MEAT_ALLAY, 1, 1);
            addDrop(key, tableBuilder, registries, EntityType.BAT, ModItems.RAW_MEAT_BAT, 1, 1);


            //MEAT DROPS: MEDIUM MOBS (1-2)
            addMeat(key, tableBuilder, registries, EntityType.FOX, ModItems.RAW_MEAT_FOX, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.WOLF, ModItems.RAW_MEAT_WOLF, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.ARMADILLO, ModItems.RAW_MEAT_ARMADILLO, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.GOAT, ModItems.RAW_MEAT_GOAT, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.TURTLE, ModItems.RAW_MEAT_TURTLE, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.GLOW_SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.NAUTILUS, ModItems.RAW_MEAT_NAUTILUS, 1, 2);
            addMeat(key, tableBuilder, registries, EntityType.DOLPHIN, ModItems.RAW_MEAT_DOLPHIN, 1, 2);
            addDrop(key, tableBuilder, registries, EntityType.CAT, ModItems.RAW_MEAT_CAT, 0, 2);
            addDrop(key, tableBuilder, registries, EntityType.OCELOT, ModItems.RAW_MEAT_CAT, 0, 2);

            //MEAT DROPS: LARGE MOBS (1-3)
            addMeat(key, tableBuilder, registries, EntityType.HORSE, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.DONKEY, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.MULE, ModItems.RAW_MEAT_HORSE, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.CAMEL, ModItems.RAW_MEAT_CAMEL, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.LLAMA, ModItems.RAW_MEAT_LLAMA, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.TRADER_LLAMA, ModItems.RAW_MEAT_LLAMA, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.POLAR_BEAR, ModItems.RAW_MEAT_BEAR, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.PANDA, ModItems.RAW_MEAT_BEAR, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.SNIFFER, ModItems.RAW_MEAT_SNIFFER, 1, 3);
            addMeat(key, tableBuilder, registries, EntityType.RAVAGER, ModItems.RAW_MEAT_RAVAGER, 1, 3);

            //MOOSHROOM: NOT HERE. Its beef is replaced on purpose, so it keeps its JSON file:
            //src/main/resources/data/minecraft/loot_table/entities/mooshroom.json

            //CHESTS: item, weight, min count, max count (added to the chest's main pool, like your old JSON files)
            if (key.equals(LootTables.VILLAGE_BUTCHER_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(Items.CHICKEN, 3, 1, 3),
                        chestItem(Items.RABBIT, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_HORSE, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_BEAR, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_WOLF, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_FOX, 2, 1, 3));
            }

            // The cleric's chest (village temple): Frog Legs, Bat Wings, Cat Eye and Allay Wings, 1 to 2 of each.
            if (key.equals(LootTables.VILLAGE_TEMPLE_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.RAW_MEAT_FROG, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_BAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_CAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_ALLAY, 1, 1, 2));
            }

            if (key.equals(LootTables.VILLAGE_FISHER_CHEST)) {
                addToMainPool(tableBuilder,
                        // Extra Cod and Salmon on top of vanilla's own entries (weights 2 and 1),
                        // so the totals stay 6 and 6 like in your old JSON file.
                        chestItem(Items.COD, 4, 1, 3),
                        chestItem(Items.SALMON, 5, 1, 3),
                        chestItem(ModItems.RAW_MEAT_SQUID, 6, 1, 3),
                        chestItem(ModItems.RAW_MEAT_TURTLE, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_DOLPHIN, 2, 1, 3));
            }

            if (key.equals(LootTables.VILLAGE_DESERT_HOUSE_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.CHILLI, 10, 1, 7));
            }

            if (key.equals(LootTables.VILLAGE_PLAINS_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.BERRY_STRAWBERRIES, 10, 1, 7),
                        chestItem(ModItems.TOMATO, 10, 1, 7),
                        chestItem(ModItems.LETTUCE_SEEDS, 10, 1, 7));
            }

            if (key.equals(LootTables.VILLAGE_SAVANNA_HOUSE_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.EGGPLANT, 10, 1, 7),
                        chestItem(ModItems.SWEET_POTATO, 10, 1, 7));
            }

            if (key.equals(LootTables.VILLAGE_SNOWY_HOUSE_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.BERRY_WHITE_CURRANT_BERRIES, 10, 1, 5),
                        chestItem(ModItems.CABBAGE, 10, 1, 7));
            }

            if (key.equals(LootTables.VILLAGE_TAIGA_HOUSE_CHEST)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.ONION, 10, 1, 7),
                        chestItem(ModItems.GARLIC, 10, 1, 7),
                        chestItem(ModItems.BERRY_BLUEBERRIES, 5, 1, 7),
                        chestItem(ModItems.BERRY_RASPBERRIES, 5, 1, 7));
            }

            if (key.equals(LootTables.SHIPWRECK_SUPPLY_CHEST)) {
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
    private static void addMeat(RegistryKey<LootTable> key, LootTable.Builder tableBuilder, RegistryWrapper.WrapperLookup registries,
                                EntityType<?> mob, ItemConvertible meat, float min, float max) {
        if (!mob.getLootTableKey().map(key::equals).orElse(false)) {
            return;
        }

        tableBuilder.pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))
                .with(ItemEntry.builder(meat)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                        .apply(FurnaceSmeltLootFunction.builder().conditionally(createSmeltLootCondition(registries)))
                        .apply(EnchantedCountIncreaseLootFunction.builder(registries, UniformLootNumberProvider.create(0.0F, 1.0F)))));
    }

    // Same as addMeat, but the drop is never cooked. For drops with no cooking recipe
    // (Bat Wings, Allay Wings, Cat Eye), so the game doesn't log "Couldn't smelt" when the mob burns.
    private static void addDrop(RegistryKey<LootTable> key, LootTable.Builder tableBuilder, RegistryWrapper.WrapperLookup registries,
                                EntityType<?> mob, ItemConvertible drop, float min, float max) {
        if (!mob.getLootTableKey().map(key::equals).orElse(false)) {
            return;
        }

        tableBuilder.pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))
                .with(ItemEntry.builder(drop)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                        .apply(EnchantedCountIncreaseLootFunction.builder(registries, UniformLootNumberProvider.create(0.0F, 1.0F)))));
    }

    // Same condition vanilla uses for cooked meat drops (copied from EntityLootTableGenerator.createSmeltLootCondition() in 1.21.11):
    // the mob is on fire, OR the killer's main-hand item has an enchantment from #minecraft:smelts_loot (Fire Aspect).
    private static AnyOfLootCondition.Builder createSmeltLootCondition(RegistryWrapper.WrapperLookup registries) {
        RegistryWrapper.Impl<Enchantment> enchantments = registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        return AnyOfLootCondition.builder(
                EntityPropertiesLootCondition.builder(LootContext.EntityReference.THIS,
                        EntityPredicate.Builder.create().flags(EntityFlagsPredicate.Builder.create().onFire(true))),
                EntityPropertiesLootCondition.builder(LootContext.EntityReference.DIRECT_ATTACKER,
                        EntityPredicate.Builder.create().equipment(EntityEquipmentPredicate.Builder.create().mainhand(
                                ItemPredicate.Builder.create().components(ComponentsPredicate.Builder.create()
                                        .partial(ComponentPredicateTypes.ENCHANTMENTS, EnchantmentsPredicate.enchantments(List.of(
                                                new EnchantmentPredicate(enchantments.getOrThrow(EnchantmentTags.SMELTS_LOOT), NumberRange.IntRange.ANY))))
                                        .build())))));
    }

    // One chest entry: item, weight (how likely it is compared to the other items), min-max count.
    private static LootPoolEntry.Builder<?> chestItem(ItemConvertible item, int weight, float min, float max) {
        return ItemEntry.builder(item)
                .weight(weight)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)));
    }

    // Adds entries to the FIRST pool of a table, which is the main pool in every vanilla chest you use.
    // Vanilla's other pools (bundles, nautilus armor, armor trims) are left untouched.
    private static void addToMainPool(LootTable.Builder tableBuilder, LootPoolEntry.Builder<?>... entries) {
        AtomicBoolean isFirstPool = new AtomicBoolean(true);

        tableBuilder.modifyPools(pool -> {
            if (isFirstPool.getAndSet(false)) {
                for (LootPoolEntry.Builder<?> entry : entries) {
                    pool.with(entry);
                }
            }
        });
    }
}
