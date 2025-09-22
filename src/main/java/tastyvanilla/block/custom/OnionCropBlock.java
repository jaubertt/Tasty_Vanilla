package tastyvanilla.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import tastyvanilla.item.ModItems;

public class OnionCropBlock extends CropBlock {
    public OnionCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.ONION;
    }
}
