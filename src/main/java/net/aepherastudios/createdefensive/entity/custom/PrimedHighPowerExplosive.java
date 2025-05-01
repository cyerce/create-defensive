package net.aepherastudios.createdefensive.entity.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.Nullable;

public class PrimedHighPowerExplosive extends PrimedTnt implements TraceableEntity {
    public PrimedHighPowerExplosive(EntityType<? extends PrimedTnt> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public PrimedHighPowerExplosive(Level pLevel, double pX, double pY, double pZ, @Nullable LivingEntity pOwner) {
        super(pLevel, pX, pY, pZ, pOwner);
    }


    protected void explode() {
        this.level().explode(this, this.getX(), this.getY(0.0625D), this.getZ(), 8.0F, Level.ExplosionInteraction.TNT);
    }
}
