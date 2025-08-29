package net.aepherastudios.createdefensive.block.custom;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

public class OilBlock extends LiquidBlock {
    public OilBlock(Supplier<? extends FlowingFluid> fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        super.entityInside(state, level, pos, entity);
        if (!level.isClientSide && entity instanceof LivingEntity living) {
            if (!living.hasEffect(DefensiveEffects.TARRED.get())) {
                living.addEffect(new MobEffectInstance(DefensiveEffects.TARRED.get(), 200, 0, true, true));
            }
        }
    }
}
