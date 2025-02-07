package net.aepherastudios.createdefensive.item.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.StoneArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class StoneArrowRenderer extends ArrowRenderer<StoneArrowEntity> {
    public StoneArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(StoneArrowEntity pEntity) {
        return new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/projectiles/stone_arrow.png");
    }
}
