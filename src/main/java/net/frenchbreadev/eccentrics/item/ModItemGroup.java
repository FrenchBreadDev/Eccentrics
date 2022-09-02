package net.frenchbreadev.eccentrics.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.eccentrics.EccentricsMod;
import net.frenchbreadev.eccentrics.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ECCENTRICSBLOCKS = FabricItemGroupBuilder.build(
            new Identifier(EccentricsMod.MOD_ID, "eccentricsblocks"), () -> new ItemStack(ModBlocks.ECCENTRIUM_ORE));
    public static final ItemGroup ECCENTRICSCOMBAT = FabricItemGroupBuilder.build(
            new Identifier(EccentricsMod.MOD_ID, "eccentricscombat"), () -> new ItemStack(ModItems.HARDENED_ECCENTRIUM_CRYSTAL_BLADE));
    public static final ItemGroup ECCENTRICSMISC = FabricItemGroupBuilder.build(
            new Identifier(EccentricsMod.MOD_ID, "eccentricsmisc"), () -> new ItemStack(ModItems.CITADEL_STAR));
    }
