package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.PainiteElementalEntity;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateDefensive.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DefensiveEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(DefensiveEntities.PAINITE_ELEMENTAL.get(), PainiteElementalEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(DefensiveEntities.PAINITE_ELEMENTAL.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                PainiteElementalEntity::checkMobSpawnRules,
                SpawnPlacementRegisterEvent.Operation.OR);
    }
}