package tastyvanilla.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import tastyvanilla.item.ModItems;

public class SweetPotatoCropBlock extends CropBlock {
    public SweetPotatoCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SWEET_POTATO;
    }
}
