//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.world;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.ModBlocks;


public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> HONEY_BERRY_BUSH_KEY = registerKey("honey_berry_bush");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_BLACKBERRY_BUSH_KEY = registerKey("berry_blackberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_BLUEBERRY_BUSH_KEY = registerKey("berry_blueberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_ELDERBERRY_BUSH_KEY = registerKey("berry_elderberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_GOJI_BERRY_BUSH_KEY = registerKey("berry_goji_berry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_GOOSE_BERRY_BUSH_KEY = registerKey("berry_gooseberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_RASPBERRY_BUSH_KEY = registerKey("berry_raspberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_STRAWBERRY_BUSH_KEY = registerKey("berry_strawberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_WHITE_CURRANT_BERRY_BUSH_KEY = registerKey("berry_white_current_berry_bush");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, BERRY_BLACKBERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_BLACKBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_BLUEBERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_BLUEBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_ELDERBERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_ELDERBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_GOJI_BERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_GOJI_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_GOOSE_BERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_GOOSEBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_RASPBERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_RASPBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_STRAWBERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_STRAWBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
        register(context, BERRY_WHITE_CURRANT_BERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }


    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

