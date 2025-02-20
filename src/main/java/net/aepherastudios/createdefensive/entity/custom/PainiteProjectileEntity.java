package net.aepherastudios.createdefensive.entity.custom;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.event.ForgeEventFactory;

public class PainiteProjectileEntity extends Fireball {
    private int explosionPower = 1;

    @Override
    public boolean isOnFire() {
        return false;
    }

    public PainiteProjectileEntity(EntityType<PainiteProjectileEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public PainiteProjectileEntity(Level pLevel, LivingEntity pShooter, double pOffsetX, double pOffsetY, double pOffsetZ, int pExplosionPower) {
        super(DefensiveEntities.PAINITE_PROJECTILE.get(), pShooter, pOffsetX, pOffsetY, pOffsetZ, pLevel);
        this.explosionPower = pExplosionPower;
    }

    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            boolean flag = ForgeEventFactory.getMobGriefingEvent(this.level(), this.getOwner());
            this.level().explode(this, this.getX(), this.getY(), this.getZ(), (float)this.explosionPower, flag, Level.ExplosionInteraction.MOB);
            this.discard();
        }

    }

    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        if (!this.level().isClientSide) {
            Entity entity = pResult.getEntity();
            Entity entity1 = this.getOwner();
            entity.hurt(this.damageSources().indirectMagic(this, entity1), 6.0F);
            if (entity1 instanceof LivingEntity) {
                this.doEnchantDamageEffects((LivingEntity)entity1, entity);
            }
        }

    }

    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putByte("ExplosionPower", (byte)this.explosionPower);
    }

    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        if (pCompound.contains("ExplosionPower", 99)) {
            this.explosionPower = pCompound.getByte("ExplosionPower");
        }
    }}