package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.client.*;
import net.aepherastudios.createdefensive.item.shield.OakShieldModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateDefensive.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DefensiveEventBusClientEvents {
    @SubscribeEvent
    public static void registerAluminumSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ALUMINUM_SPEAR_LAYER, AluminumSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerSilverSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.SILVER_SPEAR_LAYER, SilverSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerPlatinumSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.PLATINUM_SPEAR_LAYER, PlatinumSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerSteelSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.STEEL_SPEAR_LAYER, SteelSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerExperienceSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.EXPERIENCE_SPEAR_LAYER, SteelSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerCopperSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.COPPER_SPEAR_LAYER, CopperSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerZincSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ZINC_SPEAR_LAYER, ZincSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerBrassSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.BRASS_SPEAR_LAYER, BrassSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerRoseQuartzSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ROSE_QUARTZ_SPEAR_LAYER, RoseQuartzSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerWoodenSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.WOODEN_SPEAR_LAYER, WoodenSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerStoneSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.STONE_SPEAR_LAYER, StoneSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerIronSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.IRON_SPEAR_LAYER, IronSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerGoldenSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.GOLDEN_SPEAR_LAYER, GoldenSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerDiamondSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.DIAMOND_SPEAR_LAYER, DiamondSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerNetheriteSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.NETHERITE_SPEAR_LAYER, NetheriteSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerElectrumSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ELECTRUM_SPEAR_LAYER, ElectrumSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerRedstoneSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.REDSTONE_SPEAR_LAYER, RedstoneSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerRoseGoldSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ROSE_GOLD_SPEAR_LAYER, RoseGoldSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerOakShieldLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.OAK_SHIELD_LAYER, OakShieldModel::createLayer);
    }
}