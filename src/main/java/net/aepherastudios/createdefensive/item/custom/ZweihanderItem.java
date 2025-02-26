package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ZweihanderItem extends SwordItem {
    public ZweihanderItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        int armorDamage = 3;
        for (ItemStack armor : pTarget.getArmorSlots()) {
            if (!armor.isEmpty()) {
                armor.hurtAndBreak(armorDamage, pTarget, (entity) -> {
                    entity.broadcastBreakEvent(EquipmentSlot.HEAD);
                    entity.broadcastBreakEvent(EquipmentSlot.CHEST);
                    entity.broadcastBreakEvent(EquipmentSlot.LEGS);
                    entity.broadcastBreakEvent(EquipmentSlot.FEET);
                });
            }
        }
        pTarget.addEffect(new MobEffectInstance(DefensiveEffects.LACERATION.get(), 200, 0, true, false), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}


