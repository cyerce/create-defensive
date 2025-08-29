package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class NaturalGasScannerItem extends Item {
    public NaturalGasScannerItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.getCooldowns().addCooldown(this, 40);
            BlockPos playerPos = player.blockPosition();
            int scanRadius = 250;
            int maxDepth = playerPos.getY(); // down to bedrock
            BlockPos nearestNaturalGas = null;
            double closestDistanceSq = Double.MAX_VALUE;

            // XZ scanning only, vertical to bedrock
            for (int dx = -scanRadius; dx <= scanRadius; dx++) {
                for (int dz = -scanRadius; dz <= scanRadius; dz++) {
                    for (int dy = 0; dy <= maxDepth; dy++) {
                        BlockPos checkPos = playerPos.offset(dx, -dy, dz);
                        BlockState state = level.getBlockState(checkPos);

                        if (state.is(DefensiveBlocks.RAW_NATURAL_GAS.get())) {
                            double distSq = dx * dx + dz * dz;
                            if (distSq < closestDistanceSq) {
                                closestDistanceSq = distSq;
                                nearestNaturalGas = checkPos;
                            }
                            break;
                        }
                    }
                }
            }
            ItemStack stack = player.getItemInHand(hand);

            if (nearestNaturalGas == null || Math.sqrt(closestDistanceSq) > 250) {
                spawnParticles(level, playerPos, ParticleTypes.SMOKE, 12, 0.2);
                player.sendSystemMessage(Component.literal("§cNo Natural Gas Nearby"));
            } else {
                BlockPos naturalGasXZ = new BlockPos(nearestNaturalGas.getX(), playerPos.getY(), nearestNaturalGas.getZ());
                int dx = naturalGasXZ.getX() - playerPos.getX();
                int dz = naturalGasXZ.getZ() - playerPos.getZ();
                double horizontalDist = Math.sqrt(dx * dx + dz * dz);

                String ns = dz < 0 ? "North" : (dz > 0 ? "South" : "");
                String ew = dx < 0 ? "West" : (dx > 0 ? "East" : "");

                if (horizontalDist > 100) {
                    spawnParticles(level, playerPos, ParticleTypes.FLAME, 10, 0.1);
                    String dirText = "Natural Gas to the ";
                    if (!ns.isEmpty()) dirText += ns;
                    if (!ew.isEmpty()) dirText += (!ns.isEmpty() ? " and " : "") + ew;
                    player.sendSystemMessage(Component.literal("§6" + dirText));
                } else if (horizontalDist > 0) {
                    spawnParticles(level, playerPos, ParticleTypes.END_ROD, 15, 0.15);
                    int stepsNorthSouth = Math.abs(dz);
                    int stepsEastWest = Math.abs(dx);

                    StringBuilder message = new StringBuilder("§eNatural Gas ");

                    if (stepsNorthSouth > 0) {
                        message.append(" ").append(stepsNorthSouth).append(" steps to the ").append(ns);
                        if (stepsEastWest > 0) message.append(", ");
                    }

                    if (stepsEastWest > 0) {
                        message.append(stepsEastWest).append(" steps to the ").append(ew);
                    }

                    player.sendSystemMessage(Component.literal(message.toString()));
                } else {
                    spawnParticles(level, playerPos, ParticleTypes.HAPPY_VILLAGER, 20, 0.25);
                    player.sendSystemMessage(Component.literal("§aNatural Gas Found"));
                }
            }
        }

        return InteractionResultHolder.success(player.getItemInHand(hand));
    }

    private void spawnParticles(Level level, BlockPos pos, ParticleOptions type, int count, double spread) {
        for (int i = 0; i < count; i++) {
            double x = pos.getX() + 0.5 + (level.random.nextGaussian() * spread);
            double y = pos.getY() + 1.0 + (level.random.nextGaussian() * spread * 0.5);
            double z = pos.getZ() + 0.5 + (level.random.nextGaussian() * spread);
            ((ServerLevel) level).sendParticles(type, x, y, z, 1, 0, 0, 0, 0);
        }
    }
}
