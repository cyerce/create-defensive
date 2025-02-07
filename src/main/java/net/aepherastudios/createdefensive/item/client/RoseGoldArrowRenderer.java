package net.aepherastudios.createdefensive.item.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.RoseGoldArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RoseGoldArrowRenderer extends ArrowRenderer<RoseGoldArrowEntity> {
    public RoseGoldArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(RoseGoldArrowEntity pEntity) {
        return new ResourceLocation(CreateDefensive.MOD_ID, "textures/entity/projectiles/rose_gold_arrow.png");
    }
}
