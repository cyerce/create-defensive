package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class HalberdItem extends SwordItem {
    public HalberdItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        MobEffectInstance effect = pAttacker.getEffect(DefensiveEffects.HALBERDSFURY.get());
        if (effect !=null){
            int level = effect.getAmplifier();
        }

        pAttacker.addEffect(new MobEffectInstance(DefensiveEffects.HALBERDSFURY.get(), 200, 0), pTarget);
        if (pAttacker.hasEffect(DefensiveEffects.HALBERDSFURY.get())){
            pTarget.hurt(pTarget.damageSources().wither(), 3.0f);
        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Gives Strength after successful strike")
                .withStyle(ChatFormatting.WHITE));

    }
}