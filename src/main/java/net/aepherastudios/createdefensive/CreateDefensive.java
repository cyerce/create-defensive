package net.aepherastudios.createdefensive;

import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.client.PainiteElementalEntityRenderer;
import net.aepherastudios.createdefensive.entity.client.PainiteProjectileEntityRenderer;
import net.aepherastudios.createdefensive.entity.client.PrimedHighExplosiveRenderer;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.item.DefensiveCreativeModeTabs;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import com.mojang.logging.LogUtils;
import net.aepherastudios.createdefensive.item.client.*;
import net.aepherastudios.createdefensive.potion.DefensivePotions;
import net.aepherastudios.createdefensive.util.DefensiveItemProperties;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
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
        DefensivePotions.register(modEventBus);
        DefensiveEntities.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        //Cyerce was here :)
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        DefensiveItemProperties.addCustomItemProperties();
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation("createdefensive", path);
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
            EntityRenderers.register(DefensiveEntities.ALUMINUM_ARROW.get(), AluminumArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.SILVER_ARROW.get(), SilverArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.PLATINUM_ARROW.get(), PlatinumArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.STEEL_ARROW.get(), SteelArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.COPPER_ARROW.get(), CopperArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.ZINC_ARROW.get(), ZincArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.BRASS_ARROW.get(), BrassArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.ROSE_QUARTZ_ARROW.get(), RoseQuartzArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.WOODEN_ARROW.get(), WoodenArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.STONE_ARROW.get(), StoneArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.IRON_ARROW.get(), IronArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.GOLDEN_ARROW.get(), GoldenArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.DIAMOND_ARROW.get(), DiamondArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.NETHERITE_ARROW.get(), NetheriteArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.ELECTRUM_ARROW.get(), ElectrumArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.REDSTONE_ARROW.get(), RedstoneArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.ROSE_GOLD_ARROW.get(), RoseGoldArrowRenderer::new);
            EntityRenderers.register(DefensiveEntities.PAINITE_PROJECTILE.get(), PainiteProjectileEntityRenderer::new);

            EntityRenderers.register(DefensiveEntities.PAINITE_ELEMENTAL.get(), PainiteElementalEntityRenderer::new);

            EntityRenderers.register(DefensiveEntities.ALUMINUM_SPEAR.get(), AluminumSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.SILVER_SPEAR.get(), SilverSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.PLATINUM_SPEAR.get(), PlatinumSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.STEEL_SPEAR.get(), SteelSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.COPPER_SPEAR.get(), CopperSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.ZINC_SPEAR.get(), ZincSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.BRASS_SPEAR.get(), BrassSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.ROSE_QUARTZ_SPEAR.get(), RoseQuartzSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.WOODEN_SPEAR.get(), WoodenSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.STONE_SPEAR.get(), StoneSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.IRON_SPEAR.get(), IronSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.GOLDEN_SPEAR.get(), GoldenSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.DIAMOND_SPEAR.get(), DiamondSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.NETHERITE_SPEAR.get(), NetheriteSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.ELECTRUM_SPEAR.get(), ElectrumSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.REDSTONE_SPEAR.get(), RedstoneSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.ROSE_GOLD_SPEAR.get(), RoseGoldSpearRenderer::new);
            EntityRenderers.register(DefensiveEntities.EXPERIENCE_SPEAR.get(), ExperienceSpearRenderer::new);

            EntityRenderers.register(DefensiveEntities.PRIMED_HIGH_EXPLOSIVE.get(), PrimedHighExplosiveRenderer::new);
        }
    }
}
