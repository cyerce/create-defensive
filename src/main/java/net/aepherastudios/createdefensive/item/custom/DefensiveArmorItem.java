package net.aepherastudios.createdefensive.item.custom;

import com.google.common.collect.ImmutableMap;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.item.DefensiveArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class DefensiveArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(DefensiveArmorMaterials.SILVER, new MobEffectInstance(MobEffects.REGENERATION, 600, 0,
                            false,false, true))
                    .put(DefensiveArmorMaterials.PLATINUM, new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0,
                            false,false, true))
                    .put(DefensiveArmorMaterials.ELECTRUM, new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0,
                            false,false, true))
                    .put(DefensiveArmorMaterials.REDSTONE, new MobEffectInstance(MobEffects.REGENERATION, 600, 1,
                            false,false, true))
                    .put(DefensiveArmorMaterials.ROSE_GOLD, new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2,
                            false,false, true))
                    .put(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1,
                            false,false, true))
                    .put(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1,
                            false,false, true))
                    .put(DefensiveArmorMaterials.GOLD_CEREMONIAL, new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 600, 0,
                            false,false, true))
                    .put(DefensiveArmorMaterials.STEEL, new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1,
                            false,false, true))
                    .put(DefensiveArmorMaterials.ALUMINUM_POWER, new MobEffectInstance(DefensiveEffects.ALUMINUM_POWER.get(), 600, 0,
                            false,false, true))
                    .put(DefensiveArmorMaterials.STEEL_POWER, new MobEffectInstance(DefensiveEffects.STEEL_POWER.get(), 600, 0,
                            false,false, true))
                    .put(DefensiveArmorMaterials.NETHERITE_POWER, new MobEffectInstance(DefensiveEffects.NETHERITE_POWER.get(), 600, 0,
                            false,false, true))
                    .build();

    public DefensiveArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}