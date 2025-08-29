package net.aepherastudios.createdefensive.item.custom;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.aepherastudios.createdefensive.item.augments.data.IAugmentCapability;
import net.aepherastudios.createdefensive.item.augments.data.IAugmentation;
import net.aepherastudios.createdefensive.screen.AugmentInventoryProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

import static net.aepherastudios.createdefensive.item.augments.DefensiveCapabilities.AUGMENT_CAPABILITY;

public class AluminumPowerArmorItem extends ArmorItem {
    private static final String BATTERY_TAG = "Battery";
    public static final int MAX_BATTERY = 10000;

    public AluminumPowerArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties.defaultDurability(0));
    }

    public int getAugmentSlotCount() {
        return 3;
    }

    public List<ItemStack> getAugmentations(ItemStack stack) {
        List<ItemStack> augments = new ArrayList<>();
        CompoundTag tag = stack.getTag();

        if (tag != null && tag.contains("Augmentations", 9)) { // 9 = ListTag
            ListTag augList = tag.getList("Augmentations", 10); // 10 = CompoundTag
            for (int i = 0; i < augList.size(); i++) {
                CompoundTag augmentTag = augList.getCompound(i);
                ItemStack augmentStack = ItemStack.of(augmentTag);
                augments.add(augmentStack);
            }
        }
        return augments;
    }

    public void setAugmentations(ItemStack stack, List<ItemStack> augments) {
        CompoundTag tag = stack.getOrCreateTag();
        ListTag augList = new ListTag();

        for (ItemStack augment : augments) {
            CompoundTag augmentTag = new CompoundTag();
            augment.save(augmentTag);
            augList.add(augmentTag);
        }

        tag.put("Augmentations", augList);
        stack.setTag(tag);
    }

    public int getBattery(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        return tag.getInt(BATTERY_TAG);
    }

    public void setBattery(ItemStack stack, int value) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putInt(BATTERY_TAG, Math.max(0, Math.min(MAX_BATTERY, value)));

        // Re-serialize augment capability into NBT so it’s not lost
        LazyOptional<IAugmentCapability> cap = stack.getCapability(AUGMENT_CAPABILITY);
        cap.ifPresent(c -> tag.put("Augments", c.serializeNBT()));
    }

    public boolean hasCharge(ItemStack stack) {
        return getBattery(stack) > 0;
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        float fraction = (float) getBattery(stack) / MAX_BATTERY;
        return Math.round(13.0F * fraction); // Same scale as vanilla durability
    }

    @Override
    public int getBarColor(ItemStack stack) {
        float fraction = (float) getBattery(stack) / MAX_BATTERY;

        // Option A: Green-to-red like vanilla
        return Mth.hsvToRgb(fraction / 3.0F, 1.0F, 1.0F);

        // Option B: Always cyan (like energy)
        // return 0x00FFFF;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
//        tooltip.add(Component.literal("Battery: " + getBattery(stack) + " / " + MAX_BATTERY)
//                .withStyle(ChatFormatting.AQUA));
        tooltip.add(Component.literal("WORK IN PROGRESS - CAN CRASH YOU")
                .withStyle(ChatFormatting.RED));

    }

    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot, LivingEntity entity) {
        if (slot == this.type.getSlot() && hasCharge(stack)) {
            return super.getAttributeModifiers(slot, stack);
        }
        return HashMultimap.create(); // No armor if battery is empty
    }

    public void onArmorTick(ItemStack stack, Level level, Player player) {
//        System.out.println("Armor onArmorTick called");
        List<ItemStack> augmentations = getAugmentations(stack);
//        System.out.println("Augmentations count: " + augmentations.size());
        for (ItemStack aug : augmentations) {
            if (aug.getItem() instanceof IAugmentation augmentation) {
//                System.out.println("Calling onTick of: " + aug.getItem());
                augmentation.onTick(player, stack);
            }
        }

        player.inventoryMenu.broadcastChanges(); // or similar to sync container changes
    }

    @Override
    public CompoundTag getShareTag(ItemStack stack) {
        CompoundTag nbt = super.getShareTag(stack);
        if (nbt == null) {
            nbt = new CompoundTag();
        }

        // Write your augment capability or NBT data here
        LazyOptional<IAugmentCapability> cap = stack.getCapability(AUGMENT_CAPABILITY);
        CompoundTag finalNbt = nbt;
        cap.ifPresent(c -> finalNbt.put("Augments", c.serializeNBT()));

        return nbt;
    }

    @Override
    public void readShareTag(ItemStack stack, CompoundTag nbt) {
        super.readShareTag(stack, nbt);

        if (nbt != null && nbt.contains("Augments")) {
            LazyOptional<IAugmentCapability> cap = stack.getCapability(AUGMENT_CAPABILITY);
            cap.ifPresent(c -> c.deserializeNBT(nbt.getCompound("Augments")));
        }
    }

    public void recharge(ItemStack stack, int amount) {
        setBattery(stack, getBattery(stack) + amount);
    }

    @Override
    public @Nullable ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
        return new AugmentInventoryProvider(stack, 3); // example with 3 augment slots
    }

}
