package net.aepherastudios.createdefensive.entity.client.throwingstar;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.throwingstar.GoldenThrowingStar;
import net.aepherastudios.createdefensive.entity.model.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.model.throwingstar.GoldenThrowingStarModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoldenThrowingStarRenderer extends EntityRenderer<GoldenThrowingStar> {
    public static final ResourceLocation THROWING_STAR_LOCATION = new ResourceLocation(CreateDefensive.MOD_ID,"textures/entity/projectiles/golden_throwing_star.png");
    private final GoldenThrowingStarModel model;

    public GoldenThrowingStarRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.model = new GoldenThrowingStarModel(pContext.bakeLayer(DefensiveModelLayers.GOLDEN_THROWING_STAR_LAYER));
    }

    public void render(GoldenThrowingStar pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.yRotO, pEntity.getYRot()) - 90.0F));
        pMatrixStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.xRotO, pEntity.getXRot()) + 90.0F));
        VertexConsumer $$6 = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(pEntity)), false, pEntity.isFoil());
        this.model.renderToBuffer(pMatrixStack, $$6, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    public ResourceLocation getTextureLocation(GoldenThrowingStar pEntity) {
        return THROWING_STAR_LOCATION;
    }
}

