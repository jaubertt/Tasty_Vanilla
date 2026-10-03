package tastyvanilla.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import tastyvanilla.TastyVanilla;

// Blocks that have NO block item of their own (crops and bushes are planted from items in ModItems)
public class ModBlockIds {

    //NEW CROPS
    public static final ResourceKey<Block> CABBAGE_CROP = create("cabbage_crop");
    public static final ResourceKey<Block> CHILLI_CROP = create("chilli_crop");
    public static final ResourceKey<Block> EGGPLANT_CROP = create("eggplant_crop");
    public static final ResourceKey<Block> GARLIC_CROP = create("garlic_crop");
    public static final ResourceKey<Block> LETTUCE_CROP = create("lettuce_crop");
    public static final ResourceKey<Block> ONION_CROP = create("onion_crop");
    public static final ResourceKey<Block> SWEET_POTATO_CROP = create("sweet_potato_crop");
    public static final ResourceKey<Block> TOMATO_CROP = create("tomato_crop");

    //CORN & RICE (2.2.1)
    public static final ResourceKey<Block> CORN_CROP = create("corn_crop");
    public static final ResourceKey<Block> WHITE_CORN_CROP = create("white_corn_crop");
    public static final ResourceKey<Block> BLUE_CORN_CROP = create("blue_corn_crop");
    public static final ResourceKey<Block> PURPLE_CORN_CROP = create("purple_corn_crop");
    public static final ResourceKey<Block> RICE_CROP = create("rice_crop");
    public static final ResourceKey<Block> WILD_RICE_CROP = create("wild_rice_crop");
    public static final ResourceKey<Block> BLACK_RICE_CROP = create("black_rice_crop");

    //BERRIES
    public static final ResourceKey<Block> BERRY_BLACKBERRY_BUSH = create("berry_blackberry_bush");
    public static final ResourceKey<Block> BERRY_BLUEBERRY_BUSH = create("berry_blueberry_bush");
    public static final ResourceKey<Block> BERRY_ELDERBERRY_BUSH = create("berry_elderberry_bush");
    public static final ResourceKey<Block> BERRY_GOJI_BERRY_BUSH = create("berry_goji_berry_bush");
    public static final ResourceKey<Block> BERRY_GOOSEBERRY_BUSH = create("berry_gooseberry_bush");
    public static final ResourceKey<Block> BERRY_RASPBERRY_BUSH = create("berry_raspberry_bush");
    public static final ResourceKey<Block> BERRY_STRAWBERRY_BUSH = create("berry_strawberry_bush");
    public static final ResourceKey<Block> BERRY_WHITE_CURRANT_BERRY_BUSH = create("berry_white_currant_berry_bush");

    private static ResourceKey<Block> create(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }
}
