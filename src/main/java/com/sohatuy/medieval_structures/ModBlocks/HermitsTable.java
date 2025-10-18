package com.sohatuy.medieval_structures.ModBlocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.sohatuy.medieval_structures.init.BlockInit;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;

public class HermitsTable extends Block {
    // Добавляем свойство направления
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public HermitsTable() {
        super(Properties.of()
                .mapColor(MapColor.WOOD)
                .destroyTime(1)
                .sound(SoundType.WOOD));
        
        // Устанавливаем начальное состояние по умолчанию
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
    }

    // Создаем состояние блока при установке
    @Override
    public BlockState getStateForPlacement(@Nonnull BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    // Регистрируем свойства блока
    @Override
    protected void createBlockStateDefinition(@Nonnull StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // Добавляем вращение для визуального отображения
    @Override
    public BlockState rotate(@Nonnull BlockState state, @Nonnull Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public void playerDestroy(@Nonnull Level level, @Nonnull Player player, @Nonnull BlockPos pos, @Nonnull BlockState state, @Nullable BlockEntity blockEntity, @Nonnull ItemStack tool) {
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
        
        if (!level.isClientSide) {
            popResource(level, pos, new ItemStack(BlockInit.HERMITS_TABLE.get()));
        }
    }
}