package net.aepherastudios.createdefensive.block.entity;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.utility.BlockHelper;
import net.aepherastudios.createdefensive.block.custom.CokingOvenBlock;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.screen.CokingOvenMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CokingOvenBlockEntity extends BlockEntity implements MenuProvider {
    public CokingOvenBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState){
        super(pType, pPos, pBlockState);
    }
    private final ItemStackHandler itemHandler = new ItemStackHandler(2){
        @Override
        protected void onContentsChanged(int slot){
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack){
            return switch(slot) {
                case 0 -> stack.getItem() == Items.COAL || stack.getItem() == Items.OAK_LOG ||
                        stack.getItem() == Items.ACACIA_LOG || stack.getItem() == Items.BIRCH_LOG ||
                        stack.getItem() == Items.CHERRY_LOG || stack.getItem() == Items.JUNGLE_LOG ||
                        stack.getItem() == Items.DARK_OAK_LOG || stack.getItem() == Items.MANGROVE_LOG ||
                        stack.getItem() == Items.SPRUCE_LOG || stack.getItem() == Items.STRIPPED_ACACIA_LOG ||
                        stack.getItem() == Items.STRIPPED_OAK_LOG || stack.getItem() == Items.STRIPPED_BIRCH_LOG ||
                        stack.getItem() == Items.STRIPPED_CHERRY_LOG || stack.getItem() == Items.STRIPPED_JUNGLE_LOG ||
                        stack.getItem() == Items.STRIPPED_DARK_OAK_LOG || stack.getItem() == Items.STRIPPED_MANGROVE_LOG ||
                        stack.getItem() == Items.STRIPPED_SPRUCE_LOG;
                case 1 -> stack.getItem() == DefensiveItems.COKE.get()  || stack.getItem() == Items.CHARCOAL;
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    public static final int SLOT1 = 0;
    public static final int SLOT2 = 1;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected ContainerData data;
    private int heatedProgress;
    // (mentiy werse here =}> <- does haves moosetach)
    private int heatedMaxProgress = 195;


    public CokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(DefensiveBlockEntities.COKING_OVEN_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int i) {
                return switch (i){
                    case 0 -> CokingOvenBlockEntity.this.heatedProgress;
                    case 1 -> CokingOvenBlockEntity.this.heatedMaxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int i1) {
                switch (i){
                    case 0 -> CokingOvenBlockEntity.this.heatedProgress = i1;
                    case 1 -> CokingOvenBlockEntity.this.heatedMaxProgress = i1;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public void drops() {
        SimpleContainer invintory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++){
            invintory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, invintory);

    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Coking Oven");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new CokingOvenMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER){
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
    }

    public Boolean isLit() {
        return false;
    }

    public void tick(Level level, BlockPos pPos, BlockState pState, CokingOvenBlockEntity pBlockEntity) {
        if (itemHandler.isItemValid(SLOT1, new ItemStack(itemHandler.getStackInSlot(SLOT1).getItem()))) {
            BlazeBurnerBlock.HeatLevel heat = CokingOvenBlockEntity.getHeatLevelOf(getLevel().getBlockState(getBlockPos().below(1)));
            if (heat.isAtLeast(HeatCondition.HEATED.visualizeAsBlazeBurner())) {
                if (heatedProgress < heatedMaxProgress) {
                    heatedProgress++;
                    level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, true));
                } else if (heatedProgress == heatedMaxProgress) {
                    if (itemHandler.getStackInSlot(SLOT1).getItem() == Items.OAK_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.ACACIA_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.BIRCH_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.CHERRY_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.JUNGLE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.DARK_OAK_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.MANGROVE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.SPRUCE_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_ACACIA_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_OAK_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_BIRCH_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_CHERRY_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_JUNGLE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_DARK_OAK_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_MANGROVE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_SPRUCE_LOG) {
                        itemHandler.setStackInSlot(SLOT2, new ItemStack(Items.CHARCOAL,
                                itemHandler.getStackInSlot(SLOT2).getCount() + 1));
                    } else if (itemHandler.getStackInSlot(SLOT1).getItem() == Items.COAL) {
                        itemHandler.setStackInSlot(SLOT2, new ItemStack(DefensiveItems.COKE.get(),
                                itemHandler.getStackInSlot(SLOT2).getCount() + 1));
                    } else {
                        level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
                    }

                    itemHandler.extractItem(SLOT1, 1, false);
                    heatedProgress = 0;
                } else {
                    level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
                }
            } else {
                level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
            }
        } else {
            level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
        }
    }

    public static BlazeBurnerBlock.HeatLevel getHeatLevelOf(BlockState state) {
        if (state.hasProperty(BlazeBurnerBlock.HEAT_LEVEL))
            return state.getValue(BlazeBurnerBlock.HEAT_LEVEL);
        return AllTags.AllBlockTags.PASSIVE_BOILER_HEATERS.matches(state) && BlockHelper.isNotUnheated(state)
                ? BlazeBurnerBlock.HeatLevel.SMOULDERING
                : BlazeBurnerBlock.HeatLevel.NONE;

    }


}
