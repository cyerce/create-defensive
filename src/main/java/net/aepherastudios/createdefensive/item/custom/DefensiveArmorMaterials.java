package net.aepherastudios.createdefensive.item.custom;

import com.simibubi.create.AllItems;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum DefensiveArmorMaterials implements ArmorMaterial {
    ALUMINUM("aluminum", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    COPPER("copper", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    SILVER("silver", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    ZINC("zinc", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    BRASS("brass", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    ROSEQUARTZ("rosequartz", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.POLISHED_ROSE_QUARTZ.get())),
    PLATINUM("platinum", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    ELECTRUM("electrum", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    STARDUST("stardust", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    PYRAEN("pyraen", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    STEEL("steel", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    ALUMINUM_POWER("aluminum_power", 30, new int[]{ 2, 5, 4, 2 }, 5,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 1f, () -> Ingredient.of(DefensiveItems.ALUMINUM_POWER_ARMOR_COMPONENTS.get())),
    STEEL_POWER("steel_power", 35, new int[]{ 3, 8, 6, 3 }, 5,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 1f, () -> Ingredient.of(DefensiveItems.STEEL_POWER_ARMOR_COMPONENTS.get())),
    NETHERITE_POWER("netherite_power", 70, new int[]{ 8, 17, 15, 10 }, 5,
            SoundEvents.ARMOR_EQUIP_IRON, 1f, 1f, () -> Ingredient.of(DefensiveItems.NETHERITE_POWER_ARMOR_COMPONENTS.get())),
    GOLD_CEREMONIAL("gold_ceremonial", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    ROSE_GOLD_CEREMONIAL("rose_gold_ceremonial", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    VIOLET_GOLD_CEREMONIAL("violet_gold_ceremonial", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),

    REGAL_ALUMINUM("regal_aluminum", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER("regal_copper", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER("regal_silver", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC("regal_zinc", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS("regal_brass", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM("regal_platinum", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM("regal_electrum", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST("regal_stardust", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN("regal_pyraen", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL("regal_steel", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD("regal_rose_gold", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD("regal_violet_gold", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_WOOD("regal_wood", 5, new int[]{ 1, 2, 3, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ItemTags.PLANKS)),
    REGAL_STONE("regal_stone", 7, new int[]{ 1, 4, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
    REGAL_IRON("regal_iron", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD("regal_gold", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE("regal_netherite", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_EMERALD("regal_aluminum_emerald", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_EMERALD("regal_copper_emerald", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_EMERALD("regal_silver_emerald", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_EMERALD("regal_zinc_emerald", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_EMERALD("regal_brass_emerald", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_EMERALD("regal_platinum_emerald", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_EMERALD("regal_electrum_emerald", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_EMERALD("regal_stardust_emerald", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_EMERALD("regal_pyraen_emerald", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_EMERALD("regal_steel_emerald", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_EMERALD("regal_rose_gold_emerald", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_EMERALD("regal_violet_gold_emerald", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_EMERALD("regal_iron_emerald", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_EMERALD("regal_gold_emerald", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_EMERALD("regal_netherite_emerald", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_LAPIS("regal_aluminum_lapis", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_LAPIS("regal_copper_lapis", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_LAPIS("regal_silver_lapis", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_LAPIS("regal_zinc_lapis", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_LAPIS("regal_brass_lapis", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_LAPIS("regal_platinum_lapis", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_LAPIS("regal_electrum_lapis", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_LAPIS("regal_stardust_lapis", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_LAPIS("regal_pyraen_lapis", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_LAPIS("regal_steel_lapis", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_LAPIS("regal_rose_gold_lapis", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_LAPIS("regal_violet_gold_lapis", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_LAPIS("regal_iron_lapis", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_LAPIS("regal_gold_lapis", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_LAPIS("regal_netherite_lapis", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_DIAMOND("regal_aluminum_diamond", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_DIAMOND("regal_copper_diamond", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_DIAMOND("regal_silver_diamond", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_DIAMOND("regal_zinc_diamond", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_DIAMOND("regal_brass_diamond", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_DIAMOND("regal_platinum_diamond", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_DIAMOND("regal_electrum_diamond", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_DIAMOND("regal_stardust_diamond", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_DIAMOND("regal_pyraen_diamond", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_DIAMOND("regal_steel_diamond", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_DIAMOND("regal_rose_gold_diamond", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_DIAMOND("regal_violet_gold_diamond", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_DIAMOND("regal_iron_diamond", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_DIAMOND("regal_gold_diamond", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_DIAMOND("regal_netherite_diamond", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_QUARTZ("regal_aluminum_quartz", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_QUARTZ("regal_copper_quartz", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_QUARTZ("regal_silver_quartz", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_QUARTZ("regal_zinc_quartz", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_QUARTZ("regal_brass_quartz", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_QUARTZ("regal_platinum_quartz", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_QUARTZ("regal_electrum_quartz", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_QUARTZ("regal_stardust_quartz", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_QUARTZ("regal_pyraen_quartz", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_QUARTZ("regal_steel_quartz", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_QUARTZ("regal_rose_gold_quartz", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_QUARTZ("regal_violet_gold_quartz", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_QUARTZ("regal_iron_quartz", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_QUARTZ("regal_gold_quartz", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_QUARTZ("regal_netherite_quartz", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_AMETHYST("regal_aluminum_amethyst", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_AMETHYST("regal_copper_amethyst", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_AMETHYST("regal_silver_amethyst", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_AMETHYST("regal_zinc_amethyst", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_AMETHYST("regal_brass_amethyst", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_AMETHYST("regal_platinum_amethyst", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_AMETHYST("regal_electrum_amethyst", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_AMETHYST("regal_stardust_amethyst", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_AMETHYST("regal_pyraen_amethyst", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_AMETHYST("regal_steel_amethyst", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_AMETHYST("regal_rose_gold_amethyst", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_AMETHYST("regal_violet_gold_amethyst", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_AMETHYST("regal_iron_amethyst", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_AMETHYST("regal_gold_amethyst", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_AMETHYST("regal_netherite_amethyst", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_REDSTONE("regal_aluminum_redstone", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_REDSTONE("regal_copper_redstone", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_REDSTONE("regal_silver_redstone", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_REDSTONE("regal_zinc_redstone", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_REDSTONE("regal_brass_redstone", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_REDSTONE("regal_platinum_redstone", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_REDSTONE("regal_electrum_redstone", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_REDSTONE("regal_stardust_redstone", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_REDSTONE("regal_pyraen_redstone", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_REDSTONE("regal_steel_redstone", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_REDSTONE("regal_rose_gold_redstone", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_REDSTONE("regal_violet_gold_redstone", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_REDSTONE("regal_iron_redstone", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_REDSTONE("regal_gold_redstone", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_REDSTONE("regal_netherite_redstone", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    REGAL_ALUMINUM_ROSE_QUARTZ("regal_aluminum_rose_quartz", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT.get())),
    REGAL_COPPER_ROSE_QUARTZ("regal_copper_rose_quartz", 10, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    REGAL_SILVER_ROSE_QUARTZ("regal_silver_rose_quartz", 15, new int[]{ 2, 6, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.SILVER_INGOT.get())),
    REGAL_ZINC_ROSE_QUARTZ("regal_zinc_rose_quartz", 15, new int[]{ 2, 5, 4, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(AllItems.ZINC_INGOT.get())),
    REGAL_BRASS_ROSE_QUARTZ("regal_brass_rose_quartz", 30, new int[]{ 2, 7, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(AllItems.BRASS_INGOT.get())),
    REGAL_PLATINUM_ROSE_QUARTZ("regal_platinum_rose_quartz", 35, new int[]{ 3, 8, 6, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT.get())),
    REGAL_ELECTRUM_ROSE_QUARTZ("regal_electrum_rose_quartz", 50, new int[]{ 5, 12, 10, 7 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get())),
    REGAL_STARDUST_ROSE_QUARTZ("regal_stardust_rose_quartz", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT.get())),
    REGAL_PYRAEN_ROSE_QUARTZ("regal_pyraen_rose_quartz", 75, new int[]{ 8, 18, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT.get())),
    REGAL_STEEL_ROSE_QUARTZ("regal_steel_rose_quartz", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.STEEL_INGOT.get())),
    REGAL_ROSE_GOLD_ROSE_QUARTZ("regal_rose_gold_rose_quartz", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    REGAL_VIOLET_GOLD_ROSE_QUARTZ("regal_violet_gold_rose_quartz", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get())),
    REGAL_IRON_ROSE_QUARTZ("regal_iron_rose_quartz", 15, new int[]{ 2, 5, 6, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.IRON_INGOT)),
    REGAL_GOLD_ROSE_QUARTZ("regal_gold_rose_quartz", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    REGAL_NETHERITE_ROSE_QUARTZ("regal_netherite_rose_quartz", 37, new int[]{ 3, 6, 8, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.NETHERITE_INGOT));


    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    DefensiveArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }


    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return CreateDefensive.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
