package net.aepherastudios.createdefensive.worldgen.features;

import com.mojang.serialization.Codec;
import net.aepherastudios.createdefensive.worldgen.config.MeteoriteConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class MeteoriteFeature extends Feature<MeteoriteConfig> {
    public MeteoriteFeature(Codec<MeteoriteConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<MeteoriteConfig> context) {
        WorldGenLevel world = context.level();
        BlockPos pos = context.origin();
        RandomSource random = context.random();
        MeteoriteConfig config = context.config();

        int radius = config.radius();
        int inner = config.innerThickness();

        Block coreBlock = config.coreBlock().value();
        Block middleBlock = config.middleBlock().value();
        Block shellBlock = config.shellBlock().value();
        Block crackedShell = config.crackedShellBlock() != null ? config.crackedShellBlock().value() : shellBlock;

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    double dist = Math.sqrt(x*x + y*y + z*z);
                    BlockPos targetPos = pos.offset(x, y, z);

                    if (dist <= 0.5) {
                        // Core
                        world.setBlock(targetPos, coreBlock.defaultBlockState(), 2);
                    }
                    else if (dist <= inner + 0.5) {
                        // Middle layer with optional replacement
                        if (config.middleReplacementBlock() != null && random.nextFloat() < config.middleReplacementChance()) {
                            world.setBlock(targetPos, config.middleReplacementBlock().value().defaultBlockState(), 2);
                        } else {
                            world.setBlock(targetPos, middleBlock.defaultBlockState(), 2);
                        }
                    }
                    else if (dist <= radius) {
                        // Outer shell with replacement chance
                        if (random.nextFloat() < config.shellCrackChance()) {
                            world.setBlock(targetPos, crackedShell.defaultBlockState(), 2);
                        } else {
                            world.setBlock(targetPos, shellBlock.defaultBlockState(), 2);
                        }
                    }
                }
            }
        }

        return true;
    }
}