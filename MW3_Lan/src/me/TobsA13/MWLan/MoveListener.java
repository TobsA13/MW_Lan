/**
 * @author TobsA13
 *
 */

package me.TobsA13.MWLan;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MoveListener implements Listener {
	private MWLan plugin;

	public MoveListener(MWLan plugin) {
		this.plugin = plugin;
	}
	@SuppressWarnings("deprecation")
	@EventHandler
	public void MoveE(PlayerMoveEvent e){
		//plugin.getLogger().info("GO");
		Inventory i = e.getPlayer().getInventory();
			if (i.contains(30500)){ 			//T1 K1
				plugin.tmap.put(e.getPlayer(), 1);
				plugin.kmap.put(e.getPlayer(), 1);
				i.remove(30500);
				i.remove(30700);
				i.addItem(new ItemStack(30022,5));
				i.addItem(new ItemStack(30034,3));
			}else if (i.contains(30501)){	//T1 K2
				plugin.tmap.put(e.getPlayer(), 1);
				plugin.kmap.put(e.getPlayer(), 2);
				i.remove(30501);
				i.remove(30700);
				i.addItem(new ItemStack(30030,5));
				i.addItem(new ItemStack(30080,3));
			}else if (i.contains(30502)){	//T1 K3
				plugin.tmap.put(e.getPlayer(), 1);
				plugin.kmap.put(e.getPlayer(), 3);
				i.remove(30502);
				i.remove(30700);
				i.addItem(new ItemStack(30060,5));
				i.addItem(new ItemStack(30064,3));
			}else if (i.contains(30543)){	//T1 K4
				plugin.tmap.put(e.getPlayer(), 1);
				plugin.kmap.put(e.getPlayer(), 4);
				i.remove(30543);
				i.remove(30700);
				i.addItem(new ItemStack(30001,5));
				i.addItem(new ItemStack(30074,3));
			}else if (i.contains(30504)){	//T1 K5
				plugin.tmap.put(e.getPlayer(), 1);
				plugin.kmap.put(e.getPlayer(), 5);
				i.remove(30504);
				i.remove(30700);
				i.addItem(new ItemStack(30048,5));
				i.addItem(new ItemStack(30088,3));
			}else if (i.contains(30505)){	//T2 K1
				plugin.tmap.put(e.getPlayer(), 2);
				plugin.kmap.put(e.getPlayer(), 1);
				i.remove(30505);
				i.remove(30700);
				i.addItem(new ItemStack(30022,5));
				i.addItem(new ItemStack(30034,3));
			}else if (i.contains(30506)){	//T2 K2
				plugin.tmap.put(e.getPlayer(), 2);
				plugin.kmap.put(e.getPlayer(), 2);
				i.remove(30506);
				i.remove(30700);
				i.addItem(new ItemStack(30030,5));
				i.addItem(new ItemStack(30080,3));
			}else if (i.contains(30507)){	//T2 K3
				plugin.tmap.put(e.getPlayer(), 2);
				plugin.kmap.put(e.getPlayer(), 3);
				i.remove(30507);
				i.remove(30700);
				i.addItem(new ItemStack(30060,5));
				i.addItem(new ItemStack(30064,3));
			}else if (i.contains(30508)){	//T2 K4
				plugin.tmap.put(e.getPlayer(), 2);
				plugin.kmap.put(e.getPlayer(), 4);
				i.remove(30508);
				i.remove(30700);
				i.addItem(new ItemStack(30001,5));
				i.addItem(new ItemStack(30074,3));
			}else if (i.contains(30509)){	//T2 K5
				plugin.tmap.put(e.getPlayer(), 2);
				plugin.kmap.put(e.getPlayer(), 5);
				i.remove(30509);
				i.remove(30700);
				i.addItem(new ItemStack(30048,5));
				i.addItem(new ItemStack(30088,3));
			}
		}

		
	
	
}
