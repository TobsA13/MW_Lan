/**
 * @author TobsA13
 *
 */

package me.TobsA13.MWLan;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class KlickListener implements Listener {

	private MWLan plugin;

	public KlickListener(MWLan plugin) {
		this.plugin = plugin;
	}
	

	@SuppressWarnings("deprecation")
	public void klick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand() == new ItemStack(30701)) {
			plugin.tmap.get(p);
			if(plugin.tmap.get(p) == 1){
				if(!(plugin.t1dro)){
					p.sendMessage("Go");
					plugin.drohne(1);
				}else{
					p.sendMessage(ChatColor.GREEN + "[" + ChatColor.GOLD + "MWLan" + ChatColor.GREEN + "]" + ChatColor.DARK_RED + " Dein Team hat bereits eine Drohne!");
				}
			}else if(plugin.tmap.get(p) == 2){
				if(!(plugin.t2dro)){
					plugin.drohne(2);
					p.sendMessage("Go2");
				}else{
					p.sendMessage(ChatColor.GREEN + "[" + ChatColor.GOLD + "MWLan" + ChatColor.GREEN + "]" + ChatColor.DARK_RED + " Dein Team hat bereits eine Drohne!");
				}
			}else{
				System.out.println("[MWLan] FEHLER BEI DROHNE!");
			}
						
			
			
			
			
			
			
			
			// TODO DROHNE

		}

	}

}
