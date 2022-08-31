package net.frenchbreadev.eccentrics.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModLevitationSwordItem extends SwordItem {
    public ModLevitationSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 5, 1), attacker);
    return super.postHit(stack, target, attacker);

    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("§7This Weapon Inflicts The Effect:"));
            tooltip.add(Text.literal("§cpoison II (0:05)"));
        } else {
            tooltip.add(Text.literal("Press §eSHIFT§r for More Info"));
        }


        super.appendTooltip(stack, world, tooltip, context);
}
}
