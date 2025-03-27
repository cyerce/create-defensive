package net.aepherastudios.createdefensive.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MorningstarItem extends SwordItem {
    public MorningstarItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        int armorDamage = 3; // Set how much durability to remove
        for (ItemStack armor : pTarget.getArmorSlots()) {
            if (!armor.isEmpty()) {
                armor.hurtAndBreak(armorDamage, pTarget, (entity) -> {
                    entity.broadcastBreakEvent(EquipmentSlot.HEAD);
                    entity.broadcastBreakEvent(EquipmentSlot.CHEST);
                    entity.broadcastBreakEvent(EquipmentSlot.LEGS);
                    entity.broadcastBreakEvent(EquipmentSlot.FEET);
                });
            }
        }        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}

