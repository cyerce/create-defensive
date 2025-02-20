package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;

public class HalberdItem extends SwordItem {
    public HalberdItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(DefensiveEffects.LACERATION.get(), 200, 0, true, false), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}