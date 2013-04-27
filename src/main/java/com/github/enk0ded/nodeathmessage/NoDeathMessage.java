package com.github.enk0ded.nodeathmessage;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author ENK0DED
 */
public class NoDeathMessage extends JavaPlugin implements Listener {
    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onEntityDeath(EntityDeathEvent event) {
        if (event instanceof PlayerDeathEvent) {
            PlayerDeathEvent e = (PlayerDeathEvent) event;
            e.setDeathMessage(null);
        }
    }
}