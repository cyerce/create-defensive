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

    public static final RegistryObject<BlockEntityType<ProximityMineBlockEntity>> PROXIMITY_MINE =
            BLOCK_ENTITIES.register("proximity_mine", () ->
                    BlockEntityType.Builder.of(ProximityMineBlockEntity::new, DefensiveBlocks.PROXIMITY_MINE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FireGrateBlockEntity>> FIRE_GRATE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("fire_grate_block_entity", () ->
                    BlockEntityType.Builder.of(FireGrateBlockEntity::new, DefensiveBlocks.FIRE_GRATE.get()).build(null));

    public static final RegistryObject<BlockEntityType<LightningTrapBlockEntity>> LIGHTNING_TRAP_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("lightning_trap_block_entity", () ->
                    BlockEntityType.Builder.of(LightningTrapBlockEntity::new, DefensiveBlocks.LIGHTNING_TRAP.get()).build(null));

    public static final RegistryObject<BlockEntityType<AirTrapBlockEntity>> AIR_TRAP_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("air_trap_block_entity", () ->
                    BlockEntityType.Builder.of(AirTrapBlockEntity::new, DefensiveBlocks.AIR_TRAP.get()).build(null));

    public static final RegistryObject<BlockEntityType<GasTrapBlockEntity>> GAS_TRAP_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("gas_trap_block_entity", () ->
                    BlockEntityType.Builder.of(GasTrapBlockEntity::new, DefensiveBlocks.GAS_TRAP.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
