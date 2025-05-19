package net.aepherastudios.createdefensive.item.arrow;

import net.aepherastudios.createdefensive.entity.custom.BulletEntity;
import net.aepherastudios.createdefensive.entity.custom.CopperArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SmallBulletItem extends ArrowItem {
    public final float damage;

    public SmallBulletItem(float damage, Properties pProperties) {
        super(pProperties);
        this.damage = damage;
    }
}
