package net.frenchbread.eccentrics.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EndBoostBlock extends Block {
    public EndBoostBlock(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
           livingEntity.addVelocity(0,2,0);
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,200 ,1));
        }

        super.onSteppedOn(world, pos, state, entity);

    }
}