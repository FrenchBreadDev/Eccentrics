package net.frenchbread.eccentrics.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HealingShard extends Item {
    public HealingShard(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("§cHas a 25% Chance to Grant Regeneration Upon Consumption"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
