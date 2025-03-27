package net.aepherastudios.createdefensive.util;

import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class DefensiveItemProperties {
    public static void addCustomItemProperties() {
        makeBow(DefensiveItems.ALUMINUM_BOW.get());
        makeBow(DefensiveItems.SILVER_BOW.get());
        makeBow(DefensiveItems.PLATINUM_BOW.get());
        makeBow(DefensiveItems.STEEL_BOW.get());
        makeBow(DefensiveItems.EXPERIENCE_BOW.get());
        makeBow(DefensiveItems.COPPER_BOW.get());
        makeBow(DefensiveItems.ZINC_BOW.get());
        makeBow(DefensiveItems.BRASS_BOW.get());
        makeBow(DefensiveItems.ROSE_QUARTZ_BOW.get());
        makeBow(DefensiveItems.WOODEN_BOW.get());
        makeBow(DefensiveItems.STONE_BOW.get());
        makeBow(DefensiveItems.IRON_BOW.get());
        makeBow(DefensiveItems.GOLDEN_BOW.get());
        makeBow(DefensiveItems.DIAMOND_BOW.get());
        makeBow(DefensiveItems.NETHERITE_BOW.get());
        makeBow(DefensiveItems.ELECTRUM_BOW.get());
        makeBow(DefensiveItems.REDSTONE_BOW.get());
        makeBow(DefensiveItems.ROSE_GOLD_BOW.get());

        makeShield(DefensiveItems.OAK_SHIELD.get());

        makeSpear(DefensiveItems.ALUMINUM_SPEAR.get());
        makeSpear(DefensiveItems.SILVER_SPEAR.get());
        makeSpear(DefensiveItems.PLATINUM_SPEAR.get());
        makeSpear(DefensiveItems.STEEL_SPEAR.get());
        makeSpear(DefensiveItems.EXPERIENCE_SPEAR.get());
        makeSpear(DefensiveItems.COPPER_SPEAR.get());
        makeSpear(DefensiveItems.ZINC_SPEAR.get());
        makeSpear(DefensiveItems.BRASS_SPEAR.get());
        makeSpear(DefensiveItems.ROSE_QUARTZ_SPEAR.get());
        makeSpear(DefensiveItems.WOODEN_SPEAR.get());
        makeSpear(DefensiveItems.STONE_SPEAR.get());
        makeSpear(DefensiveItems.IRON_SPEAR.get());
        makeSpear(DefensiveItems.GOLDEN_SPEAR.get());
        makeSpear(DefensiveItems.DIAMOND_SPEAR.get());
        makeSpear(DefensiveItems.NETHERITE_SPEAR.get());
        makeSpear(DefensiveItems.ELECTRUM_SPEAR.get());
        makeSpear(DefensiveItems.REDSTONE_SPEAR.get());
        makeSpear(DefensiveItems.ROSE_GOLD_SPEAR.get());

        makeCrossbow(DefensiveItems.ALUMINUM_CROSSBOW.get());
        makeCrossbow(DefensiveItems.SILVER_CROSSBOW.get());
        makeCrossbow(DefensiveItems.PLATINUM_CROSSBOW.get());
        makeCrossbow(DefensiveItems.STEEL_CROSSBOW.get());
        makeCrossbow(DefensiveItems.COPPER_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ZINC_CROSSBOW.get());
        makeCrossbow(DefensiveItems.BRASS_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ROSE_QUARTZ_CROSSBOW.get());
        makeCrossbow(DefensiveItems.EXPERIENCE_CROSSBOW.get());
        makeCrossbow(DefensiveItems.WOODEN_CROSSBOW.get());
        makeCrossbow(DefensiveItems.STONE_CROSSBOW.get());
        makeCrossbow(DefensiveItems.IRON_CROSSBOW.get());
        makeCrossbow(DefensiveItems.GOLDEN_CROSSBOW.get());
        makeCrossbow(DefensiveItems.DIAMOND_CROSSBOW.get());
        makeCrossbow(DefensiveItems.NETHERITE_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ELECTRUM_CROSSBOW.get());
        makeCrossbow(DefensiveItems.REDSTONE_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ROSE_GOLD_CROSSBOW.get());
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() -
                        p_174637_.getUseItemRemainingTicks()) / 20.0F;
            }
        });

        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }

    private static void makeShield(Item item) {
        ItemProperties.register(item, new ResourceLocation("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });
    }

    private static void makeSpear(Item item) {
        ItemProperties.register(item, new ResourceLocation("throwing"), (p_234996_, p_234997_, p_234998_, p_234999_) -> {
            return p_234998_ != null && p_234998_.isUsingItem() && p_234998_.getUseItem() == p_234996_ ? 1.0F : 0.0F;
        });
    }

    private static void makeCrossbow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174610_, p_174611_, p_174612_, p_174613_) -> {
            if (p_174612_ == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(p_174610_) ? 0.0F : (float)(p_174610_.getUseDuration() - p_174612_.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(p_174610_);
            }
        });
        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174605_, p_174606_, p_174607_, p_174608_) -> {
            return p_174607_ != null && p_174607_.isUsingItem() && p_174607_.getUseItem() == p_174605_ && !CrossbowItem.isCharged(p_174605_) ? 1.0F : 0.0F;
        });
        ItemProperties.register(item, new ResourceLocation("charged"), (p_275891_, p_275892_, p_275893_, p_275894_) -> {
            return CrossbowItem.isCharged(p_275891_) ? 1.0F : 0.0F;
        });
        ItemProperties.register(item, new ResourceLocation("firework"), (p_275887_, p_275888_, p_275889_, p_275890_) -> {
            return CrossbowItem.isCharged(p_275887_) && CrossbowItem.containsChargedProjectile(p_275887_, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F;
        });
    }
}