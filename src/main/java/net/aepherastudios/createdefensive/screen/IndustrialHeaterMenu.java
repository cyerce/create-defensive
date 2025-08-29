package net.aepherastudios.createdefensive.screen;

import net.aepherastudios.createdefensive.block.entity.IndustrialHeaterBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import net.minecraftforge.common.capabilities.ForgeCapabilities;


public class IndustrialHeaterMenu extends AbstractContainerMenu {

    private final IndustrialHeaterBlockEntity blockEntity;
    private final ContainerLevelAccess access;
    private final ContainerData data;

    public IndustrialHeaterMenu(int windowId, Inventory playerInventory, IndustrialHeaterBlockEntity blockEntity, ContainerData data) {
        super(DefensiveMenuTypes.INDUSTRIAL_HEATER.get(), windowId);
        this.blockEntity = blockEntity;
        this.access = ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos());
        this.data = data;

        this.addDataSlots(data); // This line syncs the data with the client

        blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
            this.addSlot(new SlotItemHandler(handler, 0, 80, 49));
        });

        layoutPlayerInventorySlots(playerInventory, 8, 84);
    }

    public IndustrialHeaterMenu(int windowId, Inventory playerInventory, FriendlyByteBuf buffer) {
        this(windowId, playerInventory,
                (IndustrialHeaterBlockEntity) playerInventory.player.level().getBlockEntity(buffer.readBlockPos()),
                new SimpleContainerData(2)
        );
    }



    public boolean isBurning() {
        return this.data.get(0) > 0;
    }

    public int getBurnLeftScaled(int pixels) {
        int burnTime = this.data.get(0);
        int totalBurnTime = this.data.get(1);
        if (totalBurnTime == 0) {
            totalBurnTime = 200; // prevent divide by zero
        }
        return burnTime * pixels / totalBurnTime;
    }

    private void layoutPlayerInventorySlots(Inventory playerInventory, int leftCol, int topRow) {
        // Player inventory 3 rows of 9
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, leftCol + col * 18, topRow + row * 18));
            }
        }

        // Player hotbar
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, leftCol + col * 18, topRow + 58));
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(access, player, blockEntity.getBlockState().getBlock());
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (index < 1) {
                if (!this.moveItemStackTo(itemstack1, 1, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemstack;
    }
}
