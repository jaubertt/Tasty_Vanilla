package tastyvanilla.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.ai.brain.task.FarmerWorkTask;
import net.minecraft.entity.ai.brain.task.VillagerWorkTask;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import tastyvanilla.item.ModItems;

import java.util.List;

@Mixin({FarmerWorkTask.class})
public class FarmerWorkTaskMixin extends VillagerWorkTask {

    private static final List<Item> COMPOSTABLES = ImmutableList.of(
            Items.WHEAT_SEEDS,
            Items.BEETROOT_SEEDS,
            ModItems.CHILLI_SEEDS,
            ModItems.LETTUCE_SEEDS,
            ModItems.TOMATO_SEEDS
            );

}
