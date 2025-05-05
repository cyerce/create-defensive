package net.aepherastudios.createdefensive.block.entity;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateDefensive.MOD_ID);

    public static final RegistryObject<BlockEntityType<CokingOvenBlockEntity>> COKING_OVEN_BE =
            BLOCK_ENTITIES.register("coking_oven_block_entity", () ->
                    BlockEntityType.Builder.of(CokingOvenBlockEntity::new,
                            DefensiveBlocks.COKING_OVEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
