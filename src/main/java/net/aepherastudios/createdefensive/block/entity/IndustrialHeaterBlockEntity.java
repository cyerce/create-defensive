package net.aepherastudios.createdefensive.block.entity;

import net.aepherastudios.createdefensive.block.custom.IndustrialHeaterBlock;
import net.aepherastudios.createdefensive.screen.IndustrialHeaterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;
import java.awt.*;

public class IndustrialHeaterBlockEntity extends BlockEntity implements MenuProvider {
    public int burnTime = 0;
    public int totalBurnTime = 0;
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final ItemStackHandler handler = new ItemStackHandler(1);

    public IndustrialHeaterBlockEntity(BlockPos pos, BlockState state) {
        super(DefensiveBlockEntities.INDUSTRIAL_HEATER.get(), pos, state);
    }

    public boolean isBurning() {
        return this.burnTime > 0;  // or however you track burning time
    }

    public static void tick(Level level, BlockPos pos, BlockState state, IndustrialHeaterBlockEntity blockEntity) {
        if (level.isClientSide) return;

        boolean wasLit = state.getValue(IndustrialHeaterBlock.LIT);
        boolean isLit = false;

        IItemHandler inventory = blockEntity.itemHandler;
        ItemStack fuelStack = inventory.getStackInSlot(0);

        if (blockEntity.burnTime > 0) {
            blockEntity.burnTime--;
            isLit = true;
        } else if (!fuelStack.isEmpty() && ForgeHooks.getBurnTime(fuelStack, null) > 0) {
            blockEntity.burnTime = ForgeHooks.getBurnTime(fuelStack, null);
            blockEntity.totalBurnTime = blockEntity.burnTime;  // <-- set totalBurnTime here
            fuelStack.shrink(1);
            blockEntity.setChanged();
            isLit = true;
        }

        if (wasLit != isLit) {
            level.setBlock(pos, state.setValue(IndustrialHeaterBlock.LIT, isLit), 3);
        }

        if (isLit) {
            // Any heating effect logic here
        }
    }

    private void setLitState(boolean lit) {
        if (level != null && level.getBlockState(worldPosition).getValue(IndustrialHeaterBlock.LIT) != lit) {
            level.setBlock(worldPosition, level.getBlockState(worldPosition).setValue(IndustrialHeaterBlock.LIT, lit), 3);
        }
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Industrial Heater");
    }

    @Override
    public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player player) {
        return new IndustrialHeaterMenu(windowId, playerInventory, this);
    }

    private final ItemStackHandler itemHandler = new ItemStackHandler(1) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return LazyOptional.of(() -> itemHandler).cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }
}
