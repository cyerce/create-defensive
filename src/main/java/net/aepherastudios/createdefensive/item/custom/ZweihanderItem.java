package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ZweihanderItem extends SwordItem {
    public ZweihanderItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        for (ItemStack armor : pTarget.getArmorSlots()) {
            if (!armor.isEmpty()) {
                armor.hurtAndBreak(1, pTarget, (entity) -> {
                    entity.broadcastBreakEvent(EquipmentSlot.HEAD);
                    entity.broadcastBreakEvent(EquipmentSlot.CHEST);
                    entity.broadcastBreakEvent(EquipmentSlot.LEGS);
                    entity.broadcastBreakEvent(EquipmentSlot.FEET);
                });
            }
        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("Penetrates armor")
                .withStyle(ChatFormatting.WHITE));

    }
}


