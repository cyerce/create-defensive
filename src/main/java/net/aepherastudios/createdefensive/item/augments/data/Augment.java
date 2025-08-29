package net.aepherastudios.createdefensive.item.augments.data;

import net.minecraft.nbt.CompoundTag;

public class Augment {
    private final String id;  // Unique id for the augment, e.g., "speed_boost"

    public Augment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Example serialize method
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putString("Id", id);
        return tag;
    }

    // Example deserialize static method
    public static Augment deserializeNBT(CompoundTag tag) {
        String id = tag.getString("Id");
        return new Augment(id);
    }
}
