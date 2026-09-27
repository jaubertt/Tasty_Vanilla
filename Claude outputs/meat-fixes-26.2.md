# Tasty Vanilla: meat fixes, step by step (26.2)

These steps use your decisions from 2026-09-26. The line numbers match your files as they were at 00:31 Mazatlán time on 2026-09-27, after you finished Parts 1 to 9. If you've edited a file since, use the quoted text to find the line.

Parts 1 to 9 are done and checked. Part 0 is optional. When you build your next release jar, tell me its name (Part 9, step 6).

## Checklist

- [ ] Part 0: Safety commit (optional)
- [x] Part 1: Saturation values (`ModFoods.java`), done
- [x] Part 2: Wolves eat the new meats (`ModItemTagProvider.java`), done
- [x] Part 3: LLAMA leftover and cleric trades, done
- [x] Part 4: Run Data Generation, done
- [x] Part 5: Veggie Meat textures, done
- [x] Part 6: Advancements folder name, done
- [x] Part 6b: Fix one advancement file (`food_bumsblech_salad.json`), done
- [x] Part 7: Mob and chest loot through `LootTableEvents.MODIFY`, done
- [x] Part 8: Test in game, done
- [x] Part 9: Keep iCloud copies out of your mod jar (`build.gradle`), done

## Your decisions

| Topic | Decision |
|---|---|
| Mooshroom | No change. It drops Veggie Meat instead of beef, and still drops leather. |
| Dolphin | Vanilla cod comes back. Raw Dolphin drops 1-2. |
| Cleric trades | Allay and Bat both at level 5 (Master), 30 XP each. Frog stays at level 3. |
| Drop counts | Tiny mobs 1, medium mobs 1-2, large mobs 1-3. Looting still adds 0-1. |
| Trade XP | No change to the butcher trades. |
| Wolves | They eat every new meat except Veggie Meat, Allay Wings and Bat Wings, raw or cooked. |
| Vanilla loot | No more overriding, except `mooshroom.json`. Your drops are added with `LootTableEvents.MODIFY` (Part 7). If you'd rather keep the JSON copies, skip Part 7 and use the Appendix. |
| Advancements folder | Yes, rename it (Part 6). |

---

## Part 0: Safety commit (optional)

Why: a commit saves Parts 1 to 7 in Git, so you can undo anything you change later. Git was healthy when last checked, at 22:19 Mazatlán time on 2026-09-26: every file in `.git` was readable and `git fsck` found no errors.

Three of your source files aren't in Git yet: `ModItemIds.java`, `ModBlockIds.java` and `ModBlockItemIds.java`. Other files use them, so a commit without them won't compile.

1. In IntelliJ, open the Commit window (**Cmd+K**).
2. Tick every file under **Changes**.
3. Under **Unversioned Files**, tick `ModItemIds.java`, `ModBlockIds.java` and `ModBlockItemIds.java`.
4. Also tick the three new generated files: `meat.json`, `level_5.json` and `cleric/5/raw_meat_allay_emerald.json`.
5. Leave these unticked: `src/main/generated/.cache` (datagen's record of what it wrote), `.claude/settings.local.json` and the `Claude outputs` folder. Your `icon.png` and the two `sugar.json` files are up to you.
6. Type a message, for example `26.2 meat fixes, parts 1 to 7`.
7. Click **Commit** (not Commit and Push).

---

## Part 1: Saturation values (done)

File: `src/main/java/tastyvanilla/food/ModFoods.java`

Why: `saturationModifier()` takes a multiplier. The game calculates saturation = hunger × multiplier × 2. These numbers give exactly vanilla's saturation, for example Steak: 8 × 0.8 × 2 = 12.8.

1. Open `ModFoods.java`.
2. Line 120 (`RAW_MEAT_TIER_1`): change `saturationModifier(1.8F)` to `saturationModifier(0.3F)`.
3. Line 121 (`RAW_MEAT_TIER_2`): change `saturationModifier(1.2F)` to `saturationModifier(0.3F)`.
4. Line 122 (`RAW_MEAT_TIER_3`): change `saturationModifier(0.4F)` to `saturationModifier(0.1F)`.
5. Line 123 (`RAW_MEAT_TIER_4`): change `saturationModifier(0.6F)` to `saturationModifier(0.3F)`.
6. Line 125 (`COOKED_MEAT_TIER_1`): change `saturationModifier(12.8F)` to `saturationModifier(0.8F)`.
7. Line 126 (`COOKED_MEAT_TIER_2`): change `saturationModifier(9.6F)` to `saturationModifier(0.8F)`.
8. Line 127 (`COOKED_MEAT_TIER_3`): change `saturationModifier(6.0F)` to `saturationModifier(0.6F)`.
9. Line 128 (`COOKED_MEAT_TIER_4`): change `saturationModifier(3.6F)` to `saturationModifier(0.6F)`.

Result:

| Tier | Hunger | Saturation after the fix | Same as vanilla |
|---|---|---|---|
| Raw 1 | 3 | 1.8 | Raw Beef, Raw Porkchop, Raw Rabbit |
| Raw 2 | 2 | 1.2 | Raw Chicken, Raw Mutton |
| Raw 3 | 2 | 0.4 | Raw Cod, Raw Salmon |
| Raw 4 | 1 | 0.6 | (no vanilla meat) |
| Cooked 1 | 8 | 12.8 | Steak, Cooked Porkchop |
| Cooked 2 | 6 | 9.6 | Cooked Mutton, Cooked Salmon |
| Cooked 3 | 5 | 6.0 | Cooked Rabbit, Cooked Cod |
| Cooked 4 | 3 | 3.6 | (no vanilla meat) |

---

## Part 2: Wolves eat the new meats (done)

Checked on 2026-09-26 at 22:45 Mazatlán time:

- `ModItemTagProvider.java` adds 34 items to `#minecraft:meat`: 17 raw and 17 cooked. Wolves eat anything in that tag, through `#minecraft:wolf_food`.
- Left out on purpose: Veggie Meat, Allay Wings and Bat Wings, raw and cooked.
- The generated `data/minecraft/tags/item/meat.json` lists the same 34.

---

## Part 3: LLAMA leftover and cleric trades (done)

Checked in your files on 2026-09-26 at 22:07 Mazatlán time:

- `ModVillagerTrades.java` line 108 uses `ModItems.RAW_MEAT_LLAMA`. No `LlAMA` is left anywhere in `src/main/java`.
- Allay trade: `CLERIC_5_RAW_MEAT_ALLAY_EMERALD`, ID `cleric/5/raw_meat_allay_emerald`, 30 XP.
- Bat trade: `CLERIC_5_RAW_MEAT_BAT_EMERALD`, ID `cleric/5/raw_meat_bat_emerald`, 30 XP.
- `ModVillagerTradeTags.java`: `CLERIC_LEVEL_3` has only the Frog trade. `CLERIC_LEVEL_5` has the Bat and Allay trades.

---

## Part 4: Run Data Generation (done)

You ran it at 22:38 Mazatlán time. Checked at 22:45:

- `meat.json` lists the 34 meats from Part 2.
- `cleric/level_5.json` lists Bat and Allay. `cleric/level_3.json` lists only Frog.
- The Allay trade now lives in `cleric/5/raw_meat_allay_emerald.json`: 13 Allay Wings for 1 emerald, 30 XP. Datagen deleted the old `cleric/3` file itself.
- The `data 2` duplicate is gone. The log's `removed stale: 13` was its 9 files, the old Allay file and 3 Finder `.DS_Store` files.
- 42 other files changed only because 26.2 leaves out default values: `"cookingtime"` in your 40 meat cooking recipes, and `"bonus_rolls": 0.0` in the salt and sugar block loot tables. Vanilla 26.2 writes its own files the same way, and the game fills in the same defaults.
- Not in Git yet: the three new files above and the `.cache` folder. Part 0 says which to commit.

Run Data Generation again whenever you change a datagen class. It deletes any file in `src/main/generated` that it didn't write, so never keep hand-made files in that folder.

---

## Part 5: Veggie Meat textures (done)

Checked at 22:45: `raw_meat_veggie.png` and `cooked_meat_veggie.png` are in `textures/item/`, 16x16 like your other item textures, and the generated models point to them. Part 8's log check confirms them in game.

---

## Part 6: Advancements folder name (done)

Checked at 22:45:

- `data/tastyvanilla/advancement/` has all 48 files, and `advancements/` is gone.
- `cookie.json` line 32 now says `"tastyvanilla:cookie_sunflower_seed"`.
- Every recipe and item that the 48 files point to exists (117 recipe links, 73 item links).

Part 8's log check confirms they load.

---

## Part 6b: One advancement file to fix (done)

Fixed at 23:27 and checked: lines 31 to 33 now list `has_tomato`, `has_eggplant` and `has_cooked_chicken`, the file is valid JSON, and all 48 files pass this rule. The game confirms it on its next start (Part 8, step 27).

Found in game at 23:07. The log shows `Couldn't parse data file 'tastyvanilla:recipes/food/food_bumsblech_salad'`, and the game loaded 1795 advancements instead of 1796.

Why: 26.2 refuses an advancement unless its `requirements` list names every criterion in the file. This file defines `has_eggplant` and `has_cooked_chicken` but doesn't list them. I checked all 48 files for this rule: the other 47 are fine.

1. Open `src/main/resources/data/tastyvanilla/advancement/recipes/food/food_bumsblech_salad.json`.
2. Line 31: change `"has_tomato"` to `"has_tomato",` (add a comma at the end).
3. Click at the end of line 31 and press Enter.
4. Paste these two lines:

```json
      "has_eggplant",
      "has_cooked_chicken"
```

Result: the salad recipe unlocks when you pick up any of its four ingredients. All 1,562 vanilla recipe unlocks work this way: one list, and any item in it counts. The game picks up the change the next time you start it.

---

## Part 7: Mob and chest loot through LootTableEvents.MODIFY (done)

Checked at 23:05 Mazatlán time:

- `loot/ModLootTableModifiers.java` matches the code at the end of this part. The only difference is the missing line break after the last `}`, which doesn't matter. IntelliJ already added the file to Git.
- `TastyVanilla.java` imports it (line 11) and calls `ModLootTableModifiers.registerModLootTableModifiers();` right after `ModWorldGeneration.GenerateWorldGen();` (line 25).
- `loot_table` holds only `entities/mooshroom.json`, unchanged. Git shows the other 39 files as deleted.
- Built and running at 23:07: the class compiled, the log shows `Registering Mod Loot Table Modifiers for tastyvanilla`, and the build folder now has only `mooshroom.json`, so the old JSON copies are gone.

### How it works

- `LootTableEvents.MODIFY` is a Fabric event. It runs once for every loot table while the game loads a world.
- Your code checks which table it is (`key`), then adds to it: a new pool for a mob, or new entries for a chest.
- Vanilla's own loot files stay in charge. Vanilla drops can't go missing, and if Minecraft changes a table, your additions still sit on top of the new version.
- The whole thing is one Java class, started once from `TastyVanilla.onInitialize()`.

Fabric's source for this event (branch 26.2):
https://github.com/FabricMC/fabric/blob/26.2/fabric-loot-api-v3/src/main/java/net/fabricmc/fabric/api/loot/v3/LootTableEvents.java

### What changes compared with your current JSON files

- Tiny and medium mobs drop less, except the dolphin, which goes up from 0-1 to 1-2 (your decisions). Large mobs stay at 1-3.
- Dolphin: the cod comes back, and Raw Dolphin drops 1-2.
- Village houses get their vanilla 26.2 bundle back. Shipwreck supply chests get their nautilus armor back.
- Fisher chest: same odds as your file. Vanilla's Cod and Salmon entries stay, and extra ones are added so the totals are still 6 and 6.
- Taiga house: Blueberries are listed once, at weight 5. Your file listed them twice, which nearly doubled their chance. If you want the old chance, change that `5` to `10`.
- Shipwreck crops: 2-8 each. Your file had min 8 and max 2, which always gives exactly 8. If you meant something else, change the numbers in the `SHIPWRECK_SUPPLY` block.
- Mooshroom keeps its JSON file, since removing its beef is a deliberate change to vanilla.

I compiled this class against the Minecraft 26.2 jar in your project's `.gradle` folder, plus Fabric API 26.2's method signatures. It compiled with no errors. The meat pool and the "cooked if on fire / Fire Aspect" condition are built the same way vanilla builds the Cow's beef pool in 26.2.

### Steps

1. In the Project panel, right-click `src/main/java/tastyvanilla`.
2. Choose **New > Package** and type `loot`.
3. Right-click the new `loot` package.
4. Choose **New > Java Class** and type `ModLootTableModifiers`.
5. Replace everything in the new file with the code at the end of this part.
6. Open `src/main/java/tastyvanilla/TastyVanilla.java`.
7. Below the line `import tastyvanilla.world.gen.ModWorldGeneration;`, add this line:

```java
import tastyvanilla.loot.ModLootTableModifiers;
```

8. Below the line `ModWorldGeneration.GenerateWorldGen();`, add this line:

```java
		ModLootTableModifiers.registerModLootTableModifiers();
```

9. In the Project panel, open `src/main/resources/data/minecraft/loot_table/`.
10. Delete the `blocks` folder. Its 2 grass files give the same drops as vanilla, so nothing is lost.
11. Delete the `chests` folder. Its 8 files are replaced by the code.
12. Open the `entities` folder.
13. Select every file except `mooshroom.json` (29 files), then delete them. To select them: click the first file, Shift+click the last one, then Cmd+click `mooshroom.json` to unselect it. If you skip this step, mobs drop their meat twice.
14. Check that `loot_table` now contains only `entities/mooshroom.json`.
15. Choose **Build > Build Project**. It should finish with no errors.
16. If the Part 8 tests later show double meat (2 or more Bat Wings) or duplicate chest items, old JSON copies are still in the build output. Run the Gradle task **clean** (Gradle panel > Tasks > build > clean), then run the game again. Clean deletes the whole `build` folder, including your jars in `build/libs`, so move any jar you want to keep before you run it.

### The code (`ModLootTableModifiers.java`)

```java
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
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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
            addMeat(key, tableBuilder, registries, EntityTypes.BAT, ModItems.RAW_MEAT_BAT, 1, 1);
            addMeat(key, tableBuilder, registries, EntityTypes.FROG, ModItems.RAW_MEAT_FROG, 1, 1);
            addMeat(key, tableBuilder, registries, EntityTypes.ALLAY, ModItems.RAW_MEAT_ALLAY, 1, 1);
            addMeat(key, tableBuilder, registries, EntityTypes.PARROT, ModItems.RAW_MEAT_PARROT, 1, 1);
            addMeat(key, tableBuilder, registries, EntityTypes.AXOLOTL, ModItems.RAW_MEAT_AXOLOTL, 1, 1);

            //MEAT DROPS: MEDIUM MOBS (1-2)
            addMeat(key, tableBuilder, registries, EntityTypes.FOX, ModItems.RAW_MEAT_FOX, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.CAT, ModItems.RAW_MEAT_CAT, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.OCELOT, ModItems.RAW_MEAT_CAT, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.WOLF, ModItems.RAW_MEAT_WOLF, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.ARMADILLO, ModItems.RAW_MEAT_ARMADILLO, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.GOAT, ModItems.RAW_MEAT_GOAT, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.TURTLE, ModItems.RAW_MEAT_TURTLE, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.GLOW_SQUID, ModItems.RAW_MEAT_SQUID, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.NAUTILUS, ModItems.RAW_MEAT_NAUTILUS, 1, 2);
            addMeat(key, tableBuilder, registries, EntityTypes.DOLPHIN, ModItems.RAW_MEAT_DOLPHIN, 1, 2);

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

            //MOOSHROOM: NOT HERE. Its beef is replaced on purpose, so it keeps its JSON file:
            //src/main/resources/data/minecraft/loot_table/entities/mooshroom.json

            //CHESTS: item, weight, min count, max count (added to the chest's main pool, like your old JSON files)
            if (key.equals(BuiltInLootTables.VILLAGE_BUTCHER)) {
                addToMainPool(tableBuilder,
                        chestItem(Items.CHICKEN, 3, 1, 3),
                        chestItem(Items.RABBIT, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_HORSE, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_BEAR, 3, 1, 3),
                        chestItem(ModItems.RAW_MEAT_CAT, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_WOLF, 2, 1, 3),
                        chestItem(ModItems.RAW_MEAT_FOX, 2, 1, 3));
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
                                EntityType<?> mob, ItemLike meat, float min, float max) {
        if (!mob.getDefaultLootTable().map(key::equals).orElse(false)) {
            return;
        }

        tableBuilder.withPool(LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(meat)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot(registries)))
                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries, UniformGenerator.between(0.0F, 1.0F)))));
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
    private static LootPoolEntryContainer.Builder<?> chestItem(ItemLike item, int weight, float min, float max) {
        return LootItem.lootTableItem(item)
                .setWeight(weight)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)));
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
```

---

## Part 8: Test in game (done)

Progress at 23:31: steps 1 to 3 are done. Steps 26 to 28 passed: no `veggie` lines, and after Part 6b the log says `Loaded 1796 advancements` with no parse errors. You reported steps 4 to 25 done. The log from that session shows no errors, only one `Can't keep up!` lag warning, which is normal.

Setup:

1. In IntelliJ's run configuration menu (top right), choose **Minecraft Client**.
2. Click **Run**. It builds Part 7 first. If the build fails, copy the error to me.
3. Open a creative world. The difficulty must not be Peaceful, for the saturation test.

Dolphin drops (tests Part 7):

4. Run `/summon minecraft:dolphin ~ ~ ~ {NoAI:1b}`. `NoAI` keeps it still and stops it drying out on land.
5. Run `/loot give @s kill @e[type=minecraft:dolphin,limit=1,sort=nearest]` five times. This rolls the dolphin's drops without killing it.
6. Expect 1-2 Raw Dolphin every time, and Raw Cod about half the time.

Bat drops (tests the tiny-mob count):

7. Run `/summon minecraft:bat ~ ~1 ~ {NoAI:1b}`.
8. Run `/loot give @s kill @e[type=minecraft:bat,limit=1,sort=nearest]` five times.
9. Expect exactly one Bat Wings item every time.

Chest loot (tests that vanilla loot is back):

10. Run `/loot give @s loot minecraft:chests/village/village_plains_house` ten times.
11. Expect Strawberry, Tomato and Lettuce Seeds, plus a Bundle now and then.

Wolves (tests Part 2):

12. Run `/give @s minecraft:bone 16`.
13. Run `/give @s tastyvanilla:raw_meat_goat`.
14. Run `/give @s tastyvanilla:raw_meat_veggie`.
15. Run `/summon minecraft:wolf ~ ~ ~`.
16. Right-click the wolf with bones until it's tamed (hearts and a red collar).
17. Right-click it with Raw Goat Chop. It should eat it: it heals, or shows hearts if it's already at full health.
18. Right-click it with Raw Veggie Meat. It should not eat it (no healing, no hearts). It may just sit down or stand up.

Saturation (tests Part 1):

19. Run `/give @s tastyvanilla:raw_meat_bear`.
20. Run `/gamemode survival`.
21. Run `/effect give @s minecraft:hunger 60 20` and wait until the hunger bar is about half full.
22. Run `/effect clear @s`.
23. Run `/data get entity @s foodSaturationLevel`. It should print `0.0f`.
24. Eat the Raw Bear.
25. Run `/data get entity @s foodSaturationLevel` again. Expect about `1.8` (it may print `1.8000001f`). With the old values it printed about `10.8`.

Log check (tests Parts 5 and 6):

26. Open `run/logs/latest.log` and search for `Missing textures`. There should be no `veggie` lines. A `tastyvanilla:item/sugar` line, if there is one, is a separate issue.
27. Search for `advancements`. The line right after `Loaded ... recipes` should say `Loaded 1796 advancements` once Part 6b is done. Before Part 6 it said 1748; the 48 extra are yours.
28. If the number is lower, search for `tastyvanilla:recipes/` and send me those lines.

The `ignored invalid namespace: ... 2` warnings and the `Invalid path in mod resource-pack ... 2.json` errors come from iCloud duplicates inside `build` (245 files on 2026-09-26; your `src` folder has none). The game skips them, but they must never reach players: Part 9 keeps them out of your jar.

---

## Part 9: Keep iCloud copies out of your mod jar (done)

Checked at 00:31: the block sits right after the `jar { ... }` block, outside every other block, and matches the code below exactly. Gradle hadn't run since you added it, so your next game start or build is its first real run. If Gradle then shows an error that points at `build.gradle`, send it to me.

Why: iCloud Drive keeps making copies like `raw_meat_fox 2.json` and folders like `recipe 2` inside `build`. Minecraft rejects those names, which is what filled your log with `Invalid path ... 2.json` errors. A jar built while they're there would carry them to players. I tested this with Gradle: without the block below, the copies went into the jar; with it, only your real files did.

Your 5 existing jars in `build/libs` have no copies, so players haven't seen this error.

1. Open `build.gradle`.
2. Click at the end of line 64. It's the `}` that closes the `jar { ... }` block.
3. Press Enter twice.
4. Paste this block:

```groovy
// iCloud Drive sometimes copies files as "name 2.json" or folders as "recipe 2".
// Minecraft rejects those names, so keep them out of every jar this project builds.
tasks.withType(AbstractArchiveTask).configureEach {
	exclude { element -> element.relativePath.segments.any { it ==~ /.+ \d+(\.[^.]+)?/ } }
}
```

5. If IntelliJ shows a **Load Gradle Changes** button, click it.
6. When you build your next release jar, tell me its name. I'll check it has no copies before you upload it.

I deleted the copies in `build` at 00:08 on 2026-09-27, but that only lasts until iCloud makes new ones: there were 340 at 23:36 and 1,027 by 00:04. The lasting fix is moving the project out of iCloud Drive, which your Git repair notes already recommend.

---

## Appendix: only if you keep the JSON copies instead of Part 7

You did Part 7, so you don't need this. It stays here for reference.

What each of your copies in `src/main/resources/data/minecraft/loot_table/` is missing or changes, compared with vanilla 26.2:

| File | Difference from vanilla 26.2 |
|---|---|
| `chests/village/village_desert_house.json` | Missing the bundle pool (A1) |
| `chests/village/village_plains_house.json` | Missing the bundle pool (A1) |
| `chests/village/village_savanna_house.json` | Missing the bundle pool (A1) |
| `chests/village/village_snowy_house.json` | Missing the bundle pool (A1) |
| `chests/village/village_taiga_house.json` | Missing the bundle pool (A1). Blueberries listed twice |
| `chests/shipwreck_supply.json` | Missing the nautilus armor pool (A2). Crop counts are min 8 / max 2 (always 8) |
| `chests/village/village_fisher.json` | Cod weight 2 raised to 6, Salmon weight 1 raised to 6 (your design) |
| `entities/dolphin.json` | Vanilla cod replaced by Raw Dolphin |
| `entities/mooshroom.json` | Beef replaced by Veggie Meat (intended) |
| All other files | Nothing missing. `cow`, `pig`, `chicken`, `cod` and both grass files give the same drops as vanilla (only default fields like `"bonus_rolls": 0.0` differ) |

### Add a missing pool (A1, A2, A3)

Do this once per file that's missing a pool: the 5 village houses get A1, `shipwreck_supply.json` gets A2, `dolphin.json` gets A3.

1. Open the file.
2. Find the end of the `"pools": [ ... ]` list: the last pool's closing `}` just before the `]`.
3. Type a comma right after that `}`.
4. Paste the pool (A1, A2 or A3 below) after the comma, before the `]`.

### Drop counts

In each file below, the line number points at the Tasty Vanilla meat entry's count, not at a vanilla item.

Tiny mobs (change `"max": 3.0` to `"max": 1.0`):

1. `entities/bat.json`, line 14.
2. `entities/frog.json`, line 14.
3. `entities/allay.json`, line 14.
4. `entities/parrot.json`, line 44.
5. `entities/axolotl.json`, line 13.

Medium mobs (change `"max": 3.0` to `"max": 2.0`):

6. `entities/fox.json`, line 14.
7. `entities/cat.json`, line 35.
8. `entities/ocelot.json`, line 14.
9. `entities/wolf.json`, line 13.
10. `entities/armadillo.json`, line 14.
11. `entities/goat.json`, line 14.
12. `entities/turtle.json`, line 68.
13. `entities/squid.json`, line 44. Don't touch line 14; that's the ink sac.
14. `entities/glow_squid.json`, line 44. Don't touch line 14; that's the glow ink sac.
15. `entities/nautilus.json`, line 39.

Dolphin:

16. `entities/dolphin.json`, line 14: change `"max": 1.0` to `"max": 2.0`.
17. `entities/dolphin.json`, line 15: change `"min": 0.0` to `"min": 1.0`. Don't touch lines 22-23; that's Looting.
18. Then add pool A3 to `dolphin.json` (see "Add a missing pool").

### Optional fixes in the JSON copies

1. `chests/village/village_taiga_house.json`: delete lines 125 to 141 (the second Blueberries entry).
2. `chests/shipwreck_supply.json`: press **Cmd+R**, replace `"max": 2.0, "min": 8.0` with `"max": 8.0, "min": 2.0`, and click **Replace All**. It should say 8 replacements.

### A1: bundle pool (vanilla 26.2, the same in all 5 village houses)

```json
{
  "entries": [
    {
      "type": "minecraft:item",
      "functions": [
        {
          "count": 1.0,
          "function": "minecraft:set_count"
        }
      ],
      "name": "minecraft:bundle"
    },
    {
      "type": "minecraft:empty",
      "weight": 2
    }
  ],
  "rolls": 1.0
}
```

### A2: nautilus armor pool (vanilla 26.2 shipwreck supply)

```json
{
  "entries": [
    {
      "type": "minecraft:empty",
      "weight": 148
    },
    {
      "type": "minecraft:item",
      "functions": [
        {
          "count": 1.0,
          "function": "minecraft:set_count"
        }
      ],
      "name": "minecraft:copper_nautilus_armor",
      "weight": 20
    },
    {
      "type": "minecraft:item",
      "functions": [
        {
          "count": 1.0,
          "function": "minecraft:set_count"
        }
      ],
      "name": "minecraft:iron_nautilus_armor",
      "weight": 10
    },
    {
      "type": "minecraft:item",
      "functions": [
        {
          "count": 1.0,
          "function": "minecraft:set_count"
        }
      ],
      "name": "minecraft:golden_nautilus_armor",
      "weight": 5
    },
    {
      "type": "minecraft:item",
      "functions": [
        {
          "count": 1.0,
          "function": "minecraft:set_count"
        }
      ],
      "name": "minecraft:diamond_nautilus_armor",
      "weight": 2
    }
  ],
  "rolls": 1.0
}
```

### A3: dolphin cod pool (vanilla 26.2)

```json
{
  "entries": [
    {
      "type": "minecraft:item",
      "functions": [
        {
          "count": {
            "type": "minecraft:uniform",
            "max": 1.0,
            "min": 0.0
          },
          "function": "minecraft:set_count"
        },
        {
          "count": {
            "type": "minecraft:uniform",
            "max": 1.0,
            "min": 0.0
          },
          "enchantment": "minecraft:looting",
          "function": "minecraft:enchanted_count_increase"
        },
        {
          "conditions": [
            {
              "condition": "minecraft:any_of",
              "terms": [
                {
                  "condition": "minecraft:entity_properties",
                  "entity": "this",
                  "predicate": {
                    "minecraft:flags": {
                      "is_on_fire": true
                    }
                  }
                },
                {
                  "condition": "minecraft:entity_properties",
                  "entity": "direct_attacker",
                  "predicate": {
                    "minecraft:equipment": {
                      "mainhand": {
                        "predicates": {
                          "minecraft:enchantments": [
                            {
                              "enchantments": "#minecraft:smelts_loot"
                            }
                          ]
                        }
                      }
                    }
                  }
                }
              ]
            }
          ],
          "function": "minecraft:furnace_smelt"
        }
      ],
      "name": "minecraft:cod"
    }
  ],
  "rolls": 1.0
}
```
