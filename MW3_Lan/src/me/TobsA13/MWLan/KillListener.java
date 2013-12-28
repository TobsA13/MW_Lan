/**
 * @author TobsA13
 *
 */

package me.TobsA13.MWLan;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class KillListener implements Listener {
	private MWLan plugin;

	public KillListener(MWLan plugin) {
		this.plugin = plugin;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void kill(EntityDeathEvent e) {
		System.out.println(plugin.tmap.get((Player) e.getEntity()) + " | "+ plugin.tmap.get((Player) e.getEntity().getKiller()));
		System.out.println("0");
		if (e.getEntity() instanceof Player) {
			System.out.println("1");
			if (e.getEntity().getKiller() instanceof Player) {
				System.out.println("2");
				Player p = (Player) e.getEntity();
				Player kp = (Player) e.getEntity().getKiller();

				if (plugin.tmap.get(p) != plugin.tmap.get(kp)) {
					System.out.println("3");
					if (!(plugin.killsmap.containsKey(kp))) {
						plugin.killsmap.put(kp, 0);
						System.out.println("ini");
					}
					System.out.println("kill");
					plugin.killsmap.put(kp, (plugin.killsmap.get(kp) + 1));
					plugin.killsmap.put(p, 0);
					System.out.print(kp.getDisplayName()); // TODO DEBUG
					System.out.print(p.getDisplayName()); // DEBUG
					System.out.print("Kills: " + plugin.killsmap.get(kp)); // DEBUG
					// TEST
					if (plugin.killsmap.get(kp) == 2) {
						kp.getInventory().addItem(new ItemStack(30701, 1));// Smoke
					} else if (plugin.killsmap.get(kp) == 3) {
						kp.getInventory().addItem(new ItemStack(30701, 2)); // Drohne
					} else if (plugin.killsmap.get(kp) == 6) {
						kp.getInventory().addItem(new ItemStack(30701, 4));
					}
				}
			}
		}
	}
}
