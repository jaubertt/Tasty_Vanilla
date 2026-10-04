package tastyvanilla.block;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import tastyvanilla.TastyVanilla;

// Blocks that also get a block item with the same id
public class ModBlockItemIds {

    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name);
        return BlockItemId.create(id, id);
    }

    //NEW BLOCKS
    public static final BlockItemId SALT_BLOCK = create("salt_block");
    public static final BlockItemId SUGAR_BLOCK = create("sugar_block");

}
