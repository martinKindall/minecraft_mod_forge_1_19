package com.codigomorsa.tutorialmod;

import com.codigomorsa.tutorialmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Tutorialmod.MODID)
public class Tutorialmod {
    public static final String MODID = "tutorialmod";

    public Tutorialmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
    }
}
