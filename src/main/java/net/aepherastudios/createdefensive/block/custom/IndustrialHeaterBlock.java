package net.aepherastudios.createdefensive.block.custom;

import net.aepherastudios.createdefensive.block.entity.CokingOvenBlockEntity;
import net.aepherastudios.createdefensive.block.entity.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.entity.IndustrialHeaterBlockEntity;
import net.aepherastudios.createdefensive.screen.IndustrialHeaterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nullable;

import static net.aepherastudios.createdefensive.block.custom.CokingOvenBlock.FACING;

public class IndustrialHeaterBlock extends Block implements EntityBlock {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public IndustrialHeaterBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(LIT, false));
    }


    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(BlockStateProperties.LIT);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
    }

    public int getLightValue(BlockState state) {
        return state.getValue(LIT) ? 14 : 0;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection().getOpposite();
        return this.defaultBlockState().setValue(FACING, facing).setValue(LIT, false);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new IndustrialHeaterBlockEntity(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof IndustrialHeaterBlockEntity heater) {
                NetworkHooks.openScreen((ServerPlayer) player, heater, pos);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!state.getValue(BlockStateProperties.LIT)) return;

        double x = (double)pos.getX() + 0.5;
        double y = (double)pos.getY()+ 0.4;
        double z = (double)pos.getZ() + 0.5;
        if (random.nextDouble() < 0.1) {
            level.playLocalSound(x, y, z, SoundEvents.FURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
        }

        // Small random offset like furnace
        double offset = 0.52;
        Direction facing = state.getValue(HorizontalDirectionalBlock.FACING);
        Direction.Axis axis = facing.getAxis();

        double dx = axis == Direction.Axis.X ? (double)facing.getStepX() * offset : 0.0;
        double dz = axis == Direction.Axis.Z ? (double)facing.getStepZ() * offset : 0.0;

        // Flame particle
        level.addParticle(ParticleTypes.FLAME, x + dx, y, z + dz, 0.0, 0.0, 0.0);
        level.addParticle(ParticleTypes.SMOKE, x + dx, y, z + dz, 0.0, 0.0, 0.0);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return type == DefensiveBlockEntities.INDUSTRIAL_HEATER.get()
                ? (lvl, pos, blkState, be) -> {
            if (be instanceof IndustrialHeaterBlockEntity heater) {
                IndustrialHeaterBlockEntity.tick(lvl, pos, blkState, heater);
            }
        }
                : null;
    }


}
