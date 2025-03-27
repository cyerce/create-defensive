package net.aepherastudios.createdefensive.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class NetheritePowerEffect extends MobEffect {
    public NetheritePowerEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level().isClientSide()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 3, true, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.JUMP, 10, 3, true, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 10, 3, true, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, 3, true, false, false));
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
