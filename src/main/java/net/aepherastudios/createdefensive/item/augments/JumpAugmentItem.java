package net.aepherastudios.createdefensive.item.augments;

import net.aepherastudios.createdefensive.item.IAugmentation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class JumpAugmentItem extends Item implements IAugmentation {
    public JumpAugmentItem(Properties properties) {
        super(properties);
    }

    @Override
    public void onTick(Player player, ItemStack armorStack) {
        MobEffectInstance current = player.getEffect(MobEffects.JUMP);
        if (current == null || current.getAmplifier() < 1 || current.getDuration() < 5) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 10, 1, true, false));
        }
    }
}
