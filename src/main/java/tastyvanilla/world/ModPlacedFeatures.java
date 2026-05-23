//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.world;

import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import tastyvanilla.TastyVanilla;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> BERRY_BLACKBERRY_BUSH_PLACED_KEY = registerKey("berry_blackberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_BLUEBERRY_BUSH_PLACED_KEY = registerKey("berry_blueberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_ELDERBERRY_BUSH_PLACED_KEY = registerKey("berry_elderberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_GOJI_BERRY_BUSH_PLACED_KEY = registerKey("berry_goji_berry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_GOOSEBERRY_BUSH_PLACED_KEY = registerKey("berry_gooseberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_RASPBERRY_BUSH_PLACED_KEY = registerKey("berry_raspberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_STRAWBERRY_BUSH_PLACED_KEY = registerKey("berry_strawberry_bush_placed");
    public static final ResourceKey<PlacedFeature> BERRY_WHITE_CURRANT_BERRY_BUSH_PLACED_KEY = registerKey("berry_white_currant_berry_bush_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, BERRY_BLACKBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_BLACKBERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32),InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_BLUEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_BLUEBERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_ELDERBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_ELDERBERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_GOJI_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_GOJI_BERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_GOOSEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_GOOSE_BERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_RASPBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_RASPBERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_STRAWBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_STRAWBERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BERRY_WHITE_CURRANT_BERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERRY_WHITE_CURRANT_BERRY_BUSH_KEY), List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                          Holder<ConfiguredFeature<?, ?>> configuration, net.minecraft.world.level.levelgen.placement.PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<net.minecraft.world.level.levelgen.placement.PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

