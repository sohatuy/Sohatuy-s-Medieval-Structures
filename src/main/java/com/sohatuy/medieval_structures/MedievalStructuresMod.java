package com.sohatuy.medieval_structures;

import com.sohatuy.medieval_structures.ModVillagers.VillagerInit;
import com.sohatuy.medieval_structures.init.BlockInit;
import com.sohatuy.medieval_structures.init.ItemInit;

import net.minecraft.world.entity.npc.VillagerProfession;
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

        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        VillagerInit.POI_TYPES.register(modEventBus);
        VillagerInit.VILLAGER_PROFESSIONS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            VillagerInit.registerPOIs();
            LOGGER.info("=== Medieval Structures Debug ===");
            
            // Проверяем все компоненты
           if (VillagerInit.HERMIT.isPresent()) {
    LOGGER.info("✓ Профессия зарегистрирована: {}", VillagerInit.HERMIT.getId());
    
    VillagerProfession profession = VillagerInit.HERMIT.get();

    var jobSiteHolder = profession.heldJobSite();
    LOGGER.info("  - Job site predicate: {}", jobSiteHolder);
    LOGGER.info("  - POI Key: {}", VillagerInit.HERMIT_POI.getKey());
}
            
            // Проверяем в реестрах Forge
            LOGGER.info("Все POI в реестре: {}", ForgeRegistries.POI_TYPES.getKeys());
            LOGGER.info("Все профессии в реестре: {}", ForgeRegistries.VILLAGER_PROFESSIONS.getKeys());
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("=== Запуск сервера - проверка профессий ===");
        LOGGER.info("HERMIT_MASTER профессия: {}", VillagerInit.HERMIT.get());
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}