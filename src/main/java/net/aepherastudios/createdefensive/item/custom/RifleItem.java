package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.BulletEntity;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

public class RifleItem extends Item {
    private static final int MAGAZINE_SIZE = 6;
    private final Map<UUID, Integer> ammoMap = new HashMap<>();

    public RifleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack rifle = player.getItemInHand(hand);
        UUID uuid = player.getUUID();
        int ammo = ammoMap.getOrDefault(uuid, MAGAZINE_SIZE);

        if (ammo > 0) {
            if (!level.isClientSide) {
                BulletEntity bullet = new BulletEntity(DefensiveEntities.BULLET.get(), level, player);
                bullet.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3.0F, 1.0F);
                level.addFreshEntity(bullet);                level.playSound(null, player.blockPosition(), SoundEvents.CROSSBOW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F);
            }

            // Decrease ammo
            ammoMap.put(uuid, ammo - 1);
            player.swing(hand, true);
        } else {
            // Try to reload
            if (tryReload(player)) {
                ammoMap.put(uuid, MAGAZINE_SIZE - 1); // First shot uses 1 ammo
                if (!level.isClientSide) {
                    BulletEntity bullet = new BulletEntity(DefensiveEntities.BULLET.get(), level, player);
                    bullet.setPos(player.getX(), player.getEyeY() - 0.1, player.getZ());
                    bullet.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3.0F, 1.0F);
                    level.addFreshEntity(bullet);
                    level.playSound(null, player.blockPosition(), SoundEvents.CROSSBOW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F);
                }
                player.swing(hand, true);
            } else {
                if (!level.isClientSide) {
                    player.displayClientMessage(Component.literal("Out of ammo!"), true);
                }
            }
        }

        return InteractionResultHolder.sidedSuccess(rifle, level.isClientSide());
    }

    private boolean tryReload(Player player) {
        int bulletsNeeded = MAGAZINE_SIZE;
        int bulletsFound = 0;

        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (stack.getItem() == DefensiveItems.LARGE_BULLET.get()) {
                int used = Math.min(stack.getCount(), bulletsNeeded - bulletsFound);
                stack.shrink(used);
                bulletsFound += used;
                if (bulletsFound >= bulletsNeeded) break;
            }
        }

        return bulletsFound >= 1;
    }
}
