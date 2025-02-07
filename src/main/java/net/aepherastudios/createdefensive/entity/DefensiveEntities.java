package net.aepherastudios.createdefensive.entity;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateDefensive.MOD_ID);

    public static final RegistryObject<EntityType<AluminumArrowEntity>> ALUMINUM_ARROW =
            ENTITY_TYPES.register("aluminum_arrow", () -> EntityType.Builder.<AluminumArrowEntity>of(AluminumArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_arrow"));

    public static final RegistryObject<EntityType<SilverArrowEntity>> SILVER_ARROW =
            ENTITY_TYPES.register("silver_arrow", () -> EntityType.Builder.<SilverArrowEntity>of(SilverArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("silver_arrow"));

    public static final RegistryObject<EntityType<PlatinumArrowEntity>> PLATINUM_ARROW =
            ENTITY_TYPES.register("platinum_arrow", () -> EntityType.Builder.<PlatinumArrowEntity>of(PlatinumArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("platinum_arrow"));

    public static final RegistryObject<EntityType<SteelArrowEntity>> STEEL_ARROW =
            ENTITY_TYPES.register("steel_arrow", () -> EntityType.Builder.<SteelArrowEntity>of(SteelArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_arrow"));

    public static final RegistryObject<EntityType<CopperArrowEntity>> COPPER_ARROW =
            ENTITY_TYPES.register("copper_arrow", () -> EntityType.Builder.<CopperArrowEntity>of(CopperArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("copper_arrow"));

    public static final RegistryObject<EntityType<ZincArrowEntity>> ZINC_ARROW =
            ENTITY_TYPES.register("zinc_arrow", () -> EntityType.Builder.<ZincArrowEntity>of(ZincArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("zinc_arrow"));

    public static final RegistryObject<EntityType<BrassArrowEntity>> BRASS_ARROW =
            ENTITY_TYPES.register("brass_arrow", () -> EntityType.Builder.<BrassArrowEntity>of(BrassArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("brass_arrow"));

    public static final RegistryObject<EntityType<RoseQuartzArrowEntity>> ROSE_QUARTZ_ARROW =
            ENTITY_TYPES.register("rose_quartz_arrow", () -> EntityType.Builder.<RoseQuartzArrowEntity>of(RoseQuartzArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_quartz_arrow"));

    public static final RegistryObject<EntityType<WoodenArrowEntity>> WOODEN_ARROW =
            ENTITY_TYPES.register("wooden_arrow", () -> EntityType.Builder.<WoodenArrowEntity>of(WoodenArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("wooden_arrow"));

    public static final RegistryObject<EntityType<StoneArrowEntity>> STONE_ARROW =
            ENTITY_TYPES.register("stone_arrow", () -> EntityType.Builder.<StoneArrowEntity>of(StoneArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stone_arrow"));

    public static final RegistryObject<EntityType<IronArrowEntity>> IRON_ARROW =
            ENTITY_TYPES.register("iron_arrow", () -> EntityType.Builder.<IronArrowEntity>of(IronArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_arrow"));

    public static final RegistryObject<EntityType<GoldenArrowEntity>> GOLDEN_ARROW =
            ENTITY_TYPES.register("golden_arrow", () -> EntityType.Builder.<GoldenArrowEntity>of(GoldenArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("golden_arrow"));

    public static final RegistryObject<EntityType<DiamondArrowEntity>> DIAMOND_ARROW =
            ENTITY_TYPES.register("diamond_arrow", () -> EntityType.Builder.<DiamondArrowEntity>of(DiamondArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("diamond_arrow"));

    public static final RegistryObject<EntityType<NetheriteArrowEntity>> NETHERITE_ARROW =
            ENTITY_TYPES.register("netherite_arrow", () -> EntityType.Builder.<NetheriteArrowEntity>of(NetheriteArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("netherite_arrow"));

    public static final RegistryObject<EntityType<ElectrumArrowEntity>> ELECTRUM_ARROW =
            ENTITY_TYPES.register("electrum_arrow", () -> EntityType.Builder.<ElectrumArrowEntity>of(ElectrumArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("electrum_arrow"));

    public static final RegistryObject<EntityType<RedstoneArrowEntity>> REDSTONE_ARROW =
            ENTITY_TYPES.register("redstone_arrow", () -> EntityType.Builder.<RedstoneArrowEntity>of(RedstoneArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("redstone_arrow"));

    public static final RegistryObject<EntityType<RoseGoldArrowEntity>> ROSE_GOLD_ARROW =
            ENTITY_TYPES.register("rose_gold_arrow", () -> EntityType.Builder.<RoseGoldArrowEntity>of(RoseGoldArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_gold_arrow"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
