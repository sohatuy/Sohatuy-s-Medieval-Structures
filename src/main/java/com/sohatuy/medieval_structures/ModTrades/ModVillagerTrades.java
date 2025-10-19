package com.sohatuy.medieval_structures.ModTrades;

import com.sohatuy.medieval_structures.MedievalStructuresMod;
import com.sohatuy.medieval_structures.ModVillagers.VillagerInit;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = MedievalStructuresMod.MODID)
public class ModVillagerTrades {
    @SubscribeEvent
    public static void VillagersTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerInit.HERMIT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ResourceLocation itemId = ResourceLocation.fromNamespaceAndPath("enigmaticlegacy", "iron_ring");
            Item ENIGMATIC_RING_IRON = ForgeRegistries.ITEMS.getValue(itemId);

            ResourceLocation itemId2 = ResourceLocation.fromNamespaceAndPath("mcwfurnitures", "oak_chair");
            Item FURNITURE_WOODEN_CHAIR_OAK = ForgeRegistries.ITEMS.getValue(itemId2);

            ResourceLocation itemId3 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "mug");
            Item ALCOCRAFT_MUG = ForgeRegistries.ITEMS.getValue(itemId3);

            ResourceLocation itemId4 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "cutting_board");
            Item CUT_BOARD = ForgeRegistries.ITEMS.getValue(itemId4);

            ResourceLocation itemId5 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "iron_knife");
            Item IRON_KNIFE = ForgeRegistries.ITEMS.getValue(itemId5);

            ResourceLocation itemId6 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "cabbage");
            Item CABBAGE = ForgeRegistries.ITEMS.getValue(itemId6);

            ResourceLocation itemId7 = ResourceLocation.fromNamespaceAndPath("enigmaticlegacy", "golden_ring");
            Item GOLDEN_RING = ForgeRegistries.ITEMS.getValue(itemId7);

            ResourceLocation itemId8 = ResourceLocation.fromNamespaceAndPath("ironchest", "gold_chest");
            Item GOLD_CHEST = ForgeRegistries.ITEMS.getValue(itemId8);

            ResourceLocation itemId9 = ResourceLocation.fromNamespaceAndPath("dungeons_and_combat", "iron_rapier");
            Item IRON_RAPIER = ForgeRegistries.ITEMS.getValue(itemId9);

            ResourceLocation itemId10 = ResourceLocation.fromNamespaceAndPath("enigmaticlegacy", "magnet_ring");
            Item MAGNET_RING = ForgeRegistries.ITEMS.getValue(itemId10);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 4),
                ItemStack.EMPTY,
                new ItemStack(ENIGMATIC_RING_IRON, 1),
                15, // maxUses - максимальное использование
                10, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(FURNITURE_WOODEN_CHAIR_OAK, 1),
                30, // maxUses - максимальное использование
                8, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(ALCOCRAFT_MUG, 4),
                15, // maxUses - максимальное использование
                5, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                ItemStack.EMPTY,
                new ItemStack(Items.BREAD, 3),
                20, // maxUses - максимальное использование
                5, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(IRON_KNIFE, 1),
                8, // maxUses - максимальное использование
                15, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(Items.BLAST_FURNACE, 1),
                10, // maxUses - максимальное использование
                10, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                ItemStack.EMPTY,
                new ItemStack(CUT_BOARD, 2),
                15, // maxUses - максимальное использование
                8, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                ItemStack.EMPTY,
                new ItemStack(CABBAGE, 3),
                25, // maxUses - максимальное использование
                5, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(Items.GLASS_BOTTLE, 4),
                20, // maxUses - максимальное использование
                5, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(Items.HOPPER, 1),
                10, // maxUses - максимальное использование
                15, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                ItemStack.EMPTY,
                new ItemStack(GOLDEN_RING, 1),
                8, // maxUses - максимальное использование
                20, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 7),
                ItemStack.EMPTY,
                new ItemStack(MAGNET_RING, 1),
                8, // maxUses - максимальное использование
                25, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 4),
                ItemStack.EMPTY,
                new ItemStack(GOLD_CHEST, 1),
                8, // maxUses - максимальное использование
                20, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 7),
                ItemStack.EMPTY,
                new ItemStack(IRON_RAPIER, 1),
                5, // maxUses - максимальное использование
                25, // xp - опыт
                0.01f // priceMultiplier - множитель цены
            ));
        }
    }
}