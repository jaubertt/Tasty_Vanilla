package tastyvanilla.mixin;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

// Opens LootPool.entries (final) so ModLootTableModifiers can add the mod's items to a vanilla chest's main pool.
// Fabric API reads the same field through its own LootPoolAccessor; NeoForge 26.3 has no API to add pool entries.
@Mixin(LootPool.class)
public interface LootPoolAccessor {

    @Accessor("entries")
    List<LootPoolEntryContainer> tastyvanilla$getEntries();

    @Accessor("entries")
    @Mutable
    void tastyvanilla$setEntries(List<LootPoolEntryContainer> entries);
}
