package net.aepherastudios.createdefensive.item.experience;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.item.custom.GreatswordItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class ExperienceHalberdItem extends GreatswordItem {
    public ExperienceHalberdItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(DefensiveEffects.LACERATION.get(), 200, 0, true, false), pAttacker);
        pTarget.addEffect(new MobEffectInstance(DefensiveEffects.CRYSTALLIZED_EXPERIENCE.get(), 200, 0, true, false), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
