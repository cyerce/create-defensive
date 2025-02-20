package net.aepherastudios.createdefensive.item.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.client.RoseGoldSpearModel;
import net.aepherastudios.createdefensive.entity.client.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.custom.RoseGoldSpear;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RoseGoldSpearRenderer extends EntityRenderer<RoseGoldSpear> {
    public static final ResourceLocation SPEAR_LOCATION = new ResourceLocation(CreateDefensive.MOD_ID,"textures/entity/projectiles/rose_gold_spear.png");
    private final RoseGoldSpearModel model;

    public RoseGoldSpearRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.model = new RoseGoldSpearModel(pContext.bakeLayer(DefensiveModelLayers.ROSE_GOLD_SPEAR_LAYER));
    }

    public void render(RoseGoldSpear pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.yRotO, pEntity.getYRot()) - 90.0F));
        pMatrixStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.xRotO, pEntity.getXRot()) + 90.0F));
        VertexConsumer $$6 = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(pEntity)), false, pEntity.isFoil());
        this.model.renderToBuffer(pMatrixStack, $$6, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    public ResourceLocation getTextureLocation(RoseGoldSpear pEntity) {
        return SPEAR_LOCATION;
    }
}
