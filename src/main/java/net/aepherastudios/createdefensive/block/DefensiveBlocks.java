package net.aepherastudios.createdefensive.block;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.DripstoneUtils;
import net.minecraft.world.level.levelgen.feature.configurations.PointedDripstoneConfiguration;
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

    public static final RegistryObject<Block> POINTED_CRIMSITE = registerBlock("pointed_crimsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POINTED_ASURINE = registerBlock("pointed_asurine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POINTED_VERIDIUM = registerBlock("pointed_veridium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POINTED_OCHRUM = registerBlock("pointed_ochrum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POINTED_SCORIA = registerBlock("pointed_scoria",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POINTED_SCORCHIA = registerBlock("pointed_scorchia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> POINTED_CALCITE = registerBlock("pointed_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ECRUSITE = registerBlock("ecrusite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUNUM = registerBlock("dunum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALITE = registerBlock("coralite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

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
