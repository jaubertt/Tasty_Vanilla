# ru_ru.json (Russian): fixes and new names

File: `src/main/resources/assets/tastyvanilla/lang/ru_ru.json`

Line numbers match your file as it is now (checked 27 Sep 2026). If you edit it before you start, tell me first and I'll update them.

**In this file:** 23 fixes in Part 1, and 40 new names in Part 2 (the 40 meats).

Do Part 1 first, then Part 2 in the order given. Part 1 doesn't add or remove lines, and Part 2 starts at the bottom of the file, so every line number stays right.

How it was checked: a translator and a separate reviewer per language, against Minecraft 26.2's own translation files. Then a script followed every step below on a copy of your file and confirmed the result.

Optional word choices are at the end.

---

## Part 1: Fixes (23)

1. Line 4: change `"Печенье с ягодами света"` to `"Печенье со светящимися ягодами"`. Vanilla Glow Berries = 'Светящиеся ягоды'.
2. Line 7: change `"Печенье с семечками подсолнечника"` to `"Печенье с семечками подсолнуха"`. Vanilla Sunflower = 'Подсолнух'.
3. Line 11: change `"Печенье с глазом паука"` to `"Печенье с паучьим глазом"`. Vanilla Spider Eye = 'Паучий глаз'.
4. Line 24: change `"Тесто для бэйгла"` to `"Тесто для бейгла"`. Standard spelling is 'бейгл' (е, not э).
5. Line 39: change `"Бэйгл"` to `"Бейгл"`. Standard spelling is 'бейгл' (е, not э).
6. Line 41: change `"Хлеб"` to `"Печёный хлеб"`. 'Хлеб' was identical to vanilla Bread; follows vanilla Baked Potato = 'Печёный картофель'.
7. Line 59: change `"Грибной пирог"` to `"Пирог с незерскими грибами"`. Meant the same as Mushroom Pie ('Пирог с грибами'); names the Nether fungi with vanilla's 'незерский'.
8. Line 60: change `"Пирог с ягодами света"` to `"Пирог со светящимися ягодами"`. Vanilla Glow Berries = 'Светящиеся ягоды'.
9. Line 63: change `"Дынный пирог"` to `"Арбузный пирог"`. Vanilla Melon = 'Арбуз'; 'дыня' is a different fruit.
10. Line 73: change `"Посев капусты"` to `"Росток капусты"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.
11. Line 77: change `"Посев перца чили"` to `"Росток перца чили"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.
12. Line 80: change `"Посев баклажана"` to `"Росток баклажана"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.
13. Line 83, the key: change `"item.tastyvanilla.garlic_crop"` to `"block.tastyvanilla.garlic_crop"`. The crop is a block, so the game looks for its name under `block.`. With `item.` it never finds it. The other 8 language files get the same fix.
14. Line 83: change `"Посев чеснока"` to `"Росток чеснока"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.
15. Line 85 (`item.tastyvanilla.lettuce`): change `"Салат"` to `"Латук"`. Was identical to Salad ('Салат'); 'латук' is the Russian name of the lettuce plant.
16. Line 86: change `"Семена салата"` to `"Семена латука"`. Matches the new Lettuce name 'Латук'.
17. Line 87: change `"Посев салата"` to `"Росток латука"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing; matches the new Lettuce name 'Латук'.
18. Line 89: change `"Лук"` to `"Репчатый лук"`. 'Лук' is vanilla's Bow; 'репчатый лук' is the normal word for bulb onion.
19. Line 90: change `"Посев лука"` to `"Росток репчатого лука"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing; matches the new Onion name 'Репчатый лук'.
20. Line 93: change `"Посев батата"` to `"Росток батата"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.
21. Line 97: change `"Посев помидора"` to `"Росток помидора"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.
22. Line 100: change `"Сырой рис"` to `"Метёлка риса"`. Follows your English 'Rice Panicle', the rice head you harvest. A rice head is a 'метёлка' in Russian.
23. Line 101: change `"Посев риса"` to `"Росток риса"`. Like vanilla's crop blocks 'Росток факельника' and 'Росток кувшинницы'; 'Посев' reads as the act of sowing.

---

## Part 2: New names (40)

### Meats (40)

1. Click at the end of line 183: `"block.tastyvanilla.cheese_hard": "Твёрдый сыр",`
2. Press Enter 3 times.
3. Paste this block. It starts with the `//MEATS & DROPS` heading, like en_us.

```json
  //MEATS & DROPS
  "item.tastyvanilla.raw_meat_bear": "Сырая медвежатина",
  "item.tastyvanilla.raw_meat_camel": "Сырая верблюжатина",
  "item.tastyvanilla.raw_meat_horse": "Сырая конина",
  "item.tastyvanilla.raw_meat_veggie": "Сырое растительное мясо",
  "item.tastyvanilla.raw_meat_sniffer": "Сырое мясо нюхача",
  "item.tastyvanilla.raw_meat_goat": "Сырая козлятина",
  "item.tastyvanilla.raw_meat_llama": "Сырое мясо ламы",
  "item.tastyvanilla.raw_meat_wolf": "Сырое мясо волка",
  "item.tastyvanilla.raw_meat_fox": "Сырое мясо лисицы",
  "item.tastyvanilla.raw_meat_cat": "Сырое мясо кошки",
  "item.tastyvanilla.raw_meat_parrot": "Сырое мясо попугая",
  "item.tastyvanilla.raw_meat_frog": "Лягушачьи лапки",
  "item.tastyvanilla.raw_meat_bat": "Крылья летучей мыши",
  "item.tastyvanilla.raw_meat_turtle": "Сырое мясо черепахи",
  "item.tastyvanilla.raw_meat_dolphin": "Сырое мясо дельфина",
  "item.tastyvanilla.raw_meat_squid": "Сырое мясо спрута",
  "item.tastyvanilla.raw_meat_axolotl": "Сырое мясо аксолотля",
  "item.tastyvanilla.raw_meat_armadillo": "Сырое мясо броненосца",
  "item.tastyvanilla.raw_meat_allay": "Крылья тихони",
  "item.tastyvanilla.raw_meat_nautilus": "Сырое мясо наутилуса",

  "item.tastyvanilla.cooked_meat_bear": "Стейк из медвежатины",
  "item.tastyvanilla.cooked_meat_camel": "Стейк из верблюжатины",
  "item.tastyvanilla.cooked_meat_horse": "Стейк из конины",
  "item.tastyvanilla.cooked_meat_veggie": "Растительный стейк",
  "item.tastyvanilla.cooked_meat_sniffer": "Жаркое из нюхача",
  "item.tastyvanilla.cooked_meat_goat": "Жареная козлятина",
  "item.tastyvanilla.cooked_meat_llama": "Жареное мясо ламы",
  "item.tastyvanilla.cooked_meat_wolf": "Волчий стейк",
  "item.tastyvanilla.cooked_meat_fox": "Жареное мясо лисицы",
  "item.tastyvanilla.cooked_meat_cat": "Жареное мясо кошки",
  "item.tastyvanilla.cooked_meat_parrot": "Жареное мясо попугая",
  "item.tastyvanilla.cooked_meat_frog": "Жареные лягушачьи лапки",
  "item.tastyvanilla.cooked_meat_bat": "Жареные крылья летучей мыши",
  "item.tastyvanilla.cooked_meat_turtle": "Жареное мясо черепахи",
  "item.tastyvanilla.cooked_meat_dolphin": "Жареное мясо дельфина",
  "item.tastyvanilla.cooked_meat_squid": "Жареное мясо спрута",
  "item.tastyvanilla.cooked_meat_axolotl": "Жареное мясо аксолотля",
  "item.tastyvanilla.cooked_meat_armadillo": "Жареное мясо броненосца",
  "item.tastyvanilla.cooked_meat_allay": "Жареные крылья тихони",
  "item.tastyvanilla.cooked_meat_nautilus": "Жареное мясо наутилуса",
```

---

## Part 3: Check

1. Tell me when you're done. I'll check the file on your computer: all 180 names, valid, nothing lost.

---

## Your choices (optional)

The steps above use the first version. Tell me if you want the other one and I'll send the lines.

- Lettuce and Salad had the same name. Now lettuce is **Латук** and the dish stays **Салат**. Option: lettuce stays **Салат** and the dish becomes **Овощной салат**.
- Onion: now **Репчатый лук**, because vanilla's Bow is already Лук. Option: **Лук**, but then onion and bow share a name.
- Butter: now **Масло**, which can also mean oil. Option: **Сливочное масло**.
- Pancakes: now **Блины** (thin). Option: **Панкейки** or **Оладьи** if your texture shows thick pancakes.
- Bumsblech is written in Cyrillic, **Салат Бумсблех**, since vanilla's Russian item, block and mob names use no Latin letters. Option: Latin, only if Bumsblech is someone's online handle.
- Rice Panicle: now **Метёлка риса**, the correct term. Option: **Колос риса**, the looser everyday word.
