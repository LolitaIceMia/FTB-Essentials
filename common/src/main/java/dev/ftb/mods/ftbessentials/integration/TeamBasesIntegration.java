package dev.ftb.mods.ftbessentials.integration;

import net.minecraft.server.level.ServerPlayer;

public class TeamBasesIntegration {
    public static void sendToLobby(ServerPlayer player) {
        player.getServer().getCommands().performPrefixedCommand(player.createCommandSourceStack(), "ftbteambases lobby");
    }
}
