package net.aepherastudios.createdefensive.effect;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreateDefensive.MOD_ID);

    public static final RegistryObject<MobEffect> SILVER_ARMOR = MOB_EFFECTS.register("silver_armor",
            () -> new SilverArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> PLATINUM_ARMOR = MOB_EFFECTS.register("platinum_armor",
            () -> new PlatinumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> GOLD_ARMOR = MOB_EFFECTS.register("gold_armor",
            () -> new GoldArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> ROSE_GOLD_ARMOR = MOB_EFFECTS.register("rose_gold_armor",
            () -> new RoseGoldArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> VIOLET_GOLD_ARMOR = MOB_EFFECTS.register("violet_gold_armor",
            () -> new VioletGoldArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> ELECTRUM_ARMOR = MOB_EFFECTS.register("electrum_armor",
            () -> new ElectrumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> REDSTONE_ARMOR = MOB_EFFECTS.register("redstone_armor",
            () -> new ElectrumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> UNSTABLE_ROSE_GOLD_ARMOR = MOB_EFFECTS.register("unstable_rose_gold_armor",
            () -> new ElectrumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> STEEL_ARMOR = MOB_EFFECTS.register("steel_armor",
            () -> new SteelArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final RegistryObject<MobEffect> LACERATION = MOB_EFFECTS.register("laceration",
            () -> new LacerationEffect(MobEffectCategory.HARMFUL, 7208960));

    public static final RegistryObject<MobEffect> CRYSTALLIZED_EXPERIENCE = MOB_EFFECTS.register("crystallized_experience",
            () -> new CrystallizedExperienceEffect(MobEffectCategory.HARMFUL, 10551193));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
