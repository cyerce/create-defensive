package net.aepherastudios.createdefensive.item.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.ZincArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ZincArrowRenderer extends ArrowRenderer<ZincArrowEntity> {
    public ZincArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(ZincArrowEntity pEntity) {
        return new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/projectiles/zinc_arrow.png");
    }
}
