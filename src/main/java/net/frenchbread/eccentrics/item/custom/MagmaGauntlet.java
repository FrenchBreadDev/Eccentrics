/*
package net.frenchbread.eccentrics.item.custom;

import net.frenchbread.eccentrics.item.ModItems;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MagmaGauntlet extends Item {
    public MagmaGauntlet(Settings settings) {
        super(settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addVelocity(-0, 1,-0);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 0), attacker);
        target.damage(DamageSource.ON_FIRE, 3);
        target.animateDamage();
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("§6Inflicts Blindness, Fire Damage, and Velocity On Hit"));
        } else {
            tooltip.add(Text.literal("Press §eSHIFT§r For More Information"));

        }
        super.appendTooltip(stack, world, tooltip, context);

    }
    @Override
    public int getItemBarColor(ItemStack stack) {
        float f = Math.max(0.0F, ((float) this.getMaxDamage() - (float) stack.getDamage()) / (float) this.getMaxDamage());
        return MathHelper.hsvToRgb(f / 6.0F, 1.0F, 1.0F);
    }
    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(Items.NETHERITE_INGOT) && stack.isOf(ModItems.NETHERITE_MAGMA_GAUNTLET);
    }
}
*/