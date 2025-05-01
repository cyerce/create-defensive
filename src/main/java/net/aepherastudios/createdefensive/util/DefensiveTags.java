package net.aepherastudios.createdefensive.util;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DefensiveTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_ALUMINUM_TOOL = tag("needs_aluminum_tool");
        public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = tag("needs_platinum_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = tag("needs_copper_tool");
        public static final TagKey<Block> NEEDS_ZINC_TOOL = tag("needs_zinc_tool");
        public static final TagKey<Block> NEEDS_BRASS_TOOL = tag("needs_brass_tool");
        public static final TagKey<Block> NEEDS_ROSE_QUARTZ_TOOL = tag("needs_rose_quartz_tool");
        public static final TagKey<Block> NEEDS_ELECTRUM_TOOL = tag("needs_electrum_tool");
        public static final TagKey<Block> NEEDS_REDSTONE_TOOL = tag("needs_redstone_tool");
        public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = tag("needs_rose_gold_tool");
        public static final TagKey<Block> NEEDS_STARDUST_TOOL = tag("needs_stardust_tool");
        public static final TagKey<Block> NEEDS_CRIMSTEEL_TOOL = tag("needs_crimsteel_tool");

        public static final TagKey<Block> DYED_BLAST_PLATING = tag("dyed_blast_plating");

        public static final TagKey<Block> STARDUST = tag("stardust");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CreateDefensive.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CreateDefensive.MOD_ID, name));
        }
    }
}