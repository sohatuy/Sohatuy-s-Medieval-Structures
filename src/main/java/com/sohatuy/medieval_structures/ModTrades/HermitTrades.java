package com.sohatuy.medieval_structures.ModTrades;

import com.sohatuy.medieval_structures.init.VillagerInit;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = "medieval_structures", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HermitTrades {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        // Add trades to your custom hermit profession
        if (event.getType() == VillagerInit.HERMIT.get()) {
            List<net.minecraft.world.entity.npc.VillagerTrades.ItemListing> trades = event.getTrades().get(1); // Level 1 trades
            
            // Diamond for Emerald trade (similar to your original)
            trades.add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, random.nextIntBetweenInclusive(1, 2)), // Buying: 1-2 diamonds
                    new ItemStack(Items.EMERALD, random.nextIntBetweenInclusive(3, 4)), // Selling: 3-4 emeralds
                    16, // Max uses
                    2, // Villager XP
                    0.05f // Price multiplier
            ));
        }
    }
}