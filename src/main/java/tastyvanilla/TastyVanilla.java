package tastyvanilla;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.entity.ModEntities;
import tastyvanilla.item.ModCompostableItems;
import tastyvanilla.item.ModItems;
import tastyvanilla.world.gen.ModWorldGeneration;

public class TastyVanilla implements ModInitializer {
	public static final String MOD_ID = "tastyvanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCompostableItems.registerModCompostableItems();
		ModEntities.registerModEntities();
		ModWorldGeneration.GenerateWorldGen();

	}
}