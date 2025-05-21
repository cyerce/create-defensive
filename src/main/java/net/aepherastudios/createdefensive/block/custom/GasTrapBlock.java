package net.aepherastudios.createdefensive.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class GasTrapBlock extends Block {


    public GasTrapBlock(Properties properties) {
        super(properties);
    }

    // Redstone power detection
    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (world.hasNeighborSignal(pos)) {
            shootGas(world, pos);
        }
    }

    // Entity stepping on it
    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClientSide && entity instanceof LivingEntity) {
            shootGas(world, pos);

        }
        super.stepOn(world, pos, state, entity);
    }

    // Gas shooting logic
    private void shootGas(Level world, BlockPos pos) {
        for (int i = 1; i <= 2; i++) {
            BlockPos gasPos = pos.above(i);
            if (world instanceof ServerLevel serverWorld) {
                AABB gasZone = new AABB(
                        pos.getX(), pos.getY() + 1, pos.getZ(),
                        pos.getX() + 1, pos.getY() + 4, pos.getZ() + 1);

                List<LivingEntity> targets = serverWorld.getEntitiesOfClass(LivingEntity.class, gasZone);

                for (LivingEntity entity : targets) {
                    entity.hurt(entity.damageSources().fall(), 0.1F);
                    entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 1), entity);
                }
                serverWorld.sendParticles(ParticleTypes.POOF,
                        gasPos.getX() + 0.5,
                        gasPos.getY() + 0.5,
                        gasPos.getZ() + 0.5,
                        50, // particle count
                        0, 1, 0, // spread in X, Y, Z
                        0.1 // speed
                );

                world.playSound(null, pos, SoundEvents.TRIDENT_RIPTIDE_1,
                        SoundSource.BLOCKS, 1.0f, 1.0f);
            }
        }
    }
}
