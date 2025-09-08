package com.minekarta.advancedcorehub.listeners;

import com.minekarta.advancedcorehub.AdvancedCoreHub;
import com.minekarta.advancedcorehub.manager.InventoryManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class WorldListener implements Listener {

    private final AdvancedCoreHub plugin;
    private final InventoryManager inventoryManager;

    public WorldListener(AdvancedCoreHub plugin) {
        this.plugin = plugin;
        this.inventoryManager = plugin.getInventoryManager();
    }

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent event) {
        // Hub-specific world change logic has been removed.
        // Items are now given on join and are persistent across all worlds.
        // Future inventory save/restore logic might be implemented here.
    }
}
