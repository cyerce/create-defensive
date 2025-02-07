package net.aepherastudios.createdefensive.entity.custom;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class StoneArrowEntity extends AbstractArrow {
    public StoneArrowEntity(EntityType<? extends AbstractArrow> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public StoneArrowEntity(LivingEntity pShooter, Level pLevel) {
        super(DefensiveEntities.STONE_ARROW.get(), pShooter, pLevel);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(DefensiveItems.STONE_ARROW.get());
    }
}
