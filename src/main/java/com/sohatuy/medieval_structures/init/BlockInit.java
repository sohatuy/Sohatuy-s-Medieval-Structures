package com.sohatuy.medieval_structures.init;

import com.sohatuy.medieval_structures.MedievalStructuresMod;
import com.sohatuy.medieval_structures.ModBlocks.HermitsTable;
import com.sohatuy.medieval_structures.ModBlocks.TavernersTable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalStructuresMod.MODID);

    public static final RegistryObject<Block> HERMITS_TABLE = BLOCKS.register("hermits_table",HermitsTable::new);
    public static final RegistryObject<Item> HERMITS_TABLE_ITEM = ItemInit.ITEMS.register("hermits_table", () -> new BlockItem(HERMITS_TABLE.get(), new Item.Properties()));

    public static final RegistryObject<Block> TAVERNERS_TABLE = BLOCKS.register("taverners_table",TavernersTable::new);
    public static final RegistryObject<Item> TAVERNERS_TABLE_ITEM = ItemInit.ITEMS.register("taverners_table", () -> new BlockItem(TAVERNERS_TABLE.get(), new Item.Properties()));
}
