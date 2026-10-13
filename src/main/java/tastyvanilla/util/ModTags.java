package tastyvanilla.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import tastyvanilla.TastyVanilla;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> CROP_FOODS = createTag("crop_foods");
        public static final TagKey<Item> MOD_CROPS = createTag("mod_foods");


        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
        }
    }
}
