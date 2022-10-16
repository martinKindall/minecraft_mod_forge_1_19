package com.codigomorsa.tutorialmod.events;

import com.codigomorsa.tutorialmod.utils.Summon;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


import static com.codigomorsa.tutorialmod.init.ItemInit.VARITA;
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

    @SubscribeEvent
    public void interactItemBlock(PlayerInteractEvent.LeftClickBlock event) {
        var item = event.getItemStack();
        if (event.getSide().isServer()) {
            var server = event.getPlayer().getServer();
            if (item.is(VARITA.get()) && server != null) {
                var stack = server.createCommandSourceStack();
                var pos = event.getPlayer().position();
                var command = "fill " + (int)(pos.x - 10) + " " + (int)(pos.y - 10) + " " + (int)(pos.z - 10) + " " + (int)(pos.x + 10) + " " + (int)(pos.y + 10) + " " + (int)(pos.z + 10) + " minecraft:lava replace minecraft:grass_block";
                server.getCommands().performCommand(
                        stack,
                        command
                );
                event.setCanceled(true);
            }
        }
    }
}
