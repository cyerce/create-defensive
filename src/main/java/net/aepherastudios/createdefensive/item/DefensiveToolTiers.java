package net.aepherastudios.createdefensive.item;

import com.simibubi.create.AllItems;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.util.DefensiveTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class DefensiveToolTiers {
    public static final Tier ALUMINUM = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6f, 2f, 15,
                    DefensiveTags.Blocks.NEEDS_ALUMINUM_TOOL, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "aluminum"), List.of(Tiers.STONE), List.of());

    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.5f, 2f, 14,
                    DefensiveTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "silver"), List.of(Tiers.STONE), List.of());

    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1800, 9f, 3f, 10,
                    DefensiveTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "platinum"), List.of(Tiers.IRON), List.of());

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1800, 5f, 2f, 15,
                    DefensiveTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "steel"), List.of(Tiers.IRON), List.of());

    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 131, 6f, 2f, 14,
                    DefensiveTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(CreateDefensive.MOD_ID, "copper"), List.of(Tiers.STONE), List.of());

    public static final Tier ZINC = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6f, 2f, 15,
                    DefensiveTags.Blocks.NEEDS_ZINC_TOOL, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "zinc"), List.of(Tiers.STONE), List.of());

    public static final Tier BRASS = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1561, 6f, 4f, 14,
                    DefensiveTags.Blocks.NEEDS_BRASS_TOOL, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "brass"), List.of(Tiers.STONE), List.of());

    public static final Tier ROSE_QUARTZ = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1561, 6f, 4f, 25,
                    DefensiveTags.Blocks.NEEDS_ROSE_QUARTZ_TOOL, () -> Ingredient.of(AllItems.POLISHED_ROSE_QUARTZ.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "rose_quartz"), List.of(Tiers.STONE), List.of());

    public static final Tier ELECTRUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 4062, 10f, 4f, 15,
                    DefensiveTags.Blocks.NEEDS_ELECTRUM_TOOL, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "electrum"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier REDSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 6092, 11f, 4f, 30,
                    DefensiveTags.Blocks.NEEDS_REDSTONE_TOOL, () -> Ingredient.of(DefensiveItems.UNSTABLE_REDSTONE_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "redstone"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ROSE_GOLD = TierSortingRegistry.registerTier(
            new ForgeTier(7, 7310, 12f, 4f, 35,
                    DefensiveTags.Blocks.NEEDS_ROSE_GOLD_TOOL, () -> Ingredient.of(DefensiveItems.UNSTABLE_ROSE_GOLD_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "rose_gold"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier STARDUST = TierSortingRegistry.registerTier(
            new ForgeTier(8, 10000, 13f, 4f, 40,
                    DefensiveTags.Blocks.NEEDS_STARDUST_TOOL, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "stardust"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier CRIMSTEEL = TierSortingRegistry.registerTier(
            new ForgeTier(8, 12500, 14f, 5f, 45,
                    DefensiveTags.Blocks.NEEDS_CRIMSTEEL_TOOL, () -> Ingredient.of(DefensiveItems.CRIMSTEEL_INGOT.get())),
            new ResourceLocation(CreateDefensive.MOD_ID, "crimsteel"), List.of(Tiers.NETHERITE), List.of());

}