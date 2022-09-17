package net.frenchbread.eccentrics.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EndBoostBlockAmpX2 extends Block {
    public EndBoostBlockAmpX2(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200,15));
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,800 ,1));
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}