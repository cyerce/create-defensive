package net.aepherastudios.createdefensive.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AirTrapBlockEntity extends BlockEntity {

    private long lastFireTime = 0;
    private static final long COOLDOWN_TICKS = 60; // 3 seconds at 20 ticks per second

    public AirTrapBlockEntity(BlockPos pos, BlockState state) {
        super(DefensiveBlockEntities.AIR_TRAP_BLOCK_ENTITY.get(), pos, state);
    }

    public boolean canShoot(Level level) {
        long gameTime = level.getGameTime();
        if (gameTime - lastFireTime >= COOLDOWN_TICKS) {
            lastFireTime = gameTime;
            return true;
        }
        return false;
    }
}
