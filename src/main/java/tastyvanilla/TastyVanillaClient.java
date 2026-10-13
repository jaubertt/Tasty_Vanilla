package tastyvanilla;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import tastyvanilla.block.ModBlocks;

@Mod(value = TastyVanilla.MOD_ID, dist = Dist.CLIENT)
public class TastyVanillaClient {

    public TastyVanillaClient(IEventBus modBus) {
        modBus.addListener(TastyVanillaClient::onClientSetup);
    }

    //CROPS AND BERRY BUSHES USE THE CUTOUT LAYER, LIKE VANILLA CROPS AND THE SWEET BERRY BUSH
    @SuppressWarnings("deprecation")
    private static void onClientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CABBAGE_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHILLI_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EGGPLANT_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLIC_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LETTUCE_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ONION_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SWEET_POTATO_CROP, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOMATO_CROP, RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_BLACKBERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_BLUEBERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_ELDERBERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_GOJI_BERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_GOOSEBERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_RASPBERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_STRAWBERRY_BUSH, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH, RenderType.cutout());
    }
}

