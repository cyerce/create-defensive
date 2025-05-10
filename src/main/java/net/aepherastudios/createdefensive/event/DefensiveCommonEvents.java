package net.aepherastudios.createdefensive.event;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class DefensiveCommonEvents {

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModBusEvents {

//        @SubscribeEvent
//        public static void addPackFinders(AddPackFindersEvent event) {
//			if (event.getPackType() == PackType.CLIENT_RESOURCES) {
//				IModFileInfo modFileInfo = ModList.get().getModFileById(CreateDefensive.MOD_ID);
//				IModFile modFile = modFileInfo.getFile();
//				event.addRepositorySource(consumer -> {
//                    Pack pack = Pack.readMetaAndCreate(CreateDefensive.asResource("defensive_legacy_copper").toString(), Component.literal("Defensive Legacy Copper"), false, id -> new ModFilePackResources(id, modFile, "resourcepacks/defensive_legacy_copper"), PackType.CLIENT_RESOURCES, Pack.Position.TOP, PackSource.BUILT_IN);
//					if (pack != null) {
//						consumer.accept(pack);
//					}
//				});
//			}
//        }
    }
}
