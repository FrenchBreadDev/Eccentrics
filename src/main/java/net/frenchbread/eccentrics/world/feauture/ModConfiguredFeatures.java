package net.frenchbread.eccentrics.world.feauture;
import net.frenchbread.eccentrics.EccentricsMod;
import net.frenchbread.eccentrics.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> END_ECCENTRIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ECCENTRIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_ECCENTRIUM_ORE =
            ConfiguredFeatures.register("eccentrium_ore",Feature.ORE, new OreFeatureConfig(END_ECCENTRIUM_ORES, 3));

    public static void registerConfiguredFeatures() {
        EccentricsMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + EccentricsMod.MOD_ID);
    }
}