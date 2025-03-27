package net.aepherastudios.createdefensive.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import java.util.List;

import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.item.shield.OakShieldModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Holder;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DefensiveBlockEntityWithoutLevelRenderers implements ResourceManagerReloadListener {
    private OakShieldModel oakShieldModel;

    private final BlockEntityRenderDispatcher blockEntityRenderDispatcher;
    private final EntityModelSet entityModelSet;

    public DefensiveBlockEntityWithoutLevelRenderers(BlockEntityRenderDispatcher pBlockEntityRenderDispatcher, EntityModelSet pEntityModelSet) {
        this.blockEntityRenderDispatcher = pBlockEntityRenderDispatcher;
        this.entityModelSet = pEntityModelSet;
    }

    public void onResourceManagerReload(ResourceManager pResourceManager) {
        this.oakShieldModel = new OakShieldModel(this.entityModelSet.bakeLayer(DefensiveModelLayers.OAK_SHIELD_LAYER));
    }

    public void renderByItem(ItemStack pStack, ItemDisplayContext pDisplayContext, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, int pPackedOverlay) {
        Item item = pStack.getItem();
        if (item instanceof BlockItem) {
            Block block = ((BlockItem)item).getBlock();
        } else {
            if (pStack.is(DefensiveItems.OAK_SHIELD.get())) {
                boolean flag = BlockItem.getBlockEntityData(pStack) != null;
                pPoseStack.pushPose();
                pPoseStack.scale(1.0F, -1.0F, -1.0F);
                Material material = flag ? DefensiveModelBakery.OAK_SHIELD_BASE : DefensiveModelBakery.NO_PATTERN_OAK_SHIELD;
                VertexConsumer vertexconsumer = material.sprite().wrap(ItemRenderer.getFoilBufferDirect(pBuffer, this.oakShieldModel.renderType(material.atlasLocation()), true, pStack.hasFoil()));
                this.oakShieldModel.oak_shield_handle().render(pPoseStack, vertexconsumer, pPackedLight, pPackedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
                if (flag) {
                    List<Pair<Holder<BannerPattern>, DyeColor>> list = BannerBlockEntity.createPatterns(ShieldItem.getColor(pStack), BannerBlockEntity.getItemPatterns(pStack));
                    BannerRenderer.renderPatterns(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, this.oakShieldModel.oak_shield_plate(), material, false, list, pStack.hasFoil());
                } else {
                    this.oakShieldModel.oak_shield_plate().render(pPoseStack, vertexconsumer, pPackedLight, pPackedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
                }

                pPoseStack.popPose();
            }

        }
    }
}