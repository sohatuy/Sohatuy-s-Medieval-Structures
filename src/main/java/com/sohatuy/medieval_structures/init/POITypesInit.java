package com.sohatuy.medieval_structures.init;

import com.sohatuy.medieval_structures.MedievalStructuresMod;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class POITypesInit {
    public static final DeferredRegister<PoiType> POI_TYPES = 
            DeferredRegister.create(ForgeRegistries.POI_TYPES, MedievalStructuresMod.MODID);

    public static final RegistryObject<PoiType> HERMIT_POI = POI_TYPES.register("hermit_poi",
            () -> new PoiType(getBlockStates(BlockInit.HERMITS_TABLE.get()), 1, 1));
    
    private static Set<BlockState> getBlockStates(Block block) {
    return Set.copyOf(block.getStateDefinition().getPossibleStates());
}
}