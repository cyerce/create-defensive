package net.aepherastudios.createdefensive.item;

import com.simibubi.create.content.equipment.sandPaper.SandPaperItem;
import com.simibubi.create.content.materials.ExperienceNuggetItem;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.item.arrow.*;
import net.aepherastudios.createdefensive.item.augments.*;
import net.aepherastudios.createdefensive.item.custom.*;
import net.aepherastudios.createdefensive.item.experience.*;
import net.aepherastudios.createdefensive.item.gloves.IronGloveItem;
import net.aepherastudios.createdefensive.item.shield.OakShieldItem;
import net.aepherastudios.createdefensive.item.spear.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateDefensive.MOD_ID);

    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_WIRE = ITEMS.register("zinc_wire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_WIRE = ITEMS.register("silver_wire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_WIRE = ITEMS.register("gold_wire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_SHEET = ITEMS.register("aluminum_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHEET = ITEMS.register("silver_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIOLET_GOLD_INGOT = ITEMS.register("violet_gold_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_SHEET = ITEMS.register("electrum_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGIZED_ELECTRUM_INGOT = ITEMS.register("energized_electrum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUNSTEEL_INGOT = ITEMS.register("gunsteel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STABALLOY_INGOT = ITEMS.register("staballoy_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGIZED_ROSE_QUARTZ = ITEMS.register("energized_rose_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNSTABLE_REDSTONE_INGOT = ITEMS.register("unstable_redstone_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_REDSTONE_INGOT = ITEMS.register("incomplete_redstone_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNSTABLE_ROSE_GOLD_INGOT = ITEMS.register("unstable_rose_gold_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEAPON_HANDLE = ITEMS.register("weapon_handle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_CIRCUIT = ITEMS.register("basic_circuit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_circuit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIO_TRANSMITTER = ITEMS.register("radio_transmitter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_BASIC_CIRCUIT = ITEMS.register("incomplete_basic_circuit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_ADVANCED_CIRCUIT = ITEMS.register("incomplete_advanced_circuit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ROD = ITEMS.register("zinc_rod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_ROD = ITEMS.register("steel_rod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_CAM = ITEMS.register("aluminum_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SHEET = ITEMS.register("zinc_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SHEET = ITEMS.register("netherite_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CAM = ITEMS.register("steel_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CAM = ITEMS.register("copper_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_CAM = ITEMS.register("zinc_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_CAM = ITEMS.register("brass_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_CAM = ITEMS.register("rose_quartz_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_CAM = ITEMS.register("wooden_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_CAM = ITEMS.register("stone_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_CAM = ITEMS.register("iron_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_CAM = ITEMS.register("golden_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_CAM = ITEMS.register("diamond_cam", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_STARDUST = ITEMS.register("yellow_stardust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_STARDUST = ITEMS.register("blue_stardust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARDUST_INGOT = ITEMS.register("stardust_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_ESSENCE = ITEMS.register("crimson_essence", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSTEEL_INGOT = ITEMS.register("crimsteel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAINITE = ITEMS.register("painite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGIZED_PAINITE = ITEMS.register("energized_painite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_POWER_ARMOR_COMPONENTS = ITEMS.register("aluminum_power_armor_components", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_POWER_ARMOR_COMPONENTS = ITEMS.register("steel_power_armor_components", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_POWER_ARMOR_COMPONENTS = ITEMS.register("netherite_power_armor_components", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_ALUMINUM_POWER_ARMOR_COMPONENTS = ITEMS.register("incomplete_aluminum_power_armor_components", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_STEEL_POWER_ARMOR_COMPONENTS = ITEMS.register("incomplete_steel_power_armor_components", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_NETHERITE_POWER_ARMOR_COMPONENTS = ITEMS.register("incomplete_netherite_power_armor_components", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_POWER_CORE = ITEMS.register("basic_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_BASIC_POWER_CORE = ITEMS.register("incomplete_basic_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCHARGED_BASIC_POWER_CORE = ITEMS.register("uncharged_basic_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWER_CORE = ITEMS.register("power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_POWER_CORE = ITEMS.register("incomplete_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCHARGED_POWER_CORE = ITEMS.register("uncharged_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_POWER_CORE = ITEMS.register("advanced_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_ADVANCED_POWER_CORE = ITEMS.register("incomplete_advanced_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCHARGED_ADVANCED_POWER_CORE = ITEMS.register("uncharged_advanced_power_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNING_CORE = ITEMS.register("lightning_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_LIGHTNING_CORE = ITEMS.register("incomplete_lightning_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCHARGED_LIGHTNING_CORE = ITEMS.register("uncharged_lightning_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAG = ITEMS.register("slag", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_IRON = ITEMS.register("powdered_iron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_STEEL = ITEMS.register("powdered_steel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_LEAD = ITEMS.register("powdered_lead", () -> new Item(new Item.Properties().food(DefensiveFoods.POWDERED_LEAD)));
    public static final RegistryObject<Item> CALCITE_SHARD = ITEMS.register("calcite_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSITE_SHARD = ITEMS.register("crimsite_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASURINE_SHARD = ITEMS.register("asurine_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VERIDIUM_SHARD = ITEMS.register("veridium_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OCHRUM_SHARD = ITEMS.register("ochrum_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORIA_SHARD = ITEMS.register("scoria_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORCHIA_SHARD = ITEMS.register("scorchia_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_ANCIENT_DEBRIS = ITEMS.register("crushed_ancient_debris", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_CRYSTAL = ITEMS.register("redstone_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INERT_REDSTONE_CRYSTAL = ITEMS.register("inert_redstone_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_CRYSTAL_CLUSTER = ITEMS.register("redstone_crystal_cluster", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_CAPACITOR = ITEMS.register("redstone_capacitor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_CRYSTAL = ITEMS.register("experience_crystal", () -> new ExperienceNuggetItem(new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_INGOT = ITEMS.register("experience_ingot", () -> new ExperienceNuggetItem(new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_CRYSTAL_CLUSTER = ITEMS.register("experience_crystal_cluster", () -> new ExperienceNuggetItem(new Item.Properties()));

    public static final RegistryObject<Item> VAULT_MODULE = ITEMS.register("vault_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANK_MODULE = ITEMS.register("tank_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BATTERY_MODULE = ITEMS.register("battery_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THERMAL_PLATING_MODULE = ITEMS.register("thermal_plating_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIERCE_PLATING_MODULE = ITEMS.register("pierce_plating_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLAST_PLATING_MODULE = ITEMS.register("blast_plating_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPIKES_MODULE = ITEMS.register("spikes_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BATTERY_EFFICIENCY_MODULE = ITEMS.register("battery_efficiency_module", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPEED_MODULE = ITEMS.register("speed_module", () -> new SpeedBoostAugmentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FIRE_RESISTANCE_MODULE = ITEMS.register("fire_resistance_module", () -> new FireResistanceAugmentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JUMP_BOOST_MODULE = ITEMS.register("jump_boost_module", () -> new JumpAugmentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NIGHT_VISION_MODULE = ITEMS.register("night_vision_module", () -> new NightVisionAugmentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ARMOR_PLATING_MODULE = ITEMS.register("armor_plating_module", () -> new ResistanceAugmentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RESPIRATION_MODULE = ITEMS.register("respiration_module", () -> new RespirationAugmentItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STRENGTH_MODULE = ITEMS.register("strength_module", () -> new StrengthAugmentItem(new Item.Properties().stacksTo(1)));





    public static final RegistryObject<Item> RESPIRATOR_MODULE = ITEMS.register("respirator_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> XRAY_MODULE = ITEMS.register("xray_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_XRAY_MODULE = ITEMS.register("advanced_xray_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AUTOFEED_MODULE = ITEMS.register("autofeed_module", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEAVY_PISTONS_MODULE = ITEMS.register("heavy_pistons_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROPE_MODULE = ITEMS.register("rope_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXTENDO_GRIP_MODULE = ITEMS.register("extendo_grip_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HASTE_MODULE = ITEMS.register("haste_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_MODULE = ITEMS.register("totem_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_TOTEM_MODULE = ITEMS.register("advanced_totem_module", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENERGY_SHIELD_MODULE = ITEMS.register("energy_shield_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELYTRA_MODULE = ITEMS.register("elytra_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JETPACK_MODULE = ITEMS.register("jetpack_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JET_MODULE = ITEMS.register("jet_module", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILENT_FITTINGS_MODULE = ITEMS.register("silent_fittings_module", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PADDED_BOOTS_MODULE = ITEMS.register("padded_boots_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLIPPERS_MODULE = ITEMS.register("flippers_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_ACCELERATOR_MODULES = ITEMS.register("soul_accelerator_module", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FREEZING_MODULE = ITEMS.register("freezing_module", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PISTOL = ITEMS.register("pistol", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIFLE = ITEMS.register("rifle", () -> new RifleItem(new Item.Properties()));
    public static final RegistryObject<Item> SHOTGUN = ITEMS.register("shotgun", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUNPOWDER_PINCH = ITEMS.register("gunpowder_pinch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_BULLET = ITEMS.register("small_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_BULLET_TIP = ITEMS.register("small_bullet_tip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_BULLET = ITEMS.register("large_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_BULLET_TIP = ITEMS.register("large_bullet_tip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKSHOT = ITEMS.register("buckshot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHOTGUN_SHELL = ITEMS.register("shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BULLET_CASING = ITEMS.register("bullet_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_BULLET_TIP_DIE = ITEMS.register("small_bullet_tip_die", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_BULLET_TIP_DIE = ITEMS.register("large_bullet_tip_die", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BULLET_CASING_DIE = ITEMS.register("bullet_casing_die", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEATED_LEAD_INGOT = ITEMS.register("heated_lead_ingot", () -> new HotIngotItem(new Item.Properties()));
    public static final RegistryObject<Item> HEATED_BRASS_INGOT = ITEMS.register("heated_brass_ingot", () -> new HotIngotItem(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIOLET_GOLD_NUGGET = ITEMS.register("violet_gold_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUNSTEEL_NUGGET = ITEMS.register("gunsteel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STABALLOY_NUGGET = ITEMS.register("staballoy_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("silver_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("platinum_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("electrum_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("redstone_upgrade_smithing_template", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("rose_gold_upgrade_smithing_template", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> EXPERIENCE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("experience_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARDUST_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("stardust_upgrade_smithing_template", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POWDERED_RAW_IRON = ITEMS.register("powdered_raw_iron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_GOLD = ITEMS.register("powdered_raw_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_COPPER = ITEMS.register("powdered_raw_copper", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_ZINC = ITEMS.register("powdered_raw_zinc", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_ALUMINUM = ITEMS.register("powdered_raw_aluminum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_SILVER = ITEMS.register("powdered_raw_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_PLATINUM = ITEMS.register("powdered_raw_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_LEAD = ITEMS.register("powdered_raw_lead", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_TIN = ITEMS.register("powdered_raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_NICKEL = ITEMS.register("powdered_raw_nickel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RAW_URANIUM = ITEMS.register("powdered_raw_uranium", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KINETIC_MECHANISM = ITEMS.register("kinetic_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_MECHANISM = ITEMS.register("redstone_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HYDRAULIC_MECHANISM = ITEMS.register("hydraulic_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOGISTIC_MECHANISM = ITEMS.register("logistic_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPUTATION_MECHANISM = ITEMS.register("computation_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADAR_MECHANISM = ITEMS.register("radar_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_KINETIC_MECHANISM = ITEMS.register("incomplete_kinetic_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_REDSTONE_MECHANISM = ITEMS.register("incomplete_redstone_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_HYDRAULIC_MECHANISM = ITEMS.register("incomplete_hydraulic_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_LOGISTIC_MECHANISM = ITEMS.register("incomplete_logistic_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COMPUTATION_MECHANISM = ITEMS.register("incomplete_computation_mechanism", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_RADAR_MECHANISM = ITEMS.register("incomplete_radar_mechanism", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_NUT = ITEMS.register("copper_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> SILVER_NUT = ITEMS.register("silver_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GOLD_NUT = ITEMS.register("gold_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ELECTRUM_NUT = ITEMS.register("electrum_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> PLATINUM_NUT = ITEMS.register("platinum_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> POLISHED_AMETHYST = ITEMS.register("polished_amethyst", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_QUARTZ_ROD = ITEMS.register("rose_quartz_rod", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_GRIT_SANDPAPER = ITEMS.register("iron_grit_sandpaper", () -> new SandPaperItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> STEEL_GRIT_SANDPAPER = ITEMS.register("steel_grit_sandpaper", () -> new SandPaperItem(new Item.Properties().durability(128)));

    public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ZINC_HELMET = ITEMS.register("zinc_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_CHESTPLATE = ITEMS.register("zinc_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_LEGGINGS = ITEMS.register("zinc_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_BOOTS = ITEMS.register("zinc_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BRASS_HELMET = ITEMS.register("brass_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_LEGGINGS = ITEMS.register("brass_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_BOOTS = ITEMS.register("brass_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_CEREMONIAL_HELMET = ITEMS.register("rose_gold_ceremonial_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_CEREMONIAL_CHESTPLATE = ITEMS.register("rose_gold_ceremonial_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_CEREMONIAL_LEGGINGS = ITEMS.register("rose_gold_ceremonial_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_CEREMONIAL_BOOTS = ITEMS.register("rose_gold_ceremonial_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> VIOLET_GOLD_CEREMONIAL_HELMET = ITEMS.register("violet_gold_ceremonial_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> VIOLET_GOLD_CEREMONIAL_CHESTPLATE = ITEMS.register("violet_gold_ceremonial_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> VIOLET_GOLD_CEREMONIAL_LEGGINGS = ITEMS.register("violet_gold_ceremonial_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> VIOLET_GOLD_CEREMONIAL_BOOTS = ITEMS.register("violet_gold_ceremonial_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_QUARTZ_HELMET = ITEMS.register("rose_quartz_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_CHESTPLATE = ITEMS.register("rose_quartz_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_LEGGINGS = ITEMS.register("rose_quartz_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_BOOTS = ITEMS.register("rose_quartz_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ELECTRUM_HELMET = ITEMS.register("electrum_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_BOOTS = ITEMS.register("electrum_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.REDSTONE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.REDSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.REDSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.REDSTONE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> STARDUST_HELMET = ITEMS.register("stardust_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.DEV_STARDUST, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> STARDUST_CHESTPLATE = ITEMS.register("stardust_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.DEV_STARDUST, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> STARDUST_LEGGINGS = ITEMS.register("stardust_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.DEV_STARDUST, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> STARDUST_BOOTS = ITEMS.register("stardust_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.DEV_STARDUST, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> EXPERIENCE_HELMET = ITEMS.register("experience_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.EXPERIENCE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_CHESTPLATE = ITEMS.register("experience_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.EXPERIENCE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_LEGGINGS = ITEMS.register("experience_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.EXPERIENCE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_BOOTS = ITEMS.register("experience_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.EXPERIENCE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DEV_CHARGER = ITEMS.register("dev_charger", () -> new DevChargerItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> POWER_ARMOR_TERMINAL = ITEMS.register("power_armor_terminal", () -> new ArmorOpenerItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ALUMINUM_POWER_HELMET = ITEMS.register("aluminum_power_helmet",
            () -> new AluminumPowerArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ALUMINUM_POWER_CHESTPLATE = ITEMS.register("aluminum_power_chestplate",
            () -> new AluminumPowerArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ALUMINUM_POWER_LEGGINGS = ITEMS.register("aluminum_power_leggings",
            () -> new AluminumPowerArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ALUMINUM_POWER_BOOTS = ITEMS.register("aluminum_power_boots",
            () -> new AluminumPowerArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STEEL_POWER_HELMET = ITEMS.register("steel_power_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STEEL_POWER_CHESTPLATE = ITEMS.register("steel_power_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STEEL_POWER_LEGGINGS = ITEMS.register("steel_power_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> STEEL_POWER_BOOTS = ITEMS.register("steel_power_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> NETHERITE_POWER_HELMET = ITEMS.register("netherite_power_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NETHERITE_POWER_CHESTPLATE = ITEMS.register("netherite_power_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NETHERITE_POWER_LEGGINGS = ITEMS.register("netherite_power_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NETHERITE_POWER_BOOTS = ITEMS.register("netherite_power_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> GOLD_CEREMONIAL_HELMET = ITEMS.register("gold_ceremonial_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_CEREMONIAL_CHESTPLATE = ITEMS.register("gold_ceremonial_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_CEREMONIAL_LEGGINGS = ITEMS.register("gold_ceremonial_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_CEREMONIAL_BOOTS = ITEMS.register("gold_ceremonial_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword",
            () -> new SwordItem(DefensiveToolTiers.ALUMINUM, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ALUMINUM, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe",
            () -> new AxeItem(DefensiveToolTiers.ALUMINUM, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ALUMINUM, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe",
            () -> new HoeItem(DefensiveToolTiers.ALUMINUM, -2, -1.6f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_HALBERD = ITEMS.register("aluminum_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ALUMINUM, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_POLEAXE = ITEMS.register("aluminum_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ALUMINUM, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_SCYTHE = ITEMS.register("aluminum_scythe",
            () -> new ScytheItem(4, -2.7f, DefensiveToolTiers.ALUMINUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ALUMINUM_M0RNINGSTAR = ITEMS.register("aluminum_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ALUMINUM, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_GREATAXE = ITEMS.register("aluminum_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ALUMINUM, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_GREATSWORD = ITEMS.register("aluminum_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ALUMINUM, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_HAMMER = ITEMS.register("aluminum_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.ALUMINUM, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ALUMINUM_EXCAVATOR = ITEMS.register("aluminum_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.ALUMINUM, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ALUMINUM_SPEAR = ITEMS.register("aluminum_spear",
            () -> new AluminumSpearItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> ALUMINUM_GLAIVE = ITEMS.register("aluminum_glaive",
            () -> new SwordItem(DefensiveToolTiers.ALUMINUM, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_DAGGER = ITEMS.register("aluminum_dagger",
            () -> new SwordItem(DefensiveToolTiers.ALUMINUM, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_STAFF = ITEMS.register("aluminum_staff",
            () -> new SwordItem(DefensiveToolTiers.ALUMINUM, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_BOW = ITEMS.register("aluminum_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(384)));
    public static final RegistryObject<Item> ALUMINUM_CROSSBOW = ITEMS.register("aluminum_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(DefensiveToolTiers.SILVER, 3, -2f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.SILVER, 0, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(DefensiveToolTiers.SILVER, 6, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(DefensiveToolTiers.SILVER, 0.5f, -2.6f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(DefensiveToolTiers.SILVER, -2, -1.6f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HALBERD = ITEMS.register("silver_halberd",
            () -> new HalberdItem(DefensiveToolTiers.SILVER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_POLEAXE = ITEMS.register("silver_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.SILVER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SCYTHE = ITEMS.register("silver_scythe",
            () -> new ScytheItem(4, -2.7f, DefensiveToolTiers.SILVER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_MORNINGSTAR = ITEMS.register("silver_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.SILVER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_GREATAXE = ITEMS.register("silver_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.SILVER, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_GREATSWORD = ITEMS.register("silver_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.SILVER, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HAMMER = ITEMS.register("silver_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.SILVER, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> SILVER_EXCAVATOR = ITEMS.register("silver_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.SILVER, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> SILVER_SPEAR = ITEMS.register("silver_spear",
            () -> new SilverSpearItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> SILVER_GLAIVE = ITEMS.register("silver_glaive",
            () -> new SwordItem(DefensiveToolTiers.SILVER, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DAGGER = ITEMS.register("silver_dagger",
            () -> new SwordItem(DefensiveToolTiers.SILVER, 0, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_STAFF = ITEMS.register("silver_staff",
            () -> new SwordItem(DefensiveToolTiers.SILVER, 0, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOW = ITEMS.register("silver_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(384)));
    public static final RegistryObject<Item> SILVER_CROSSBOW = ITEMS.register("silver_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(DefensiveToolTiers.PLATINUM, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.PLATINUM, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(DefensiveToolTiers.PLATINUM, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(DefensiveToolTiers.PLATINUM, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(DefensiveToolTiers.PLATINUM, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HALBERD = ITEMS.register("platinum_halberd",
            () -> new HalberdItem(DefensiveToolTiers.PLATINUM, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_POLEAXE = ITEMS.register("platinum_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.PLATINUM, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SCYTHE = ITEMS.register("platinum_scythe",
            () -> new ScytheItem(6, -2.7f, DefensiveToolTiers.PLATINUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> PLATINUM_MORNINGSTAR = ITEMS.register("platinum_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.PLATINUM, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_GREATAXE = ITEMS.register("platinum_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.PLATINUM, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_GREATSWORD = ITEMS.register("platinum_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.PLATINUM, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HAMMER = ITEMS.register("platinum_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.PLATINUM, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> PLATINUM_EXCAVATOR = ITEMS.register("platinum_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.PLATINUM, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> PLATINUM_SPEAR = ITEMS.register("platinum_spear",
            () -> new PlatinumSpearItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> PLATINUM_GLAIVE = ITEMS.register("platinum_glaive",
            () -> new SwordItem(DefensiveToolTiers.PLATINUM, 4, -2f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_DAGGER = ITEMS.register("platinum_dagger",
            () -> new SwordItem(DefensiveToolTiers.PLATINUM, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_STAFF = ITEMS.register("platinum_staff",
            () -> new SwordItem(DefensiveToolTiers.PLATINUM, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOW = ITEMS.register("platinum_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(1800)));
    public static final RegistryObject<Item> PLATINUM_CROSSBOW = ITEMS.register("platinum_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(1800)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(DefensiveToolTiers.STEEL, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.STEEL, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(DefensiveToolTiers.STEEL, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(DefensiveToolTiers.STEEL, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(DefensiveToolTiers.STEEL, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HALBERD = ITEMS.register("steel_halberd",
            () -> new HalberdItem(DefensiveToolTiers.STEEL, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_POLEAXE = ITEMS.register("steel_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.STEEL, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SCYTHE = ITEMS.register("steel_scythe",
            () -> new ScytheItem(6, -2.7f, DefensiveToolTiers.STEEL, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> STEEL_MORNINGSTAR = ITEMS.register("steel_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.STEEL, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_GREATAXE = ITEMS.register("steel_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.STEEL, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_GREATSWORD = ITEMS.register("steel_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.STEEL, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register("steel_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.STEEL, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> STEEL_EXCAVATOR = ITEMS.register("steel_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.STEEL, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> STEEL_SPEAR = ITEMS.register("steel_spear",
            () -> new SteelSpearItem(new Item.Properties().durability(1800)));
    public static final RegistryObject<Item> STEEL_GLAIVE = ITEMS.register("steel_glaive",
            () -> new SwordItem(DefensiveToolTiers.STEEL, 4, -2f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register("steel_dagger",
            () -> new SwordItem(DefensiveToolTiers.STEEL, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_STAFF = ITEMS.register("steel_staff",
            () -> new SwordItem(DefensiveToolTiers.STEEL, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOW = ITEMS.register("steel_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(2765)));
    public static final RegistryObject<Item> STEEL_CROSSBOW = ITEMS.register("steel_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(2765)));

    public static final RegistryObject<Item> EXPERIENCE_SWORD = ITEMS.register("experience_sword",
            () -> new ExperienceSwordItem(DefensiveToolTiers.EXPERIENCE, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_PICKAXE = ITEMS.register("experience_pickaxe",
            () -> new ExperiencePickaxeItem(DefensiveToolTiers.EXPERIENCE, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_AXE = ITEMS.register("experience_axe",
            () -> new ExperienceAxeItem(DefensiveToolTiers.EXPERIENCE, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_SHOVEL = ITEMS.register("experience_shovel",
            () -> new ExperienceShovelItem(DefensiveToolTiers.EXPERIENCE, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_HOE = ITEMS.register("experience_hoe",
            () -> new ExperienceHoeItem(DefensiveToolTiers.EXPERIENCE, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_HALBERD = ITEMS.register("experience_halberd",
            () -> new ExperienceHalberdItem(DefensiveToolTiers.EXPERIENCE, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_POLEAXE = ITEMS.register("experience_poleaxe",
            () -> new ExperienceHalberdItem(DefensiveToolTiers.EXPERIENCE, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_SCYTHE = ITEMS.register("experience_scythe",
            () -> new ExperienceScytheItem(6, -2.7f, DefensiveToolTiers.EXPERIENCE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> EXPERIENCE_MORNINGSTAR = ITEMS.register("experience_morningstar",
            () -> new ExperienceMorningstarItem(DefensiveToolTiers.EXPERIENCE, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_GREATAXE = ITEMS.register("experience_greataxe",
            () -> new ExperienceGreataxeItem(DefensiveToolTiers.EXPERIENCE, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_GREATSWORD = ITEMS.register("experience_greatsword",
            () -> new ExperienceGreatswordItem(DefensiveToolTiers.EXPERIENCE, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_HAMMER = ITEMS.register("experience_hammer",
            () -> new ExperienceHammerItem(12, -3.7f, DefensiveToolTiers.EXPERIENCE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> EXPERIENCE_EXCAVATOR = ITEMS.register("experience_excavator",
            () -> new ExperienceExcavatorItem(0.5f, -3f, DefensiveToolTiers.EXPERIENCE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(7200)));
    public static final RegistryObject<Item> EXPERIENCE_SPEAR = ITEMS.register("experience_spear",
            () -> new ExperienceSpearItem(new Item.Properties().durability(1800)));
    public static final RegistryObject<Item> EXPERIENCE_GLAIVE = ITEMS.register("experience_glaive",
            () -> new ExperienceSwordItem(DefensiveToolTiers.EXPERIENCE, 4, -2f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_DAGGER = ITEMS.register("experience_dagger",
            () -> new ExperienceSwordItem(DefensiveToolTiers.EXPERIENCE, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_STAFF = ITEMS.register("experience_staff",
            () -> new ExperienceSwordItem(DefensiveToolTiers.EXPERIENCE, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCE_BOW = ITEMS.register("experience_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(2765)));
    public static final RegistryObject<Item> EXPERIENCE_CROSSBOW = ITEMS.register("experience_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(2765)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(DefensiveToolTiers.COPPER, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.COPPER, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(DefensiveToolTiers.COPPER, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(DefensiveToolTiers.COPPER, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(DefensiveToolTiers.COPPER, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HALBERD = ITEMS.register("copper_halberd",
            () -> new HalberdItem(DefensiveToolTiers.COPPER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_POLEAXE = ITEMS.register("copper_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.COPPER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new ScytheItem(4, -2.7f, DefensiveToolTiers.COPPER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(524)));
    public static final RegistryObject<Item> COPPER_MORNINGSTAR = ITEMS.register("copper_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.COPPER, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_GREATAXE = ITEMS.register("copper_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.COPPER, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_GREATSWORD = ITEMS.register("copper_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.COPPER, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.COPPER, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(524)));
    public static final RegistryObject<Item> COPPER_EXCAVATOR = ITEMS.register("copper_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.COPPER, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(524)));
    public static final RegistryObject<Item> COPPER_SPEAR = ITEMS.register("copper_spear",
            () -> new CopperSpearItem(new Item.Properties().durability(131)));
    public static final RegistryObject<Item> COPPER_GLAIVE = ITEMS.register("copper_glaive",
            () -> new SwordItem(DefensiveToolTiers.COPPER, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_DAGGER = ITEMS.register("copper_dagger",
            () -> new SwordItem(DefensiveToolTiers.COPPER, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_STAFF = ITEMS.register("copper_staff",
            () -> new SwordItem(DefensiveToolTiers.COPPER, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOW = ITEMS.register("copper_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(201)));
    public static final RegistryObject<Item> COPPER_CROSSBOW = ITEMS.register("copper_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(201)));

    public static final RegistryObject<Item> ZINC_SWORD = ITEMS.register("zinc_sword",
            () -> new SwordItem(DefensiveToolTiers.ZINC, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ZINC, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_AXE = ITEMS.register("zinc_axe",
            () -> new AxeItem(DefensiveToolTiers.ZINC, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ZINC, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_HOE = ITEMS.register("zinc_hoe",
            () -> new HoeItem(DefensiveToolTiers.ZINC, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_HALBERD = ITEMS.register("zinc_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ZINC, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_POLEAXE = ITEMS.register("zinc_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ZINC, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SCYTHE = ITEMS.register("zinc_scythe",
            () -> new ScytheItem(6, -2.7f,  DefensiveToolTiers.ALUMINUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ZINC_MORNINGSTAR = ITEMS.register("zinc_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ZINC, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_GREATAXE = ITEMS.register("zinc_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ZINC, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_GREATSWORD = ITEMS.register("zinc_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ZINC, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_HAMMER = ITEMS.register("zinc_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.ZINC, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ZINC_EXCAVATOR = ITEMS.register("zinc_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.ZINC, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ZINC_SPEAR = ITEMS.register("zinc_spear",
            () -> new ZincSpearItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> ZINC_GLAIVE = ITEMS.register("zinc_glaive",
            () -> new SwordItem(DefensiveToolTiers.ZINC, 4, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_DAGGER = ITEMS.register("zinc_dagger",
            () -> new SwordItem(DefensiveToolTiers.ZINC, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_STAFF = ITEMS.register("zinc_staff",
            () -> new SwordItem(DefensiveToolTiers.ZINC, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_BOW = ITEMS.register("zinc_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(384)));
    public static final RegistryObject<Item> ZINC_CROSSBOW = ITEMS.register("zinc_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> BRASS_SWORD = ITEMS.register("brass_sword",
            () -> new SwordItem(DefensiveToolTiers.BRASS, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.BRASS, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_AXE = ITEMS.register("brass_axe",
            () -> new AxeItem(DefensiveToolTiers.BRASS, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel",
            () -> new ShovelItem(DefensiveToolTiers.BRASS, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_HOE = ITEMS.register("brass_hoe",
            () -> new HoeItem(DefensiveToolTiers.BRASS, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_HALBERD = ITEMS.register("brass_halberd",
            () -> new HalberdItem(DefensiveToolTiers.BRASS, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_POLEAXE = ITEMS.register("brass_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.BRASS, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SCYTHE = ITEMS.register("brass_scythe",
            () -> new ScytheItem(6, -2.7f, DefensiveToolTiers.BRASS, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(6364)));
    public static final RegistryObject<Item> BRASS_MORNINGSTAR = ITEMS.register("brass_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.BRASS, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_GREATAXE = ITEMS.register("brass_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.BRASS, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_GREATSWORD = ITEMS.register("brass_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.BRASS, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_HAMMER = ITEMS.register("brass_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.BRASS, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(6364)));
    public static final RegistryObject<Item> BRASS_EXCAVATOR = ITEMS.register("brass_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.BRASS, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(6364)));
    public static final RegistryObject<Item> BRASS_SPEAR = ITEMS.register("brass_spear",
            () -> new BrassSpearItem(new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> BRASS_GLAIVE = ITEMS.register("brass_glaive",
            () -> new SwordItem(DefensiveToolTiers.BRASS, 4, -2f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_DAGGER = ITEMS.register("brass_dagger",
            () -> new SwordItem(DefensiveToolTiers.BRASS, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_STAFF = ITEMS.register("brass_staff",
            () -> new SwordItem(DefensiveToolTiers.BRASS, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_BOW = ITEMS.register("brass_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(2398)));
    public static final RegistryObject<Item> BRASS_CROSSBOW = ITEMS.register("brass_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(2398)));

    public static final RegistryObject<Item> ROSE_QUARTZ_SWORD = ITEMS.register("rose_quartz_sword",
            () -> new SwordItem(DefensiveToolTiers.ROSE_QUARTZ, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_PICKAXE = ITEMS.register("rose_quartz_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ROSE_QUARTZ, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_AXE = ITEMS.register("rose_quartz_axe",
            () -> new AxeItem(DefensiveToolTiers.ROSE_QUARTZ, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_SHOVEL = ITEMS.register("rose_quartz_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ROSE_QUARTZ, 0.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_HOE = ITEMS.register("rose_quartz_hoe",
            () -> new HoeItem(DefensiveToolTiers.ROSE_QUARTZ, -2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_HALBERD = ITEMS.register("rose_quartz_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ROSE_QUARTZ, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_POLEAXE = ITEMS.register("rose_quartz_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ROSE_QUARTZ, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_SCYTHE = ITEMS.register("rose_quartz_scythe",
            () -> new ScytheItem(5, -2.7f, DefensiveToolTiers.ROSE_QUARTZ, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(6364)));
    public static final RegistryObject<Item> ROSE_QUARTZ_MORNINGSTAR = ITEMS.register("rose_quartz_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ROSE_QUARTZ, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_GREATAXE = ITEMS.register("rose_quartz_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ROSE_QUARTZ, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_GREATSWORD = ITEMS.register("rose_quartz_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ROSE_QUARTZ, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_HAMMER = ITEMS.register("rose_quartz_hammer",
            () -> new HammerItem(12, -3.7f, DefensiveToolTiers.ROSE_QUARTZ, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(6364)));
    public static final RegistryObject<Item> ROSE_QUARTZ_EXCAVATOR = ITEMS.register("rose_quartz_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.ROSE_QUARTZ, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(6364)));
    public static final RegistryObject<Item> ROSE_QUARTZ_SPEAR = ITEMS.register("rose_quartz_spear",
            () -> new RoseQuartzSpearItem(new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> ROSE_QUARTZ_GLAIVE = ITEMS.register("rose_quartz_glaive",
            () -> new SwordItem(DefensiveToolTiers.ROSE_QUARTZ, 3, -2f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_DAGGER = ITEMS.register("rose_quartz_dagger",
            () -> new SwordItem(DefensiveToolTiers.ROSE_QUARTZ, 1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_STAFF = ITEMS.register("rose_quartz_staff",
            () -> new SwordItem(DefensiveToolTiers.ROSE_QUARTZ, 1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_BOW = ITEMS.register("rose_quartz_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(2398)));
    public static final RegistryObject<Item> ROSE_QUARTZ_CROSSBOW = ITEMS.register("rose_quartz_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(2398)));

    public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register("electrum_sword",
            () -> new SwordItem(DefensiveToolTiers.ELECTRUM, 7, -2.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ELECTRUM, 0, -2.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register("electrum_axe",
            () -> new AxeItem(DefensiveToolTiers.ELECTRUM, 9, -3f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ELECTRUM, 0.5f, -2.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register("electrum_hoe",
            () -> new HoeItem(DefensiveToolTiers.ELECTRUM, -2, -1.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_HALBERD = ITEMS.register("electrum_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ELECTRUM, 8, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_POLEAXE = ITEMS.register("electrum_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ELECTRUM, 8, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_SCYTHE = ITEMS.register("electrum_scythe",
            () -> new ScytheItem(8, -2.7f, DefensiveToolTiers.ELECTRUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().fireResistant().durability(16248)));
    public static final RegistryObject<Item> ELECTRUM_MORNINGSTAR = ITEMS.register("electrum_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ELECTRUM, 8, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_GREATAXE = ITEMS.register("electrum_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ELECTRUM, 10, -3.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_GREATSWORD = ITEMS.register("electrum_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ELECTRUM, 12, -3.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_HAMMER = ITEMS.register("electrum_hammer",
            () -> new HammerItem(15, -3.7f, DefensiveToolTiers.ELECTRUM, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().fireResistant().durability(16248)));
    public static final RegistryObject<Item> ELECTRUM_EXCAVATOR = ITEMS.register("electrum_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.ELECTRUM, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().fireResistant().durability(16248)));
    public static final RegistryObject<Item> ELECTRUM_SPEAR = ITEMS.register("electrum_spear",
            () -> new ElectrumSpearItem(new Item.Properties().durability(4062).fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_GLAIVE = ITEMS.register("electrum_glaive",
            () -> new SwordItem(DefensiveToolTiers.ELECTRUM, 6, -2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_DAGGER = ITEMS.register("electrum_dagger",
            () -> new SwordItem(DefensiveToolTiers.ELECTRUM, 4, -1.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_STAFF = ITEMS.register("electrum_staff",
            () -> new SwordItem(DefensiveToolTiers.ELECTRUM, 4, -1.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ELECTRUM_BOW = ITEMS.register("electrum_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(6239)));
    public static final RegistryObject<Item> ELECTRUM_CROSSBOW = ITEMS.register("electrum_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(6239)));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(DefensiveToolTiers.REDSTONE, 8, -2.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.REDSTONE, 0, -2.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(DefensiveToolTiers.REDSTONE, 10, -3f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(DefensiveToolTiers.REDSTONE, 0.5f, -2.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(DefensiveToolTiers.REDSTONE, -2, -1.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_HALBERD = ITEMS.register("redstone_halberd",
            () -> new HalberdItem(DefensiveToolTiers.REDSTONE, 9, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_POLEAXE = ITEMS.register("redstone_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.REDSTONE, 9, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_SCYTHE = ITEMS.register("redstone_scythe",
            () -> new ScytheItem(9, -2.7f, DefensiveToolTiers.REDSTONE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().fireResistant().durability(24368)));
    public static final RegistryObject<Item> REDSTONE_MORNINGSTAR = ITEMS.register("redstone_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.REDSTONE, 9, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_GREATAXE = ITEMS.register("redstone_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.REDSTONE, 11, -3.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_GREATSWORD = ITEMS.register("redstone_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.REDSTONE, 13, -3.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_HAMMER = ITEMS.register("redstone_hammer",
            () -> new HammerItem(16, -3.7f, DefensiveToolTiers.REDSTONE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().fireResistant().durability(24368)));
    public static final RegistryObject<Item> REDSTONE_EXCAVATOR = ITEMS.register("redstone_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.SILVER, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().fireResistant().durability(24368)));
    public static final RegistryObject<Item> REDSTONE_SPEAR = ITEMS.register("redstone_spear",
            () -> new RedstoneSpearItem(new Item.Properties().durability(6092).fireResistant()));
    public static final RegistryObject<Item> REDSTONE_GLAIVE = ITEMS.register("redstone_glaive",
            () -> new SwordItem(DefensiveToolTiers.REDSTONE, 7, -2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_DAGGER = ITEMS.register("redstone_dagger",
            () -> new SwordItem(DefensiveToolTiers.REDSTONE, 5, -1.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_STAFF = ITEMS.register("redstone_staff",
            () -> new SwordItem(DefensiveToolTiers.REDSTONE, 5, -1.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> REDSTONE_BOW = ITEMS.register("redstone_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(9357)));
    public static final RegistryObject<Item> REDSTONE_CROSSBOW = ITEMS.register("redstone_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(9357)));

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(DefensiveToolTiers.ROSE_GOLD, 9, -1.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ROSE_GOLD, 0, -2.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(DefensiveToolTiers.ROSE_GOLD, 11, -2.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ROSE_GOLD, 0.5f, -2.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(DefensiveToolTiers.ROSE_GOLD, -2, -1.8f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_HALBERD = ITEMS.register("rose_gold_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ROSE_GOLD, 10, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_POLEAXE = ITEMS.register("rose_gold_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ROSE_GOLD, 10, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_SCYTHE = ITEMS.register("rose_gold_scythe",
            () -> new ScytheItem(10, -2.7f, DefensiveToolTiers.ROSE_GOLD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().fireResistant().durability(29240)));
    public static final RegistryObject<Item> ROSE_GOLD_MORNINGSTAR = ITEMS.register("rose_gold_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ROSE_GOLD, 10, -2.7f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_GREATAXE = ITEMS.register("rose_gold_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ROSE_GOLD, 12, -3.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_GREATSWORD = ITEMS.register("rose_gold_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ROSE_GOLD, 14, -3.6f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_HAMMER = ITEMS.register("rose_gold_hammer",
            () -> new HammerItem(17, -3.7f, DefensiveToolTiers.ROSE_GOLD, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().fireResistant().durability(29240)));
    public static final RegistryObject<Item> ROSE_GOLD_EXCAVATOR = ITEMS.register("rose_gold_excavator",
            () -> new ExcavatorItem(0.5f, -3f, DefensiveToolTiers.ROSE_GOLD, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().fireResistant().durability(29240)));
    public static final RegistryObject<Item> ROSE_GOLD_SPEAR = ITEMS.register("rose_gold_spear",
            () -> new RoseGoldSpearItem(new Item.Properties().durability(7310).fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_GLAIVE = ITEMS.register("rose_gold_glaive",
            () -> new SwordItem(DefensiveToolTiers.ROSE_GOLD, 8, -2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_DAGGER = ITEMS.register("rose_gold_dagger",
            () -> new SwordItem(DefensiveToolTiers.ROSE_GOLD, 8, -1.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_STAFF = ITEMS.register("rose_gold_staff",
            () -> new SwordItem(DefensiveToolTiers.ROSE_GOLD, 8, -1.2f, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ROSE_GOLD_BOW = ITEMS.register("rose_gold_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(11288)));
    public static final RegistryObject<Item> ROSE_GOLD_CROSSBOW = ITEMS.register("rose_gold_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(11288)));

    public static final RegistryObject<Item> CRIMSTEEL_HALBERD = ITEMS.register("crimsteel_halberd",
            () -> new HalberdItem(DefensiveToolTiers.CRIMSTEEL, 11, -1.8f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> STARDUST_HAMMER = ITEMS.register("stardust_hammer",
            () -> new HammerItem(45, -3.8f, DefensiveToolTiers.STARDUST, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(14620)));

    public static final RegistryObject<Item> WOODEN_HALBERD = ITEMS.register("wooden_halberd",
            () -> new HalberdItem(Tiers.WOOD, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_POLEAXE = ITEMS.register("wooden_poleaxe",
            () -> new HalberdItem(Tiers.WOOD, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SCYTHE = ITEMS.register("wooden_scythe",
            () -> new ScytheItem(5, -2.7f, Tiers.WOOD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(236)));
    public static final RegistryObject<Item> WOODEN_MORNINGSTAR = ITEMS.register("wooden_morningstar",
            () -> new MorningstarItem(Tiers.WOOD, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_GREATAXE = ITEMS.register("wooden_greataxe",
            () -> new GreataxeItem(Tiers.WOOD, 8, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword",
            () -> new GreatswordItem(Tiers.WOOD, 10, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new HammerItem(13, -3.7f, Tiers.WOOD, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(236)));
    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new ExcavatorItem(0.5f, -3f, Tiers.WOOD, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(236)));
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear",
            () -> new WoodenSpearItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive",
            () -> new SwordItem(Tiers.WOOD, 3, -2f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_DAGGER = ITEMS.register("wooden_dagger",
            () -> new SwordItem(Tiers.WOOD, 1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_STAFF = ITEMS.register("wooden_staff",
            () -> new SwordItem(Tiers.WOOD, 1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> OAK_SHIELD = ITEMS.register("oak_shield",
                () -> new OakShieldItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> BIRCH_SHIELD = ITEMS.register("birch_shield",
                () -> new ShieldItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> SPRUCE_SHIELD = ITEMS.register("spruce_shield",
                () -> new ShieldItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> JUNGLE_SHIELD = ITEMS.register("jungle_shield",
                () -> new ShieldItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> ACACIA_SHIELD = ITEMS.register("acacia_shield",
                () -> new ShieldItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> WOODEN_BOW = ITEMS.register("wooden_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(91)));
    public static final RegistryObject<Item> WOODEN_CROSSBOW = ITEMS.register("wooden_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(91)));

    public static final RegistryObject<Item> STONE_HALBERD = ITEMS.register("stone_halberd",
            () -> new HalberdItem(Tiers.STONE, 3, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_POLEAXE = ITEMS.register("stone_poleaxe",
            () -> new HalberdItem(Tiers.STONE, 3, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SCYTHE = ITEMS.register("stone_scythe",
            () -> new ScytheItem(3, -2.7f, Tiers.STONE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(452)));
    public static final RegistryObject<Item> STONE_MORNINGSTAR = ITEMS.register("stone_morningstar",
            () -> new MorningstarItem(Tiers.STONE, 3, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_GREATAXE = ITEMS.register("stone_greataxe",
            () -> new GreataxeItem(Tiers.STONE, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword",
            () -> new GreatswordItem(Tiers.STONE, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new ExcavatorItem(0.5f, -3f, Tiers.STONE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(452)));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(12, -3.7f, Tiers.STONE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(452)));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new StoneSpearItem(new Item.Properties().durability(131)));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive",
            () -> new SwordItem(Tiers.STONE, 1, -2f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger",
            () -> new SwordItem(Tiers.STONE, -1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_STAFF = ITEMS.register("stone_staff",
            () -> new SwordItem(Tiers.STONE, -1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_BOW = ITEMS.register("stone_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(201)));
    public static final RegistryObject<Item> STONE_CROSSBOW = ITEMS.register("stone_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(201)));

    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd",
            () -> new HalberdItem(Tiers.IRON, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_POLEAXE = ITEMS.register("iron_poleaxe",
            () -> new HalberdItem(Tiers.IRON, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new ScytheItem(4, -2.7f, Tiers.IRON, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(542)));
    public static final RegistryObject<Item> IRON_MORNINGSTAR = ITEMS.register("iron_morningstar",
            () -> new MorningstarItem(Tiers.IRON, 4, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe",
            () -> new GreataxeItem(Tiers.IRON, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword",
            () -> new GreatswordItem(Tiers.IRON, 9, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(12, -3.7f, Tiers.IRON, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(542)));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new ExcavatorItem(0.5f, -3f, Tiers.IRON, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(542)));
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new IronSpearItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive",
            () -> new SwordItem(Tiers.IRON, 2, -2f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(Tiers.IRON, 0, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_STAFF = ITEMS.register("iron_staff",
            () -> new SwordItem(Tiers.IRON, 0, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(384)));
    public static final RegistryObject<Item> IRON_CROSSBOW = ITEMS.register("iron_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> GOLDEN_HALBERD = ITEMS.register("golden_halberd",
            () -> new HalberdItem(Tiers.GOLD, 2, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_POLEAXE = ITEMS.register("golden_poleaxe",
            () -> new HalberdItem(Tiers.GOLD, 2, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
            () -> new ScytheItem(2, -2.7f, Tiers.GOLD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(128)));
    public static final RegistryObject<Item> GOLDEN_MORNINGSTAR = ITEMS.register("golden_morningstar",
            () -> new MorningstarItem(Tiers.GOLD, 2, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_GREATAXE = ITEMS.register("golden_greataxe",
            () -> new GreataxeItem(Tiers.GOLD, 5, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword",
            () -> new GreatswordItem(Tiers.GOLD, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new HammerItem(10, -3.7f, Tiers.GOLD, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(128)));
    public static final RegistryObject<Item> GOLDEN_EXCAVATOR = ITEMS.register("golden_excavator",
            () -> new ExcavatorItem(0.5f, -3f, Tiers.GOLD, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(128)));
    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear",
            () -> new GoldenSpearItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive",
            () -> new SwordItem(Tiers.GOLD, 0, -2f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_DAGGER = ITEMS.register("golden_dagger",
            () -> new SwordItem(Tiers.GOLD, 0, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_STAFF = ITEMS.register("golden_staff",
            () -> new SwordItem(Tiers.GOLD, 0, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(49)));
    public static final RegistryObject<Item> GOLDEN_CROSSBOW = ITEMS.register("golden_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(49)));

    public static final RegistryObject<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd",
            () -> new HalberdItem(Tiers.DIAMOND, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_POLEAXE = ITEMS.register("diamond_poleaxe",
            () -> new HalberdItem(Tiers.DIAMOND, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(5, -2.7f, Tiers.DIAMOND, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(6244)));
    public static final RegistryObject<Item> DIAMOND_MORNINGSTAR = ITEMS.register("diamond_morningstar",
            () -> new MorningstarItem(Tiers.DIAMOND, 5, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GREATAXE = ITEMS.register("diamond_greataxe",
            () -> new GreataxeItem(Tiers.DIAMOND, 6, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword",
            () -> new GreatswordItem(Tiers.DIAMOND, 7, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new ExcavatorItem(0.5f, -3f, Tiers.DIAMOND, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(6244)));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(11, -3.7f, Tiers.DIAMOND, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(6244)));
    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear",
            () -> new DiamondSpearItem(new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_STAFF = ITEMS.register("diamond_staff",
            () -> new SwordItem(Tiers.DIAMOND, 1, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(2398)));
    public static final RegistryObject<Item> DIAMOND_CROSSBOW = ITEMS.register("diamond_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(2398)));

    public static final RegistryObject<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd",
            () -> new HalberdItem(Tiers.NETHERITE, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_POLEAXE = ITEMS.register("netherite_poleaxe",
            () -> new HalberdItem(Tiers.NETHERITE, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new ScytheItem(6, -2.7f, Tiers.WOOD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().durability(8124)));
    public static final RegistryObject<Item> NETHERITE_MORNINGSTAR = ITEMS.register("netherite_morningstar",
            () -> new MorningstarItem(Tiers.NETHERITE, 6, -2.7f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GREATAXE = ITEMS.register("netherite_greataxe",
            () -> new GreataxeItem(Tiers.NETHERITE, 8, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword",
            () -> new GreatswordItem(Tiers.NETHERITE, 10, -3.6f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new ExcavatorItem(0.5f, -3f, Tiers.NETHERITE, BlockTags.MINEABLE_WITH_SHOVEL, new Item.Properties().durability(8124)));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(13, -3.7f, Tiers.NETHERITE, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().durability(8124)));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new NetheriteSpearItem(new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new SwordItem(Tiers.NETHERITE, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_STAFF = ITEMS.register("netherite_staff",
            () -> new SwordItem(Tiers.NETHERITE, 2, -1.2f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new CompoundBowItem(new Item.Properties().durability(3120)));
    public static final RegistryObject<Item> NETHERITE_CROSSBOW = ITEMS.register("netherite_crossbow",
            () -> new CompoundCrossbowItem(new Item.Properties().durability(3120)));

    public static final RegistryObject<Item> ALUMINUM_ARROW = ITEMS.register("aluminum_arrow", () -> new AluminumArrowItem(2f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ARROW = ITEMS.register("silver_arrow", () -> new SilverArrowItem(2.2f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_ARROW = ITEMS.register("platinum_arrow", () -> new PlatinumArrowItem(2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_ARROW = ITEMS.register("steel_arrow", () -> new SteelArrowItem(2.6f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ARROW = ITEMS.register("copper_arrow", () -> new CopperArrowItem(2f, new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ARROW = ITEMS.register("zinc_arrow", () -> new ZincArrowItem(2.2f, new Item.Properties()));
    public static final RegistryObject<Item> BRASS_ARROW = ITEMS.register("brass_arrow", () -> new BrassArrowItem(2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_ARROW = ITEMS.register("rose_quartz_arrow", () -> new RoseQuartzArrowItem(3f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_ARROW = ITEMS.register("wooden_arrow", () -> new WoodenArrowItem(1.2f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_ARROW = ITEMS.register("stone_arrow", () -> new StoneArrowItem(1.4f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_ARROW = ITEMS.register("iron_arrow", () -> new IronArrowItem(2.2f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_ARROW = ITEMS.register("golden_arrow", () -> new GoldenArrowItem(1.2f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ARROW = ITEMS.register("diamond_arrow", () -> new DiamondArrowItem(2.6f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ARROW = ITEMS.register("netherite_arrow", () -> new NetheriteArrowItem(2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_ARROW = ITEMS.register("electrum_arrow", () -> new ElectrumArrowItem(3f, new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ARROW = ITEMS.register("redstone_arrow", () -> new RedstoneArrowItem(3.4f, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_ARROW = ITEMS.register("rose_gold_arrow", () -> new RoseGoldArrowItem(3.8f, new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_ARROW_HEAD = ITEMS.register("aluminum_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ARROW_HEAD = ITEMS.register("silver_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_ARROW_HEAD = ITEMS.register("platinum_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_ARROW_HEAD = ITEMS.register("steel_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ARROW_HEAD = ITEMS.register("copper_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ARROW_HEAD = ITEMS.register("zinc_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_ARROW_HEAD = ITEMS.register("brass_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_ARROW_HEAD = ITEMS.register("rose_quartz_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_ARROW_HEAD = ITEMS.register("wooden_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_ARROW_HEAD = ITEMS.register("stone_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_ARROW_HEAD = ITEMS.register("iron_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_ARROW_HEAD = ITEMS.register("golden_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ARROW_HEAD = ITEMS.register("diamond_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ARROW_HEAD = ITEMS.register("netherite_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_ARROW_HEAD = ITEMS.register("electrum_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ARROW_HEAD = ITEMS.register("redstone_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_ARROW_HEAD = ITEMS.register("rose_gold_arrow_head", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_STRAIGHT_ARROW_HEAD = ITEMS.register("aluminum_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_STRAIGHT_ARROW_HEAD = ITEMS.register("silver_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_STRAIGHT_ARROW_HEAD = ITEMS.register("platinum_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_STRAIGHT_ARROW_HEAD = ITEMS.register("steel_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_STRAIGHT_ARROW_HEAD = ITEMS.register("copper_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_STRAIGHT_ARROW_HEAD = ITEMS.register("zinc_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_STRAIGHT_ARROW_HEAD = ITEMS.register("brass_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_STRAIGHT_ARROW_HEAD = ITEMS.register("rose_quartz_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_STRAIGHT_ARROW_HEAD = ITEMS.register("wooden_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_STRAIGHT_ARROW_HEAD = ITEMS.register("stone_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STRAIGHT_ARROW_HEAD = ITEMS.register("iron_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_STRAIGHT_ARROW_HEAD = ITEMS.register("golden_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_STRAIGHT_ARROW_HEAD = ITEMS.register("diamond_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_STRAIGHT_ARROW_HEAD = ITEMS.register("netherite_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_STRAIGHT_ARROW_HEAD = ITEMS.register("electrum_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_STRAIGHT_ARROW_HEAD = ITEMS.register("redstone_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_STRAIGHT_ARROW_HEAD = ITEMS.register("rose_gold_straight_arrow_head", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_HOOKED_ARROW_HEAD = ITEMS.register("aluminum_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOOKED_ARROW_HEAD = ITEMS.register("silver_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HOOKED_ARROW_HEAD = ITEMS.register("platinum_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOOKED_ARROW_HEAD = ITEMS.register("steel_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOOKED_ARROW_HEAD = ITEMS.register("copper_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_HOOKED_ARROW_HEAD = ITEMS.register("zinc_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_HOOKED_ARROW_HEAD = ITEMS.register("brass_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_HOOKED_ARROW_HEAD = ITEMS.register("rose_quartz_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HOOKED_ARROW_HEAD = ITEMS.register("wooden_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_HOOKED_ARROW_HEAD = ITEMS.register("stone_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_HOOKED_ARROW_HEAD = ITEMS.register("iron_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HOOKED_ARROW_HEAD = ITEMS.register("golden_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HOOKED_ARROW_HEAD = ITEMS.register("diamond_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HOOKED_ARROW_HEAD = ITEMS.register("netherite_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_HOOKED_ARROW_HEAD = ITEMS.register("electrum_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_HOOKED_ARROW_HEAD = ITEMS.register("redstone_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_HOOKED_ARROW_HEAD = ITEMS.register("rose_gold_hooked_arrow_head", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_BARBED_ARROW_HEAD = ITEMS.register("aluminum_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BARBED_ARROW_HEAD = ITEMS.register("silver_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BARBED_ARROW_HEAD = ITEMS.register("platinum_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BARBED_ARROW_HEAD = ITEMS.register("steel_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BARBED_ARROW_HEAD = ITEMS.register("copper_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_BARBED_ARROW_HEAD = ITEMS.register("zinc_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_BARBED_ARROW_HEAD = ITEMS.register("brass_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_BARBED_ARROW_HEAD = ITEMS.register("rose_quartz_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_BARBED_ARROW_HEAD = ITEMS.register("wooden_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_BARBED_ARROW_HEAD = ITEMS.register("stone_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_BARBED_ARROW_HEAD = ITEMS.register("iron_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BARBED_ARROW_HEAD = ITEMS.register("golden_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BARBED_ARROW_HEAD = ITEMS.register("diamond_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BARBED_ARROW_HEAD = ITEMS.register("netherite_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_BARBED_ARROW_HEAD = ITEMS.register("electrum_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_BARBED_ARROW_HEAD = ITEMS.register("redstone_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_BARBED_ARROW_HEAD = ITEMS.register("rose_gold_barbed_arrow_head", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUPERHEATED_BLAZE_SPAWN_EGG = ITEMS.register("superheated_blaze_spawn_egg", () -> new ForgeSpawnEggItem(DefensiveEntities.SUPERHEATED_BLAZE, 4567512, 4567512, new Item.Properties()));
    public static final RegistryObject<Item> SUPERHEATED_BLAZE_ROD = ITEMS.register("superheated_blaze_rod", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}