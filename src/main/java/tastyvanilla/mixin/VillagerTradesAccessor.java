package tastyvanilla.mixin;

import net.minecraft.world.entity.npc.VillagerTrades;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

//WANDERING TRADER TRADES OF THE VILLAGER TRADE REBALANCE EXPERIMENT, USED BY ModVillagerTrades
@Mixin(VillagerTrades.class)
public interface VillagerTradesAccessor {

    @Accessor("EXPERIMENTAL_WANDERING_TRADER_TRADES")
    @Mutable
    static void tastyvanilla$setExperimentalWanderingTraderTrades(List<Pair<VillagerTrades.ItemListing[], Integer>> trades) {
        throw new AssertionError();
    }
}
