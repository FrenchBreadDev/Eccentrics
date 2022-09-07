package net.frenchbread.eccentrics.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbread.eccentrics.EccentricsMod;
import net.frenchbread.eccentrics.block.custom.ObsidianGlassLightBlock;
import net.frenchbread.eccentrics.item.ModItemGroup;
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

    public static final Block STYLED_STAINED_GLASS_WATER_VARIANT = registerBlock("styled_stained_glass_water_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_FIRE_VARIANT = registerBlock("styled_stained_glass_fire_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_NATURE_VARIANT = registerBlock("styled_stained_glass_nature_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_WIND_VARIANT = registerBlock("styled_stained_glass_wind_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_OXIDIZING_COPPER_VARIANT = registerBlock("styled_stained_glass_oxdizing_coppper_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_OBSIDIAN_VARIANT = registerBlock("styled_stained_glass_obsidian_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).hardness(100.0f).resistance(2400.0f).nonOpaque()));

    public static final Block STYLED_STAINED_GLASS_BEDROCK_VARIANT = registerBlock("styled_stained_glass_bedrock_variant",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).hardness(150.0f).resistance(2800.0f).nonOpaque()));

    public static final Block PURPLE_CRYSTAL_LANTERN = registerBlock("purple_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block AQUA_CRYSTAL_LANTERN = registerBlock("aqua_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block CRYSTAL_LANTERN = registerBlock("crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block DARK_RED_CRYSTAL_LANTERN = registerBlock("dark_red_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block BLUE_CRYSTAL_LANTERN = registerBlock("blue_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block ORANGE_CRYSTAL_LANTERN = registerBlock("orange_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block GREEN_CRYSTAL_LANTERN = registerBlock("green_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block YELLOW_CRYSTAL_LANTERN = registerBlock("yellow_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block DARK_AQUA_CRYSTAL_LANTERN = registerBlock("dark_aqua_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block RED_CRYSTAL_LANTERN = registerBlock("red_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block DARK_BLUE_CRYSTAL_LANTERN = registerBlock("dark_blue_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block PINK_CRYSTAL_LANTERN = registerBlock("pink_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block BLACK_CRYSTAL_LANTERN = registerBlock("black_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block WHITE_CRYSTAL_LANTERN = registerBlock("white_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block LIGHT_GRAY_CRYSTAL_LANTERN = registerBlock("light_gray_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block GRAY_CRYSTAL_LANTERN = registerBlock("gray_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block LIME_GREEN_CRYSTAL_LANTERN = registerBlock("lime_green_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block END_CRYSTAL_LANTERN = registerBlock("end_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    public static final Block PURPUR_END_CRYSTAL_LANTERN = registerBlock("purpur_end_crystal_lantern",
            new ObsidianGlassLightBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(4.5f).nonOpaque().requiresTool()
                    .luminance(state -> state.get(ObsidianGlassLightBlock.LIT) ? 15  : 0)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
    return Registry.register(Registry.BLOCK, new Identifier(EccentricsMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(EccentricsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.ECCENTRICSBLOCKS)));
    }

    public static void registerModBlocks() {
        EccentricsMod.LOGGER.debug("Registering ModBlocks for " + EccentricsMod.MOD_ID);
    }
}
