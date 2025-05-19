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
}
