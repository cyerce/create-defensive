package net.aepherastudios.createdefensive.item.custom.arrow;

import net.aepherastudios.createdefensive.entity.custom.NetheriteArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NetheriteArrowItem extends ArrowItem {
    public final float damage;

    public NetheriteArrowItem(float damage, Properties pProperties) {
        super(pProperties);
        this.damage = damage;
    }

    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        NetheriteArrowEntity arrow = new NetheriteArrowEntity(pShooter, pLevel);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }
}