package net.aepherastudios.createdefensive.item.augments.data;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public interface IAugmentation {
    void onTick(Player player, ItemStack armorStack);
}
