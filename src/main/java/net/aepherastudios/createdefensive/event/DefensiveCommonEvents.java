package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.item.custom.*;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yesman.epicfight.world.item.DaggerItem;

@Mod.EventBusSubscriber
public class DefensiveCommonEvents {

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ModBusEvents {

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            LivingEntity victim = event.getEntity();
            Entity aggressor = event.getSource().getEntity();
            float adjustedDamage = event.getAmount();
            if (aggressor!= null){
                double dx = victim.getX() - aggressor.getX();
                double dz = victim.getZ() - aggressor.getZ();
                double distance = Math.sqrt(dx * dx + dz * dz);
                if (distance < 0.001) distance = 0.001;

                if (!(aggressor instanceof LivingEntity attacker)) return;

                if (aggressor instanceof LivingEntity) {
                    ItemStack weapon = attacker.getItemInHand(InteractionHand.MAIN_HAND);

                    if (weapon.getItem() instanceof GreatswordItem || weapon.getItem() instanceof HammerItem) {
                        double strength = 2;
                        victim.push(dx / distance * strength, 0.1, dz / distance * strength);
                        victim.hurtMarked = true;
                    }
                    if (weapon.getItem() instanceof StaffItem) {
                        attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), attacker);
                        attacker.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 1), attacker);
                    }
                    if (weapon.getItem() instanceof ZweihanderItem) {
                        float originalDamage = event.getAmount();

                        int armorValue = victim.getArmorValue();
                        float armorReduction = armorValue * 0.04f;
                        float ignored = armorReduction * 0.5f;

                        adjustedDamage = originalDamage / (1 - (armorReduction - ignored));
                    }
                }
            }
            if (victim.hasEffect(DefensiveEffects.TARRED.get())) {
                String damageType = event.getSource().getMsgId();
                if (isFireDamage(damageType)) {
                    float original = event.getAmount();
                    event.setAmount(original * 2.0f);
                }
            }

            event.setAmount(adjustedDamage);

        }
    }

    private static boolean isFireDamage(String type) {
        return type.equals("in_fire") ||
                type.equals("on_fire") ||
                type.equals("lava") ||
                type.equals("hot_floor") ||
                type.equals("fireball");
    }
}
