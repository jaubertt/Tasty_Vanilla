package tastyvanilla.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import tastyvanilla.TastyVanilla;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> CROP_FOODS = createTag("crop_foods");
        public static final TagKey<Item> MOD_CROPS = createTag("mod_foods");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID, name));
        }
    }
}
