package tastyvanilla.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import tastyvanilla.item.ModItems;

public class AloeVeraHerbBlock extends CropBlock {
    public AloeVeraHerbBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.EGGPLANT;
    }
}
