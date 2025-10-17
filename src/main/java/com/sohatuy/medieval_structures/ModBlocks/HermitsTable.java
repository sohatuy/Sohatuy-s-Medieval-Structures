package com.sohatuy.medieval_structures.ModBlocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.sohatuy.medieval_structures.init.BlockInit;

import net.minecraft.world.entity.player.Player; // Добавь этот импорт
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level; // Добавь этот импорт
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class HermitsTable extends Block{
    public HermitsTable() {
        super(BlockBehaviour.Properties.of()
        .destroyTime(1)
        .sound(SoundType.WOOD)
        );
    }
    
    @Override
public void playerDestroy(@Nonnull Level level, @Nonnull Player player, @Nonnull BlockPos pos, @Nonnull BlockState state, @Nullable BlockEntity blockEntity, @Nonnull ItemStack tool) {
    super.playerDestroy(level, player, pos, state, blockEntity, tool);
    
    if (!level.isClientSide) {
        // Самый простой и правильный способ
        popResource(level, pos, new ItemStack(BlockInit.HERMITS_TABLE.get()));
    }
}
}