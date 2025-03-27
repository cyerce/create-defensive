package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class GreataxeItem extends SwordItem {
    public GreataxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(DefensiveEffects.LACERATION.get(), 200, 0), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}


