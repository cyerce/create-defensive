package net.aepherastudios.createdefensive.item;

import net.aepherastudios.createdefensive.item.augments.Augment;
import net.minecraft.nbt.CompoundTag;

import java.util.List;

public interface IAugmentCapability {
    void addAugment(Augment augment);
    void removeAugment(int slot);
    List<Augment> getAugments();
    CompoundTag serializeNBT();
    void deserializeNBT(CompoundTag nbt);
}
