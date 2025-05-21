package net.aepherastudios.createdefensive.item;

import net.aepherastudios.createdefensive.item.augments.Augment;
import net.minecraft.nbt.CompoundTag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AugmentCapabilityImpl implements IAugmentCapability {
    private List<Augment> augments = new ArrayList<>();

    @Override
    public void addAugment(Augment augment) {
        augments.add(augment);
    }

    @Override
    public void removeAugment(int slot) {
        if(slot >= 0 && slot < augments.size()) {
            augments.remove(slot);
        }
    }

    @Override
    public List<Augment> getAugments() {
        return Collections.unmodifiableList(augments);
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        // Serialize augments to tag
        // Example pseudocode:
        // tag.put("Augments", serializeAugmentList(augments));
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        // Deserialize augments from tag
        // Example pseudocode:
        // augments = deserializeAugmentList(nbt.getList("Augments", ...));
    }
}
