package me.TobsA13.MWLan;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MWLan extends JavaPlugin {

	public Map<Player, Integer> tmap = new HashMap<Player, Integer>();
	public Map<Player, Integer> kmap = new HashMap<Player, Integer>();
	public Map<Player, Integer> killsmap = new HashMap<Player, Integer>();

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

	}
}
