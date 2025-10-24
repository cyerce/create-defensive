package net.aepherastudios.createdefensive.item.custom;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.aepherastudios.createdefensive.util.DefensiveTags;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.Map;
import java.util.Optional;

public class PaxelItem extends DiggerItem {

    protected static final Map<Block, BlockState> FLATTENABLES = Maps.newHashMap((new ImmutableMap.Builder()).put(Blocks.GRASS_BLOCK, Blocks.DIRT_PATH.defaultBlockState()).put(Blocks.DIRT, Blocks.DIRT_PATH.defaultBlockState()).put(Blocks.PODZOL, Blocks.DIRT_PATH.defaultBlockState()).put(Blocks.COARSE_DIRT, Blocks.DIRT_PATH.defaultBlockState()).put(Blocks.MYCELIUM, Blocks.DIRT_PATH.defaultBlockState()).put(Blocks.ROOTED_DIRT, Blocks.DIRT_PATH.defaultBlockState()).build());
    protected static final Map<Block, Block> STRIPPABLES = (new ImmutableMap.Builder<Block, Block>()).put(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD).put(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG).put(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD).put(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG).put(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD).put(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG).put(Blocks.CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD).put(Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG).put(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD).put(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG).put(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD).put(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG).put(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD).put(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG).put(Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM).put(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE).put(Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM).put(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE).put(Blocks.MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_WOOD).put(Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG).put(Blocks.BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK).build();

    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, DefensiveTags.Blocks.MINEABLE_WITH_PAXEL, pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        BlockState state = level.getBlockState(pos);
        ItemStack stack = context.getItemInHand();

        // --- AXE LOGIC ---
        Optional<BlockState> stripped = Optional.ofNullable(state.getToolModifiedState(context, net.minecraftforge.common.ToolActions.AXE_STRIP, false));
        Optional<BlockState> scraped = stripped.isPresent() ? Optional.empty() : Optional.ofNullable(state.getToolModifiedState(context, net.minecraftforge.common.ToolActions.AXE_SCRAPE, false));
        Optional<BlockState> unwaxed = (stripped.isPresent() || scraped.isPresent()) ? Optional.empty() : Optional.ofNullable(state.getToolModifiedState(context, net.minecraftforge.common.ToolActions.AXE_WAX_OFF, false));
        Optional<BlockState> axeResult = Optional.empty();

        if (stripped.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            axeResult = stripped;
        } else if (scraped.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3005, pos, 0);
            axeResult = scraped;
        } else if (unwaxed.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3004, pos, 0);
            axeResult = unwaxed;
        }

        if (axeResult.isPresent()) {
            if (player instanceof ServerPlayer sp)
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(sp, pos, stack);
            level.setBlock(pos, axeResult.get(), 11);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, axeResult.get()));
            if (player != null)
                stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(context.getHand()));
            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        // --- SHOVEL LOGIC ---
        if (context.getClickedFace() != Direction.DOWN) {
            BlockState flattened = state.getToolModifiedState(context, net.minecraftforge.common.ToolActions.SHOVEL_FLATTEN, false);
            BlockState resultState = null;

            if (flattened != null && level.isEmptyBlock(pos.above())) {
                level.playSound(player, pos, SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0F, 1.0F);
                resultState = flattened;
            } else if (state.getBlock() instanceof CampfireBlock && state.getValue(CampfireBlock.LIT)) {
                if (!level.isClientSide)
                    level.levelEvent(null, 1009, pos, 0);
                CampfireBlock.dowse(player, level, pos, state);
                resultState = state.setValue(CampfireBlock.LIT, false);
            }

            if (resultState != null) {
                if (!level.isClientSide) {
                    level.setBlock(pos, resultState, 11);
                    level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, resultState));
                    if (player != null)
                        stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(context.getHand()));
                }
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        return InteractionResult.PASS;
    }

    @org.jetbrains.annotations.Nullable
    public static BlockState getAxeStrippingState(BlockState originalState) {
        Block block = STRIPPABLES.get(originalState.getBlock());
        return block != null ? block.defaultBlockState().setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS)) : null;
    }

    private Optional<BlockState> getStripped(BlockState pUnstrippedState) {
        return Optional.ofNullable(STRIPPABLES.get(pUnstrippedState.getBlock())).map((p_150689_) -> {
            return p_150689_.defaultBlockState().setValue(RotatedPillarBlock.AXIS, pUnstrippedState.getValue(RotatedPillarBlock.AXIS));
        });
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction)
                || ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction)
                || ToolActions.DEFAULT_SHOVEL_ACTIONS.contains(toolAction);
    }

    @org.jetbrains.annotations.Nullable
    public static BlockState getShovelPathingState(BlockState originalState) {
        return FLATTENABLES.get(originalState.getBlock());
    }
}
