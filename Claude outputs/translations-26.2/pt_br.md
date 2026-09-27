# pt_br.json (Portuguese, Brazil): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/pt_br.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 16 fixes in Part 1, and 40 new names in Part 2 (the 40 meats).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

A correction: in my earlier question I said pt_br would lose its capital letters. That was wrong. Vanilla pt_br capitalizes names ("Torta de Abóbora"), so your file keeps its style.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (16)

1. Line 3: change `"Biscoito de Fruta Doce"` to `"Biscoito de Bagas Doces"`. Vanilla pt_br calls Sweet Berries 'Bagas Doces' (as in 'Arbusto de Bagas Doces'); 'Fruta Doce' is not the vanilla name.
2. Line 4: change `"Biscoito de Fruta-Luminosa"` to `"Biscoito de Bagas Brilhantes"`. Vanilla pt_br calls Glow Berries 'Bagas Brilhantes'; 'Fruta-Luminosa' is not the vanilla name.
3. Line 24: change `"Massa de Baguel"` to `"Massa de Bagel"`. 'Baguel' copied the typo in the English key; the bread is a bagel, and 'bagel' is the normal word in Brazil. Matches Bagel.
4. Line 26: change `"Massa de Pão Assado"` to `"Massa de Pão"`. Follows your English 'Bread Dough'.
5. Line 33: change `"Massa de Panquecas"` to `"Massa de Panqueca"`. Follows your English 'Pancake Batter'; Brazilian recipes say 'massa de panqueca', in the singular.
6. Line 35: change `"Massa de Rolo Doce"` to `"Massa de Pão Doce"`. Matches the fix to Sweet Roll ('Pão Doce').
7. Line 39: change `"Baguel"` to `"Bagel"`. 'Baguel' copied the typo in the English key; 'bagel' is the normal word in Brazil.
8. Line 50: change `"Rolo Doce"` to `"Pão Doce"`. 'Rolo' means a roll of something (cylinder), not a bread roll; a sweet bread roll is 'pão doce' in Brazil.
9. Line 60: change `"Torta de Fruta-Luminosa"` to `"Torta de Bagas Brilhantes"`. Vanilla pt_br calls Glow Berries 'Bagas Brilhantes'; 'Fruta-Luminosa' is not the vanilla name.
10. Line 67: change `"Torta de Fruta Doce"` to `"Torta de Bagas Doces"`. Vanilla pt_br calls Sweet Berries 'Bagas Doces' (as in 'Arbusto de Bagas Doces'); 'Fruta Doce' is not the vanilla name.
11. Line 83, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
12. Line 100: change `"Arroz Cru"` to `"Cacho de Arroz"`. Follows your English 'Rice Panicle', the rice head you harvest. Brazilian rice farmers call it 'cacho'.
13. Line 117: change `"Bumsblech Salada"` to `"Salada Bumsblech"`. Portuguese puts the noun first and the proper name after it (like 'Salada Caesar'); 'Bumsblech Salada' is English word order.
14. Line 142: change `"Morangos"` to `"Morango"`. Your item shows one strawberry, so the name is singular, like the English 'Strawberry'.
15. Line 158: change `"Geleia de Fruta Doce"` to `"Geleia de Bagas Doces"`. Vanilla pt_br calls Sweet Berries 'Bagas Doces' (as in 'Arbusto de Bagas Doces'); 'Fruta Doce' is not the vanilla name.
16. Line 168: change `"Polpa de Fruta Doce"` to `"Polpa de Bagas Doces"`. Vanilla pt_br calls Sweet Berries 'Bagas Doces' (as in 'Arbusto de Bagas Doces'); 'Fruta Doce' is not the vanilla name.

---

## Part 2: New names (40)

### Meats (40)

1. Click at the end of line 184: `"block.tastyvanilla.cheese_hard": "Queijo Duro",`
2. Press Enter 3 times.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Urso Cru",
  "item.tastyvanilla.raw_meat_camel": "Camelo Cru",
  "item.tastyvanilla.raw_meat_horse": "Cavalo Cru",
  "item.tastyvanilla.raw_meat_veggie": "Carne Vegetal Crua",
  "item.tastyvanilla.raw_meat_sniffer": "Farejador Cru",
  "item.tastyvanilla.raw_meat_goat": "Costeleta de Cabra Crua",
  "item.tastyvanilla.raw_meat_llama": "Costeleta de Lhama Crua",
  "item.tastyvanilla.raw_meat_wolf": "Lobo Cru",
  "item.tastyvanilla.raw_meat_fox": "Raposa Crua",
  "item.tastyvanilla.raw_meat_cat": "Gato Cru",
  "item.tastyvanilla.raw_meat_parrot": "Papagaio Cru",
  "item.tastyvanilla.raw_meat_frog": "Coxas de Sapo",
  "item.tastyvanilla.raw_meat_bat": "Asas de Morcego",
  "item.tastyvanilla.raw_meat_turtle": "Tartaruga Crua",
  "item.tastyvanilla.raw_meat_dolphin": "Golfinho Cru",
  "item.tastyvanilla.raw_meat_squid": "Lula Crua",
  "item.tastyvanilla.raw_meat_axolotl": "Axolote Cru",
  "item.tastyvanilla.raw_meat_armadillo": "Tatu Cru",
  "item.tastyvanilla.raw_meat_allay": "Asas de Sereno",
  "item.tastyvanilla.raw_meat_nautilus": "Náutilo Cru",

  "item.tastyvanilla.cooked_meat_bear": "Filé de Urso",
  "item.tastyvanilla.cooked_meat_camel": "Filé de Camelo",
  "item.tastyvanilla.cooked_meat_horse": "Filé de Cavalo",
  "item.tastyvanilla.cooked_meat_veggie": "Filé Vegetal",
  "item.tastyvanilla.cooked_meat_sniffer": "Assado de Farejador",
  "item.tastyvanilla.cooked_meat_goat": "Costeleta de Cabra Assada",
  "item.tastyvanilla.cooked_meat_llama": "Costeleta de Lhama Assada",
  "item.tastyvanilla.cooked_meat_wolf": "Filé de Lobo",
  "item.tastyvanilla.cooked_meat_fox": "Raposa Assada",
  "item.tastyvanilla.cooked_meat_cat": "Gato Assado",
  "item.tastyvanilla.cooked_meat_parrot": "Papagaio Assado",
  "item.tastyvanilla.cooked_meat_frog": "Coxas de Sapo Assadas",
  "item.tastyvanilla.cooked_meat_bat": "Asas de Morcego Assadas",
  "item.tastyvanilla.cooked_meat_turtle": "Tartaruga Assada",
  "item.tastyvanilla.cooked_meat_dolphin": "Golfinho Assado",
  "item.tastyvanilla.cooked_meat_squid": "Lula Assada",
  "item.tastyvanilla.cooked_meat_axolotl": "Axolote Assado",
  "item.tastyvanilla.cooked_meat_armadillo": "Tatu Assado",
  "item.tastyvanilla.cooked_meat_allay": "Asas de Sereno Assadas",
  "item.tastyvanilla.cooked_meat_nautilus": "Náutilo Assado",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Crops: now **Plantação de X**. Option: **Plantio de X**, like vanilla's Plantio de Trigo.
- Soups: now **Sopa de Cebola** and **Sopa de Tomate**. Option: **Ensopado de ...**, vanilla's word for soups and stews (Ensopado de Beterraba).
- Gooseberries: now **Groselhas**. In Brazil plain groselha usually means currant, so next to **Groselhas Brancas** (White Currants) it reads as red and white currants. Option: **Groselhas-Espinhosas** (4 names).
- Rice Panicle: now **Cacho de Arroz**, the rice farmers' word. Option: **Panícula de Arroz**, the botanical term, like the English.
