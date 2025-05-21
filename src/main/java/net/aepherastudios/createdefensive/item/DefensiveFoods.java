package net.aepherastudios.createdefensive.item;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class DefensiveFoods {
    public static final FoodProperties POWDERED_LEAD = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(DefensiveEffects.LEAD_POISONING.get(), 12000, 1, true, true, true), 1f)
            .build();
    public static final FoodProperties SLAG = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 12000, 6, true, true, true), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 6, true, true, true), 1f)
            .build();
}
