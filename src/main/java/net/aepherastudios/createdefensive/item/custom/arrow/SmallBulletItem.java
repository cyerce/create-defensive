package net.aepherastudios.createdefensive.item.custom.arrow;

import net.minecraft.world.item.ArrowItem;

public class SmallBulletItem extends ArrowItem {
    public final float damage;

    public SmallBulletItem(float damage, Properties pProperties) {
        super(pProperties);
        this.damage = damage;
    }
}
