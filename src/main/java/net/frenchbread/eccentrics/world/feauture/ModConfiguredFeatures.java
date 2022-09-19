package net.frenchbread.eccentrics.world.feauture;

import net.frenchbread.eccentrics.EccentricsMod;
import net.frenchbread.eccentrics.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ALEXANDRITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ALEXANDRITE_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> IRRENDIUM_TREE =
            ConfiguredFeatures.register("irrendium_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.IRRENDIUM_STEM),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.IRRENDIUM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<PlacedFeature> IRRENDIUM_CHECKED =
            PlacedFeatures.register("irrendium_checked", IRRENDIUM_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.IRRENDIUM_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> IRRENDIUM_SPAWN =
            ConfiguredFeatures.register("irrendium_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(IRRENDIUM_CHECKED, 0.5f)),
                            IRRENDIUM_CHECKED));







    public static final List<OreFeatureConfig.Target> END_ECCENTRIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ECCENTRIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALEXANDRITE_ORE =
            ConfiguredFeatures.register("alexandrite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ALEXANDRITE_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_ECCENTRIUM_ORE =
            ConfiguredFeatures.register("eccentrium_ore",Feature.ORE, new OreFeatureConfig(END_ECCENTRIUM_ORES, 3));

    public static void registerConfiguredFeatures() {
        EccentricsMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + EccentricsMod.MOD_ID);
    }
}