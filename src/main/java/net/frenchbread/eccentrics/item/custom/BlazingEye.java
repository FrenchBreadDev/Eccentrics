package net.frenchbread.eccentrics.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlazingEye extends Item {
    public BlazingEye(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity player) {
            if (player.getOffHandStack().isOf(this.asItem())) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 0, 0, true, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, 0, true, false, true));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 0, 0, true, false, true));
            }
        }
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("§7When In Offhand You'll Get:"));
            tooltip.add(Text.literal("§6Night Vision I"));
            tooltip.add(Text.literal("§6Speed I"));
            tooltip.add(Text.literal("§6Fire Resistance I"));
        } else {
            tooltip.add(Text.literal("Press §eSHIFT§r for More Info"));
        }


        super.appendTooltip(stack, world, tooltip, context);

    }
}
