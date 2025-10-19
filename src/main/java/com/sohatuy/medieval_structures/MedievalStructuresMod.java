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
import net.minecraftforge.registries.ForgeRegistries;

@Mod(MedievalStructuresMod.MODID)
public class MedievalStructuresMod {
    public static final String MODID = "medieval_structures";
    final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger();

    public MedievalStructuresMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        // Регистрируем ВСЕ deferred registers в правильном порядке
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        VillagerInit.POI_TYPES.register(modEventBus);
        VillagerInit.VILLAGER_PROFESSIONS.register(modEventBus); // Исправлена опечатка

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        VillagerInit.registerPOIs();
        
        // Дополнительная отладка
        LOGGER.info("=== Medieval Structures Debug ===");
        LOGGER.info("POI registered: {}", VillagerInit.HERMIT_POI.getId());
        LOGGER.info("Profession registered: {}", VillagerInit.HERMIT_MASTER.getId());
        
        // Проверка, что блок существует
        if (BlockInit.HERMITS_TABLE.isPresent()) {
            LOGGER.info("Hermit's Table block registered: {}", BlockInit.HERMITS_TABLE.getId());
        } else {
            LOGGER.error("Hermit's Table block NOT registered!");
        }
        LOGGER.info("=== Проверка POI в мире ===");
    LOGGER.info("POI Types: {}", ForgeRegistries.POI_TYPES.getValues());
    LOGGER.info("Villager Professions: {}", ForgeRegistries.VILLAGER_PROFESSIONS.getValues());
    });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Можно добавить дополнительную логику при запуске сервера
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Клиентская настройка
        }
    }
}