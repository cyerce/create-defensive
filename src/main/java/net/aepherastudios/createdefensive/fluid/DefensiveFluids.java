package net.aepherastudios.createdefensive.fluid;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.fluid.fluid_types.*;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateDefensive.MOD_ID);


    public static final RegistryObject<FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("crude_oil",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.CRUDE_OIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("flowing_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.CRUDE_OIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DIRTY_RAW_CRUDE_OIL = FLUIDS.register("dirty_raw_crude_oil",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.DIRTY_RAW_CRUDE_OIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DIRTY_RAW_CRUDE_OIL = FLUIDS.register("flowing_dirty_raw_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.DIRTY_RAW_CRUDE_OIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_CRUDE_OIL = FLUIDS.register("raw_crude_oil",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.RAW_CRUDE_OIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_CRUDE_OIL = FLUIDS.register("flowing_raw_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.RAW_CRUDE_OIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_NATURAL_GAS = FLUIDS.register("natural_gas",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.NATURAL_GAS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NATURAL_GAS = FLUIDS.register("flowing_natural_gas",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.NATURAL_GAS_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_NATURAL_GAS = FLUIDS.register("raw_natural_gas",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.RAW_NATURAL_GAS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_NATURAL_GAS = FLUIDS.register("flowing_raw_natural_gas",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.RAW_NATURAL_GAS_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_GASOLINE = FLUIDS.register("gasoline",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.GASOLINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GASOLINE = FLUIDS.register("flowing_gasoline",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.GASOLINE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_KEROSENE = FLUIDS.register("kerosene",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.KEROSENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_KEROSENE = FLUIDS.register("flowing_kerosene",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.KEROSENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DIESEL = FLUIDS.register("diesel",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.DIESEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DIESEL = FLUIDS.register("flowing_diesel",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.DIESEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BITUMEN = FLUIDS.register("bitumen",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.BITUMEN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BITUMEN = FLUIDS.register("flowing_bitumen",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.BITUMEN_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_BUTANE = FLUIDS.register("butane",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.BUTANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BUTANE = FLUIDS.register("flowing_butane",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.BUTANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_PROPANE = FLUIDS.register("propane",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.PROPANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PROPANE = FLUIDS.register("flowing_propane",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.PROPANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHANE = FLUIDS.register("ethane",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.ETHANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ETHANE = FLUIDS.register("flowing_ethane",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.ETHANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_METHANE = FLUIDS.register("methane",
            () -> new ForgeFlowingFluid.Source(DefensiveFluids.METHANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_METHANE = FLUIDS.register("flowing_methane",
            () -> new ForgeFlowingFluid.Flowing(DefensiveFluids.METHANE_PROPERTIES));





    public static final ForgeFlowingFluid.Properties CRUDE_OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            CrudeOilFluidType.CRUDE_OIL, SOURCE_CRUDE_OIL, FLOWING_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.CRUDE_OIL).bucket(DefensiveItems.CRUDE_OIL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties DIRTY_RAW_CRUDE_OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            DirtyRawCrudeOilFluidType.DIRTY_RAW_CRUDE_OIL, SOURCE_DIRTY_RAW_CRUDE_OIL, FLOWING_DIRTY_RAW_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.DIRTY_RAW_CRUDE_OIL).bucket(DefensiveItems.DIRTY_RAW_CRUDE_OIL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties RAW_CRUDE_OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            RawCrudeOilFluidType.RAW_CRUDE_OIL, SOURCE_RAW_CRUDE_OIL, FLOWING_RAW_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.RAW_CRUDE_OIL).bucket(DefensiveItems.RAW_CRUDE_OIL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties NATURAL_GAS_PROPERTIES = new ForgeFlowingFluid.Properties(
            NaturalGasFluidType.NATURAL_GAS, SOURCE_NATURAL_GAS, FLOWING_NATURAL_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.NATURAL_GAS).bucket(DefensiveItems.NATURAL_GAS_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties RAW_NATURAL_GAS_PROPERTIES = new ForgeFlowingFluid.Properties(
            RawNaturalGasFluidType.RAW_NATURAL_GAS, SOURCE_RAW_NATURAL_GAS, FLOWING_RAW_NATURAL_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.RAW_NATURAL_GAS).bucket(DefensiveItems.RAW_NATURAL_GAS_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties GASOLINE_PROPERTIES = new ForgeFlowingFluid.Properties(
            GasolineFluidType.GASOLINE, SOURCE_GASOLINE, FLOWING_GASOLINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.GASOLINE).bucket(DefensiveItems.GASOLINE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties KEROSENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            KeroseneFluidType.KEROSENE, SOURCE_KEROSENE, FLOWING_KEROSENE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.KEROSENE).bucket(DefensiveItems.KEROSENE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties DIESEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            DieselFluidType.DIESEL, SOURCE_DIESEL, FLOWING_DIESEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.DIESEL).bucket(DefensiveItems.DIESEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties BITUMEN_PROPERTIES = new ForgeFlowingFluid.Properties(
            BitumenFluidType.BITUMEN, SOURCE_BITUMEN, FLOWING_BITUMEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.BITUMEN).bucket(DefensiveItems.BITUMEN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties BUTANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ButaneFluidType.BUTANE, SOURCE_BUTANE, FLOWING_BUTANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.BUTANE).bucket(DefensiveItems.BUTANE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties PROPANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            PropaneFluidType.PROPANE, SOURCE_PROPANE, FLOWING_PROPANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.PROPANE).bucket(DefensiveItems.PROPANE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties ETHANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            EthaneFluidType.ETHANE, SOURCE_ETHANE, FLOWING_ETHANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.ETHANE).bucket(DefensiveItems.ETHANE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties METHANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            MethaneFluidType.METHANE, SOURCE_METHANE, FLOWING_METHANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.METHANE).bucket(DefensiveItems.METHANE_BUCKET).tickRate(30);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
