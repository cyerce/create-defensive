package net.aepherastudios.createdefensive.worldgen.dimension;

import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DefensiveSpecialEffects implements net.minecraftforge.client.extensions.IForgeDimensionSpecialEffects{

    public static DimensionSpecialEffects forType(DimensionType pDimensionType) {
        return net.minecraftforge.client.DimensionSpecialEffectsManager.getForType(pDimensionType.effectsLocation());
    }

    public static class MercuryEffects extends DimensionSpecialEffects{
        public MercuryEffects() {
            super(Float.NaN, true, SkyType.NONE, true, false );
        }

        @Override
        public Vec3 getBrightnessDependentFogColor(Vec3 vec3, float v) {
            return null;
        }



        @Override
        public boolean isFoggyAt(int i, int i1) {
            return false;
        }
    }
}
