//package net.aepherastudios.createdefensive.worldgen.dimension;
//
//import com.google.common.collect.ImmutableMap;
//import net.minecraft.client.renderer.DimensionSpecialEffects;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
//import net.minecraftforge.fml.ModLoader;
//import org.jetbrains.annotations.ApiStatus;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class DefensiveSpecialEffectsManager {
//    private static ImmutableMap<ResourceLocation, DimensionSpecialEffects> EFFECTS;
//    private static DimensionSpecialEffects DIMENSION_EFFECTS;
//
//
//    public static DimensionSpecialEffects getForType(ResourceLocation type) {
//        return EFFECTS.getOrDefault(type, DIMENSION_EFFECTS);
//    }
//
//    @ApiStatus.Internal
//    public static void init() {
//        var effects = new HashMap<ResourceLocation, DimensionSpecialEffects>();
//        DIMENSION_EFFECTS = preRegisterVanillaEffects(effects);
//        var event = new RegisterDimensionSpecialEffectsEvent(effects);
//        ModLoader.get().postEventWrapContainerInModOrder(event);
//        EFFECTS = ImmutableMap.copyOf(effects);
//    }
//
//    private static DimensionSpecialEffects preRegisterVanillaEffects(Map<ResourceLocation, DimensionSpecialEffects> effects) {
//        var mercuryEffects = new DefensiveSpecialEffects.MercuryEffects();
//        effects.put(DefensiveDimensions.MERCURY_EFFECTS, mercuryEffects);
//        return mercuryEffects;
//    }
//
//    private DefensiveSpecialEffectsManager() {
//    }
//}
