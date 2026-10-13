package tastyvanilla.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {

    //COOKIES
    public static final FoodComponent COOKIE_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent COOKIE_CARROT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent COOKIE_GLOW_BERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_HONEY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_OATMEAL = new FoodComponent.Builder().nutrition(4).saturationModifier(0.6f).build();
    public static final FoodComponent COOKIE_POPPY_SEED = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_PUMPKIN = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2f).build();
    public static final FoodComponent COOKIE_SPIDER_EYE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.8f).build();
    public static final FoodComponent COOKIE_SUNFLOWER_SEED = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_SUGAR = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKIE_SWEET_BERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1f).build();

    //BAKED BREAD
    //RAW DOUGH CAN MAKE YOU SICK: NAUSEA FOR 30 SECONDS, 80% CHANCE
    public static final FoodComponent DOUGHS = new FoodComponent.Builder().nutrition(0).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 0.8F).build();
    public static final FoodComponent BREAD_BAGUEL = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_BAGUETTE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_BAKED = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_BROWNIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_CROISSANT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_FLATBREAD = new FoodComponent.Builder().nutrition(5).saturationModifier(0.1f).build();
    public static final FoodComponent BREAD_FOCACCIA = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_HONEY = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_MULTIGRAIN = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_PANCAKES = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent BREAD_SOURDOUGH = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
    public static final FoodComponent BREAD_SWEET_ROLL = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();

    //PIES
    public static final FoodComponent PIE_APPLE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_CHICKEN = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_CHOCOLATE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_CHORUS_FRUIT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).alwaysEdible().build();
    public static final FoodComponent PIE_FISH = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_FUNGUS = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent PIE_GLOW_BERRY = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_HONEY = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_MEAT = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_MELON = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_MUSHROOM = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent PIE_SHEPHERDS = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent PIE_SWEET_BERRY = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_STRAWBERRY = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3f).build();
    public static final FoodComponent PIE_VEGETABLE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();

    //CROPS
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent CHILLI = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent EGGPLANT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent RICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent SWEET_POTATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();

    //FOOD FROM CROPS
    //BOWL FOODS GIVE THE BOWL BACK, LIKE VANILLA STEWS
    public static final FoodComponent FOOD_TOMATO_SOUP = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_SALAD = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_WRAP_VEGGIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_WRAP = new FoodComponent.Builder().nutrition(10).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_ONION_SOUP = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_ONION_RING = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_ROASTED_GARLIC = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_BAKED_SWEET_POTATO = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent FOOD_SWEET_POTATO_FRIES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_POTATO_FRIES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_COLESLAW = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_CHILLI_STEW = new FoodComponent.Builder().nutrition(10).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();
    public static final FoodComponent FOOD_BUMSBLECH_SALAD = new FoodComponent.Builder().nutrition(10).saturationModifier(0.6f).usingConvertsTo(Items.BOWL).build();

    public static final FoodComponent BREAD_GARLIC = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();

    public static final FoodComponent BERRY_BLACKBERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_BLUEBERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_ELDERBERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_GOJI_BERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_GOOSEBERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_RASPBERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_STRAWBERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent BERRY_WHITE_CURRANT_BERRIES = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_BLACKBERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_BLUEBERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_ELDERBERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_GOJI_BERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_GOOSEBERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_RASPBERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_STRAWBERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_SWEET_BERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_WHITE_CURRANT_BERRY = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.1F).build();
    public static final FoodComponent JAM_BLACKBERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_BLUEBERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_ELDERBERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_GOJI_BERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_GOOSEBERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_RASPBERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_SWEET_BERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_STRAWBERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent JAM_WHITE_CURRANT_BERRY_MASH = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.1F).alwaysEdible().build();

    //MEATS & DROPS
    public static final FoodComponent RAW_MEAT_TIER_1 = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent RAW_MEAT_TIER_2 = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent RAW_MEAT_TIER_3 = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent RAW_MEAT_TIER_4 = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F).build();

    //RAW MEATS THAT CAN GIVE HUNGER FOR 30 SECONDS, 30% CHANCE, LIKE VANILLA RAW CHICKEN
    public static final FoodComponent RAW_MEAT_TIER_1_FOOD_POISONING = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).build();
    public static final FoodComponent RAW_MEAT_TIER_2_FOOD_POISONING = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).build();
    public static final FoodComponent RAW_MEAT_TIER_3_FOOD_POISONING = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).build();

    public static final FoodComponent COOKED_MEAT_TIER_1 = (new FoodComponent.Builder()).nutrition(8).saturationModifier(0.8F).build();
    public static final FoodComponent COOKED_MEAT_TIER_2 = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.8F).build();
    public static final FoodComponent COOKED_MEAT_TIER_3 = (new FoodComponent.Builder()).nutrition(5).saturationModifier(0.6F).build();
    public static final FoodComponent COOKED_MEAT_TIER_4 = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.6F).build();

    //DROPS WITH AN EFFECT (RAW MEAT TIER 4 VALUES)
    public static final FoodComponent ALLAY_WINGS = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F) // Slow Falling, 10 seconds
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 200, 0), 1.0F).build();
    public static final FoodComponent BAT_WINGS = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F) // Blindness, 5 seconds
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 0), 1.0F).build();
    public static final FoodComponent CAT_EYE = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F) // Night Vision, 20 seconds
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0), 1.0F).build();


}
