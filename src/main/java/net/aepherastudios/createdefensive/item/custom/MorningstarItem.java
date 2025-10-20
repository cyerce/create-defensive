package net.aepherastudios.createdefensive.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

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

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Damages enemy armor substantially")
                .withStyle(ChatFormatting.WHITE));

    }
}

