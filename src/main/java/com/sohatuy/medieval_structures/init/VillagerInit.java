package com.sohatuy.medieval_structures.init;

import com.sohatuy.medieval_structures.MedievalStructuresMod;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerTrades;

public class VillagerInit {
    public static VillagerProfession HERMIT;
  
    public static void registerVillagers() {
        HERMIT = new VillagerProfession(MedievalStructuresMod.MODID, MedievalStructuresMod.MODID + ":textures/models/hermit.png", MedievalStructuresMod.MODID + ":textures/models/hermit_zombie.png");
        VillagerRegistry.register(HERMIT);
  
        VillagerCareer career_example = new VillagerCareer(HERMIT, MedievalStructuresMod.MODID);
        career_example.addTrade(1,
                new VillagerTrades.ItemstackForItemstack(Items.DIAMOND, Items.EMERALD, new EntityVillager.PriceInfo(1, 2), new EntityVillager.PriceInfo(3, 4))
        );
    }
}