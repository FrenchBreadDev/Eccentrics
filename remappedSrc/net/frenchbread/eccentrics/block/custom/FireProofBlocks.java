package net.frenchbread.eccentrics.block.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frenchbread.eccentrics.EccentricsMod;
import net.frenchbread.eccentrics.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FireProofBlocks {

    public static final Block IMPURE_BEDROCK = registerBlock("impure_bedrock",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(600.0f).resistance(9600.0f).requiresTool()));

    public static final Block HEALING_CORE = registerBlock("healing_core",
            new HealingCore(FabricBlockSettings.of(Material.STONE).hardness(400.0f).resistance(1200.0f).requiresTool()));

    public static final Block FRIGID_MAGMA = registerBlock("frigid_magma",
            new FrigidMagma(FabricBlockSettings.of(Material.STONE).hardness(200.0f).resistance(600.0f).requiresTool()));

    public static final Block END_STONE_FLOAT_BLOCK = registerBlock("end_stone_float_block",
            new EndBoostBlock(FabricBlockSettings.of(Material.STONE).nonOpaque().hardness(150.0f).resistance(300.0f).requiresTool()));

    public static final Block END_STONE_FLOAT_BLOCK_AMP_1 = registerBlock("end_stone_float_block_amp_1",
            new EndBoostBlockAmpX1(FabricBlockSettings.of(Material.STONE).nonOpaque().hardness(150.0f).resistance(300.0f).requiresTool()));

    public static final Block END_STONE_FLOAT_BLOCK_AMP_2 = registerBlock("end_stone_float_block_amp_2",
            new EndBoostBlockAmpX2(FabricBlockSettings.of(Material.STONE).nonOpaque().hardness(150.0f).resistance(300.0f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(EccentricsMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(EccentricsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().fireproof().group(ModItemGroup.ECCENTRICSBLOCKS)));
    }

    public static void registerModBlocks() {
        EccentricsMod.LOGGER.debug("Registering  for " + EccentricsMod.MOD_ID);
    }
}
