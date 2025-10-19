package com.sohatuy.medieval_structures.ModTrades;

import com.sohatuy.medieval_structures.MedievalStructuresMod;
import com.sohatuy.medieval_structures.ModVillagers.VillagerInit;
import com.sohatuy.medieval_structures.init.BlockInit;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MedievalStructuresMod.MODID)
public class ModVillagerTrades {
    @SubscribeEvent
    public static void VillagersTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.FLETCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(BlockInit.HERMITS_TABLE_ITEM.get(), 2), // Исправил количество изумрудов
                15, // maxUses - максимальное использование
                10, // xp - опыт
                0.00f // priceMultiplier - множитель цены
            ));
        }
        if(event.getType() == VillagerInit.HERMIT_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(BlockInit.HERMITS_TABLE_ITEM.get(), 2), // Исправил количество изумрудов
                15, // maxUses - максимальное использование
                10, // xp - опыт
                0.00f // priceMultiplier - множитель цены
            ));
        }
    }
}