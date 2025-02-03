package net.aepherastudios.createdefensive.item;

import com.simibubi.create.AllItems;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
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
    REDSTONE("redstone", 60, new int[]{ 6, 14, 12, 8 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.UNSTABLE_REDSTONE_INGOT.get())),
    ROSE_GOLD("rose_gold", 65, new int[]{ 7, 16, 14, 9 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.UNSTABLE_ROSE_GOLD_INGOT.get())),
    DEV_NETHERSCALE("dev_netherscale", 70, new int[]{ 8, 17, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    DEV_STARDUST("dev_stardust", 70, new int[]{ 8, 17, 15, 10 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 5f, 0.3f, () -> Ingredient.of(DefensiveItems.UNSTABLE_ROSE_GOLD_INGOT.get())),
    STEEL("steel", 45, new int[]{ 4, 10, 8, 5 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ELECTRUM_INGOT.get())),
    GOLD_CEREMONIAL("gold_ceremonial", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    ROSE_GOLD_CEREMONIAL("rose_gold_ceremonial", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.ROSE_GOLD_INGOT.get())),
    VIOLET_GOLD_CEREMONIAL("violet_gold_ceremonial", 5, new int[]{ 1, 3, 2, 1 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(DefensiveItems.VIOLET_GOLD_INGOT.get()));

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
