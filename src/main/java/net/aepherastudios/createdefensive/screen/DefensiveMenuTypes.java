package net.aepherastudios.createdefensive.screen;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.entity.IndustrialHeaterBlockEntity;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreateDefensive.MOD_ID);

    public static final RegistryObject<MenuType<CokingOvenMenu>> COKING_OVEN_MENU =
            registerMenuType(CokingOvenMenu::new, "coking_oven_menu");

    public static final RegistryObject<MenuType<AugmentMenu>> AUGMENT_MENU =
            MENUS.register("augment_menu", () ->
                    new MenuType<>(AugmentMenu::new, FeatureFlagSet.of(FeatureFlags.VANILLA)));

    public static final RegistryObject<MenuType<IndustrialHeaterMenu>> INDUSTRIAL_HEATER = MENUS.register("industrial_heater",
            () -> IForgeMenuType.create((windowId, inv, buf) -> new IndustrialHeaterMenu(windowId, inv, buf))
    );


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }
}