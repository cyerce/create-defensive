package net.aepherastudios.createdefensive.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DevChargerItem extends Item {

    public DevChargerItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean isSelected) {
        if (!(entity instanceof Player player)) return;
        if (level.isClientSide) return;

        ItemStack offhand = player.getOffhandItem();

        if (offhand.getItem() instanceof AluminumPowerArmorItem powerArmor) {
            powerArmor.setBattery(offhand, AluminumPowerArmorItem.MAX_BATTERY); // Or your method for full charge
        }
    }
}
