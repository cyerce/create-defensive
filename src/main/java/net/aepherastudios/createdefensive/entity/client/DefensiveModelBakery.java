package net.aepherastudios.createdefensive.entity.client;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.profiling.ProfilerFiller;

import java.util.List;
import java.util.Map;

public class DefensiveModelBakery extends ModelBakery {
    public DefensiveModelBakery(BlockColors pBlockColors, ProfilerFiller pProfilerFiller, Map<ResourceLocation, BlockModel> pModelResources, Map<ResourceLocation, List<LoadedJson>> pBlockStateResources) {
        super(pBlockColors, pProfilerFiller, pModelResources, pBlockStateResources);
    }

    public static final Material OAK_SHIELD_BASE = new Material(Sheets.SHIELD_SHEET, new ResourceLocation("entity/oak_shield_base"));
    public static final Material NO_PATTERN_OAK_SHIELD = new Material(Sheets.SHIELD_SHEET, new ResourceLocation("entity/oak_shield_base_nopattern"));
}
