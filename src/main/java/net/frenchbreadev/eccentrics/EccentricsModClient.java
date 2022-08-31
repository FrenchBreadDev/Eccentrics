package net.frenchbreadev.eccentrics;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.frenchbreadev.eccentrics.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class EccentricsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RAW_ECCENTRIUM_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HARDENED_ECCENTRIUM_CRYSTAL_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OBSIDIAN_GLASS_LIGHT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STYLED_STAINED_GLASS_WATER_VARIANT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STYLED_STAINED_GLASS_FIRE_VARIANT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STYLED_STAINED_GLASS_NATURE_VARIANT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STYLED_STAINED_GLASS_WIND_VARIANT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STYLED_STAINED_GLASS_OBSIDIAN_VARIANT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STYLED_STAINED_GLASS_BEDROCK_VARIANT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AQUA_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_RED_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_AQUA_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_BLUE_CRYSTAL_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_CRYSTAL_LANTERN, RenderLayer.getTranslucent());

    }
}
