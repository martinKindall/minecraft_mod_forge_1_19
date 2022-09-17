package com.codigomorsa.tutorialmod.events;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


import static com.codigomorsa.tutorialmod.tuto.Utils.println;


public class MyEventHandler {

    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
        String mensaje = "Agarrando item: " + event.getItem().getName().getString();
        println(mensaje);
        var player = Minecraft.getInstance().player;

        if (player != null) {
            player.displayClientMessage(Component.literal(mensaje), false);
        }
    }

    @SubscribeEvent
    public void attackEntity(AttackEntityEvent event) {
        String mensaje = "Atacando a: " + event.getTarget().getName();
        println(mensaje);

        var player = event.getPlayer();

        if (mensaje.contains("sheep")) {
            player.hurt(DamageSource.CACTUS, 5.0f);
        }

        if (player != null) {
            player.displayClientMessage(Component.literal(mensaje), false);
        }
    }
}
