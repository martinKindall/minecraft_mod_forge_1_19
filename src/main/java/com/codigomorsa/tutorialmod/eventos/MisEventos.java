package com.codigomorsa.tutorialmod.eventos;

import com.codigomorsa.tutorialmod.Tutorialmod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.codigomorsa.tutorialmod.tuto.Utils.println;

@Mod.EventBusSubscriber(modid = Tutorialmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MisEventos {
    @SubscribeEvent
    public void pickItem(EntityItemPickupEvent event) {
        String mensaje = "Agarrando item: " + event.getItem().getName().getString();
        println(mensaje);

        var player = event.getPlayer();
        player.displayClientMessage(Component.literal(
                mensaje
        ), false);
    }

    @SubscribeEvent
    public void pickItem(AttackEntityEvent event) {
        String mensaje = "Atacando a: " + event.getTarget().getName();

        var player = event.getPlayer();

        player.displayClientMessage(Component.literal(
                mensaje
        ), false);

        if (mensaje.contains("sheep")) {
            player.hurt(DamageSource.CACTUS, 5.0f);
        }
    }
}
