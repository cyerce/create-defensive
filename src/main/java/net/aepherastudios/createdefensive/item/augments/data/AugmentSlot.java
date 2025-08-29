package net.aepherastudios.createdefensive.item.augments.data;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class AugmentSlot extends SlotItemHandler {
    private final TagKey<Item> generalTag = ItemTags.create(new ResourceLocation("createdefensive", "augments/general"));
    private final TagKey<Item> specificTag;

    public AugmentSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition, String armorType) {
        super(itemHandler, index, xPosition, yPosition);
        this.specificTag = ItemTags.create(new ResourceLocation("createdefensive", "augments/" + armorType));
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        try {
            return stack.is(generalTag) || stack.is(specificTag);
        } catch (Exception e) {
            System.err.println("Error checking item tag: " + e.getMessage());
            return false;
        }
    }
}
