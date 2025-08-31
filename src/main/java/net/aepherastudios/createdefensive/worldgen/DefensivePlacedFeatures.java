package net.aepherastudios.createdefensive.worldgen;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class DefensivePlacedFeatures {
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
    public static final ResourceKey<PlacedFeature> OIL_LAKE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CreateDefensive.MOD_ID, "oil_lake_placed"));
    public static final ResourceKey<PlacedFeature> NATURAL_GAS_LAKE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CreateDefensive.MOD_ID, "natural_gas_lake_placed"));

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> oilConfiguredFeature = configuredFeatures.getOrThrow(DefensiveFeatures.OIL_LAKE_KEY);
        Holder<ConfiguredFeature<?, ?>> lmgConfiguredFeature = configuredFeatures.getOrThrow(DefensiveFeatures.NATURAL_GAS_LAKE_KEY);

        register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_ALUMINUM_ORE_KEY),
                DefensiveOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                DefensiveOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(40))));
        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                DefensiveOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                DefensiveOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                DefensiveOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
                DefensiveOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(DefensiveConfiguredFeatures.OVERWORLD_URANIUM_ORE_KEY),
                DefensiveOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));

        PlacementModifier[] modifiers = new PlacementModifier[] {
                RarityFilter.onAverageOnceEvery(250),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(40)),
                BiomeFilter.biome()
        };

//        context.register(OIL_LAKE_PLACED_KEY, new PlacedFeature(oilConfiguredFeature, List.of(modifiers)));
//        context.register(NATURAL_GAS_LAKE_PLACED_KEY, new PlacedFeature(lmgConfiguredFeature, List.of(modifiers)));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CreateDefensive.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}