package com.codigomorsa.tutorialmod.eventos;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.codigomorsa.tutorialmod.init.ItemInit.VARITA_HIELO;

public class MisHechizos {

    @SubscribeEvent
    public void varitaHielo(PlayerInteractEvent.LeftClickBlock event) {
        var item = event.getItemStack();

        if (event.getSide().isServer()) {
            var server = event.getPlayer().getServer();
            if(item.is(VARITA_HIELO.get()) && server != null) {
                var stack = server.createCommandSourceStack();
                var pos = event.getPlayer().position();
                var command = "fill " + (int)(pos.x - 10) + " " + (int)(pos.y - 10) + " " + (int)(pos.z - 10) + " " + (int)(pos.x + 10) + " " + (int)(pos.y + 10) + " " + (int)(pos.z + 10) + " minecraft:ice replace minecraft:water";
                server.getCommands().performCommand(
                        stack,
                        command
                );
                event.setCanceled(true);
            }
        }
    }
}
