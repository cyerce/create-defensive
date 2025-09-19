package net.aepherastudios.createdefensive.worldgen.biome.surface;

import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.worldgen.biome.DefensiveBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class DefensiveSurfaceRules {
    private static final SurfaceRules.RuleSource MERCURIAN_REGOLITH = makeStateRule(DefensiveBlocks.MERCURIAN_REGOLITH.get());

    protected static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource mercurySurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, MERCURIAN_REGOLITH), MERCURIAN_REGOLITH);

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(DefensiveBiomes.MERCURIAN_PLAINS), MERCURIAN_REGOLITH),

                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, mercurySurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
