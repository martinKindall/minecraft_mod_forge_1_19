package com.codigomorsa.tutorialmod.eventos;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.entities.MorsaEntity;
import com.codigomorsa.tutorialmod.init.EntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tutorialmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModAttrsEvent {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.MORSA.get(), MorsaEntity.getMorsaEntityAttrs().build());
    }
}
