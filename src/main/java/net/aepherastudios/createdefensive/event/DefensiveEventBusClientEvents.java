package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.PainiteElementalEntity;
import net.aepherastudios.createdefensive.entity.custom.SuperheatedBlazeEntity;
import net.aepherastudios.createdefensive.entity.model.BulletModel;
import net.aepherastudios.createdefensive.entity.model.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.model.spear.*;
import net.aepherastudios.createdefensive.entity.model.throwingstar.*;
import net.aepherastudios.createdefensive.item.custom.shield.OakShieldModel;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
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
    public static void registerStardustSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.STARDUST_SPEAR_LAYER, StardustSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerPyraenSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.PYRAEN_SPEAR_LAYER, PyraenSpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerAluminumThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ALUMINUM_THROWING_STAR_LAYER, AluminumThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerSilverThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.SILVER_THROWING_STAR_LAYER, SilverThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerPlatinumThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.PLATINUM_THROWING_STAR_LAYER, PlatinumThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerSteelThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.STEEL_THROWING_STAR_LAYER, SteelThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerCopperThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.COPPER_THROWING_STAR_LAYER, CopperThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerZincThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ZINC_THROWING_STAR_LAYER, ZincThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerBrassThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.BRASS_THROWING_STAR_LAYER, BrassThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerRoseQuartzThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ROSE_QUARTZ_THROWING_STAR_LAYER, RoseQuartzThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerWoodenThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.WOODEN_THROWING_STAR_LAYER, WoodenThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerStoneThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.STONE_THROWING_STAR_LAYER, StoneThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerIronThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.IRON_THROWING_STAR_LAYER, IronThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerGoldenThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.GOLDEN_THROWING_STAR_LAYER, GoldenThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerDiamondThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.DIAMOND_THROWING_STAR_LAYER, DiamondThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerNetheriteThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.NETHERITE_THROWING_STAR_LAYER, NetheriteThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerElectrumThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.ELECTRUM_THROWING_STAR_LAYER, ElectrumThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerStardustThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.STARDUST_THROWING_STAR_LAYER, StardustThrowingStarModel::createLayer);
    }
@SubscribeEvent
    public static void registerPyraenThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.PYRAEN_THROWING_STAR_LAYER, PyraenThrowingStarModel::createLayer);
    }

    @SubscribeEvent
    public static void registerOakShieldLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.OAK_SHIELD_LAYER, OakShieldModel::createLayer);
    }

    @SubscribeEvent
    public static void registerBulletLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.BULLET_LAYER, BulletModel::createLayer);
    }



    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(DefensiveEntities.PAINITE_ELEMENTAL.get(), PainiteElementalEntity.createAttributes().build());
        event.put(DefensiveEntities.SUPERHEATED_BLAZE.get(), SuperheatedBlazeEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(DefensiveEntities.PAINITE_ELEMENTAL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                PainiteElementalEntity::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.OR);
        event.register(DefensiveEntities.SUPERHEATED_BLAZE.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                SuperheatedBlazeEntity::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.OR);

    }
}