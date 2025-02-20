package net.aepherastudios.createdefensive.entity.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.PainiteProjectileEntity;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.resources.ResourceLocation;

public class PainiteProjectileEntityRenderer extends ThrownItemRenderer {
    public PainiteProjectileEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    public ResourceLocation getTextureLocation(PainiteProjectileEntity pEntity) {
        return new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/projectiles/painite_bullet.png");
    }
}