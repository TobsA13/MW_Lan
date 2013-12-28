/**
 * @author TobsA13
 *
 */

package me.TobsA13.MWLan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MWLan extends JavaPlugin {

	public Map<Player, Integer> tmap = new HashMap<Player, Integer>();
	public Map<Player, Integer> kmap = new HashMap<Player, Integer>();
	public Map<Player, Integer> killsmap = new HashMap<Player, Integer>();
	List<Location> t1pos = new ArrayList<Location>();
	List<Location> t2pos = new ArrayList<Location>();
	boolean t1dro, t2dro;

	@Override
	public void onDisable() {
		System.out.println("[MW] Plugin deaktiviert!");

	}

	@Override
	public void onEnable() {
		PluginDescriptionFile descFile = this.getDescription();
		System.out.println("[MW] Plugin by TobsA13");
		System.out.println("[MW] Version " + descFile.getVersion());
		System.out.println("[MW] Plugin aktiviert!");

		// TODO Commands
		// this.getCommand("color").setExecutor(new colorCommand());

		// TODO Events

		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new MoveListener(this), this);
		pm.registerEvents(new KillListener(this), this);
		pm.registerEvents(new DropListener(), this);
		pm.registerEvents(new KlickListener(this), this);

	}

	public void drohne(final int team) {
		if (team == 1) {
			t2pos.clear();
			for (Player p : getServer().getOnlinePlayers()) {
				if (tmap.get(p) == 2) {
					t2pos.add(p.getLocation());
				}
			}
			for (Location loc : t2pos) {
				flaech(loc, Material.EMERALD_ORE);
			}

			this.getServer().getScheduler()
					.scheduleSyncDelayedTask(this, new Runnable() {
						public void run() {
							for (Location loc : t2pos) {
								flaech(loc, Material.AIR);
							}
							t2pos.clear();
							for (Player p : getServer().getOnlinePlayers()) {
								if (tmap.get(p) == 2) {
									t2pos.add(p.getLocation());
								}
							}
							for (Location loc : t2pos) {
								flaech(loc, Material.EMERALD_ORE);
							}
							// BOX IN BOX IN BOX...

						}
					}, 100L);
			this.getServer().getScheduler()
					.scheduleSyncDelayedTask(this, new Runnable() {
						public void run() {
							for (Location loc : t2pos) {
								flaech(loc, Material.AIR);
							}
							t2pos.clear();
							for (Player p : getServer().getOnlinePlayers()) {
								if (tmap.get(p) == 2) {
									t2pos.add(p.getLocation());
								}
							}
							for (Location loc : t2pos) {
								flaech(loc, Material.EMERALD_ORE);
							}
							// BOX IN BOX IN BOX...

						}
					}, 200L);
			this.getServer().getScheduler()
					.scheduleSyncDelayedTask(this, new Runnable() {
						public void run() {
							for (Location loc : t2pos) {
								flaech(loc, Material.AIR);
							}
							t2pos.clear();
							for (Player p : getServer().getOnlinePlayers()) {
								if (tmap.get(p) == 2) {
									t2pos.add(p.getLocation());
								}
							}
							for (Location loc : t2pos) {
								flaech(loc, Material.EMERALD_ORE);
							}
							// BOX IN BOX IN BOX...

						}
					}, 300L);
			this.getServer().getScheduler()
					.scheduleSyncDelayedTask(this, new Runnable() {
						public void run() {
							for (Location loc : t2pos) {
								flaech(loc, Material.AIR);
							}
							t2pos.clear();
							// BOX IN BOX IN BOX...

						}
					}, 400L);
		}
	}

	public void flaech(Location loc, Material m) {
		int x = loc.getBlockX();
		int y = 255;
		int z = loc.getBlockZ();
		this.getServer().getWorld(loc.getWorld().getUID()).getBlockAt(x, y, z)
				.setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x + 1, y, z).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x + 1, y, z + 1).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x, y, z + 1).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x - 1, y, z + 1).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x - 1, y, z).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x - 1, y, z - 1).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x, y, z - 1).setType(m);
		this.getServer().getWorld(loc.getWorld().getUID())
				.getBlockAt(x + 1, y, z - 1).setType(m);

	}
}
