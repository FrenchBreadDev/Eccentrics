package net.frenchbread.eccentrics.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.frenchbread.eccentrics.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
    }
    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.IRRENDIUM_STEM, ModBlocks.STRIPPED_IRRENDIUM_STEM);
        StrippableBlockRegistry.register(ModBlocks.IRRENDIUM_WOOD, ModBlocks.STRIPPED_IRRENDIUM_WOOD);
    }

}