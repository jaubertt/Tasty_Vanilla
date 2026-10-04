package tastyvanilla.block.custom;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.ItemLike;
import tastyvanilla.item.ModItems;

public class ChilliCropBlock extends CropBlock {
    public ChilliCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CHILLI_SEEDS;
    }
}
