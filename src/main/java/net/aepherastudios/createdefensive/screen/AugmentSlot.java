package net.aepherastudios.createdefensive.screen;

import net.aepherastudios.createdefensive.item.IAugmentation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class AugmentSlot extends Slot {
    public AugmentSlot(List<ItemStack> augmentList, int index, int x, int y) {
        super(new SimpleContainer(augmentList.size()), index, x, y);
        container.setItem(index, augmentList.get(index));
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return stack.getItem() instanceof IAugmentation;
    }
}
