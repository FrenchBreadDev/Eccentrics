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
            new Block(FabricBlockSettings.of(Material.STONE).hardness(200.0f).resistance(4800.0f).requiresTool()));

    public static final Block HEALING_CORE = registerBlock("healing_core",
            new HealingCore(FabricBlockSettings.of(Material.STONE).hardness(400.0f).resistance(1200.0f).requiresTool()));
    
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
