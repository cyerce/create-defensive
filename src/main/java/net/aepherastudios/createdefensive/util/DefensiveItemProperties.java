package net.aepherastudios.createdefensive.util;

import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class DefensiveItemProperties {
    public static void addCustomItemProperties() {
        makeBow(DefensiveItems.ALUMINUM_BOW.get());
        makeBow(DefensiveItems.SILVER_BOW.get());
        makeBow(DefensiveItems.PLATINUM_BOW.get());
        makeBow(DefensiveItems.STEEL_BOW.get());
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
}
