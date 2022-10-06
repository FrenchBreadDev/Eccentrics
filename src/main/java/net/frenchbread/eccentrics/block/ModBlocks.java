package net.frenchbread.eccentrics.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbread.eccentrics.EccentricsMod;
import net.frenchbread.eccentrics.block.custom.*;
import net.frenchbread.eccentrics.entity.ModSignTypes;
import net.frenchbread.eccentrics.item.ModItemGroup;
import net.frenchbread.eccentrics.world.feauture.tree.IrrendiumSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ECCENTRIUM_ORE = registerBlock("eccentrium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final Block ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));


    public static final Block RAW_ECCENTRIUM_BLOCK = registerBlock("raw_eccentrium_block",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(6.0f).nonOpaque()));

    public static final Block RAW_ALEXANDRITE_BLOCK = registerBlock("raw_alexandrite_block",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.0f)));

    public static final Block ALEXANDRITE_GEM_BLOCK = registerBlock("alexandrite_gem_block",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.0f)));

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

    public static final Block IRRENDIUM_STEM = registerBlock("irrendium_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).hardness(100.0f).resistance(2400.0f)));

    public static final Block STRIPPED_IRRENDIUM_STEM = registerBlock("stripped_irrendium_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).hardness(100.0f).resistance(2400.0f)));

    public static final Block IRRENDIUM_WOOD = registerBlock("irrendium_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).hardness(100.0f).resistance(2400.0f)));

    public static final Block STRIPPED_IRRENDIUM_WOOD = registerBlock("stripped_irrendium_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).hardness(100.0f).resistance(2400.0f)));

    public static final Block IRRENDIUM_PLANKS = registerBlock("irrendium_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).hardness(100.0f).resistance(2400.0f)));

    public static final Block IRRENDIUM_LEAVES = registerBlock("irrendium_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Block IRRENDIUM_SAPLING = registerBlock("irrendium_sapling",
            new ModSaplingBlock(new IrrendiumSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING), () -> Blocks.END_STONE));


    public static final Block IRRENDIUM_SLAB = registerBlock("irrendium_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).hardness(100.0f).resistance(2400.0f)));

    public static final Block IRRENDIUM_STAIRS = registerBlock("irrendium_stairs",
            new ModStairsBlock(ModBlocks.IRRENDIUM_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).hardness(100.0f).resistance(2400.0f)));

    public static final Block IRRENDIUM_DOOR = registerBlock("irrendium_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .hardness(100.0f).resistance(2400.0f).nonOpaque()));

    public static final Block IRRENDIUM_TRAPDOOR = registerBlock("irrendium_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .hardness(100.0f).resistance(2400.0f).nonOpaque()));

    public static final Block IRRENDIUM_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("irrendium_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.IRRENDIUM));

    public static final Block IRRENDIUM_SIGN_BLOCK = registerBlockWithoutBlockItem("irrendium_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.IRRENDIUM));

    public static final Block IRRENDIUM_BUTTON = registerBlock("irrendium_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f).noCollision()));

    public static final Block IRRENDIUM_PRESSURE_PLATE = registerBlock("irrendium_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)));

/*
    public static final Block END_GRASS_BLOCK = registerBlock("end_grass_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f)));
*/


    public static final Block IRRENDIUM_FENCE = registerBlock("irrendium_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f)));

    public static final Block IRRENDIUM_FENCE_GATE = registerBlock("irrendium_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f)));

    public static final Block RAW_ECCENTRIUM_WALL = registerBlock("raw_eccentrium_wall",
            new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(4.0f)));

    public static final Block HARDENED_ECCENTRIUM_WALL = registerBlock("hardened_eccentrium_wall",
            new WallBlock(FabricBlockSettings.of(Material.GLASS).strength(4.0f)));


    public static final Block DECOY_STONE = registerBlock("decoy_stone",
            new Block(FabricBlockSettings.of(Material.STONE).nonOpaque().noCollision()));

    public static final Block VOID_LILY = registerBlock("void_lily",
            new FlowerBlock(StatusEffects.DARKNESS, 8,
                    FabricBlockSettings.copy(Blocks.DANDELION)));

   /* public static final Block POTTED_VOID_LILY = registerBlockWithoutItem("potted_void_lily",
            new FlowerPotBlock(ModBlocks.VOID_LILY, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(EccentricsMod.MOD_ID, name), block);
    }
*/
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
    return Registry.register(Registry.BLOCK, new Identifier(EccentricsMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
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
