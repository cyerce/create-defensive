package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class DefensiveCommonEvents {

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ModBusEvents {

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            LivingEntity entity = event.getEntity();
            if (entity.hasEffect(DefensiveEffects.TARRED.get())) {
                String damageType = event.getSource().getMsgId();
                if (isFireDamage(damageType)) {
                    float original = event.getAmount();
                    event.setAmount(original * 2.0f);
                }
            }
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
