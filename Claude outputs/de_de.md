# de_de.json (German): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/de_de.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 41 fixes in Part 1, and 43 new names in Part 2 (the 40 meats and the 3 rice names).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (41)

1. Line 3: change `"Süßbeeren Keks"` to `"Süßbeerenkeks"`. Compound was split by a space; German joins it. 'Süßbeeren-' as in your Süßbeerenmarmelade.
2. Line 4: change `"Leuchtbeeren Keks"` to `"Leuchtbeerenkeks"`. Compound was split by a space; German joins it. Vanilla 'Leuchtbeeren'.
3. Line 5: change `"Honig Keks"` to `"Honigkeks"`. Compound was split by a space; German joins it.
4. Line 7: change `"Sonnenblumen Keks"` to `"Sonnenblumenkeks"`. German writes compounds as one word, like vanilla 'Kürbiskuchen'. 'Sonnenblumen-' already means the seeds in baking, like your 'Mohnkeks'.
5. Line 8: change `"Karotten Keks"` to `"Karottenkeks"`. Compound was split by a space; German joins it.
6. Line 9: change `"Apfel Keks"` to `"Apfelkeks"`. Compound was split by a space; German joins it.
7. Line 10: change `"Kürbis Keks"` to `"Kürbiskeks"`. Compound was split by a space; German joins it. Like vanilla 'Kürbiskuchen'.
8. Line 11: change `"Spinnenaugen Keks"` to `"Spinnenaugenkeks"`. Compound was split by a space; German joins it.
9. Line 13: change `"Zucker Keks"` to `"Zuckerkeks"`. Compound was split by a space; German joins it.
10. Line 25: change `"Gebackener Brotteig"` to `"Brotteig"`. 'Gebackener Brotteig' means dough that is already baked; this is the raw dough for Baked Bread.
11. Line 29: change `"Focaccia Teig"` to `"Focacciateig"`. Compound was split by a space; German joins it. Like Croissantteig and Baguetteteig.
12. Line 45: change `"Mehrkorn Brot"` to `"Mehrkornbrot"`. Compound was split by a space; German joins it. Matches Mehrkornteig.
13. Line 46: change `"Pfannenkuchen"` to `"Pfannkuchen"`. Standard spelling; the file also had 'Pfannkuchenteig', so pancakes were spelled two ways.
14. Line 52: change `"Chicken-Pie"` to `"Hühnchenpastete"`. Was English. A savory pie is a 'Pastete' in German ('Hühnchenkuchen' sounds like a cake); 'Hühnchen' as in vanilla 'Gebratenes Hühnchen'.
15. Line 54: change `"Chorus Frucht kuchen"` to `"Chorusfruchtkuchen"`. Was split and had a lowercase noun; joined with vanilla 'Chorusfrucht'.
16. Line 55: change `"Fish-Pie"` to `"Fischpastete"`. Was English. A savory pie is a 'Pastete' in German ('Fischkuchen' reads as a fish cake).
17. Line 56: change `"Pilzkuchen"` to `"Netherpilzkuchen"`. Almost the same name as Mushroom Pie ('Pilz-Kuchen'). It's made from crimson and warped fungus, so 'Netherpilz-' (like vanilla Netherziegel, Netherwarze).
18. Line 57: change `"Leuchtbeeren Kuchen"` to `"Leuchtbeerenkuchen"`. Compound was split by a space; German joins it.
19. Line 59: change `"Meat-Pie"` to `"Fleischpastete"`. Was English. 'Fleischpastete' is the German for meat pie ('Fleischkuchen' is a regional word for a meat patty).
20. Line 61: change `"Pilz-Kuchen"` to `"Pilzkuchen"`. Removed the stray hyphen; now distinct from Fungus Pie (Netherpilzkuchen).
21. Line 62: change `"Shepherd's-Pie"` to `"Shepherd's Pie"`. German uses the English dish name, written without a hyphen.
22. Line 63: change `"Erdbeer Kuchen"` to `"Erdbeerkuchen"`. Compound was split by a space; German joins it.
23. Line 64: change `"Süßbeeren Kuchen"` to `"Süßbeerenkuchen"`. Compound was split by a space; German joins it.
24. Line 65: change `"Vegetarischer Kuchen"` to `"Gemüsekuchen"`. 'Vegetarischer Kuchen' means 'vegetarian cake'; this is a vegetable pie.
25. Line 69 (`block.tastyvanilla.cabbage_crop`): change `"Kohl"` to `"Kohlpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
26. Line 71 (`item.tastyvanilla.chilli`): change `"Chilli"` to `"Chili"`. German spelling is 'Chili' (Duden); 'Chilli' is British English.
27. Line 72: change `"Chillisamen"` to `"Chilisamen"`. German spelling 'Chili'.
28. Line 73 (`block.tastyvanilla.chilli_crop`): change `"Chilli"` to `"Chilipflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'. German spelling 'Chili'.
29. Line 76 (`block.tastyvanilla.eggplant_crop`): change `"Aubergine"` to `"Auberginenpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
30. Line 79, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
31. Line 79 (`block.tastyvanilla.garlic_crop`): change `"Knoblauch"` to `"Knoblauchpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
32. Line 83 (`block.tastyvanilla.lettuce_crop`): change `"Kopfsalat"` to `"Kopfsalatpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
33. Line 86 (`block.tastyvanilla.onion_crop`): change `"Zwiebel"` to `"Zwiebelpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
34. Line 89 (`block.tastyvanilla.sweet_potato_crop`): change `"Süßkartoffel"` to `"Süßkartoffelpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
35. Line 93 (`block.tastyvanilla.tomato_crop`): change `"Tomate"` to `"Tomatenpflanze"`. Crop block had the same name as the item; '-pflanze' like vanilla 'Weizenpflanze'.
36. Line 96: change `"Zwiebelbrot"` to `"Knoblauchbrot"`. Said onion bread ('Zwiebelbrot'); this is garlic bread.
37. Line 97: change `"Zwiebel Teig"` to `"Knoblauchteig"`. Said onion ('Zwiebel') and was split by a space; garlic dough, joined.
38. Line 99: change `"Chilli Eintopf"` to `"Chili-Eintopf"`. German spells it 'Chili'. The hyphen keeps the word readable.
39. Line 107: change `"Bumsblech Salat"` to `"Bumsblech-Salat"`. Compound was split by a space; the hyphen keeps the proper name readable (like vanilla 'Creeper-Wandkopf').
40. Line 108: change `"Süßkartoffel Pommes"` to `"Süßkartoffelpommes"`. Compound was split by a space; German joins it.
41. Line 110: change `"Veggie Wrap"` to `"Veggie-Wrap"`. English spacing; German hyphenates loanword compounds (like vanilla 'Redstone-Fackel').

---

## Part 2: New names (43)

### Meats (40)

1. Click at the end of line 174: `"block.tastyvanilla.cheese_hard": "Hartkäse",`
2. Press Enter twice.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Rohes Bärenfleisch",
  "item.tastyvanilla.raw_meat_camel": "Rohes Dromedarfleisch",
  "item.tastyvanilla.raw_meat_horse": "Rohes Pferdefleisch",
  "item.tastyvanilla.raw_meat_veggie": "Rohes Veggie-Fleisch",
  "item.tastyvanilla.raw_meat_sniffer": "Rohes Schnüfflerfleisch",
  "item.tastyvanilla.raw_meat_goat": "Rohes Ziegenfleisch",
  "item.tastyvanilla.raw_meat_llama": "Rohes Lamafleisch",
  "item.tastyvanilla.raw_meat_wolf": "Rohes Wolfsfleisch",
  "item.tastyvanilla.raw_meat_fox": "Rohes Fuchsfleisch",
  "item.tastyvanilla.raw_meat_cat": "Rohes Katzenfleisch",
  "item.tastyvanilla.raw_meat_parrot": "Roher Papagei",
  "item.tastyvanilla.raw_meat_frog": "Froschschenkel",
  "item.tastyvanilla.raw_meat_bat": "Fledermausflügel",
  "item.tastyvanilla.raw_meat_turtle": "Rohes Schildkrötenfleisch",
  "item.tastyvanilla.raw_meat_dolphin": "Rohes Delfinfleisch",
  "item.tastyvanilla.raw_meat_squid": "Roher Tintenfisch",
  "item.tastyvanilla.raw_meat_axolotl": "Roher Axolotl",
  "item.tastyvanilla.raw_meat_armadillo": "Rohes Gürteltierfleisch",
  "item.tastyvanilla.raw_meat_allay": "Hilfsgeisterflügel",
  "item.tastyvanilla.raw_meat_nautilus": "Roher Nautilus",

  "item.tastyvanilla.cooked_meat_bear": "Bärensteak",
  "item.tastyvanilla.cooked_meat_camel": "Dromedarsteak",
  "item.tastyvanilla.cooked_meat_horse": "Pferdesteak",
  "item.tastyvanilla.cooked_meat_veggie": "Veggie-Steak",
  "item.tastyvanilla.cooked_meat_sniffer": "Schnüfflerbraten",
  "item.tastyvanilla.cooked_meat_goat": "Gebratenes Ziegenfleisch",
  "item.tastyvanilla.cooked_meat_llama": "Gebratenes Lamafleisch",
  "item.tastyvanilla.cooked_meat_wolf": "Wolfssteak",
  "item.tastyvanilla.cooked_meat_fox": "Gebratenes Fuchsfleisch",
  "item.tastyvanilla.cooked_meat_cat": "Gebratenes Katzenfleisch",
  "item.tastyvanilla.cooked_meat_parrot": "Gebratener Papagei",
  "item.tastyvanilla.cooked_meat_frog": "Gebratene Froschschenkel",
  "item.tastyvanilla.cooked_meat_bat": "Gebratene Fledermausflügel",
  "item.tastyvanilla.cooked_meat_turtle": "Gebratenes Schildkrötenfleisch",
  "item.tastyvanilla.cooked_meat_dolphin": "Gebratenes Delfinfleisch",
  "item.tastyvanilla.cooked_meat_squid": "Gebratener Tintenfisch",
  "item.tastyvanilla.cooked_meat_axolotl": "Gebratener Axolotl",
  "item.tastyvanilla.cooked_meat_armadillo": "Gebratenes Gürteltierfleisch",
  "item.tastyvanilla.cooked_meat_allay": "Gebratene Hilfsgeisterflügel",
  "item.tastyvanilla.cooked_meat_nautilus": "Gebratener Nautilus",
```

### Rice (3)

4. Click at the end of line 93 (as it reads after Part 1): `"block.tastyvanilla.tomato_crop": "Tomatenpflanze" ,`
5. Press Enter twice.
6. Paste these 3 lines:

```json
  "item.tastyvanilla.rice": "Reis",
  "item.tastyvanilla.raw_rice": "Roher Reis",
  "block.tastyvanilla.rice_crop": "Reispflanze",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

If you take suggestion 6 or 9 in `en_us.md`, this file changes too. I'll send those lines then.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Pies: sweet and vegetable pies end in **-kuchen** (like vanilla Kürbiskuchen), meat and fish pies in **-pastete**. Option: the savoury vegetable pies in -pastete too (**Pilzpastete**, **Netherpilzpastete**, **Gemüsepastete**).
- Shepherd's Pie: kept in English, as German menus write it. Option: **Hirtenauflauf**.
- Chilli Stew: now **Chili-Eintopf**. Option: **Chiliragout**, like vanilla's Kaninchenragout.
- Baked Bread and Baked Sweet Potato: now **Gebackenes Brot** and **Gebackene Süßkartoffel**. Option: **Ofenbrot** and **Ofensüßkartoffel**, like vanilla's Ofenkartoffel.
- Goat Chop and Llama Chop: now **Rohes / Gebratenes Ziegenfleisch** and **Rohes / Gebratenes Lamafleisch**, like vanilla's Rohes Schweinefleisch for Raw Porkchop. Option: **Ziegenkotelett** and **Lamakotelett**.
- Veggie: now **Veggie-Wrap**, **Rohes Veggie-Fleisch**, **Veggie-Steak**. Option: **Gemüsewrap**, **Rohes Pflanzenfleisch**, **Pflanzensteak**.
