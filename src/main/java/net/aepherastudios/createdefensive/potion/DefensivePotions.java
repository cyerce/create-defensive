package net.aepherastudios.createdefensive.potion;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensivePotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, CreateDefensive.MOD_ID);

    public static final RegistryObject<Potion> CRIMSON_POTION = POTIONS.register("crimson_potion",
            () -> new Potion(new MobEffectInstance(DefensiveEffects.LACERATION.get(), 1200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
