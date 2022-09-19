package com.codigomorsa.tutorialmod;

import com.codigomorsa.tutorialmod.eventos.MobsAttrsEvent;
import com.codigomorsa.tutorialmod.eventos.MobsRendererEvents;
import com.codigomorsa.tutorialmod.eventos.ModAttrsEvent;
import com.codigomorsa.tutorialmod.eventos.ModClientEvents;
import com.codigomorsa.tutorialmod.init.BlockInit;
import com.codigomorsa.tutorialmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.codigomorsa.tutorialmod.init.EntityInit.ENTITIES;
import static com.codigomorsa.tutorialmod.init.ModsInit.MOBS;
import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

@Mod(Tutorialmod.MODID)
public class Tutorialmod {
    public static final String MODID = "tutorialmod";

    public Tutorialmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EVENT_BUS.register(new ModAttrsEvent());
        EVENT_BUS.register(new ModClientEvents());
        ENTITIES.register(bus);
        EVENT_BUS.register(new MobsAttrsEvent());
        EVENT_BUS.register(new MobsRendererEvents());
        MOBS.register(bus);
    }
}
