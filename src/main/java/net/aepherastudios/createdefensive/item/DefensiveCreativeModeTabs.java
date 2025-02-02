package net.aepherastudios.createdefensive.item;

import com.simibubi.create.AllItems;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DefensiveCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateDefensive.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATEDEFENSIVE_TAB = CREATIVE_MODE_TABS.register("createdefensive_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DefensiveItems.ROSE_GOLD_CEREMONIAL_HELMET.get()))
                    .title(Component.translatable("creativetab.createdefensive_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(DefensiveItems.ALUMINUM_INGOT.get());
                        pOutput.accept(DefensiveBlocks.ALUMINUM_ORE.get());
                        pOutput.accept(DefensiveBlocks.DEEPSLATE_ALUMINUM_ORE.get());
                        pOutput.accept(DefensiveItems.RAW_ALUMINUM.get());
                        pOutput.accept(AllItems.CRUSHED_BAUXITE.get());
                        pOutput.accept(DefensiveBlocks.RAW_ALUMINUM_BLOCK.get());
                        pOutput.accept(DefensiveBlocks.ALUMINUM_BLOCK.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_NUGGET.get());
                        pOutput.accept(DefensiveItems.SILVER_INGOT.get());
                        pOutput.accept(DefensiveBlocks.SILVER_ORE.get());
                        pOutput.accept(DefensiveBlocks.DEEPSLATE_SILVER_ORE.get());
                        pOutput.accept(DefensiveItems.RAW_SILVER.get());
                        pOutput.accept(AllItems.CRUSHED_SILVER.get());
                        pOutput.accept(DefensiveBlocks.RAW_SILVER_BLOCK.get());
                        pOutput.accept(DefensiveBlocks.SILVER_BLOCK.get());
                        pOutput.accept(DefensiveItems.SILVER_NUGGET.get());
                        pOutput.accept(DefensiveItems.PLATINUM_INGOT.get());
                        pOutput.accept(DefensiveBlocks.PLATINUM_ORE.get());
                        pOutput.accept(DefensiveBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(DefensiveItems.RAW_PLATINUM.get());
                        pOutput.accept(AllItems.CRUSHED_PLATINUM.get());
                        pOutput.accept(DefensiveBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(DefensiveBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(DefensiveItems.PLATINUM_NUGGET.get());
                        pOutput.accept(DefensiveItems.STEEL_INGOT.get());
                        pOutput.accept(DefensiveItems.STEEL_NUGGET.get());
                        pOutput.accept(DefensiveBlocks.STEEL_BLOCK.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_INGOT.get());
                        pOutput.accept(DefensiveItems.UNSTABLE_ROSE_GOLD_INGOT.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_NUGGET.get());
                        pOutput.accept(DefensiveBlocks.ROSE_GOLD_BLOCK.get());
                        pOutput.accept(DefensiveItems.VIOLET_GOLD_INGOT.get());
                        pOutput.accept(DefensiveItems.VIOLET_GOLD_NUGGET.get());
                        pOutput.accept(DefensiveBlocks.VIOLET_GOLD_BLOCK.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_INGOT.get());
                        pOutput.accept(DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());
                        pOutput.accept(DefensiveItems.ENERGIZED_ROSE_QUARTZ.get());
                        pOutput.accept(DefensiveItems.UNSTABLE_REDSTONE_INGOT.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_NUGGET.get());
                        pOutput.accept(DefensiveBlocks.ELECTRUM_BLOCK.get());
                        pOutput.accept(DefensiveItems.WEAPON_HANDLE.get());

                        pOutput.accept(DefensiveItems.SILVER_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(DefensiveItems.ALUMINUM_HELMET.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_BOOTS.get());

                        pOutput.accept(DefensiveItems.COPPER_HELMET.get());
                        pOutput.accept(DefensiveItems.COPPER_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.COPPER_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.COPPER_BOOTS.get());

                        pOutput.accept(DefensiveItems.ZINC_HELMET.get());
                        pOutput.accept(DefensiveItems.ZINC_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.ZINC_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.ZINC_BOOTS.get());

                        pOutput.accept(DefensiveItems.SILVER_HELMET.get());
                        pOutput.accept(DefensiveItems.SILVER_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.SILVER_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.SILVER_BOOTS.get());

                        pOutput.accept(DefensiveItems.PLATINUM_HELMET.get());
                        pOutput.accept(DefensiveItems.PLATINUM_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.PLATINUM_BOOTS.get());

                        pOutput.accept(DefensiveItems.ROSE_GOLD_CEREMONIAL_HELMET.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_CEREMONIAL_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_CEREMONIAL_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_CEREMONIAL_BOOTS.get());

                        pOutput.accept(DefensiveItems.VIOLET_GOLD_CEREMONIAL_HELMET.get());
                        pOutput.accept(DefensiveItems.VIOLET_GOLD_CEREMONIAL_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.VIOLET_GOLD_CEREMONIAL_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.VIOLET_GOLD_CEREMONIAL_BOOTS.get());

                        pOutput.accept(DefensiveItems.GOLD_CEREMONIAL_HELMET.get());
                        pOutput.accept(DefensiveItems.GOLD_CEREMONIAL_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.GOLD_CEREMONIAL_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.GOLD_CEREMONIAL_BOOTS.get());

                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_HELMET.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_BOOTS.get());

                        pOutput.accept(DefensiveItems.BRASS_HELMET.get());
                        pOutput.accept(DefensiveItems.BRASS_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.BRASS_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.BRASS_BOOTS.get());

                        pOutput.accept(DefensiveItems.ELECTRUM_HELMET.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_BOOTS.get());

                        pOutput.accept(DefensiveItems.REDSTONE_HELMET.get());
                        pOutput.accept(DefensiveItems.REDSTONE_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.REDSTONE_BOOTS.get());

                        pOutput.accept(DefensiveItems.ROSE_GOLD_HELMET.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_BOOTS.get());

                        pOutput.accept(DefensiveItems.STEEL_HELMET.get());
                        pOutput.accept(DefensiveItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(DefensiveItems.STEEL_LEGGINGS.get());
                        pOutput.accept(DefensiveItems.STEEL_BOOTS.get());

                        pOutput.accept(DefensiveItems.ALUMINUM_SWORD.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_PICKAXE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_AXE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_SHOVEL.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_HOE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_HALBERD.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_SCYTHE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_GREATAXE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_SPEAR.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_HAMMER.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_GLAIVE.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_M0RNINGSTAR.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_DAGGER.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_STAFF.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_BOW.get());
                        pOutput.accept(DefensiveItems.ALUMINUM_CAM.get());

                        pOutput.accept(DefensiveItems.SILVER_SWORD.get());
                        pOutput.accept(DefensiveItems.SILVER_PICKAXE.get());
                        pOutput.accept(DefensiveItems.SILVER_AXE.get());
                        pOutput.accept(DefensiveItems.SILVER_SHOVEL.get());
                        pOutput.accept(DefensiveItems.SILVER_HOE.get());
                        pOutput.accept(DefensiveItems.SILVER_HALBERD.get());
                        pOutput.accept(DefensiveItems.SILVER_SCYTHE.get());
                        pOutput.accept(DefensiveItems.SILVER_GREATAXE.get());
                        pOutput.accept(DefensiveItems.SILVER_SPEAR.get());
                        pOutput.accept(DefensiveItems.SILVER_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.SILVER_HAMMER.get());
                        pOutput.accept(DefensiveItems.SILVER_GLAIVE.get());
                        pOutput.accept(DefensiveItems.SILVER_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.SILVER_DAGGER.get());
                        pOutput.accept(DefensiveItems.SILVER_STAFF.get());
                        pOutput.accept(DefensiveItems.SILVER_BOW.get());

                        pOutput.accept(DefensiveItems.PLATINUM_SWORD.get());
                        pOutput.accept(DefensiveItems.PLATINUM_PICKAXE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_AXE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_SHOVEL.get());
                        pOutput.accept(DefensiveItems.PLATINUM_HOE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_HALBERD.get());
                        pOutput.accept(DefensiveItems.PLATINUM_SCYTHE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_GREATAXE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_SPEAR.get());
                        pOutput.accept(DefensiveItems.PLATINUM_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.PLATINUM_HAMMER.get());
                        pOutput.accept(DefensiveItems.PLATINUM_GLAIVE.get());
                        pOutput.accept(DefensiveItems.PLATINUM_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.PLATINUM_DAGGER.get());
                        pOutput.accept(DefensiveItems.PLATINUM_STAFF.get());
                        pOutput.accept(DefensiveItems.PLATINUM_BOW.get());

                        pOutput.accept(DefensiveItems.COPPER_SWORD.get());
                        pOutput.accept(DefensiveItems.COPPER_PICKAXE.get());
                        pOutput.accept(DefensiveItems.COPPER_AXE.get());
                        pOutput.accept(DefensiveItems.COPPER_SHOVEL.get());
                        pOutput.accept(DefensiveItems.COPPER_HOE.get());
                        pOutput.accept(DefensiveItems.COPPER_HALBERD.get());
                        pOutput.accept(DefensiveItems.COPPER_SCYTHE.get());
                        pOutput.accept(DefensiveItems.COPPER_GREATAXE.get());
                        pOutput.accept(DefensiveItems.COPPER_SPEAR.get());
                        pOutput.accept(DefensiveItems.COPPER_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.COPPER_HAMMER.get());
                        pOutput.accept(DefensiveItems.COPPER_GLAIVE.get());
                        pOutput.accept(DefensiveItems.COPPER_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.COPPER_DAGGER.get());
                        pOutput.accept(DefensiveItems.COPPER_STAFF.get());
                        pOutput.accept(DefensiveItems.COPPER_BOW.get());
                        pOutput.accept(DefensiveItems.COPPER_CAM.get());

                        pOutput.accept(DefensiveItems.ZINC_SWORD.get());
                        pOutput.accept(DefensiveItems.ZINC_PICKAXE.get());
                        pOutput.accept(DefensiveItems.ZINC_AXE.get());
                        pOutput.accept(DefensiveItems.ZINC_SHOVEL.get());
                        pOutput.accept(DefensiveItems.ZINC_HOE.get());
                        pOutput.accept(DefensiveItems.ZINC_HALBERD.get());
                        pOutput.accept(DefensiveItems.ZINC_SCYTHE.get());
                        pOutput.accept(DefensiveItems.ZINC_GREATAXE.get());
                        pOutput.accept(DefensiveItems.ZINC_SPEAR.get());
                        pOutput.accept(DefensiveItems.ZINC_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.ZINC_HAMMER.get());
                        pOutput.accept(DefensiveItems.ZINC_GLAIVE.get());
                        pOutput.accept(DefensiveItems.ZINC_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.ZINC_DAGGER.get());
                        pOutput.accept(DefensiveItems.ZINC_STAFF.get());
                        pOutput.accept(DefensiveItems.ZINC_BOW.get());
                        pOutput.accept(DefensiveItems.ZINC_CAM.get());

                        pOutput.accept(DefensiveItems.BRASS_SWORD.get());
                        pOutput.accept(DefensiveItems.BRASS_PICKAXE.get());
                        pOutput.accept(DefensiveItems.BRASS_AXE.get());
                        pOutput.accept(DefensiveItems.BRASS_SHOVEL.get());
                        pOutput.accept(DefensiveItems.BRASS_HOE.get());
                        pOutput.accept(DefensiveItems.BRASS_HALBERD.get());
                        pOutput.accept(DefensiveItems.BRASS_SCYTHE.get());
                        pOutput.accept(DefensiveItems.BRASS_GREATAXE.get());
                        pOutput.accept(DefensiveItems.BRASS_SPEAR.get());
                        pOutput.accept(DefensiveItems.BRASS_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.BRASS_HAMMER.get());
                        pOutput.accept(DefensiveItems.BRASS_GLAIVE.get());
                        pOutput.accept(DefensiveItems.BRASS_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.BRASS_DAGGER.get());
                        pOutput.accept(DefensiveItems.BRASS_STAFF.get());
                        pOutput.accept(DefensiveItems.BRASS_BOW.get());
                        pOutput.accept(DefensiveItems.BRASS_CAM.get());

                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_SWORD.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_PICKAXE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_AXE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_SHOVEL.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_HOE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_HALBERD.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_SCYTHE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_GREATAXE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_SPEAR.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_ROD.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_HAMMER.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_GLAIVE.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_DAGGER.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_STAFF.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_BOW.get());
                        pOutput.accept(DefensiveItems.ROSE_QUARTZ_CAM.get());

                        pOutput.accept(DefensiveItems.STEEL_SWORD.get());
                        pOutput.accept(DefensiveItems.STEEL_PICKAXE.get());
                        pOutput.accept(DefensiveItems.STEEL_AXE.get());
                        pOutput.accept(DefensiveItems.STEEL_SHOVEL.get());
                        pOutput.accept(DefensiveItems.STEEL_HOE.get());
                        pOutput.accept(DefensiveItems.STEEL_HALBERD.get());
                        pOutput.accept(DefensiveItems.STEEL_SCYTHE.get());
                        pOutput.accept(DefensiveItems.STEEL_GREATAXE.get());
                        pOutput.accept(DefensiveItems.STEEL_SPEAR.get());
                        pOutput.accept(DefensiveItems.STEEL_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.STEEL_HAMMER.get());
                        pOutput.accept(DefensiveItems.STEEL_GLAIVE.get());
                        pOutput.accept(DefensiveItems.STEEL_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.STEEL_DAGGER.get());
                        pOutput.accept(DefensiveItems.STEEL_STAFF.get());
                        pOutput.accept(DefensiveItems.STEEL_BOW.get());
                        pOutput.accept(DefensiveItems.STEEL_CAM.get());

                        pOutput.accept(DefensiveItems.ELECTRUM_SWORD.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_PICKAXE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_AXE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_SHOVEL.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_HOE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_HALBERD.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_SCYTHE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_GREATAXE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_SPEAR.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_HAMMER.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_GLAIVE.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_DAGGER.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_STAFF.get());
                        pOutput.accept(DefensiveItems.ELECTRUM_BOW.get());

                        pOutput.accept(DefensiveItems.REDSTONE_SWORD.get());
                        pOutput.accept(DefensiveItems.REDSTONE_PICKAXE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_AXE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_SHOVEL.get());
                        pOutput.accept(DefensiveItems.REDSTONE_HOE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_HALBERD.get());
                        pOutput.accept(DefensiveItems.REDSTONE_SCYTHE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_GREATAXE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_SPEAR.get());
                        pOutput.accept(DefensiveItems.REDSTONE_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.REDSTONE_HAMMER.get());
                        pOutput.accept(DefensiveItems.REDSTONE_GLAIVE.get());
                        pOutput.accept(DefensiveItems.REDSTONE_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.REDSTONE_DAGGER.get());
                        pOutput.accept(DefensiveItems.REDSTONE_STAFF.get());
                        pOutput.accept(DefensiveItems.REDSTONE_BOW.get());

                        pOutput.accept(DefensiveItems.ROSE_GOLD_SWORD.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_PICKAXE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_AXE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_SHOVEL.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_HOE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_HALBERD.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_SCYTHE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_GREATAXE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_SPEAR.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_HAMMER.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_GLAIVE.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_DAGGER.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_STAFF.get());
                        pOutput.accept(DefensiveItems.ROSE_GOLD_BOW.get());

                        pOutput.accept(DefensiveItems.WOODEN_HALBERD.get());
                        pOutput.accept(DefensiveItems.WOODEN_SCYTHE.get());
                        pOutput.accept(DefensiveItems.WOODEN_GREATAXE.get());
                        pOutput.accept(DefensiveItems.WOODEN_SPEAR.get());
                        pOutput.accept(DefensiveItems.WOODEN_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.WOODEN_HAMMER.get());
                        pOutput.accept(DefensiveItems.WOODEN_GLAIVE.get());
                        pOutput.accept(DefensiveItems.WOODEN_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.WOODEN_DAGGER.get());
                        pOutput.accept(DefensiveItems.WOODEN_STAFF.get());
                        pOutput.accept(DefensiveItems.WOODEN_BOW.get());
                        pOutput.accept(DefensiveItems.WOODEN_CAM.get());

                        pOutput.accept(DefensiveItems.STONE_HALBERD.get());
                        pOutput.accept(DefensiveItems.STONE_SCYTHE.get());
                        pOutput.accept(DefensiveItems.STONE_GREATAXE.get());
                        pOutput.accept(DefensiveItems.STONE_SPEAR.get());
                        pOutput.accept(DefensiveItems.STONE_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.STONE_HAMMER.get());
                        pOutput.accept(DefensiveItems.STONE_GLAIVE.get());
                        pOutput.accept(DefensiveItems.STONE_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.STONE_DAGGER.get());
                        pOutput.accept(DefensiveItems.STONE_STAFF.get());
                        pOutput.accept(DefensiveItems.STONE_BOW.get());
                        pOutput.accept(DefensiveItems.STONE_CAM.get());

                        pOutput.accept(DefensiveItems.IRON_HALBERD.get());
                        pOutput.accept(DefensiveItems.IRON_SCYTHE.get());
                        pOutput.accept(DefensiveItems.IRON_GREATAXE.get());
                        pOutput.accept(DefensiveItems.IRON_SPEAR.get());
                        pOutput.accept(DefensiveItems.IRON_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.IRON_HAMMER.get());
                        pOutput.accept(DefensiveItems.IRON_GLAIVE.get());
                        pOutput.accept(DefensiveItems.IRON_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.IRON_DAGGER.get());
                        pOutput.accept(DefensiveItems.IRON_STAFF.get());
                        pOutput.accept(DefensiveItems.IRON_BOW.get());
                        pOutput.accept(DefensiveItems.IRON_CAM.get());

                        pOutput.accept(DefensiveItems.GOLDEN_HALBERD.get());
                        pOutput.accept(DefensiveItems.GOLDEN_SCYTHE.get());
                        pOutput.accept(DefensiveItems.GOLDEN_GREATAXE.get());
                        pOutput.accept(DefensiveItems.GOLDEN_SPEAR.get());
                        pOutput.accept(DefensiveItems.GOLDEN_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.GOLDEN_HAMMER.get());
                        pOutput.accept(DefensiveItems.GOLDEN_GLAIVE.get());
                        pOutput.accept(DefensiveItems.GOLDEN_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.GOLDEN_DAGGER.get());
                        pOutput.accept(DefensiveItems.GOLDEN_STAFF.get());
                        pOutput.accept(DefensiveItems.GOLDEN_BOW.get());
                        pOutput.accept(DefensiveItems.GOLDEN_CAM.get());

                        pOutput.accept(DefensiveItems.DIAMOND_HALBERD.get());
                        pOutput.accept(DefensiveItems.DIAMOND_SCYTHE.get());
                        pOutput.accept(DefensiveItems.DIAMOND_GREATAXE.get());
                        pOutput.accept(DefensiveItems.DIAMOND_SPEAR.get());
                        pOutput.accept(DefensiveItems.DIAMOND_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.DIAMOND_HAMMER.get());
                        pOutput.accept(DefensiveItems.DIAMOND_GLAIVE.get());
                        pOutput.accept(DefensiveItems.DIAMOND_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.DIAMOND_DAGGER.get());
                        pOutput.accept(DefensiveItems.DIAMOND_STAFF.get());
                        pOutput.accept(DefensiveItems.DIAMOND_BOW.get());
                        pOutput.accept(DefensiveItems.DIAMOND_CAM.get());

                        pOutput.accept(DefensiveItems.NETHERITE_HALBERD.get());
                        pOutput.accept(DefensiveItems.NETHERITE_SCYTHE.get());
                        pOutput.accept(DefensiveItems.NETHERITE_GREATAXE.get());
                        pOutput.accept(DefensiveItems.NETHERITE_SPEAR.get());
                        pOutput.accept(DefensiveItems.NETHERITE_GREATSWORD.get());
                        pOutput.accept(DefensiveItems.NETHERITE_HAMMER.get());
                        pOutput.accept(DefensiveItems.NETHERITE_GLAIVE.get());
                        pOutput.accept(DefensiveItems.NETHERITE_MORNINGSTAR.get());
                        pOutput.accept(DefensiveItems.NETHERITE_DAGGER.get());
                        pOutput.accept(DefensiveItems.NETHERITE_STAFF.get());
                        pOutput.accept(DefensiveItems.NETHERITE_BOW.get());


                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
