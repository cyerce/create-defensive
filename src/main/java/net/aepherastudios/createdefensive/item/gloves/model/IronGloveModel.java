package net.aepherastudios.createdefensive.item.gloves.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

public class IronGloveModel extends HumanoidModel<LivingEntity> {
    public IronGloveModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createLayer(CubeDeformation cube, boolean isSlim, boolean isTrim) {
        MeshDefinition meshDefinition = HumanoidModel.createMesh(cube, 0.0F);
        PartDefinition partDefinition = meshDefinition.getRoot();
        int y = isTrim ? 16 : 0;
        int width = isTrim ? 64 : 16;
        int height = isTrim ? 32 : 16;
        partDefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, y).addBox(-2.5F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cube), PartPose.offset(-5.0F, 2.0F, 0.0F));
        partDefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, y).mirror().addBox(-1.5F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cube), PartPose.offset(5.0F, 2.0F, 0.0F));
        return LayerDefinition.create(meshDefinition, width, height);
    }

    @Override
    protected Iterable<ModelPart> headParts() {
        return ImmutableList.of();
    }

    @Override
    protected Iterable<ModelPart> bodyParts() {
        return ImmutableList.of(this.rightArm, this.leftArm);
    }
}
