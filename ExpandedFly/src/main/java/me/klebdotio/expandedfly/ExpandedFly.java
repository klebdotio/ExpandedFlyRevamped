package me.klebdotio.expandedfly;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.ChatColor;



public final class ExpandedFly extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("[ExpandedFly] Started");
    }

    @EventHandler
        public void onPlayerJoin(PlayerJoinEvent event)  {
        TextComponent b0 = new TextComponent("[");
        b0.setColor(ChatColor.DARK_AQUA);
        TextComponent b1 = new TextComponent("] ");
        b1.setColor(ChatColor.DARK_AQUA);
        TextComponent expanded = new TextComponent("ExpandedFly");
        expanded.setColor(ChatColor.AQUA);
        TextComponent msg = new TextComponent("Flying auto enabled on join");
        event.getPlayer().spigot().sendMessage(b0, expanded, b1, msg);
        Player player = event.getPlayer();
        player.performCommand("fly enable");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[ExpandedFly] Stopped");

    }
}
