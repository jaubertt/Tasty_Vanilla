//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tastyvanilla.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import tastyvanilla.TastyVanilla;
import tastyvanilla.block.ModBlocks;


public class ModConfiguredFeatures {
    public static final ResourceKey<Feature> HONEY_BERRY_BUSH_KEY = registerKey("honey_berry_bush");

    public static final ResourceKey<Feature> BERRY_BLACKBERRY_BUSH_KEY = registerKey("berry_blackberry_bush");
    public static final ResourceKey<Feature> BERRY_BLUEBERRY_BUSH_KEY = registerKey("berry_blueberry_bush");
    public static final ResourceKey<Feature> BERRY_ELDERBERRY_BUSH_KEY = registerKey("berry_elderberry_bush");
    public static final ResourceKey<Feature> BERRY_GOJI_BERRY_BUSH_KEY = registerKey("berry_goji_berry_bush");
    public static final ResourceKey<Feature> BERRY_GOOSE_BERRY_BUSH_KEY = registerKey("berry_gooseberry_bush");
    public static final ResourceKey<Feature> BERRY_RASPBERRY_BUSH_KEY = registerKey("berry_raspberry_bush");
    public static final ResourceKey<Feature> BERRY_STRAWBERRY_BUSH_KEY = registerKey("berry_strawberry_bush");
    public static final ResourceKey<Feature> BERRY_WHITE_CURRANT_BERRY_BUSH_KEY = registerKey("berry_white_current_berry_bush");

    public static void bootstrap(BootstrapContext<Feature> context) {
        register(context, BERRY_BLACKBERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_BLACKBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_BLUEBERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_BLUEBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_ELDERBERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_ELDERBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_GOJI_BERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_GOJI_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_GOOSE_BERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_GOOSEBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_RASPBERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_RASPBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_STRAWBERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_STRAWBERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        register(context, BERRY_WHITE_CURRANT_BERRY_BUSH_KEY,
                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
    }


    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(TastyVanilla.MOD_ID, name));
    }


    private static void register(BootstrapContext<Feature> context, ResourceKey<Feature> key, Feature feature) {
        context.register(key, feature);
    }
}