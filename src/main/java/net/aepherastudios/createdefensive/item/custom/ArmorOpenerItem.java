package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.screen.AugmentMenu;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ArmorOpenerItem extends Item {
    public ArmorOpenerItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {  // Server-side only
            // Open the menu for the player
            player.openMenu(new MenuProvider() {
                @Override
                public Component getDisplayName() {
                    return Component.literal("Power Armor Augments");
                }

                @Override
                public AbstractContainerMenu createMenu(int id, Inventory playerInventory, Player playerEntity) {
                    return new AugmentMenu(id, playerInventory);
                }
            });
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), world.isClientSide());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
//        tooltip.add(Component.literal("Battery: " + getBattery(stack) + " / " + MAX_BATTERY)
//                .withStyle(ChatFormatting.AQUA));
        tooltip.add(Component.literal("WORK IN PROGRESS - CAN CRASH YOU")
                .withStyle(ChatFormatting.RED));

    }
}
