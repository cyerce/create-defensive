package net.aepherastudios.createdefensive;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.item.DefensiveCreativeModeTabs;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import com.mojang.logging.LogUtils;
import net.aepherastudios.createdefensive.util.DefensiveItemProperties;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreateDefensive.MOD_ID)
public class CreateDefensive {
    public static final String MOD_ID = "createdefensive";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateDefensive() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        DefensiveItems.register(modEventBus);
        DefensiveBlocks.register(modEventBus);
        DefensiveCreativeModeTabs.register(modEventBus);
        DefensiveEffects.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        DefensiveItemProperties.addCustomItemProperties();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
