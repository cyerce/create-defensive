package net.aepherastudios.createdefensive.worldgen;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.worldgen.config.MeteoriteConfig;
import net.aepherastudios.createdefensive.worldgen.features.MeteoriteFeature;
import net.aepherastudios.createdefensive.worldgen.features.NaturalGasLakeFeature;
import net.aepherastudios.createdefensive.worldgen.features.OilLakeFeature;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registries.FEATURE, CreateDefensive.MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> OIL_LAKE =
            FEATURES.register("oil_lake", () -> new OilLakeFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NATURAL_GAS_LAKE =
            FEATURES.register("natural_gas_lake", () -> new NaturalGasLakeFeature(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<MeteoriteConfig>> METEORITE =
            FEATURES.register("meteorite", () -> new MeteoriteFeature(MeteoriteConfig.CODEC));


    public static final ResourceKey<ConfiguredFeature<?, ?>> OIL_LAKE_KEY = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            new ResourceLocation(CreateDefensive.MOD_ID, "oil_lake")
    );

    public static final ResourceKey<ConfiguredFeature<?, ?>> NATURAL_GAS_LAKE_KEY = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            new ResourceLocation(CreateDefensive.MOD_ID, "natural_gas_lake")
    );

    public static final ResourceKey<ConfiguredFeature<?, ?>> METEORITE_KEY = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            new ResourceLocation(CreateDefensive.MOD_ID, "meteorite")
    );

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        context.register(OIL_LAKE_KEY, new ConfiguredFeature<>(
                OIL_LAKE.get(), NoneFeatureConfiguration.INSTANCE));
        context.register(NATURAL_GAS_LAKE_KEY, new ConfiguredFeature<>(
                NATURAL_GAS_LAKE.get(), NoneFeatureConfiguration.INSTANCE));

        context.register(OIL_LAKE_KEY, new ConfiguredFeature<>(
                OIL_LAKE.get(), NoneFeatureConfiguration.INSTANCE));
        context.register(NATURAL_GAS_LAKE_KEY, new ConfiguredFeature<>(
                NATURAL_GAS_LAKE.get(), NoneFeatureConfiguration.INSTANCE));

        // Example meteorite config
        context.register(METEORITE_KEY, new ConfiguredFeature<>(
                METEORITE.get(),
                new MeteoriteConfig(
                        5, // radius of meteorite
                        1, // middle layer thickness
                        0.5f, // outer shell replacement chance
                        BuiltInRegistries.BLOCK.getHolderOrThrow(DefensiveBlocks.PYRAEN_ORE.getKey()), // core
                        BuiltInRegistries.BLOCK.getHolderOrThrow(DefensiveBlocks.STARDUST_OBSIDIAN_BLUE.getKey()), // middle
                        BuiltInRegistries.BLOCK.getHolderOrThrow(Blocks.OBSIDIAN.builtInRegistryHolder().key()), // outer shell
                        BuiltInRegistries.BLOCK.getHolderOrThrow(DefensiveBlocks.BLEEDING_OBSIDIAN.getKey()), // outer shell possible replacement
                        0.5f, // middle replacement chance
                        BuiltInRegistries.BLOCK.getHolderOrThrow(DefensiveBlocks.STARDUST_OBSIDIAN_YELLOW.getKey()), // middle replacement
                        1024, // min distance from origin
                        2048  // max distance from origin
                )
        ));
    }

}
