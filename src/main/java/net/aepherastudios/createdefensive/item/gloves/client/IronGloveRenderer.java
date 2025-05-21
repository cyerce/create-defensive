package net.aepherastudios.createdefensive.item.gloves.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.aepherastudios.createdefensive.entity.client.DefensiveModelLayers;
import net.aepherastudios.createdefensive.item.gloves.IronGloveItem;
import net.aepherastudios.createdefensive.item.gloves.model.IronGloveModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class IronGloveRenderer implements ICurioRenderer {

    private final IronGloveModel glovesModel;
    private final IronGloveModel ironGloveFirstPerson;

    public IronGloveRenderer() {
        this.glovesModel = new IronGloveModel(Minecraft.getInstance().getEntityModels().bakeLayer(DefensiveModelLayers.GLOVES));
        this.ironGloveFirstPerson = new IronGloveModel(Minecraft.getInstance().getEntityModels().bakeLayer(DefensiveModelLayers.GLOVES_FP));
    }

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack poseStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource buffer, int packedLight, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        LivingEntity livingEntity = slotContext.entity();
        IronGloveItem ironGloveItem = (IronGloveItem) stack.getItem();
        IronGloveModel model = this.glovesModel;
        ResourceLocation texture = ironGloveItem.getGloveTexture();


        ICurioRenderer.followBodyRotations(slotContext.entity(), model);

        VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.armorCutoutNoCull(texture));

        if (stack.hasFoil()) {
            RenderType glint = RenderType.armorEntityGlint();
            model.renderToBuffer(poseStack, buffer.getBuffer(glint), packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    /**
     * Renders a glove in the player's hand in first person.
     * @param stack The {@link ItemStack} for the Curio.
     * @param poseStack The rendering {@link PoseStack}.
     * @param buffer The rendering {@link MultiBufferSource}.
     * @param packedLight The {@link Integer} for the packed lighting for rendering.
     * @param player The {@link AbstractClientPlayer} to render for.
     * @param arm The {@link HumanoidArm} to render on.
     */
    public void renderFirstPerson(ItemStack stack, PoseStack poseStack, MultiBufferSource buffer, int packedLight, AbstractClientPlayer player, HumanoidArm arm) {
        IronGloveModel model = this.ironGloveFirstPerson;

        IronGloveItem ironGloveItem = (IronGloveItem) stack.getItem();
        VertexConsumer consumer = buffer.getBuffer(RenderType.armorCutoutNoCull(ironGloveItem.getGloveTexture()));


        model.setAllVisible(false);
        model.attackTime = 0.0F;
        model.crouching = false;
        model.swimAmount = 0.0F;
        model.setupAnim(player, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);

        ModelPart gloveArm = arm == HumanoidArm.RIGHT ? model.rightArm : model.leftArm;
        gloveArm.visible = true;
        gloveArm.xRot = 0.0F;
        gloveArm.render(poseStack, consumer, packedLight, OverlayTexture.NO_OVERLAY);

        if (stack.hasFoil()) {
            RenderType glint = RenderType.armorEntityGlint();
            gloveArm.render(poseStack, buffer.getBuffer(glint), packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

}
