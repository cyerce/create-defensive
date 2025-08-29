package net.aepherastudios.createdefensive.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.w3c.dom.Text;

public class IndustrialHeaterScreen extends AbstractContainerScreen<IndustrialHeaterMenu> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("createdefensive", "textures/gui/industrial_heater.png");

    public IndustrialHeaterScreen(IndustrialHeaterMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;

        // Draw main GUI background
        guiGraphics.blit(TEXTURE, x, y, 0, 0, this.imageWidth, this.imageHeight);

        if (menu.isBurning()) {
            int burnProgress = menu.getBurnLeftScaled(14);  // 0 to 14

            int iconWidth = 14;
            int iconHeight = burnProgress;

            int srcU = 176;
            int srcV = 14 - burnProgress;  // move down in texture to clip top

            int renderX = x + 81;
            int renderY = y + 30 + (14 - burnProgress);  // move up on screen to align bottom

            guiGraphics.blit(TEXTURE, renderX, renderY, srcU, srcV, iconWidth, iconHeight);
        }
    }
    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, this.title, 8, 6, 0x404040, false);
        guiGraphics.drawString(this.font, this.playerInventoryTitle, 8, this.imageHeight - 94, 0x404040, false);
    }
}