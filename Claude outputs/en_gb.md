# en_gb.json (English, UK): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/en_gb.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 7 fixes in Part 1, and 40 new names in Part 2 (the 40 meats).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (7)

1. Line 39: change `"Baguel"` to `"Bagel"`. Typo: the bread is a bagel, and its dough is already 'Bagel Dough' in this file.
2. Line 83, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
3. Line 141: change `"Strawberry"` to `"Strawberries"`. Plural like every other berry item (Raspberries, Blueberries) and vanilla Sweet Berries; the key is plural too.
4. Line 158: change `"White Currant Jam"` to `"Whitecurrant Jam"`. Same spelling as Whitecurrant Berries and Whitecurrant Bush in this file; British English writes it as one word, like blackcurrant and redcurrant.
5. Line 168: change `"White Currant Purée"` to `"Whitecurrant Purée"`. Same spelling as Whitecurrant Berries and Whitecurrant Bush in this file; British English writes it as one word, like blackcurrant and redcurrant.
6. Line 180 (`item.tastyvanilla.cheese_semihard`): change `"Semihard Cheese"` to `"Semi-hard Cheese"`. British spelling hyphenates semi- (semi-skimmed, semi-hard); lowercase after the hyphen, like vanilla 'Star-shaped'.
7. Line 181 (`block.tastyvanilla.cheese_semihard`): change `"Semihard Cheese"` to `"Semi-hard Cheese"`. British spelling hyphenates semi- (semi-skimmed, semi-hard); lowercase after the hyphen, like vanilla 'Star-shaped'.

---

## Part 2: New names (40)

### Meats (40)

1. Click at the end of line 183: `"block.tastyvanilla.cheese_hard": "Hard Cheese",`
2. Press Enter twice.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Raw Bear",
  "item.tastyvanilla.raw_meat_camel": "Raw Camel",
  "item.tastyvanilla.raw_meat_horse": "Raw Horse",
  "item.tastyvanilla.raw_meat_veggie": "Raw Veggie Meat",
  "item.tastyvanilla.raw_meat_sniffer": "Raw Sniffer",
  "item.tastyvanilla.raw_meat_goat": "Raw Goat Chop",
  "item.tastyvanilla.raw_meat_llama": "Raw Llama Chop",
  "item.tastyvanilla.raw_meat_wolf": "Raw Wolf",
  "item.tastyvanilla.raw_meat_fox": "Raw Fox",
  "item.tastyvanilla.raw_meat_cat": "Raw Cat",
  "item.tastyvanilla.raw_meat_parrot": "Raw Parrot",
  "item.tastyvanilla.raw_meat_frog": "Frog Legs",
  "item.tastyvanilla.raw_meat_bat": "Bat Wings",
  "item.tastyvanilla.raw_meat_turtle": "Raw Turtle",
  "item.tastyvanilla.raw_meat_dolphin": "Raw Dolphin",
  "item.tastyvanilla.raw_meat_squid": "Raw Squid",
  "item.tastyvanilla.raw_meat_axolotl": "Raw Axolotl",
  "item.tastyvanilla.raw_meat_armadillo": "Raw Armadillo",
  "item.tastyvanilla.raw_meat_allay": "Allay Wings",
  "item.tastyvanilla.raw_meat_nautilus": "Raw Nautilus",

  "item.tastyvanilla.cooked_meat_bear": "Bear Steak",
  "item.tastyvanilla.cooked_meat_camel": "Camel Steak",
  "item.tastyvanilla.cooked_meat_horse": "Horse Steak",
  "item.tastyvanilla.cooked_meat_veggie": "Veggie Steak",
  "item.tastyvanilla.cooked_meat_sniffer": "Sniffer Roast",
  "item.tastyvanilla.cooked_meat_goat": "Cooked Goat Chop",
  "item.tastyvanilla.cooked_meat_llama": "Cooked Llama Chop",
  "item.tastyvanilla.cooked_meat_wolf": "Wolf Steak",
  "item.tastyvanilla.cooked_meat_fox": "Cooked Fox",
  "item.tastyvanilla.cooked_meat_cat": "Cooked Cat",
  "item.tastyvanilla.cooked_meat_parrot": "Cooked Parrot",
  "item.tastyvanilla.cooked_meat_frog": "Cooked Frog Legs",
  "item.tastyvanilla.cooked_meat_bat": "Cooked Bat Wings",
  "item.tastyvanilla.cooked_meat_turtle": "Cooked Turtle",
  "item.tastyvanilla.cooked_meat_dolphin": "Cooked Dolphin",
  "item.tastyvanilla.cooked_meat_squid": "Cooked Squid",
  "item.tastyvanilla.cooked_meat_axolotl": "Cooked Axolotl",
  "item.tastyvanilla.cooked_meat_armadillo": "Cooked Armadillo",
  "item.tastyvanilla.cooked_meat_allay": "Cooked Allay Wings",
  "item.tastyvanilla.cooked_meat_nautilus": "Cooked Nautilus",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

If you take suggestion 6, 7 or 9 in `en_us.md`, this file changes too. I'll send those lines then.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Baked Sweet Potato: now **Baked Sweet Potato**. Option: **Jacket Sweet Potato**, like vanilla en_gb's Jacket Potato.
- Cooked Parrot: now **Cooked Parrot**. Option: **Roast Parrot**, like vanilla en_gb's Roast Chicken.
- Sourdough (the dough): now **Sourdough**. Option: **Sourdough Bread Dough**, since "a sourdough" often means the loaf in the UK.
- Wraps: now **Vegetable Wrap**, while the new meats say **Raw Veggie Meat** and **Veggie Steak**. Option: **Veggie Wrap**, for one word throughout.
- Not a choice, just so you know: Chilli stays **Chilli** here even if en_us becomes Chili, because that's the British spelling.
