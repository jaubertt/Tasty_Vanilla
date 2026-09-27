# es_es.json (Spanish, Spain): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/es_es.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 26 fixes in Part 1, and 40 new names in Part 2 (the 40 meats).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (26)

1. Line 6: change `"Galleta de semilla de adormidera"` to `"Galleta de semillas de amapola"`. Recipe uses vanilla Poppy, which is 'Amapola' ('adormidera' is the opium poppy); 'semillas de amapola' is the usual Spain baking term.
2. Line 7: change `"Galleta de semilla de girasol"` to `"Galleta de semillas de girasol"`. Plural 'semillas' is the natural form, matches vanilla 'Semillas de ...' and the poppy seed cookie.
3. Line 30: change `"Masa integral"` to `"Masa multicereales"`. 'Integral' means wholemeal; multigrain (seeded) bread is 'multicereales' in Spain. Matches the bread.
4. Line 33: change `"Masa de bollos dulces"` to `"Masa de bollo dulce"`. Matches the singular bread name 'Bollo dulce'.
5. Line 38: change `"Pan"` to `"Pan horneado"`. 'Pan' is vanilla Bread's name, so two different items shared it; 'Pan horneado' mirrors 'Baked Bread'.
6. Line 44: change `"Pan integral"` to `"Pan multicereales"`. 'Pan integral' is wholemeal bread; multigrain bread is 'pan multicereales' in Spain.
7. Line 47: change `"Bollos dulces"` to `"Bollo dulce"`. English is singular (one roll per item); vanilla keeps the English number (Cookie = 'Galleta').
8. Line 55: change `"Tarta de setas"` to `"Tarta de hongos"`. Made with crimson and warped fungus, which vanilla calls 'Hongo carmesí' and 'Hongo distorsionado'; 'setas' reads as ordinary mushrooms.
9. Line 59: change `"Tarta de melón"` to `"Tarta de sandía"`. Vanilla es_es calls Minecraft's melon 'Sandía' (Rodaja de sandía, Semillas de sandía).
10. Line 78, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
11. Line 95: change `"Arroz crudo"` to `"Espiga de arroz"`. Follows your English 'Rice Panicle', the rice head you harvest. 'Espiga de arroz' is the everyday word for it.
12. Line 117: change `"Cespuglio de moras"` to `"Arbusto de moras"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
13. Line 120: change `"Cespuglio de arándanos"` to `"Arbusto de arándanos"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
14. Line 123: change `"Cespuglio de saúco"` to `"Arbusto de bayas de saúco"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces). Uses the berry's own name 'Bayas de saúco'.
15. Line 126: change `"Cespuglio de bayas de goji"` to `"Arbusto de bayas de goji"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
16. Line 129: change `"Cespuglio de grosellas espinosas"` to `"Arbusto de grosellas espinosas"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
17. Line 132: change `"Cespuglio de frambuesas"` to `"Arbusto de frambuesas"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
18. Line 134: change `"Fresas"` to `"Fresa"`. Your item shows one strawberry, so the name is singular, like the English 'Strawberry'.
19. Line 135: change `"Cespuglio de fresas"` to `"Arbusto de fresas"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
20. Line 138: change `"Cespuglio de grosellas blancas"` to `"Arbusto de grosellas blancas"`. 'Cespuglio' is Italian; vanilla es_es uses 'Arbusto' (Arbusto de bayas dulces).
21. Line 145: change `"Mermelada de saúco"` to `"Mermelada de bayas de saúco"`. Matches the berry's name in this file, 'Bayas de saúco'; 'saúco' alone is the plant.
22. Line 146: change `"Mermelada de goji"` to `"Mermelada de bayas de goji"`. Matches the berry's name in this file, 'Bayas de goji'.
23. Line 155: change `"Puré de saúco"` to `"Puré de bayas de saúco"`. Matches the berry's name in this file, 'Bayas de saúco'; 'saúco' alone is the plant.
24. Line 156: change `"Puré de goji"` to `"Puré de bayas de goji"`. Matches the berry's name in this file, 'Bayas de goji'.
25. Line 164: change `"Cubo de leche de cabra"` to `"Cubo con leche de cabra"`. Vanilla pattern is 'Cubo con leche' / 'Cubo con agua'; 'Cubo de leche' reads as a bucket made of milk.
26. Line 165: change `"Cubo de leche de oveja"` to `"Cubo con leche de oveja"`. Vanilla pattern is 'Cubo con leche' / 'Cubo con agua'; 'Cubo de leche' reads as a bucket made of milk.

---

## Part 2: New names (40)

### Meats (40)

1. Click at the end of line 174: `"block.tastyvanilla.cheese_hard": "Queso curado",`
2. Press Enter twice.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Filete de oso crudo",
  "item.tastyvanilla.raw_meat_camel": "Filete de camello crudo",
  "item.tastyvanilla.raw_meat_horse": "Filete de caballo crudo",
  "item.tastyvanilla.raw_meat_veggie": "Filete vegetal crudo",
  "item.tastyvanilla.raw_meat_sniffer": "Sniffer crudo",
  "item.tastyvanilla.raw_meat_goat": "Chuleta de cabra cruda",
  "item.tastyvanilla.raw_meat_llama": "Chuleta de llama cruda",
  "item.tastyvanilla.raw_meat_wolf": "Filete de lobo crudo",
  "item.tastyvanilla.raw_meat_fox": "Zorro crudo",
  "item.tastyvanilla.raw_meat_cat": "Gato crudo",
  "item.tastyvanilla.raw_meat_parrot": "Loro crudo",
  "item.tastyvanilla.raw_meat_frog": "Ancas de rana",
  "item.tastyvanilla.raw_meat_bat": "Alas de murciélago",
  "item.tastyvanilla.raw_meat_turtle": "Tortuga cruda",
  "item.tastyvanilla.raw_meat_dolphin": "Delfín crudo",
  "item.tastyvanilla.raw_meat_squid": "Calamar crudo",
  "item.tastyvanilla.raw_meat_axolotl": "Ajolote crudo",
  "item.tastyvanilla.raw_meat_armadillo": "Armadillo crudo",
  "item.tastyvanilla.raw_meat_allay": "Alas de allay",
  "item.tastyvanilla.raw_meat_nautilus": "Nautilo crudo",

  "item.tastyvanilla.cooked_meat_bear": "Filete de oso asado",
  "item.tastyvanilla.cooked_meat_camel": "Filete de camello asado",
  "item.tastyvanilla.cooked_meat_horse": "Filete de caballo asado",
  "item.tastyvanilla.cooked_meat_veggie": "Filete vegetal asado",
  "item.tastyvanilla.cooked_meat_sniffer": "Sniffer asado",
  "item.tastyvanilla.cooked_meat_goat": "Chuleta de cabra asada",
  "item.tastyvanilla.cooked_meat_llama": "Chuleta de llama asada",
  "item.tastyvanilla.cooked_meat_wolf": "Filete de lobo asado",
  "item.tastyvanilla.cooked_meat_fox": "Zorro asado",
  "item.tastyvanilla.cooked_meat_cat": "Gato asado",
  "item.tastyvanilla.cooked_meat_parrot": "Loro asado",
  "item.tastyvanilla.cooked_meat_frog": "Ancas de rana asadas",
  "item.tastyvanilla.cooked_meat_bat": "Alas de murciélago asadas",
  "item.tastyvanilla.cooked_meat_turtle": "Tortuga asada",
  "item.tastyvanilla.cooked_meat_dolphin": "Delfín asado",
  "item.tastyvanilla.cooked_meat_squid": "Calamar asado",
  "item.tastyvanilla.cooked_meat_axolotl": "Ajolote asado",
  "item.tastyvanilla.cooked_meat_armadillo": "Armadillo asado",
  "item.tastyvanilla.cooked_meat_allay": "Alas de allay asadas",
  "item.tastyvanilla.cooked_meat_nautilus": "Nautilo asado",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Cooked meats: all 20 use **asado/asada**, as vanilla does for beef, chicken, mutton and rabbit. Option: **cocinado/cocinada** for the chops and sea animals, as vanilla does for porkchop and cod.
- Baked Bread: now **Pan horneado** (plain "Pan" is vanilla's Bread). Option: **Hogaza**.
- Soft Cheese (planned): now **Queso blando**. Option: **Queso tierno**, which completes Spain's fresco / tierno / semicurado / curado series.
- Rice Panicle: now **Espiga de arroz**, the everyday word. Option: **Panícula de arroz**, the botanical term, like the English.
