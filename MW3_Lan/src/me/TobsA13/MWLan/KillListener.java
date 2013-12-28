package me.TobsA13.MWLan;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class KillListener implements Listener {
	private MWLan plugin;

	public KillListener(MWLan plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void kill(EntityDeathEvent e) {
		if (e.getEntity() instanceof Player) {
			if (e.getEntity().getKiller() instanceof Player) {
				Player p = (Player) e.getEntity();
				Player kp = (Player) e.getEntity().getKiller();
				if (plugin.tmap.get(p) == plugin.tmap.get(kp)) {

					if (!(plugin.killsmap.containsKey(kp))) {
						plugin.killsmap.put(kp, 0);
					}

					plugin.killsmap.put(kp, plugin.tmap.get(kp) + 1);
					plugin.killsmap.put(p, 0);
					System.out.print(kp.getDisplayName()); // TODO DEBUG
					System.out.print(p.getDisplayName()); // DEBUG
					System.out.print("Kills: " + plugin.tmap.get(kp)); // DEBUG
				}
			}
		}
	}
}
