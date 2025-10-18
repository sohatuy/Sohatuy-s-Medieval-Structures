package com.sohatuy.ModTrades;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.entity.IMerchant;
import javax.annotation.Nonnull;
import java.util.Random;

public class HermitTrades
{
    public static class ItemstackForItemstack implements EntityVillager.ITradeList
    {
        public ItemStack buyingItem;
        public ItemStack sellingItem;
        public EntityVillager.PriceInfo buyAmounts;
        public EntityVillager.PriceInfo sellAmounts;

        // buyItem - покупаемое жителем, sellItem - продаваемое жителем, buyAmounts и sellAmounts - диапазоны количеств
        public ItemstackForItemstack(@Nonnull ItemStack buyItem, @Nonnull ItemStack sellItem, @Nonnull EntityVillager.PriceInfo buyAmounts,  @Nonnull EntityVillager.PriceInfo sellAmounts)
        {
            this.buyingItem = buyItem;
            this.sellingItem = sellItem;
            this.buyAmounts = buyAmounts;
            this.sellAmounts = sellAmounts;
        }

        @Override
        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
        {
            recipeList.add(new MerchantRecipe(addAmount(this.buyingItem, this.buyAmounts.getPrice(random)), addAmount(this.sellingItem, this.sellAmounts.getPrice(random))));
        }
    }
  
    // Вспомогательный метод для добавления случайного количества к итему
    public static ItemStack addAmount(ItemStack item, int amount)
    {
        ItemStack s2 = item.copy();
        s2.setCount(amount);
        return s2;
    }
}