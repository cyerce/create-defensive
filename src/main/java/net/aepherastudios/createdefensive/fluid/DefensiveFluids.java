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


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
