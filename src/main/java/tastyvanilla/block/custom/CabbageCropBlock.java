package tastyvanilla.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import tastyvanilla.item.ModItems;

public class CabbageCropBlock extends CropBlock {
    public CabbageCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CABBAGE;
    }
}
