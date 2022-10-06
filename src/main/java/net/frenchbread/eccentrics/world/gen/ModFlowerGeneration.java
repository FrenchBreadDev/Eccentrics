package net.frenchbread.eccentrics.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.frenchbread.eccentrics.world.feauture.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS, BiomeKeys.END_MIDLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VOID_LILY.getKey().get());
    }
}
