package tastyvanilla.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.trading.VillagerTrade;
import tastyvanilla.TastyVanilla;

public class ModTags {

    private static net.minecraft.tags.TagKey<VillagerTrade> createTag(String name) {
        return net.minecraft.tags.TagKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

}
