# it_it.json (Italian): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/it_it.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 11 fixes in Part 1, and 40 new names in Part 2 (the 40 meats).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

Steps marked *apostrophe* only swap the curly apostrophe `’` for the straight `'` that vanilla uses.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (11)

1. Line 12: change `"Biscotto d’avena"` to `"Biscotto d'avena"`. *apostrophe*
2. Line 41: change `"Pane"` to `"Pane al forno"`. 'Pane' is vanilla Bread's exact name, so two items shared it; 'al forno' follows vanilla 'Patata al forno' (Baked Potato).
3. Line 57: change `"Torta di frutti di chorus"` to `"Torta di coro"`. 'chorus' was untranslated English; vanilla it_it calls Chorus Fruit 'Coro' (also 'Fiore di coro', 'Ramo di coro').
4. Line 59 (`item.tastyvanilla.pie_fungus`): change `"Torta ai funghi"` to `"Torta ai funghi del Nether"`. Had the same name as Mushroom Pie; it is made from crimson and warped fungus, so 'del Nether' as in vanilla 'Verruca del Nether'.
5. Line 63: change `"Torta al melone"` to `"Torta all'anguria"`. Vanilla it_it calls Melon 'Anguria' (Fetta di anguria, Semi di anguria); 'melone' is a different fruit (cantaloupe).
6. Line 65: change `"Shepherd’s pie"` to `"Shepherd's pie"`. *apostrophe*
7. Line 83, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
8. Line 105: change `"Pane all’aglio"` to `"Pane all'aglio"`. *apostrophe*
9. Line 106: change `"Impasto all’aglio"` to `"Impasto all'aglio"`. *apostrophe*
10. Line 108: change `"Spezzatino di peperoncino"` to `"Spezzatino al peperoncino"`. 'Spezzatino di peperoncino' reads as a stew made of chillies; 'al peperoncino' means a meat stew with chilli, as in the recipe.
11. Line 133: change `"Cespuglio di bacche di goji"` to `"Cespuglio di goji"`. No other bush name says 'bacche di', and this matches your 'Marmellata di goji' and 'Purea di goji'.

---

## Part 2: New names (40)

### Meats (40)

1. Click at the end of line 183: `"block.tastyvanilla.cheese_hard": "Formaggio stagionato",`
2. Press Enter 3 times.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Orso crudo",
  "item.tastyvanilla.raw_meat_camel": "Dromedario crudo",
  "item.tastyvanilla.raw_meat_horse": "Cavallo crudo",
  "item.tastyvanilla.raw_meat_veggie": "Carne vegetale cruda",
  "item.tastyvanilla.raw_meat_sniffer": "Fiutatore crudo",
  "item.tastyvanilla.raw_meat_goat": "Costoletta di capra cruda",
  "item.tastyvanilla.raw_meat_llama": "Costoletta di lama cruda",
  "item.tastyvanilla.raw_meat_wolf": "Lupo crudo",
  "item.tastyvanilla.raw_meat_fox": "Volpe cruda",
  "item.tastyvanilla.raw_meat_cat": "Gatto crudo",
  "item.tastyvanilla.raw_meat_parrot": "Pappagallo crudo",
  "item.tastyvanilla.raw_meat_frog": "Cosce di rana",
  "item.tastyvanilla.raw_meat_bat": "Ali di pipistrello",
  "item.tastyvanilla.raw_meat_turtle": "Tartaruga cruda",
  "item.tastyvanilla.raw_meat_dolphin": "Delfino crudo",
  "item.tastyvanilla.raw_meat_squid": "Calamaro crudo",
  "item.tastyvanilla.raw_meat_axolotl": "Assolotto crudo",
  "item.tastyvanilla.raw_meat_armadillo": "Armadillo crudo",
  "item.tastyvanilla.raw_meat_allay": "Ali di alleviante",
  "item.tastyvanilla.raw_meat_nautilus": "Nautilo crudo",

  "item.tastyvanilla.cooked_meat_bear": "Bistecca di orso",
  "item.tastyvanilla.cooked_meat_camel": "Bistecca di dromedario",
  "item.tastyvanilla.cooked_meat_horse": "Bistecca di cavallo",
  "item.tastyvanilla.cooked_meat_veggie": "Bistecca vegetale",
  "item.tastyvanilla.cooked_meat_sniffer": "Arrosto di fiutatore",
  "item.tastyvanilla.cooked_meat_goat": "Costoletta di capra cotta",
  "item.tastyvanilla.cooked_meat_llama": "Costoletta di lama cotta",
  "item.tastyvanilla.cooked_meat_wolf": "Bistecca di lupo",
  "item.tastyvanilla.cooked_meat_fox": "Volpe cotta",
  "item.tastyvanilla.cooked_meat_cat": "Gatto cotto",
  "item.tastyvanilla.cooked_meat_parrot": "Pappagallo cotto",
  "item.tastyvanilla.cooked_meat_frog": "Cosce di rana cotte",
  "item.tastyvanilla.cooked_meat_bat": "Ali di pipistrello cotte",
  "item.tastyvanilla.cooked_meat_turtle": "Tartaruga cotta",
  "item.tastyvanilla.cooked_meat_dolphin": "Delfino cotto",
  "item.tastyvanilla.cooked_meat_squid": "Calamaro cotto",
  "item.tastyvanilla.cooked_meat_axolotl": "Assolotto cotto",
  "item.tastyvanilla.cooked_meat_armadillo": "Armadillo cotto",
  "item.tastyvanilla.cooked_meat_allay": "Ali di alleviante cotte",
  "item.tastyvanilla.cooked_meat_nautilus": "Nautilo cotto",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

If you take suggestion 6 or 9 in `en_us.md`, this file changes too. I'll send those lines then.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Chilli Stew: now **Spezzatino al peperoncino**. Option: **Stufato al peperoncino**, like vanilla's Stufato di coniglio.
- Shepherd's Pie: your **Shepherd's pie** stays (only its apostrophe changes), since Italian recipe sites use that name. Option: **Torta del pastore**, the literal translation.
- Crops: 4 are plural (melanzane, cipolle, patate dolci, pomodori). Option: singular, like vanilla's Coltura di fiortorcia (**Coltura di melanzana**, **cipolla**, **patata dolce**, **pomodoro**).
- Cheeses (planned): now **fresco / a pasta molle / semiduro / stagionato**. Option: one texture scale, **fresco / a pasta molle / a pasta semidura / a pasta dura**.
