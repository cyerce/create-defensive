package net.aepherastudios.createdefensive.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class RedstoneArmorEffect extends MobEffect {
    public RedstoneArmorEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level().isClientSide()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 1, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 1, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10, 1, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, 1, false, false, false));
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}