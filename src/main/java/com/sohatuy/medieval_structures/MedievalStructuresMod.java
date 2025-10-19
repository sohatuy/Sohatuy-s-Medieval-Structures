package com.sohatuy.medieval_structures;

import com.sohatuy.medieval_structures.ModVillagers.VillagerInit;
import com.sohatuy.medieval_structures.init.BlockInit;
import com.sohatuy.medieval_structures.init.ItemInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MedievalStructuresMod.MODID)
public class MedievalStructuresMod {
    public static final String MODID = "medieval_structures";

    public MedievalStructuresMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        // Регистрируем ВСЕ deferred registers в правильном порядке
        VillagerInit.POI_TYPES.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        VillagerInit.VILLAGER_PROFFESIONS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            
        }
    }
}