package net.aepherastudios.createdefensive.entity.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.client.renderer.entity.BlazeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Blaze;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class SuperheatedBlazeEntityRenderer extends BlazeRenderer {

    private static final ResourceLocation SUPERHEATED_BLAZE_LOCATION =
            new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/superheated_blaze.png");

    public SuperheatedBlazeEntityRenderer(EntityRendererProvider.Context p_173933_) {
        super(p_173933_);
    }


    @Override
    protected int getSkyLightLevel(Blaze pEntity, BlockPos pPos) {
        return 15;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Blaze pEntity) {
        return SUPERHEATED_BLAZE_LOCATION;
    }
}
