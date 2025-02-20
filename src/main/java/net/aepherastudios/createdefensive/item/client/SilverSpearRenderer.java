package net.aepherastudios.createdefensive.item.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.client.SilverSpearModel;
import net.aepherastudios.createdefensive.entity.client.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.custom.SilverSpear;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SilverSpearRenderer extends EntityRenderer<SilverSpear> {
    public static final ResourceLocation SPEAR_LOCATION = new ResourceLocation(CreateDefensive.MOD_ID,"textures/entity/projectiles/silver_spear.png");
    private final SilverSpearModel model;

    public SilverSpearRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.model = new SilverSpearModel(pContext.bakeLayer(DefensiveModelLayers.SILVER_SPEAR_LAYER));
    }

    public void render(SilverSpear pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.yRotO, pEntity.getYRot()) - 90.0F));
        pMatrixStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.xRotO, pEntity.getXRot()) + 90.0F));
        VertexConsumer $$6 = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(pEntity)), false, pEntity.isFoil());
        this.model.renderToBuffer(pMatrixStack, $$6, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    public ResourceLocation getTextureLocation(SilverSpear pEntity) {
        return SPEAR_LOCATION;
    }
}
