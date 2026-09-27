# fr_fr.json (French): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/fr_fr.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 16 fixes in Part 1, and 40 new names in Part 2 (the 40 meats).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

Steps marked *apostrophe* only swap the curly apostrophe `’` for the straight `'` that vanilla uses.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (16)

1. Line 11: change `"Cookie à l’œil d’araignée"` to `"Cookie à l'oeil d'araignée"`. Straight apostrophes, and 'oe' without the ligature as in vanilla 'Oeil d'araignée'.
2. Line 12: change `"Cookie à l’avoine"` to `"Cookie à l'avoine"`. *apostrophe*
3. Line 57: change `"Tarte aux fruits chorus"` to `"Tarte au chorus"`. Vanilla names Chorus Fruit just 'Chorus'; 'fruits chorus' was an English calque.
4. Line 59 (`item.tastyvanilla.pie_fungus`): change `"Tarte aux champignons"` to `"Tarte aux champignons du Nether"`. Had the same name as Mushroom Pie; vanilla calls crimson/warped fungus 'Champignon carmin/biscornu', so 'du Nether' (vanilla pattern, e.g. 'Verrues du Nether') tells them apart.
5. Line 63: change `"Tarte au melon"` to `"Tarte à la pastèque"`. Vanilla calls the Melon 'Pastèque' (watermelon); French 'melon' is a different fruit.
6. Line 80: change `"Culture d’aubergine"` to `"Culture d'aubergine"`. *apostrophe*
7. Line 83, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
8. Line 83: change `"Culture d’ail"` to `"Culture d'ail"`. *apostrophe*
9. Line 90: change `"Culture d’oignon"` to `"Culture d'oignon"`. *apostrophe*
10. Line 105: change `"Pain à l’ail"` to `"Pain à l'ail"`. *apostrophe*
11. Line 106: change `"Pâte à l’ail"` to `"Pâte à l'ail"`. *apostrophe*
12. Line 110: change `"Soupe à l’oignon"` to `"Soupe à l'oignon"`. *apostrophe*
13. Line 111: change `"Beignets d’oignon"` to `"Beignets d'oignon"`. *apostrophe*
14. Line 130: change `"Buisson de sureau"` to `"Buisson de baies de sureau"`. Use the berry item's name 'Baies de sureau', like 'Buisson de baies de goji'.
15. Line 153: change `"Confiture de sureau"` to `"Confiture de baies de sureau"`. Ingredient name must match the item 'Baies de sureau' (like 'Confiture de baies de goji').
16. Line 163: change `"Purée de sureau"` to `"Purée de baies de sureau"`. Ingredient name must match the item 'Baies de sureau'.

---

## Part 2: New names (40)

### Meats (40)

1. Click at the end of line 183: `"block.tastyvanilla.cheese_hard": "Fromage à pâte dure",`
2. Press Enter 3 times.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Ours cru",
  "item.tastyvanilla.raw_meat_camel": "Dromadaire cru",
  "item.tastyvanilla.raw_meat_horse": "Cheval cru",
  "item.tastyvanilla.raw_meat_veggie": "Viande végétale crue",
  "item.tastyvanilla.raw_meat_sniffer": "Renifleur cru",
  "item.tastyvanilla.raw_meat_goat": "Côtelette de chèvre crue",
  "item.tastyvanilla.raw_meat_llama": "Côtelette de lama crue",
  "item.tastyvanilla.raw_meat_wolf": "Loup cru",
  "item.tastyvanilla.raw_meat_fox": "Renard cru",
  "item.tastyvanilla.raw_meat_cat": "Chat cru",
  "item.tastyvanilla.raw_meat_parrot": "Perroquet cru",
  "item.tastyvanilla.raw_meat_frog": "Cuisses de grenouille",
  "item.tastyvanilla.raw_meat_bat": "Ailes de chauve-souris",
  "item.tastyvanilla.raw_meat_turtle": "Tortue crue",
  "item.tastyvanilla.raw_meat_dolphin": "Dauphin cru",
  "item.tastyvanilla.raw_meat_squid": "Poulpe cru",
  "item.tastyvanilla.raw_meat_axolotl": "Axolotl cru",
  "item.tastyvanilla.raw_meat_armadillo": "Tatou cru",
  "item.tastyvanilla.raw_meat_allay": "Ailes d'Allay",
  "item.tastyvanilla.raw_meat_nautilus": "Nautile cru",

  "item.tastyvanilla.cooked_meat_bear": "Steak d'ours",
  "item.tastyvanilla.cooked_meat_camel": "Steak de dromadaire",
  "item.tastyvanilla.cooked_meat_horse": "Steak de cheval",
  "item.tastyvanilla.cooked_meat_veggie": "Steak végétal",
  "item.tastyvanilla.cooked_meat_sniffer": "Rôti de renifleur",
  "item.tastyvanilla.cooked_meat_goat": "Côtelette de chèvre cuite",
  "item.tastyvanilla.cooked_meat_llama": "Côtelette de lama cuite",
  "item.tastyvanilla.cooked_meat_wolf": "Steak de loup",
  "item.tastyvanilla.cooked_meat_fox": "Renard cuit",
  "item.tastyvanilla.cooked_meat_cat": "Chat cuit",
  "item.tastyvanilla.cooked_meat_parrot": "Perroquet cuit",
  "item.tastyvanilla.cooked_meat_frog": "Cuisses de grenouille cuites",
  "item.tastyvanilla.cooked_meat_bat": "Ailes de chauve-souris cuites",
  "item.tastyvanilla.cooked_meat_turtle": "Tortue cuite",
  "item.tastyvanilla.cooked_meat_dolphin": "Dauphin cuit",
  "item.tastyvanilla.cooked_meat_squid": "Poulpe cuit",
  "item.tastyvanilla.cooked_meat_axolotl": "Axolotl cuit",
  "item.tastyvanilla.cooked_meat_armadillo": "Tatou cuit",
  "item.tastyvanilla.cooked_meat_allay": "Ailes d'Allay cuites",
  "item.tastyvanilla.cooked_meat_nautilus": "Nautile cuit",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

If you take suggestion 6 or 9 in `en_us.md`, this file changes too. I'll send those lines then.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Crops: now **Culture de X**. Option: **Plant de X**, like vanilla's Plant de torche-fleur.
- Bushes: now **Buisson de X**. Option: **Buisson à X**, like vanilla's Buisson à baies sucrées.
- Poppy Seed Cookie: now **graines de pavot**, the baking word. Option: **graines de coquelicot**, vanilla's flower name.
- Pancakes: now **Crêpes**, which are thin in France. Option: **Pancakes** if your texture shows thick pancakes.
- Veggie meat: now **Viande végétale crue** and **Steak végétal**. Option: **végétarien(ne)**, to echo your Wrap végétarien.
