package net.aepherastudios.createdefensive.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class ProximityMineBlockEntity extends BlockEntity {

    public ProximityMineBlockEntity(BlockPos pos, BlockState state) {
        super(DefensiveBlockEntities.PROXIMITY_MINE.get(), pos, state);
    }

    public void checkForPlayersAndExplode() {
        if (level == null || level.isClientSide) return;

        List<Player> players = level.getEntitiesOfClass(Player.class,
                new AABB(worldPosition).inflate(2));

        if (!players.isEmpty()) {
            level.removeBlock(worldPosition, false);
            level.explode(null, worldPosition.getX() + 0.5, worldPosition.getY() + 0.5, worldPosition.getZ() + 0.5,
                    3.0F, Level.ExplosionInteraction.BLOCK);
        }
    }
}