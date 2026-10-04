package tastyvanilla.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import tastyvanilla.item.ModItems;

public class GarlicCropBlock extends CropBlock {
    public GarlicCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId()  {
        return ModItems.GARLIC;
    }
}
