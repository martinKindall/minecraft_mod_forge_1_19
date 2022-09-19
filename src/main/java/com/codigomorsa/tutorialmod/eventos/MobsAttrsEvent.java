package com.codigomorsa.tutorialmod.eventos;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.entities.DigletEntity;
import com.codigomorsa.tutorialmod.init.ModsInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tutorialmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MobsAttrsEvent {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModsInit.DIGLET.get(), DigletEntity.getDigletEntityAttrs().build());
    }
}
