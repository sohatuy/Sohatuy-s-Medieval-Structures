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
                15, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(FURNITURE_WOODEN_CHAIR_OAK, 1),
                30, // максимальное использование
                8, // опыт
                0.01f // множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(ALCOCRAFT_MUG, 4),
                15, // максимальное использование
                5, // опыт
                0.01f // множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                ItemStack.EMPTY,
                new ItemStack(Items.BREAD, 3),
                20, // максимальное использование
                5, // опыт
                0.01f // множитель цены
            ));
            

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(IRON_KNIFE, 1),
                8, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(Items.BLAST_FURNACE, 1),
                10, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                ItemStack.EMPTY,
                new ItemStack(CUT_BOARD, 2),
                15, // максимальное использование
                8, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                ItemStack.EMPTY,
                new ItemStack(CABBAGE, 3),
                25, // максимальное использование
                5, // опыт
                0.01f // множитель цены
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(Items.GLASS_BOTTLE, 4),
                20, // максимальное использование
                5, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(Items.HOPPER, 1),
                10, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                ItemStack.EMPTY,
                new ItemStack(GOLDEN_RING, 1),
                8, // максимальное использование
                20, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 7),
                ItemStack.EMPTY,
                new ItemStack(MAGNET_RING, 1),
                8, // максимальное использование
                25, // опыт
                0.01f // множитель цены
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 4),
                ItemStack.EMPTY,
                new ItemStack(GOLD_CHEST, 1),
                8, // максимальное использование
                20, // опыт
                0.01f // множитель цены
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 7),
                ItemStack.EMPTY,
                new ItemStack(IRON_RAPIER, 1),
                5, // максимальное использование
                25, // опыт
                0.01f // множитель цены
            ));
        }
        if(event.getType() == VillagerInit.TAVERNER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ResourceLocation itemId = ResourceLocation.fromNamespaceAndPath("farmersdelight", "ham");
            Item HAM = ForgeRegistries.ITEMS.getValue(itemId);

            ResourceLocation itemId1 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "kvass");
            Item KVASS = ForgeRegistries.ITEMS.getValue(itemId1);

            ResourceLocation itemId2 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "magnet_pilsner");
            Item MAGNET_PILSNER = ForgeRegistries.ITEMS.getValue(itemId2);

            ResourceLocation itemId3 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "chicken_soup");
            Item CHICKEN_SOUP = ForgeRegistries.ITEMS.getValue(itemId3);

            ResourceLocation itemId4 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "ice_beer");
            Item ICE_BEER = ForgeRegistries.ITEMS.getValue(itemId4);

            ResourceLocation itemId5 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "egg_sandwich");
            Item EGG_SANDWICH = ForgeRegistries.ITEMS.getValue(itemId5);

            ResourceLocation itemId6 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "drowned_ale");
            Item DROWNED_ALE = ForgeRegistries.ITEMS.getValue(itemId6);

            ResourceLocation itemId7 = ResourceLocation.fromNamespaceAndPath("dungeons_and_combat", "mead");
            Item MEAD = ForgeRegistries.ITEMS.getValue(itemId7);

            ResourceLocation itemId8 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "honey_glazed_ham");
            Item HONEY_GLAZED_HAM = ForgeRegistries.ITEMS.getValue(itemId8);

            ResourceLocation itemId9 = ResourceLocation.fromNamespaceAndPath("farmersdelight", "roast_chicken_block");
            Item ROAST_CHICKEN_BLOCK = ForgeRegistries.ITEMS.getValue(itemId9);

            ResourceLocation itemId10 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "night_rauch");
            Item NIGHT_RAUCH = ForgeRegistries.ITEMS.getValue(itemId10);

            ResourceLocation itemId11 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "leprechaun_cider");
            Item LEPRECHAUN_CIDER = ForgeRegistries.ITEMS.getValue(itemId11);

            ResourceLocation itemId12 = ResourceLocation.fromNamespaceAndPath("alcocraftplus", "sun_pale_ale");
            Item SUN_PALE_ALE = ForgeRegistries.ITEMS.getValue(itemId12);
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.BEEF, 2),
                ItemStack.EMPTY,
                new ItemStack(Items.EMERALD, 1),
                20, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.CARROT, 3),
                ItemStack.EMPTY,
                new ItemStack(Items.EMERALD, 1),
                20, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(Items.COOKED_MUTTON, 1),
                15, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(HAM, 2),
                15, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));


            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(KVASS, 1),
                15, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.SALMON, 3),
                ItemStack.EMPTY,
                new ItemStack(Items.EMERALD, 2),
                20, // максимальное использование
                8, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(MAGNET_PILSNER, 1),
                20, // максимальное использование
                8, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(CHICKEN_SOUP, 1),
                10, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(ICE_BEER, 1),
                20, // максимальное использование
                8, // опыт
                0.01f // множитель цены
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(EGG_SANDWICH, 1),
                15, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(Items.RABBIT_STEW, 1),
                20, // максимальное использование
                15, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(DROWNED_ALE, 1),
                20, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 2),
                ItemStack.EMPTY,
                new ItemStack(MEAD, 1),
                20, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(ROAST_CHICKEN_BLOCK, 1),
                15, // максимальное использование
                12, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 4),
                ItemStack.EMPTY,
                new ItemStack(HONEY_GLAZED_HAM, 1),
                10, // максимальное использование
                18, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(NIGHT_RAUCH, 1),
                20, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(LEPRECHAUN_CIDER, 1),
                20, // максимальное использование
                10, // опыт
                0.01f // множитель цены
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                ItemStack.EMPTY,
                new ItemStack(SUN_PALE_ALE, 1),
                20, // максимальное использование
                12, // опыт
                0.01f // множитель цены
            ));
        }
    }
}