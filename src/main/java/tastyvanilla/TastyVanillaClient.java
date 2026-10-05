package tastyvanilla;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import tastyvanilla.block.ModBlocks;

// Client-only part of the mod: NeoForge never loads this class on a dedicated server.
// Crops and berry bushes are drawn in the CUTOUT layer, like vanilla's wheat, carrots and sweet berry bush,
// so the see-through pixels of their textures stay see-through. The Fabric branch does the same in its own
// TastyVanillaClient with BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT).
@Mod(value = TastyVanilla.MOD_ID, dist = Dist.CLIENT)
public class TastyVanillaClient {

    public TastyVanillaClient(IEventBus modBus) {
        modBus.addListener(TastyVanillaClient::onClientSetup);
    }

    // NeoForge 1.21.11 marks setRenderLayer as deprecated (it prefers "render_type" in each block model JSON),
    // but it still works and keeps the models identical to the Fabric branch's generated ones.
    @SuppressWarnings("deprecation")
    private static void onClientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CABBAGE_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHILLI_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EGGPLANT_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLIC_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LETTUCE_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ONION_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SWEET_POTATO_CROP, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOMATO_CROP, ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_BLACKBERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_BLUEBERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_ELDERBERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_GOJI_BERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_GOOSEBERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_RASPBERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_STRAWBERRY_BUSH, ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BERRY_WHITE_CURRANT_BERRY_BUSH, ChunkSectionLayer.CUTOUT);
    }
}
