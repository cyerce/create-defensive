package net.aepherastudios.createdefensive.item.augments;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class AugmentSlot extends SlotItemHandler {
    private final String armorType; // e.g., "helmet", "chestplate", etc.

    public AugmentSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition, String armorType) {
        super(itemHandler, index, xPosition, yPosition);
        this.armorType = armorType;
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        // General augment tag
        boolean isGeneral = stack.is(ItemTags.create(new ResourceLocation("forge", "augments/general")));
        // Slot-specific tag
        boolean isSpecific = stack.is(ItemTags.create(new ResourceLocation("forge", "augments/" + armorType)));
        return isGeneral || isSpecific;
    }
}
