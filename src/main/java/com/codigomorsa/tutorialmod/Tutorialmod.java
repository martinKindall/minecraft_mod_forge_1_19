package com.codigomorsa.tutorialmod;

import com.codigomorsa.tutorialmod.eventos.MisEventos;
import com.codigomorsa.tutorialmod.events.MyEventHandler;
import com.codigomorsa.tutorialmod.init.BlockInit;
import com.codigomorsa.tutorialmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

@Mod(Tutorialmod.MODID)
public class Tutorialmod {
    public static final String MODID = "tutorialmod";

    public Tutorialmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EVENT_BUS.register(new MisEventos());
    }
}
