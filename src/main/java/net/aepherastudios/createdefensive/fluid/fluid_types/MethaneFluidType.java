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

public class MethaneFluidType {
    public static final ResourceLocation METHANE_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation METHANE_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation METHANE_OVERLAY_RL = new ResourceLocation("block/water_still");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateDefensive.MOD_ID);

    public static final RegistryObject<FluidType> METHANE = register("methane",
            FluidType.Properties.create().canConvertToSource(false).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () ->
                new BaseFluidType(METHANE_STILL_RL, METHANE_FLOWING_RL, METHANE_OVERLAY_RL, 0xA1abffda, new Vector3f(171f / 255f, 1.0f, 218f / 255f), properties));
    }




    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

