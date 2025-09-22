package tastyvanilla.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import tastyvanilla.item.ModItems;

public class CabbageCropBlock extends CropBlock {
    public CabbageCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CABBAGE;
    }
}
