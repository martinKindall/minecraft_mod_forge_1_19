package com.codigomorsa.tutorialmod.utils;

import net.minecraft.world.entity.player.Player;

public class Summon {

    public static void summonEntity(String entity, Player player) {
        var server = player.getServer();
        if (server != null) {
            var stack = server.createCommandSourceStack();
            var pos = player.position();
            server.getCommands().performCommand(
                    stack,
                    "summon " + entity + " " + pos.x + " " + pos.y + " " + pos.z);
        }
    }
}
