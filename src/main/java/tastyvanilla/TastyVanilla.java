package tastyvanilla;

import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.entity.ModEntities;
import tastyvanilla.entity.ModVillagerTrades;
import tastyvanilla.item.ModBrewingRecipes;
import tastyvanilla.item.ModItems;
import tastyvanilla.item.ModVillagerFoods;
import tastyvanilla.loot.ModLootTableModifiers;

@Mod(TastyVanilla.MOD_ID)
public class TastyVanilla {
	public static final String MOD_ID = "tastyvanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public TastyVanilla(IEventBus modBus) {

		modBus.addListener(this::onRegister);
		modBus.addListener(ModItems::addToCreativeTabs);
		modBus.addListener(ModBlocks::addToCreativeTabs);
		modBus.addListener(ModItems::modifyDefaultComponents);
		modBus.addListener(this::onCommonSetup);
		modBus.addListener(this::onLoadComplete);

		NeoForge.EVENT_BUS.addListener(ModBrewingRecipes::onRegisterBrewingRecipes);
		NeoForge.EVENT_BUS.addListener(ModLootTableModifiers::onLootTableLoad);
		NeoForge.EVENT_BUS.addListener(ModVillagerTrades::onVillagerTrades);
		NeoForge.EVENT_BUS.addListener(ModVillagerTrades::onWandererTrades);

		//COMPOSTABLE ITEMS: data/neoforge/data_maps/item/compostables.json
		//BERRY BUSHES IN THE WORLD: data/tastyvanilla/neoforge/biome_modifier

	}

	//BLOCKS AND ITEMS ARE REGISTERED WHEN THEIR CLASS LOADS, WHILE NEOFORGE HAS THAT REGISTRY OPEN
	private void onRegister(RegisterEvent event) {
		if (event.getRegistryKey().equals(Registries.BLOCK)) {
			ModBlocks.registerModBlocks();
		} else if (event.getRegistryKey().equals(Registries.ITEM)) {
			ModItems.registerModItems();
		}
	}

	private void onCommonSetup(FMLCommonSetupEvent event) {
		ModEntities.registerModEntities();
		event.enqueueWork(ModVillagerFoods::registerModVillagerFoods);
	}

	//AFTER THE DEFAULT COMPONENTS ARE SET, SO VANILLA'S TRADES KEEP THE RABBIT STEW STACK SIZE OF 16
	private void onLoadComplete(FMLLoadCompleteEvent event) {
		event.enqueueWork(ModVillagerTrades::registerRebalancedWanderingTraderTrades);
	}
}