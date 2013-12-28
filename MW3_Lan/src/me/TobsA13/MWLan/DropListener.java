package me.TobsA13.MWLan;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropListener implements Listener {
	@EventHandler
	public void drop(PlayerDropItemEvent e) {
		System.out.print("DROP");
		e.setCancelled(true);
	}
}
