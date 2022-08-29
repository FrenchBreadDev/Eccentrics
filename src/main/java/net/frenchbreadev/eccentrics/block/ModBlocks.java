package net.frenchbreadev.eccentrics.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbreadev.eccentrics.EccentricsMod;
import net.frenchbreadev.eccentrics.block.custom.ObsidianGlassLightBlock;
import net.frenchbreadev.eccentrics.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ECCENTRIUM_ORE = registerBlock("eccentrium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));


    public static final Block RAW_ECCENTRIUM_BLOCK = registerBlock("raw_eccentrium_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(6.0f).nonOpaque()));

    public static final Block HARDENED_ECCENTRIUM_CRYSTAL_BLOCK = registerBlock("hardened_eccentrium_crystal_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(6.0f).nonOpaque()));

    public static final Block OBSIDIAN_GLASS_LIGHT = registerBlock("dark_eccentrium_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(8f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block STYLED_STAINED_GLASS_ELEMENTAL_VARIANT = registerBlock("styled_stained_glass_elemental_variant",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block DAMAGED_BEDROCK = registerBlock("damaged_bedrock",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(200.0f).resistance(4800.0f).requiresTool()));

    public static final Block STYLED_STAINED_GLASS_WATER_VARIANT = registerBlock("styled_stained_glass_water_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_FIRE_VARIANT = registerBlock("styled_stained_glass_fire_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_NATURE_VARIANT = registerBlock("styled_stained_glass_nature_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_WIND_VARIANT = registerBlock("styled_stained_glass_wind_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_OBSIDIAN_VARIANT = registerBlock("styled_stained_glass_obsidian_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).hardness(100.0f).resistance(2400.0f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_BEDROCK_VARIANT = registerBlock("styled_stained_glass_bedrock_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).hardness(150.0f).resistance(2800.0f).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
    return Registry.register(Registry.BLOCK, new Identifier(EccentricsMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(EccentricsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.ECCENTRICS)));
    }

    public static void registerModBlocks() {
        EccentricsMod.LOGGER.debug("Registering ModBlocks for " + EccentricsMod.MOD_ID);
    }
}
