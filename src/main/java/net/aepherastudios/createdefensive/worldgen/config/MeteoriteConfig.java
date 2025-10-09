package net.aepherastudios.createdefensive.worldgen.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public record MeteoriteConfig(
        int radius,
        int innerThickness,
        float shellCrackChance,
        Holder<Block> coreBlock,
        Holder<Block> middleBlock,
        Holder<Block> shellBlock,
        Holder<Block> crackedShellBlock,
        float middleReplacementChance,        // new
        Holder<Block> middleReplacementBlock,// new
        int minDistance,
        int maxDistance
) implements FeatureConfiguration {
    public static final Codec<MeteoriteConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("radius").forGetter(MeteoriteConfig::radius),
            Codec.INT.fieldOf("inner_thickness").forGetter(MeteoriteConfig::innerThickness),
            Codec.FLOAT.fieldOf("shell_crack_chance").forGetter(MeteoriteConfig::shellCrackChance),
            BuiltInRegistries.BLOCK.holderByNameCodec().fieldOf("core_block").forGetter(MeteoriteConfig::coreBlock),
            BuiltInRegistries.BLOCK.holderByNameCodec().fieldOf("middle_block").forGetter(MeteoriteConfig::middleBlock),
            BuiltInRegistries.BLOCK.holderByNameCodec().fieldOf("shell_block").forGetter(MeteoriteConfig::shellBlock),
            BuiltInRegistries.BLOCK.holderByNameCodec().optionalFieldOf("cracked_shell_block", null).forGetter(MeteoriteConfig::crackedShellBlock),
            Codec.FLOAT.optionalFieldOf("middle_replacement_chance", 0f).forGetter(MeteoriteConfig::middleReplacementChance),
            BuiltInRegistries.BLOCK.holderByNameCodec().optionalFieldOf("middle_replacement_block", null).forGetter(MeteoriteConfig::middleReplacementBlock),
            Codec.INT.fieldOf("min_distance").forGetter(MeteoriteConfig::minDistance),
            Codec.INT.fieldOf("max_distance").forGetter(MeteoriteConfig::maxDistance)
    ).apply(instance, MeteoriteConfig::new));
}