package tastyvanilla;

import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.entity.ModEntities;
import tastyvanilla.item.ModBrewingRecipes;
import tastyvanilla.item.ModItems;
import tastyvanilla.item.ModVillagerFoods;
import tastyvanilla.loot.ModLootTableModifiers;

// NeoForge entry point. The Fabric branch has the same class as a ModInitializer; here NeoForge calls the
// constructor and hands us the mod event bus. Blocks and items keep the Fabric ids, so a 2.2 world opens on
// either loader. Content NeoForge doesn't have (the 2.2.1 corn and rice) is dropped when NeoForge saves a world.
@Mod(TastyVanilla.MOD_ID)
public class TastyVanilla {
	public static final String MOD_ID = "tastyvanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public TastyVanilla(IEventBus modBus) {

		// Blocks and items: NeoForge opens the registries during RegisterEvent, see onRegister below.
		modBus.addListener(this::onRegister);

		// Creative tabs and the vanilla stews' stack size (mod event bus).
		modBus.addListener(ModItems::addToCreativeTabs);
		modBus.addListener(ModBlocks::addToCreativeTabs);
		modBus.addListener(ModItems::modifyDefaultComponents);
		modBus.addListener(this::onCommonSetup);

		// Brewing recipes and loot table additions (game event bus).
		NeoForge.EVENT_BUS.addListener(ModBrewingRecipes::onRegisterBrewingRecipes);
		NeoForge.EVENT_BUS.addListener(ModLootTableModifiers::onLootTableLoad);

		// Compostables and farmer composting: data/neoforge/data_maps/item/compostables.json (no code).
		// Berry bush world generation: data/tastyvanilla/neoforge/biome_modifier/*.json (no code).
	}

	// ModBlocks and ModItems register everything the moment their class loads (the same code as on
	// Fabric), so each class is loaded while NeoForge fires the RegisterEvent for its own registry.
	private void onRegister(RegisterEvent event) {
		if (event.getRegistryKey().equals(Registries.BLOCK)) {
			ModBlocks.registerModBlocks();
		} else if (event.getRegistryKey().equals(Registries.ITEM)) {
			ModItems.registerModItems();
		}
	}

	private void onCommonSetup(FMLCommonSetupEvent event) {
		ModEntities.registerModEntities();
		// Villager food points touch a vanilla static map, so this runs on the main thread.
		event.enqueueWork(ModVillagerFoods::registerModVillagerFoods);
	}
}
