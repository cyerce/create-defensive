package net.aepherastudios.createdefensive.worldgen.features;

import com.mojang.serialization.Codec;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class OilLakeFeature extends Feature<NoneFeatureConfiguration> {
    public OilLakeFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos origin = context.origin();
        LevelAccessor level = context.level();
        RandomSource random = context.random();

        if (origin.getY() > 40) return false;
        double squishFactor = 2.0;

        int baseRadius = 10;
        int radiusVariance = 5;
        int radius = baseRadius + random.nextInt(radiusVariance * 2 + 1) - radiusVariance;
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    double dy = y * squishFactor;
                    double dist = Math.sqrt(x * x + dy * dy + z * z);
                    double jitteredRadius = radius + (random.nextDouble() * 0.7 - 0.35);
                    if (dist <= jitteredRadius) {
                        pos.set(origin.offset(x, y, z));
                        BlockState state = level.getBlockState(pos);
                        if (state.isAir() || state.is(Blocks.BEDROCK)) {
                            continue;
                        }
                        level.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
                    }
                }
            }
        }

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    double dy = y * squishFactor;
                    double dist = Math.sqrt(x * x + dy * dy + z * z);
                    double jitteredRadius = radius + (random.nextDouble() * 0.7 - 0.35);
                    if (dist <= jitteredRadius) {
                        pos.set(origin.offset(x, y, z));
                        level.setBlock(pos, DefensiveBlocks.DIRTY_RAW_CRUDE_OIL.get().defaultBlockState(), 2);
                    }
                }
            }
        }
        return true;
    }
}
