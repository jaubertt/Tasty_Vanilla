package tastyvanilla.food;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ClearAllStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect;

import java.util.List;

public class ModFoods {

    //COOKIES

    public static final FoodProperties COOKIE_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodProperties COOKIE_CARROT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties COOKIE_GLOW_BERRY = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1f).build();
    public static final FoodProperties COOKIE_HONEY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.1f).build();
    public static final FoodProperties COOKIE_OATMEAL = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6f).build();
    public static final FoodProperties COOKIE_POPPY_SEED = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodProperties COOKIE_PUMPKIN = new FoodProperties.Builder().nutrition(3).saturationModifier(0.2f).build();
    public static final FoodProperties COOKIE_SPIDER_EYE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.8f).build();
    public static final FoodProperties COOKIE_SUNFLOWER_SEED = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodProperties COOKIE_SUGAR = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodProperties COOKIE_SWEET_BERRY = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1f).build();

    //BAKED BREAD
    public static final FoodProperties DOUGHS = new FoodProperties.Builder().nutrition(0).saturationModifier(0f).build();
    public static final FoodProperties BREAD_BAGUEL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodProperties BREAD_BAGUETTE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodProperties BREAD_BAKED = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodProperties BREAD_BROWNIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodProperties BREAD_CROISSANT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodProperties BREAD_FLATBREAD = new FoodProperties.Builder().nutrition(5).saturationModifier(0.1f).build();
    public static final FoodProperties BREAD_FOCACCIA = new FoodProperties.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodProperties BREAD_HONEY = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodProperties BREAD_MULTIGRAIN = new FoodProperties.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodProperties BREAD_PANCAKES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodProperties BREAD_SOURDOUGH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodProperties BREAD_SWEET_ROLL = new FoodProperties.Builder().nutrition(8).saturationModifier(0.3f).build();

    //PIES
    public static final FoodProperties PIE_APPLE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_CHICKEN = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodProperties PIE_CHOCOLATE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_CHORUS_FRUIT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).alwaysEdible().build();
    public static final FoodProperties PIE_FISH = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodProperties PIE_FUNGUS = new FoodProperties.Builder().nutrition(8).saturationModifier(1.8f).build();
    public static final FoodProperties PIE_GLOW_BERRY = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_HONEY = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodProperties PIE_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodProperties PIE_MELON = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_MUSHROOM = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_SHEPHERDS = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();
    public static final FoodProperties PIE_SWEET_BERRY = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_STRAWBERRY = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties PIE_VEGETABLE = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2f).build();

    //CROPS
    public static final FoodProperties CABBAGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties CHILLI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties EGGPLANT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties GARLIC = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties RICE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties SWEET_POTATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();

    //FOOD FROM CROPS
    public static final FoodProperties FOOD_TOMATO_SOUP = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_SALAD = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_WRAP_VEGGIE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_WRAP = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_ONION_SOUP = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_ONION_RING = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_ROASTED_GARLIC = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_BAKED_SWEET_POTATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_SWEET_POTATO_FRIES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_POTATO_FRIES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_COLESLAW = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_CHILLI_STEW = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FOOD_BUMSBLECH_SALAD = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();

    public static final FoodProperties BREAD_GARLIC = new FoodProperties.Builder().nutrition(8).saturationModifier(0.6f).build();

    public static final FoodProperties BERRY_BLACKBERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_BLUEBERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_ELDERBERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_GOJI_BERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_GOOSEBERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_RASPBERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_STRAWBERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties BERRY_WHITE_CURRANT_BERRIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_BLACKBERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_BLUEBERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_ELDERBERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_GOJI_BERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_GOOSEBERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_RASPBERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_STRAWBERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_SWEET_BERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_WHITE_CURRANT_BERRY = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodProperties JAM_BLACKBERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_BLUEBERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_ELDERBERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_GOJI_BERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_GOOSEBERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_RASPBERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_SWEET_BERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_STRAWBERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodProperties JAM_WHITE_CURRANT_BERRY_MASH = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();

    //MEATS & DROPS
    public static final FoodProperties RAW_MEAT_TIER_1 = (new FoodProperties.Builder()).nutrition(3).saturationModifier(1.8F).build();
    public static final FoodProperties RAW_MEAT_TIER_2 = (new FoodProperties.Builder()).nutrition(2).saturationModifier(1.2F).build();
    public static final FoodProperties RAW_MEAT_TIER_3 = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.4F).build();
    public static final FoodProperties RAW_MEAT_TIER_4 = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.6F).build();

    public static final FoodProperties COOKED_MEAT_TIER_1 = (new FoodProperties.Builder()).nutrition(8).saturationModifier(12.8F).build();
    public static final FoodProperties COOKED_MEAT_TIER_2 = (new FoodProperties.Builder()).nutrition(6).saturationModifier(9.6F).build();
    public static final FoodProperties COOKED_MEAT_TIER_3 = (new FoodProperties.Builder()).nutrition(5).saturationModifier(6.0F).build();
    public static final FoodProperties COOKED_MEAT_TIER_4 = (new FoodProperties.Builder()).nutrition(3).saturationModifier(3.6F).build();

    //EFFECTS

    public static final Consumable JAMS_CONSUMABLE = Consumables.defaultDrink()
            .consumeSeconds(2.0F).sound(SoundEvents.HONEY_DRINK).onConsume(ClearAllStatusEffectsConsumeEffect.INSTANCE).build();
    public static final Consumable PIE_CHORUS_FRUIT_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new TeleportRandomlyConsumeEffect()).build();
    public static final Consumable DOUGH_CONSUMABLE = Consumables.defaultDrink()
            .consumeSeconds(2.0F).sound(SoundEvents.GENERIC_EAT)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 600, 0), 0.8F)).build();
    public static final Consumable FOOD_POISONING = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)).build();
}
