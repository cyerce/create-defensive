package net.aepherastudios.createdefensive.item.shield;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.swing.*;

@OnlyIn(Dist.CLIENT)
public class OakShieldModel extends Model {
    private static final String OAK_SHIELD_PLATE = "oak_shield_plate";
    private static final String OAK_SHIELD_HANDLE = "oak_shield_handle";
    private static final int SHIELD_WIDTH = 10;
    private static final int SHIELD_HEIGHT = 20;
    private final ModelPart oak_shield_root;
    private final ModelPart oak_shield_plate;
    private final ModelPart oak_shield_handle;

    public OakShieldModel(ModelPart pRoot) {
        super(RenderType::entitySolid);
        this.oak_shield_root = pRoot;
        this.oak_shield_plate = pRoot.getChild("oak_shield_plate");
        this.oak_shield_handle = pRoot.getChild("oak_shield_handle");
    }

    public static LayerDefinition createLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        partDefinition.addOrReplaceChild("oak_shield_plate", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), PartPose.ZERO);
        partDefinition.addOrReplaceChild("oak_shield_handle", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), PartPose.ZERO);
        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    public ModelPart oak_shield_plate() {
        return this.oak_shield_plate;
    }

    public ModelPart oak_shield_handle() {
        return this.oak_shield_handle;
    }

    public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {
        this.oak_shield_root.render(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pRed, pGreen, pBlue, pAlpha);
    }
}

