package net.aepherastudios.createdefensive.screen;

import net.aepherastudios.createdefensive.item.custom.AluminumPowerArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AugmentMenu extends AbstractContainerMenu {
    private final Map<Integer, ArmorSlotReference> slotMap = new HashMap<>();

    private final List<IItemHandler> augmentInventories = new ArrayList<>();

    public AugmentMenu(int id, Inventory playerInventory) {
        super(DefensiveMenuTypes.AUGMENT_MENU.get(), id);

        Player player = playerInventory.player;

        // Slot positions for each armor piece (3 per piece)
        int[][] slotPositions = {
                {98, 26}, {98, 44}, {98, 62},  // Helmet
                {116, 26}, {116, 44}, {116, 62},  // Chestplate
                {134, 26}, {134, 44}, {134, 62},  // Leggings
                {152, 26}, {152, 44}, {152, 62} // Boots
        };

        // Map from armor slot to base index in slotPositions
        EquipmentSlot[] armorSlots = {
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        };

        AtomicInteger slotIndex = new AtomicInteger(0);

        for (EquipmentSlot armorSlot : armorSlots) {
            ItemStack armorPiece = player.getItemBySlot(armorSlot);

            if (armorPiece.getItem() instanceof AluminumPowerArmorItem armor) {
                List<ItemStack> savedAugments = armor.getAugmentations(armorPiece);

                armorPiece.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(cap -> {
                    augmentInventories.add(cap);

                    for (int i = 0; i < 3; i++) {
                        ItemStack augmentStack = i < savedAugments.size() ? savedAugments.get(i) : ItemStack.EMPTY;
                        cap.insertItem(i, augmentStack, false);

                        int x = slotPositions[slotIndex.get()][0];
                        int y = slotPositions[slotIndex.get()][1];
                        this.addSlot(new SlotItemHandler(cap, i, x, y));
                        slotMap.put(slotIndex.get(), new ArmorSlotReference(armorSlot, i));
                        slotIndex.getAndIncrement();
                    }
                });
            } else {
                slotIndex.addAndGet(3);
            }
        }

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);


    }

    // CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
    // must assign a slot number to each of the slots used by the GUI.
    // For this container, we can see both the tile inventory's slots as well as the player inventory slots and the hotbar.
    // Each time we add a Slot to the container, it automatically increases the slotIndex, which means
    //  0 - 8 = hotbar slots (which will map to the InventoryPlayer slot numbers 0 - 8)
    //  9 - 35 = player inventory slots (which map to the InventoryPlayer slot numbers 9 - 35)
    //  36 - 44 = TileInventory slots, which map to our TileEntity slot numbers 0 - 8)


    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 12;

    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public void removed(Player player) {
        System.out.println("Removed Called");
        System.out.println("slotMap size: " + slotMap.size());
        for (Map.Entry<Integer, ArmorSlotReference> entry : slotMap.entrySet()) {
            int globalSlot = entry.getKey();
            ArmorSlotReference ref = entry.getValue();

            ItemStack armorStack = player.getItemBySlot(ref.equipmentSlot);
            if (!(armorStack.getItem() instanceof AluminumPowerArmorItem armor)) continue;

            List<ItemStack> newAugments = getNewAugmentsFromSlots(ref);
            System.out.println("Saving augments for slot " + ref.equipmentSlot + ": " + newAugments.size() + " augments.");
            for (ItemStack aug : newAugments) {
                System.out.println(" - " + aug);
            }

            armor.setAugmentations(armorStack, newAugments);
        }
        super.removed(player);
    }

    // Helper to extract augments from GUI back to list
    private List<ItemStack> getNewAugmentsFromSlots(ArmorSlotReference ref) {
        List<ItemStack> list = new ArrayList<>();
        for (Map.Entry<Integer, ArmorSlotReference> entry : slotMap.entrySet()) {
            if (!entry.getValue().equipmentSlot.equals(ref.equipmentSlot)) continue;
            list.add(getSlot(entry.getKey()).getItem());
        }
        return list;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    public record ArmorSlotReference(EquipmentSlot equipmentSlot, int index) {}
}
