package tastyvanilla.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

// A block and its block item. Minecraft 26.2 has this as net.minecraft.references.BlockItemId; 26.1.x doesn't, so the mod keeps its own copy here.
public record BlockItemId(ResourceKey<Block> block, ResourceKey<Item> item) {

    public static BlockItemId create(Identifier blockId, Identifier itemId) {
        return new BlockItemId(ResourceKey.create(Registries.BLOCK, blockId), ResourceKey.create(Registries.ITEM, itemId));
    }
}
