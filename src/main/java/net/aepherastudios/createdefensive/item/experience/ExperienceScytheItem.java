package net.aepherastudios.createdefensive.item.experience;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.item.custom.ScytheItem;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class ExperienceScytheItem extends ScytheItem {
    public ExperienceScytheItem(float pAttackDamageModifier, float pAttackSpeedModifier, Tier pTier, TagKey<Block> pBlocks, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, pBlocks, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(DefensiveEffects.CRYSTALLIZED_EXPERIENCE.get(), 200, 0, true, false), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
