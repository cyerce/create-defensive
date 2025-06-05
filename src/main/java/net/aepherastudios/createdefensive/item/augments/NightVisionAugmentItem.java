package net.aepherastudios.createdefensive.item.augments;

import net.aepherastudios.createdefensive.item.IAugmentation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class NightVisionAugmentItem extends Item implements IAugmentation {
    public NightVisionAugmentItem(Properties properties) {
        super(properties);
    }

    @Override
    public void onTick(Player player, ItemStack armorStack) {
        MobEffectInstance current = player.getEffect(MobEffects.NIGHT_VISION);
        if (current == null || current.getAmplifier() < 1 || current.getDuration() < 5) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 10, 0, true, false));
        }
    }
}
