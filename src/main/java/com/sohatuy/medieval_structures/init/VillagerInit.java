package com.sohatuy.medieval_structures.init;

import com.google.common.collect.ImmutableSet;
import com.sohatuy.medieval_structures.MedievalStructuresMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VillagerInit {
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = 
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MedievalStructuresMod.MODID);

    public static final RegistryObject<VillagerProfession> HERMIT = VILLAGER_PROFESSIONS.register("hermit",
            () -> new VillagerProfession("hermit", 
                    holder -> holder.is(POITypesInit.HERMIT_POI.getKey()), 
                    holder -> holder.is(POITypesInit.HERMIT_POI.getKey()),
                    ImmutableSet.of(), 
                    ImmutableSet.of(), 
                    SoundEvents.VILLAGER_WORK_CLERIC)); // You can change the sound
}