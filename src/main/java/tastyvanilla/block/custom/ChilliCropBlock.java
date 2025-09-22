package tastyvanilla.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import tastyvanilla.item.ModItems;

public class ChilliCropBlock extends CropBlock {
    public ChilliCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CHILLI_SEEDS;
    }
}
