package net.aepherastudios.createdefensive.block.custom;

import net.aepherastudios.createdefensive.block.entity.FireGrateBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class FireGrateBlock extends Block {


    public FireGrateBlock(Properties properties) {
        super(properties);
    }

    // Redstone power detection
    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (world.hasNeighborSignal(pos)) {
            shootFire(world, pos);
        }
    }

    // Entity stepping on it
    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClientSide && entity instanceof LivingEntity) {
            shootFire(world, pos);

        }
        super.stepOn(world, pos, state, entity);
    }

    // Fire shooting logic
    private void shootFire(Level world, BlockPos pos) {
        for (int i = 1; i <= 2; i++) {
            BlockPos firePos = pos.above(i);
            if (world instanceof ServerLevel serverWorld) {
                AABB fireZone = new AABB(
                        pos.getX(), pos.getY() + 1, pos.getZ(),
                        pos.getX() + 1, pos.getY() + 4, pos.getZ() + 1);

                List<LivingEntity> targets = serverWorld.getEntitiesOfClass(LivingEntity.class, fireZone);

                for (LivingEntity entity : targets) {
                    entity.hurt(entity.damageSources().inFire(), 5.0F);
                    entity.setSecondsOnFire(5); // set on fire
                    entity.setDeltaMovement(entity.getDeltaMovement().add(0, 0.25, 0));
                }

                serverWorld.sendParticles(ParticleTypes.FLAME,
                        firePos.getX() + 0.5,
                        firePos.getY() + 0.5,
                        firePos.getZ() + 0.5,
                        100, // particle count
                        0, 2, 0, // spread in X, Y, Z
                        0.05 // speed
                );
            }
            if (world instanceof ServerLevel serverWorld) {
                serverWorld.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                        firePos.getX() + 0.5,
                        firePos.getY() + 0.5,
                        firePos.getZ() + 0.5,
                        10, // particle count
                        0, 2, 0, // spread in X, Y, Z
                        0.01 // speed
                );
            }
            if (world instanceof ServerLevel serverWorld) {
                serverWorld.sendParticles(ParticleTypes.LAVA,
                        firePos.getX() + 0.5,
                        firePos.getY() + 0.5,
                        firePos.getZ() + 0.5,
                        10, // particle count
                        0, 2, 0, // spread in X, Y, Z
                        0.05 // speed
                );
            }
            if (world instanceof ServerLevel serverWorld) {
                serverWorld.sendParticles(ParticleTypes.LAVA,
                        firePos.getX() + 0.5,
                        firePos.getY() + 0.5,
                        firePos.getZ() + 0.5,
                        10, // particle count
                        0, 2, 0, // spread in X, Y, Z
                        0.05 // speed
                );
            }
        }

        world.playSound(null, pos, SoundEvents.FIRECHARGE_USE,
                SoundSource.BLOCKS, 1.0f, 1.0f);
        world.playSound(null, pos, SoundEvents.FIREWORK_ROCKET_LARGE_BLAST,
                SoundSource.BLOCKS, 1.0f, 1.0f);
        world.playSound(null, pos, SoundEvents.BLAZE_AMBIENT,
                SoundSource.BLOCKS, 1.0f, 1.0f);
    }
}
