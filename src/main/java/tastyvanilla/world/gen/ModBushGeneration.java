package tastyvanilla.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import tastyvanilla.world.ModPlacedFeatures;

public class ModBushGeneration {
    public static void generateBushes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FOREST,Biomes.DARK_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_BLACKBERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_BLUEBERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BIRCH_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_ELDERBERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WINDSWEPT_HILLS, Biomes.STONY_PEAKS), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_GOJI_BERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_GOOSEBERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.OLD_GROWTH_SPRUCE_TAIGA), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_RASPBERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FLOWER_FOREST, Biomes.MEADOW, Biomes.PLAINS), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_STRAWBERRY_BUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.WINDSWEPT_FOREST, Biomes.SNOWY_PLAINS), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BERRY_WHITE_CURRANT_BERRY_BUSH_PLACED_KEY);    }
}
