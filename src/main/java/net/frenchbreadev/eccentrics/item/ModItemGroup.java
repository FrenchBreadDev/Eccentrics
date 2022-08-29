package net.frenchbreadev.eccentrics.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.eccentrics.EccentricsMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ECCENTRICS = FabricItemGroupBuilder.build(
            new Identifier(EccentricsMod.MOD_ID, "eccentrics"), () -> new ItemStack(ModItems.RAW_ECCENTRIUM));
    }
