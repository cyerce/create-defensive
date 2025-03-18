package net.aepherastudios.createdefensive.entity.custom;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.decoration.palettes.AllPaletteBlocks;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.state.properties.BedPart;

public class SteelArrowEntity extends AbstractArrow {
    public SteelArrowEntity(EntityType<? extends AbstractArrow> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public SteelArrowEntity(LivingEntity pShooter, Level pLevel) {
        super(DefensiveEntities.STEEL_ARROW.get(), pShooter, pLevel);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(DefensiveItems.STEEL_ARROW.get());
    }
}