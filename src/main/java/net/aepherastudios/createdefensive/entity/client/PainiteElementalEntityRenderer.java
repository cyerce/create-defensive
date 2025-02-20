package net.aepherastudios.createdefensive.entity.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.client.renderer.entity.BlazeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Blaze;
import org.jetbrains.annotations.NotNull;

public class PainiteElementalEntityRenderer extends BlazeRenderer {

    private static final ResourceLocation PAINITE_ELEMENTAL_LOCATION =
            new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/painite_elemental.png");

    public PainiteElementalEntityRenderer(EntityRendererProvider.Context p_173933_) {
        super(p_173933_);
    }


    @Override
    protected int getSkyLightLevel(Blaze pEntity, BlockPos pPos) {
        return 15;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Blaze pEntity) {
        return PAINITE_ELEMENTAL_LOCATION;
    }
}
