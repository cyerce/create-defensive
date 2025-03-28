package net.aepherastudios.createdefensive.event;

import com.simibubi.create.foundation.ModFilePackResources;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.pack.DefensiveDynamicPack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.language.IModFileInfo;
import net.minecraftforge.forgespi.locating.IModFile;

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
