//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.world;

import java.util.List;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.ModBlocks;
import tastyvanilla.block.custom.BlackberryBushBlock;
import tastyvanilla.block.custom.BlueberryBushBlock;
import tastyvanilla.block.custom.ElderberryBushBlock;
import tastyvanilla.block.custom.GojiBerryBushBlock;
import tastyvanilla.block.custom.GooseberryBushBlock;
import tastyvanilla.block.custom.RaspberryBushBlock;
import tastyvanilla.block.custom.StrawberryBushBlock;
import tastyvanilla.block.custom.WhiteCurrantBerryBushBlock;

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

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, BERRY_BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_BLUEBERRY_BUSH.getDefaultState().with(BlueberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_ELDERBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_ELDERBERRY_BUSH.getDefaultState().with(ElderberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_GOJI_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_GOJI_BERRY_BUSH.getDefaultState().with(GojiBerryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_GOOSE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_GOOSEBERRY_BUSH.getDefaultState().with(GooseberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_RASPBERRY_BUSH.getDefaultState().with(RaspberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_STRAWBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_STRAWBERRY_BUSH.getDefaultState().with(StrawberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_WHITE_CURRANT_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH.getDefaultState().with(WhiteCurrantBerryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_BLACKBERRY_BUSH_KEY, Feature.SIMPLE_RANDOM_SELECTOR,new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BERRY_BLACKBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3)))))));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

