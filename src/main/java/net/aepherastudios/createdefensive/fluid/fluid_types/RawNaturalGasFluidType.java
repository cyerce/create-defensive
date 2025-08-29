package net.aepherastudios.createdefensive.fluid.fluid_types;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class RawNaturalGasFluidType {
    public static final ResourceLocation RAW_NATURAL_GAS_STILL_RL = new ResourceLocation(CreateDefensive.MOD_ID, "block/oil_still");
    public static final ResourceLocation RAW_NATURAL_GAS_FLOWING_RL = new ResourceLocation(CreateDefensive.MOD_ID, "block/oil_flowing");
    public static final ResourceLocation RAW_NATURAL_GAS_OVERLAY_RL = new ResourceLocation(CreateDefensive.MOD_ID, "block/oil_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateDefensive.MOD_ID);

    public static final RegistryObject<FluidType> RAW_NATURAL_GAS = register("raw_natural_gas",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(RAW_NATURAL_GAS_STILL_RL, RAW_NATURAL_GAS_FLOWING_RL, RAW_NATURAL_GAS_OVERLAY_RL, 0xA1A6DFFF, new Vector3f(166f / 255f, 223f / 255f, 1f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
