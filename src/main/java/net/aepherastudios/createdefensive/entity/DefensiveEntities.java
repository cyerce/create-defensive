package net.aepherastudios.createdefensive.entity;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.*;
import net.aepherastudios.createdefensive.entity.custom.arrow.*;
import net.aepherastudios.createdefensive.entity.custom.spear.*;
import net.aepherastudios.createdefensive.entity.custom.throwingstar.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateDefensive.MOD_ID);

    public static final RegistryObject<EntityType<BulletEntity>> BULLET =
            ENTITY_TYPES.register("bullet", () -> EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_arrow"));

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

    public static final RegistryObject<EntityType<StardustArrowEntity>> STARDUST_ARROW =
            ENTITY_TYPES.register("stardust_arrow", () -> EntityType.Builder.<StardustArrowEntity>of(StardustArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stardust_arrow"));

    public static final RegistryObject<EntityType<PyraenArrowEntity>> PYRAEN_ARROW =
            ENTITY_TYPES.register("pyraen_arrow", () -> EntityType.Builder.<PyraenArrowEntity>of(PyraenArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("pyraen_arrow"));


    public static final RegistryObject<EntityType<AluminumSpear>> ALUMINUM_SPEAR =
            ENTITY_TYPES.register("aluminum_spear", () -> EntityType.Builder.<AluminumSpear>of(AluminumSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_spear"));

    public static final RegistryObject<EntityType<SilverSpear>> SILVER_SPEAR =
            ENTITY_TYPES.register("silver_spear", () -> EntityType.Builder.<SilverSpear>of(SilverSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("silver_spear"));

    public static final RegistryObject<EntityType<PlatinumSpear>> PLATINUM_SPEAR =
            ENTITY_TYPES.register("platinum_spear", () -> EntityType.Builder.<PlatinumSpear>of(PlatinumSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("platinum_spear"));

    public static final RegistryObject<EntityType<SteelSpear>> STEEL_SPEAR =
            ENTITY_TYPES.register("steel_spear", () -> EntityType.Builder.<SteelSpear>of(SteelSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_spear"));

    public static final RegistryObject<EntityType<CopperSpear>> COPPER_SPEAR =
            ENTITY_TYPES.register("copper_spear", () -> EntityType.Builder.<CopperSpear>of(CopperSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("copper_spear"));

    public static final RegistryObject<EntityType<ZincSpear>> ZINC_SPEAR =
            ENTITY_TYPES.register("zinc_spear", () -> EntityType.Builder.<ZincSpear>of(ZincSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("zinc_spear"));

    public static final RegistryObject<EntityType<BrassSpear>> BRASS_SPEAR =
            ENTITY_TYPES.register("brass_spear", () -> EntityType.Builder.<BrassSpear>of(BrassSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("brass_spear"));

    public static final RegistryObject<EntityType<RoseQuartzSpear>> ROSE_QUARTZ_SPEAR =
            ENTITY_TYPES.register("rose_quartz_spear", () -> EntityType.Builder.<RoseQuartzSpear>of(RoseQuartzSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_quartz_spear"));

    public static final RegistryObject<EntityType<WoodenSpear>> WOODEN_SPEAR =
            ENTITY_TYPES.register("wooden_spear", () -> EntityType.Builder.<WoodenSpear>of(WoodenSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("wooden_spear"));

    public static final RegistryObject<EntityType<StoneSpear>> STONE_SPEAR =
            ENTITY_TYPES.register("stone_spear", () -> EntityType.Builder.<StoneSpear>of(StoneSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stone_spear"));

    public static final RegistryObject<EntityType<IronSpear>> IRON_SPEAR =
            ENTITY_TYPES.register("iron_spear", () -> EntityType.Builder.<IronSpear>of(IronSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_spear"));

    public static final RegistryObject<EntityType<GoldenSpear>> GOLDEN_SPEAR =
            ENTITY_TYPES.register("golden_spear", () -> EntityType.Builder.<GoldenSpear>of(GoldenSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("golden_spear"));

    public static final RegistryObject<EntityType<DiamondSpear>> DIAMOND_SPEAR =
            ENTITY_TYPES.register("diamond_spear", () -> EntityType.Builder.<DiamondSpear>of(DiamondSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("diamond_spear"));

    public static final RegistryObject<EntityType<NetheriteSpear>> NETHERITE_SPEAR =
            ENTITY_TYPES.register("netherite_spear", () -> EntityType.Builder.<NetheriteSpear>of(NetheriteSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("netherite_spear"));

    public static final RegistryObject<EntityType<ElectrumSpear>> ELECTRUM_SPEAR =
            ENTITY_TYPES.register("electrum_spear", () -> EntityType.Builder.<ElectrumSpear>of(ElectrumSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("electrum_spear"));

    public static final RegistryObject<EntityType<StardustSpear>> STARDUST_SPEAR =
            ENTITY_TYPES.register("stardust_spear", () -> EntityType.Builder.<StardustSpear>of(StardustSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stardust_spear"));
    
    public static final RegistryObject<EntityType<PyraenSpear>> PYRAEN_SPEAR =
            ENTITY_TYPES.register("pyraen_spear", () -> EntityType.Builder.<PyraenSpear>of(PyraenSpear::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("pyraen_spear"));


    public static final RegistryObject<EntityType<AluminumThrowingStar>> ALUMINUM_THROWING_STAR =
            ENTITY_TYPES.register("aluminum_throwing_star", () -> EntityType.Builder.<AluminumThrowingStar>of(AluminumThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_throwing_star"));

    public static final RegistryObject<EntityType<SilverThrowingStar>> SILVER_THROWING_STAR =
            ENTITY_TYPES.register("silver_throwing_star", () -> EntityType.Builder.<SilverThrowingStar>of(SilverThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("silver_throwing_star"));

    public static final RegistryObject<EntityType<PlatinumThrowingStar>> PLATINUM_THROWING_STAR =
            ENTITY_TYPES.register("platinum_throwing_star", () -> EntityType.Builder.<PlatinumThrowingStar>of(PlatinumThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("platinum_throwing_star"));

    public static final RegistryObject<EntityType<SteelThrowingStar>> STEEL_THROWING_STAR =
            ENTITY_TYPES.register("steel_throwing_star", () -> EntityType.Builder.<SteelThrowingStar>of(SteelThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_throwing_star"));

    public static final RegistryObject<EntityType<CopperThrowingStar>> COPPER_THROWING_STAR =
            ENTITY_TYPES.register("copper_throwing_star", () -> EntityType.Builder.<CopperThrowingStar>of(CopperThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("copper_throwing_star"));

    public static final RegistryObject<EntityType<ZincThrowingStar>> ZINC_THROWING_STAR =
            ENTITY_TYPES.register("zinc_throwing_star", () -> EntityType.Builder.<ZincThrowingStar>of(ZincThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("zinc_throwing_star"));

    public static final RegistryObject<EntityType<BrassThrowingStar>> BRASS_THROWING_STAR =
            ENTITY_TYPES.register("brass_throwing_star", () -> EntityType.Builder.<BrassThrowingStar>of(BrassThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("brass_throwing_star"));

    public static final RegistryObject<EntityType<RoseQuartzThrowingStar>> ROSE_QUARTZ_THROWING_STAR =
            ENTITY_TYPES.register("rose_quartz_throwing_star", () -> EntityType.Builder.<RoseQuartzThrowingStar>of(RoseQuartzThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_quartz_throwing_star"));

    public static final RegistryObject<EntityType<WoodenThrowingStar>> WOODEN_THROWING_STAR =
            ENTITY_TYPES.register("wooden_throwing_star", () -> EntityType.Builder.<WoodenThrowingStar>of(WoodenThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("wooden_throwing_star"));

    public static final RegistryObject<EntityType<StoneThrowingStar>> STONE_THROWING_STAR =
            ENTITY_TYPES.register("stone_throwing_star", () -> EntityType.Builder.<StoneThrowingStar>of(StoneThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stone_throwing_star"));

    public static final RegistryObject<EntityType<IronThrowingStar>> IRON_THROWING_STAR =
            ENTITY_TYPES.register("iron_throwing_star", () -> EntityType.Builder.<IronThrowingStar>of(IronThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_throwing_star"));

    public static final RegistryObject<EntityType<GoldenThrowingStar>> GOLDEN_THROWING_STAR =
            ENTITY_TYPES.register("golden_throwing_star", () -> EntityType.Builder.<GoldenThrowingStar>of(GoldenThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("golden_throwing_star"));

    public static final RegistryObject<EntityType<DiamondThrowingStar>> DIAMOND_THROWING_STAR =
            ENTITY_TYPES.register("diamond_throwing_star", () -> EntityType.Builder.<DiamondThrowingStar>of(DiamondThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("diamond_throwing_star"));

    public static final RegistryObject<EntityType<NetheriteThrowingStar>> NETHERITE_THROWING_STAR =
            ENTITY_TYPES.register("netherite_throwing_star", () -> EntityType.Builder.<NetheriteThrowingStar>of(NetheriteThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("netherite_throwing_star"));

    public static final RegistryObject<EntityType<ElectrumThrowingStar>> ELECTRUM_THROWING_STAR =
            ENTITY_TYPES.register("electrum_throwing_star", () -> EntityType.Builder.<ElectrumThrowingStar>of(ElectrumThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("electrum_throwing_star"));

    public static final RegistryObject<EntityType<StardustThrowingStar>> STARDUST_THROWING_STAR =
            ENTITY_TYPES.register("stardust_throwing_star", () -> EntityType.Builder.<StardustThrowingStar>of(StardustThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stardust_throwing_star"));

    public static final RegistryObject<EntityType<PyraenThrowingStar>> PYRAEN_THROWING_STAR =
            ENTITY_TYPES.register("pyraen_throwing_star", () -> EntityType.Builder.<PyraenThrowingStar>of(PyraenThrowingStar::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("pyraen_throwing_star"));





    public static final RegistryObject<EntityType<PainiteProjectileEntity>> PAINITE_PROJECTILE =
            ENTITY_TYPES.register("painite_projectile", () -> EntityType.Builder.<PainiteProjectileEntity>of(PainiteProjectileEntity::new, MobCategory.MISC)
                    .sized(0.35f, 0.35f).clientTrackingRange(4).updateInterval(10).build("painite_projectile"));

    public static final RegistryObject<EntityType<PainiteElementalEntity>> PAINITE_ELEMENTAL =
            ENTITY_TYPES.register("painite_elemental", () -> EntityType.Builder.of(PainiteElementalEntity::new, MobCategory.MONSTER)
                    .sized(1.2f, 3.6f).fireImmune().clientTrackingRange(8).build("painite_elemental"));

    public static final RegistryObject<EntityType<PrimedHighPowerExplosive>> PRIMED_HIGH_EXPLOSIVE =
            ENTITY_TYPES.register("primed_high_explosive", () -> EntityType.Builder.<PrimedHighPowerExplosive>of(PrimedHighPowerExplosive::new, MobCategory.MISC).fireImmune().sized(0.98F, 0.98F).clientTrackingRange(10).updateInterval(10).build("primed_high_power_explosive"));

    public static final RegistryObject<EntityType<SuperheatedBlazeEntity>> SUPERHEATED_BLAZE =
            ENTITY_TYPES.register("superheated_blaze", () -> EntityType.Builder.of(SuperheatedBlazeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f).fireImmune().clientTrackingRange(8).build("superheated_blaze"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
