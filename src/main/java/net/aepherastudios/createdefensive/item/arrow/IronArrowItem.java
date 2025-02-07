package net.aepherastudios.createdefensive.item.arrow;

import net.aepherastudios.createdefensive.entity.custom.IronArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class IronArrowItem extends ArrowItem {
    public final float damage;

    public IronArrowItem(float damage, Properties pProperties) {
        super(pProperties);
        this.damage = damage;
    }

    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        IronArrowEntity arrow = new IronArrowEntity(pShooter, pLevel);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }
}