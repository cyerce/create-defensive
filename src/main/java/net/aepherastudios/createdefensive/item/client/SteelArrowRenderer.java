package net.aepherastudios.createdefensive.item.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.SteelArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class SteelArrowRenderer extends ArrowRenderer<SteelArrowEntity> {
    public SteelArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(SteelArrowEntity pEntity) {
        return new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/projectiles/steel_arrow.png");
    }
}
