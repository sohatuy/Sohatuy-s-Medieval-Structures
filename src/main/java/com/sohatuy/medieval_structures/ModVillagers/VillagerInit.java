package com.sohatuy.medieval_structures.ModVillagers;

import com.google.common.collect.ImmutableSet;
import com.sohatuy.medieval_structures.MedievalStructuresMod;
import com.sohatuy.medieval_structures.init.BlockInit;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VillagerInit {
    public static final DeferredRegister<PoiType> POI_TYPES = 
        DeferredRegister.create(ForgeRegistries.POI_TYPES, MedievalStructuresMod.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = 
        DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MedievalStructuresMod.MODID);

    public static final RegistryObject<PoiType> HERMIT_POI = POI_TYPES.register("hermit_poi", 
        () -> new PoiType(
            ImmutableSet.copyOf(BlockInit.HERMITS_TABLE.get().getStateDefinition().getPossibleStates()), 
            1, 
            1
        ));

    public static final RegistryObject<VillagerProfession> HERMIT =
        VILLAGER_PROFESSIONS.register("hermit", () -> new VillagerProfession(
            "hermit",
            holder -> holder.is(HERMIT_POI.getKey()),
            holder -> holder.is(HERMIT_POI.getKey()),
            ImmutableSet.of(),
            ImmutableSet.of(),
            SoundEvents.VILLAGER_WORK_ARMORER
        ));
}