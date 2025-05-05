package net.aepherastudios.createdefensive.effect;

import com.simibubi.create.AllItems;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class SilverArmorEffect extends MobEffect {
    public SilverArmorEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level().isClientSide()) {
            if (!pLivingEntity.hasEffect(MobEffects.REGENERATION)) {

            } else {
                pLivingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 1, false, false, false));

            }
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}