package net.aepherastudios.createdefensive.block;

import com.simibubi.create.AllSpriteShifts;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.custom.CokingOvenBlock;
import net.aepherastudios.createdefensive.block.custom.HighPowerExplosiveBlock;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.levelgen.feature.DripstoneUtils;
import net.minecraft.world.level.levelgen.feature.configurations.PointedDripstoneConfiguration;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DefensiveBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateDefensive.MOD_ID);

    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> VIOLET_GOLD_BLOCK = registerBlock("violet_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ECRUSITE = registerBlock("ecrusite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUNUM = registerBlock("dunum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALITE = registerBlock("coralite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> COKING_OVEN = registerBlock("coking_oven",
            () -> new CokingOvenBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> SLAG_BLOCK = registerBlock("slag_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> OAK_TRUSS = registerBlock("oak_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_TRUSS = registerBlock("birch_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_TRUSS = registerBlock("spruce_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_TRUSS = registerBlock("jungle_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_TRUSS = registerBlock("dark_oak_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_TRUSS = registerBlock("acacia_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_TRUSS = registerBlock("mangrove_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_TRUSS = registerBlock("cherry_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ANDESITE_TRUSS = registerBlock("andesite_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ZINC_TRUSS = registerBlock("zinc_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRASS_TRUSS = registerBlock("brass_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_TRUSS = registerBlock("copper_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> INDUSTRIAL_IRON_TRUSS = registerBlock("industrial_iron_truss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> COPPER_BLAST_PLATING = registerBlock("copper_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(200).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> COMPACT_INDUSTRIAL_IRON_BLOCK = registerBlock("compact_industrial_iron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> INDUSTRIAL_IRON_BLAST_PLATING = registerBlock("industrial_iron_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(300).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ZINC_BLAST_PLATING = registerBlock("zinc_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(500).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BRASS_BLAST_PLATING = registerBlock("brass_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(750).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STEEL_BLAST_PLATING = registerBlock("steel_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> RED_BLAST_PLATING = registerBlock("red_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ORANGE_BLAST_PLATING = registerBlock("orange_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> YELLOW_BLAST_PLATING = registerBlock("yellow_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LIME_BLAST_PLATING = registerBlock("lime_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> GREEN_BLAST_PLATING = registerBlock("green_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> CYAN_BLAST_PLATING = registerBlock("cyan_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LIGHT_BLUE_BLAST_PLATING = registerBlock("light_blue_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BLUE_BLAST_PLATING = registerBlock("blue_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> PURPLE_BLAST_PLATING = registerBlock("purple_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> MAGENTA_BLAST_PLATING = registerBlock("magenta_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> PINK_BLAST_PLATING = registerBlock("pink_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BLACK_BLAST_PLATING = registerBlock("black_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> GRAY_BLAST_PLATING = registerBlock("gray_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LIGHT_GRAY_BLAST_PLATING = registerBlock("light_gray_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> WHITE_BLAST_PLATING = registerBlock("white_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BROWN_BLAST_PLATING = registerBlock("brown_blast_plating",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> SMOKE_CATALYST = registerBlock("smoke_catalyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLAST_CATALYST = registerBlock("blast_catalyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SPLASH_CATALYST = registerBlock("splash_catalyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> HAUNT_CATALYST = registerBlock("haunt_catalyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> HIGH_POWER_EXPLOSIVE = registerBlock("high_power_explosive",
            () -> new HighPowerExplosiveBlock(BlockBehaviour.Properties.copy(Blocks.TNT).strength(0f).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> REDSTONE_CRYSTAL_BLOCK = registerBlock("redstone_crystal_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return DefensiveItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
