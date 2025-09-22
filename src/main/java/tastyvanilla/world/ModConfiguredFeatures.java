//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.world;

import java.util.List;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
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
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_BLACKBERRY_BUSH_KEY = registerKey("berry_blackberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_BLUEBERRY_BUSH_KEY = registerKey("berry_blueberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_ELDERBERRY_BUSH_KEY = registerKey("berry_elderberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_GOJI_BERRY_BUSH_KEY = registerKey("berry_goji_berry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_GOOSE_BERRY_BUSH_KEY = registerKey("berry_gooseberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_RASPBERRY_BUSH_KEY = registerKey("berry_raspberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_STRAWBERRY_BUSH_KEY = registerKey("berry_strawberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERRY_WHITE_CURRANT_BERRY_BUSH_KEY = registerKey("berry_white_current_berry_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, BERRY_BLACKBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_BLACKBERRY_BUSH.getDefaultState().with(BlackberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_BLUEBERRY_BUSH.getDefaultState().with(BlueberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_ELDERBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_ELDERBERRY_BUSH.getDefaultState().with(ElderberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_GOJI_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_GOJI_BERRY_BUSH.getDefaultState().with(GojiBerryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_GOOSE_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_GOOSEBERRY_BUSH.getDefaultState().with(GooseberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_RASPBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_RASPBERRY_BUSH.getDefaultState().with(RaspberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_STRAWBERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_STRAWBERRY_BUSH.getDefaultState().with(StrawberryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
        register(context, BERRY_WHITE_CURRANT_BERRY_BUSH_KEY, Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH.getDefaultState().with(WhiteCurrantBerryBushBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TastyVanilla.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

