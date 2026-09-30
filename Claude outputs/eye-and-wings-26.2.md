# Cat Eye, Bat Wings and Allay Wings

**Status, 30 Sep:** Parts 1 to 6, and Part 6b except the textures, are done by you and checked by me: the Java compiles, and Data Generation ran at 11:37 and made all the ravager files. You also added the Hunger chance to Raw Ravager, kept the Cat Eye trade at cleric level 3, and removed the old cooked textures. Part 8 is done by me, ravager names included, and double-checked by 2 agents. Next: the 2 ravager textures (Part 6b, step 17), then Part 7 and on as written.

Written for your files as they were on 30 Sep at 10:35 your time. Please don't edit these files until you've done the steps. If a line doesn't match what a step says, stop and tell me.

**What these steps do:**

- **Eating:** Allay Wings give Slow Falling for 10 seconds, Bat Wings give Blindness for 5 seconds, and Cat Eye gives Night Vision for 20 seconds, every time. Cat Eye and Bat Wings no longer have the 30% Hunger chance.
- **Brewing:** Awkward Potion + Allay Wings makes a Potion of Slow Falling, and Awkward Potion + Cat Eye makes a Potion of Night Vision. Redstone (longer), Gunpowder (splash) and Dragon's Breath (lingering) then work as in vanilla. Bat Wings don't brew.
- **Drops:** bats, allays, cats and ocelots always drop their item raw, even when they die on fire. Without this, the game would write a warning to the log each time, because these items no longer have a cooked version.
- **Cleric's chest (village temple):** Frog Legs, Bat Wings, Cat Eye and Allay Wings, 1 to 2 of each. Each one shows up in about 1 in 5 temple chests.
- **Names:** Cat Eye in the 6 languages you haven't done yet, and the 3 cooked names removed there.
- **Branches:** the 9 lang files then go to all 11 other branches, and everything is pushed.

**Already done by you (I checked):** cooked Cat, Bat and Allay are gone from the items, recipes, models and meat tag; Data Generation has run; cat meat is out of the butcher's chest; Cat Eye is named in en_us, en_gb and es_es; the new cat texture; your cleric trades.

**Nothing to do for witch huts:** in vanilla 26.2 they have no chest.

**How it was checked:** I applied these exact steps to copies of your files and compiled the changed Java against Minecraft 26.2, with Fabric API 0.154.0's brewing code: no errors. All 9 lang files come out valid, with the same 177 names (179 now, with your ravager).

**While you type:** IntelliJ may show a list of suggestions. Press Esc to close it. Don't press Enter unless a step says so.

---

## Part 1: `ModFoods.java` (the 3 effects)

1. Open `src/main/java/tastyvanilla/food/ModFoods.java`.
2. Check: line 140 is `.onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)).build();`. It's the second line of `FOOD_POISONING`.
3. Copy the block below.

```java
    // Allay Wings, Bat Wings and Cat Eye: eating one gives a short dose of an effect, every time, like Spider Eye.
    // Times are in ticks (20 ticks = 1 second). The last 0 is the level: 0 = I.
    public static final Consumable ALLAY_WINGS = Consumables.defaultFood() // Slow Falling, 10 seconds
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0))).build();
    public static final Consumable BAT_WINGS = Consumables.defaultFood() // Blindness, 5 seconds
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0))).build();
    public static final Consumable CAT_EYE = Consumables.defaultFood() // Night Vision, 20 seconds
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0))).build();
```

4. Click anywhere on line 140.
5. Press Cmd+Right Arrow. The cursor goes to the end of the line.
6. Press Enter twice.
7. Press Cmd+V.
8. Check: nothing in the file is underlined in red.

## Part 2: `ModItems.java` (use them)

1. Open `src/main/java/tastyvanilla/item/ModItems.java`.
2. On line 156 (Allay Wings), click just after `RAW_MEAT_TIER_4`, between the `4` and the `)`.
3. Type `,ModFoods.ALLAY_WINGS`. The line now ends with `ModFoods.RAW_MEAT_TIER_4,ModFoods.ALLAY_WINGS)));`.
4. On line 150 (Bat Wings), double-click `FOOD_POISONING`.
5. Type `BAT_WINGS`.
6. On line 147 (Cat Eye), double-click `FOOD_POISONING`.
7. Type `CAT_EYE`.
8. Check: nothing in the file is underlined in red.

## Part 3: `ModLootTableModifiers.java` (raw drops and the cleric's chest)

The steps go from the bottom of the file up, so the line numbers stay right.

1. Open `src/main/java/tastyvanilla/loot/ModLootTableModifiers.java`.
2. Copy the block below. It's a copy of `addMeat` without the cooking.

```java
    // Same as addMeat, but the drop is never cooked. For drops with no cooking recipe
    // (Bat Wings, Allay Wings, Cat Eye), so the game doesn't log "Couldn't smelt" when the mob burns.
    private static void addDrop(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, HolderLookup.Provider registries,
                                EntityType<?> mob, ItemLike drop, float min, float max) {
        if (!mob.getDefaultLootTable().map(key::equals).orElse(false)) {
            return;
        }

        tableBuilder.withPool(LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(drop)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(registries, UniformGenerator.between(0.0F, 1.0F)))));
    }
```

3. Click anywhere on line 171. It's the `}` that closes the `addMeat` method; line 170 above it ends with `UniformGenerator.between(0.0F, 1.0F)))));`.
4. Press Cmd+Right Arrow.
5. Press Enter twice.
6. Press Cmd+V.
7. Copy the block below.

```java
            // The cleric's chest (village temple): Frog Legs, Bat Wings, Cat Eye and Allay Wings, 1 to 2 of each.
            if (key.equals(BuiltInLootTables.VILLAGE_TEMPLE)) {
                addToMainPool(tableBuilder,
                        chestItem(ModItems.RAW_MEAT_FROG, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_BAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_CAT, 1, 1, 2),
                        chestItem(ModItems.RAW_MEAT_ALLAY, 1, 1, 2));
            }
```

8. Click anywhere on line 98. It's the `}` that closes the butcher chest block; line 100 below it starts the `VILLAGE_FISHER` block.
9. Press Cmd+Right Arrow.
10. Press Enter twice.
11. Press Cmd+V.
12. On line 65 (Ocelot), double-click `addMeat`.
13. Type `addDrop`.
14. On line 64 (Cat), double-click `addMeat`.
15. Type `addDrop`.
16. On line 58 (Allay), double-click `addMeat`.
17. Type `addDrop`.
18. On line 56 (Bat), double-click `addMeat`.
19. Type `addDrop`.
20. Check: nothing in the file is underlined in red.

## Part 4: New file `ModBrewingRecipes.java` (the brewing recipes)

1. In the Project panel on the left, click the arrows to expand src > main > java > tastyvanilla.
2. Right-click the `item` folder.
3. Choose New > Java Class.
4. Type `ModBrewingRecipes`.
5. Press Enter. The new file opens. If IntelliJ asks whether to add it to Git, click Add.
6. Copy the block below.

```java
package tastyvanilla.item;

import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.world.item.alchemy.Potions;

// Brewing recipes for the mod's drops, added to vanilla's brewing stand.
// Longer, splash and lingering versions come from vanilla's own recipes (Redstone, Gunpowder, Dragon's Breath).
public class ModBrewingRecipes {

    public static void registerModBrewingRecipes() {
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            // Awkward Potion + Allay Wings = Potion of Slow Falling, like Phantom Membrane
            builder.addMix(Potions.AWKWARD, ModItems.RAW_MEAT_ALLAY, Potions.SLOW_FALLING);
            // Awkward Potion + Cat Eye = Potion of Night Vision, like Golden Carrot
            builder.addMix(Potions.AWKWARD, ModItems.RAW_MEAT_CAT, Potions.NIGHT_VISION);
        });
    }
}
```

7. Click anywhere in the new file's text.
8. Press Cmd+A.
9. Press Cmd+V.
10. Check: nothing in the file is underlined in red.

## Part 5: `TastyVanilla.java` (turn the brewing recipes on)

1. Open `src/main/java/tastyvanilla/TastyVanilla.java`.
2. If the imports at the top are folded into one `import ...` line, click the `...` to show them all.
3. Copy this line:

```java
import tastyvanilla.item.ModBrewingRecipes;
```

4. Click anywhere on line 8 (`import tastyvanilla.item.ModCompostableItems;`).
5. Press Cmd+Right Arrow.
6. Press Enter.
7. Press Cmd+V.
8. Copy this line:

```java
ModBrewingRecipes.registerModBrewingRecipes();
```

9. Click anywhere on line 23 (`ModCompostableItems.registerModCompostableItems();`).
10. Press Cmd+Right Arrow.
11. Press Enter.
12. Press Cmd+V.
13. Check: nothing in the file is underlined in red.

## Part 6 (optional): `ModItemIds.java` (tidy-up)

The ids of the 3 cooked items are still listed but no longer used. They do nothing, so you can skip this part.

1. Open `src/main/java/tastyvanilla/item/ModItemIds.java`.
2. Click on line 161 (`public static final ResourceKey<Item> COOKED_MEAT_ALLAY = create("cooked_meat_allay");`).
3. Press Cmd+Backspace. The line is deleted.
4. Click on line 155 (`public static final ResourceKey<Item> COOKED_MEAT_BAT = create("cooked_meat_bat");`).
5. Press Cmd+Backspace. The line is deleted.
6. Click on line 152 (`public static final ResourceKey<Item> COOKED_MEAT_CAT = create("cooked_meat_cat");`).
7. Press Cmd+Backspace. The line is deleted.

## Part 6b: Ravager fixes and Data Generation

Found when I checked your changes on 30 Sep. I compiled your code with the ravager drop line added: no errors.

**Cooked Nautilus's model.** The ravager line took its place, so the next Data Generation would delete it and Cooked Nautilus would show the purple and black texture.

1. Open `src/main/java/tastyvanilla/datagen/ModModelProvider.java`.
2. Check: line 128 is `itemModelGenerator.generateFlatItem(ModItems.COOKED_MEAT_ARMADILLO, ModelTemplates.FLAT_ITEM);`.
3. Copy this line:

```java
itemModelGenerator.generateFlatItem(ModItems.COOKED_MEAT_NAUTILUS, ModelTemplates.FLAT_ITEM);
```

4. Click anywhere on line 128.
5. Press Cmd+Right Arrow.
6. Press Enter.
7. Press Cmd+V.
8. Check: nothing in the file is underlined in red.

**The ravager drop.** Without it, ravagers don't drop the meat. It's 1 to 3, like the other large mobs, and cooked if the ravager dies on fire.

9. Open `src/main/java/tastyvanilla/loot/ModLootTableModifiers.java`.
10. Check: line 85 is `addMeat(key, tableBuilder, registries, EntityTypes.SNIFFER, ModItems.RAW_MEAT_SNIFFER, 1, 3);`.
11. Copy this line:

```java
addMeat(key, tableBuilder, registries, EntityTypes.RAVAGER, ModItems.RAW_MEAT_RAVAGER, 1, 3);
```

12. Click anywhere on line 85.
13. Press Cmd+Right Arrow.
14. Press Enter.
15. Press Cmd+V.
16. Check: nothing in the file is underlined in red.

**Textures and Data Generation.**

17. Put your 2 ravager textures in `src/main/resources/assets/tastyvanilla/textures/item/`, named `raw_meat_ravager.png` and `cooked_meat_ravager.png`.
18. Run Data Generation.
19. Tell me. I'll check the generated files before you go on.

**Your call (not needed):**

- Raw Ravager has no Hunger chance (`FOOD_POISONING`). Raw Bear, Camel, Horse, Sniffer, Goat and Llama have it. To match them: on line 155 of `ModItems.java`, click just after `RAW_MEAT_TIER_1`, between the `1` and the `)`, and type `,ModFoods.FOOD_POISONING`. I compiled this too: no errors.
- The Cat Eye trade is at cleric level 3. You'd said level 4 before. If it's on purpose, leave it.
- `cooked_meat_cat.png`, `cooked_meat_bat.png` and `cooked_meat_allay.png` are still in the textures folder. Nothing uses them now. They're harmless; delete them yourself if you want.

## Part 7: Build

1. In the menu bar, choose Build > Build Project.
2. Check: the Build panel at the bottom shows no errors.

Data Generation must have run first (Part 6b, step 18).

## Part 8: Names in the other 6 languages

**Done by me on 30 Sep, directly in the 6 files, with the ravager names too. Nothing to do here.** The steps below stay for the record.

In each file, the change comes first, then the 3 deletions go from the bottom up, so the line numbers stay right.

### German (`de_de.json`)

1. Open `src/main/resources/assets/tastyvanilla/lang/de_de.json`.
2. On line 197, change `Rohes Katzenfleisch` to `Katzenauge`.
3. Click on line 227 (`"item.tastyvanilla.cooked_meat_allay": "Gebratene Hilfsgeisterflügel",`).
4. Press Cmd+Backspace.
5. Click on line 221 (`"item.tastyvanilla.cooked_meat_bat": "Gebratene Fledermausflügel",`).
6. Press Cmd+Backspace.
7. Click on line 218 (`"item.tastyvanilla.cooked_meat_cat": "Gebratenes Katzenfleisch",`).
8. Press Cmd+Backspace.

### Spanish, Mexico (`es_mx.json`)

1. Open `src/main/resources/assets/tastyvanilla/lang/es_mx.json`.
2. On line 198, change `Gato crudo` to `Ojo de gato`.
3. Click on line 228 (`"item.tastyvanilla.cooked_meat_allay": "Alas de allay asadas",`).
4. Press Cmd+Backspace.
5. Click on line 222 (`"item.tastyvanilla.cooked_meat_bat": "Alas de murciélago asadas",`).
6. Press Cmd+Backspace.
7. Click on line 219 (`"item.tastyvanilla.cooked_meat_cat": "Gato asado",`).
8. Press Cmd+Backspace.

### French (`fr_fr.json`)

1. Open `src/main/resources/assets/tastyvanilla/lang/fr_fr.json`.
2. On line 203, change `Chat cru` to `Oeil de chat`.
3. Click on line 233 (`"item.tastyvanilla.cooked_meat_allay": "Ailes d'Allay cuites",`).
4. Press Cmd+Backspace.
5. Click on line 227 (`"item.tastyvanilla.cooked_meat_bat": "Ailes de chauve-souris cuites",`).
6. Press Cmd+Backspace.
7. Click on line 224 (`"item.tastyvanilla.cooked_meat_cat": "Chat cuit",`).
8. Press Cmd+Backspace.

### Italian (`it_it.json`)

1. Open `src/main/resources/assets/tastyvanilla/lang/it_it.json`.
2. On line 202, change `Gatto crudo` to `Occhio di gatto`.
3. Click on line 232 (`"item.tastyvanilla.cooked_meat_allay": "Ali di alleviante cotte",`).
4. Press Cmd+Backspace.
5. Click on line 226 (`"item.tastyvanilla.cooked_meat_bat": "Ali di pipistrello cotte",`).
6. Press Cmd+Backspace.
7. Click on line 223 (`"item.tastyvanilla.cooked_meat_cat": "Gatto cotto",`).
8. Press Cmd+Backspace.

### Portuguese, Brazil (`pt_br.json`)

1. Open `src/main/resources/assets/tastyvanilla/lang/pt_br.json`.
2. On line 203, change `Gato Cru` to `Olho de Gato`.
3. Click on line 233 (`"item.tastyvanilla.cooked_meat_allay": "Asas de Sereno Assadas",`).
4. Press Cmd+Backspace.
5. Click on line 227 (`"item.tastyvanilla.cooked_meat_bat": "Asas de Morcego Assadas",`).
6. Press Cmd+Backspace.
7. Click on line 224 (`"item.tastyvanilla.cooked_meat_cat": "Gato Assado",`).
8. Press Cmd+Backspace.

### Russian (`ru_ru.json`)

1. Open `src/main/resources/assets/tastyvanilla/lang/ru_ru.json`.
2. On line 203, change `Сырое мясо кошки` to `Кошачий глаз`.
3. Click on line 233 (`"item.tastyvanilla.cooked_meat_allay": "Жареные крылья тихони",`).
4. Press Cmd+Backspace.
5. Click on line 227 (`"item.tastyvanilla.cooked_meat_bat": "Жареные крылья летучей мыши",`).
6. Press Cmd+Backspace.
7. Click on line 224 (`"item.tastyvanilla.cooked_meat_cat": "Жареное мясо кошки",`).
8. Press Cmd+Backspace.

## Part 9: Test in the game

1. Run Minecraft Client and open a creative world with cheats on.
2. In chat, run `/difficulty easy`. Hunger doesn't work on Peaceful, and step 17 needs it.
3. From the creative inventory, take a Brewing Stand and some Blaze Powder.
4. Take 2 Awkward Potions (search for `awkward`).
5. Take a few Allay Wings, Bat Wings and Cat Eyes.
6. Place the Brewing Stand and right-click it to open it.
7. Put Blaze Powder in its top-left slot (the fuel).
8. Put 1 Awkward Potion in one of the 3 bottom slots.
9. Put 1 Allay Wings in the top slot. After a few seconds, the potion becomes a Potion of Slow Falling.
10. Take the Potion of Slow Falling out.
11. Put the other Awkward Potion in a bottom slot.
12. Put 1 Cat Eye in the top slot. The potion becomes a Potion of Night Vision.
13. Take the Potion of Night Vision out.
14. Try to put Bat Wings in the top slot. They don't go in.
15. Close the brewing stand.
16. In chat, run `/gamemode survival`.
17. Run `/effect give @s minecraft:hunger 5 250`. It empties your hunger bar, so you can eat.
18. Eat Allay Wings. You get Slow Falling for 0:10.
19. Eat Bat Wings. You get Blindness for 0:05.
20. Eat Cat Eye. You get Night Vision for 0:20. Its last 10 seconds flicker, as with the potion.
21. Run `/gamemode creative`.
22. Run `/loot give @s loot minecraft:chests/village/village_temple` a few times. Now and then you get Frog Legs, Bat Wings, Cat Eye or Allay Wings.
23. Run `/summon minecraft:ravager`.
24. Run `/kill @e[type=minecraft:ravager]`. 1 to 3 Raw Ravager drop.
25. Close the game and tell me. I'll check `run/logs/latest.log`.

## Part 10: Commit on 26.2

1. Open the Commit window (Cmd+0).
2. Tick what you want in this commit. These must be ticked: every lang file in the list, the new `ModBrewingRecipes.java`, and, under **Unversioned Files**, the 2 ravager textures and every new file in `src/main/generated`. Leave `.claude` and `Claude outputs` unticked.
3. Click **Commit** (not Commit and Push).

## Part 11: Copy the lang files to the 11 branches

Same block as last time. It gives each of the 11 branches one new commit with 26.2's 9 lang files and deletes nothing. As you chose, this includes 26.1.2: its code still has cat meat and the 3 cooked items, so there the cat meat will be called Cat Eye and the 3 cooked items will show their internal names.

1. Open IntelliJ's Terminal: View > Tool Windows > Terminal.
2. Copy the whole block below.

```sh
cd "$(git rev-parse --show-toplevel)"
LANG_DIR=src/main/resources/assets/tastyvanilla/lang
if git diff --quiet 26.2 -- "$LANG_DIR"; then
  for b in 1.21.4 1.21.5 1.21.6 1.21.7 1.21.8 1.21.9 1.21.10 1.21.11 26.1 26.1.1 26.1.2; do
    if [ "$(git rev-parse "${b}:$LANG_DIR")" = "$(git rev-parse "26.2:$LANG_DIR")" ]; then
      echo "$b: already the same as 26.2, skipped"
      continue
    fi
    tmp=$(mktemp -d)
    old=$(git rev-parse "refs/heads/$b") &&
    GIT_INDEX_FILE="$tmp/index" git read-tree "$old" &&
    git ls-tree -r 26.2 -- "$LANG_DIR/" | GIT_INDEX_FILE="$tmp/index" git update-index --add --index-info &&
    tree=$(GIT_INDEX_FILE="$tmp/index" git write-tree) &&
    new=$(git commit-tree "$tree" -p "$old" -m "Translations: same lang files as 26.2") &&
    git update-ref "refs/heads/$b" "$new" "$old" &&
    echo "$b: $old -> $new" ||
    echo "$b: FAILED, this branch was not changed"
  done
else
  echo "Stop: commit the 9 lang files on 26.2 first."
fi
```

3. Click in the Terminal and press Cmd+V.
4. Press Enter.
5. Check: you see 11 lines, one per branch, each with 2 long numbers.
   - If a line says `already the same as 26.2, skipped`, that branch already had these lang files. That's fine.
   - If a line says `FAILED`, that branch stayed as it was.
   - If you see `Stop: commit the 9 lang files on 26.2 first.` instead, nothing was changed: a lang file on disk differs from your last commit.
6. Send me the output. I'll check all 11 branches before you push.

What each line does is explained in `Claude outputs/translations-26.2/branches.md`, Part 1.

## Part 12: Push

Do this after I confirm Part 11.

1. Copy this line:

```sh
git push origin 26.2 1.21.4 1.21.5 1.21.6 1.21.7 1.21.8 1.21.9 1.21.10 1.21.11 26.1 26.1.1 26.1.2
```

2. Click in the Terminal and press Cmd+V.
3. Press Enter.
4. Send me the output. If any line says `rejected`, don't retry or force anything.

**Good to know:**

- It sends 26.2, with your latest commits, and the 11 branches. `main` and your other branches aren't touched.
- It only adds new commits on top. Nothing on GitHub is deleted.
- GitHub may print `This repository moved`. That's expected.
- If it asks for a username or password, press Ctrl+C and tell me.
