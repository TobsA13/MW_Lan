/**
 * @author TobsA13
 *
 */

package me.TobsA13.MWLan;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.meta.FireworkMeta;

@SuppressWarnings("unused")
public class DropListener implements Listener {
	@EventHandler
	public void drop(PlayerDropItemEvent e) {
		System.out.print("DROP");
		/*for ( int faktor = 1; faktor <= 80; faktor ++ ) {
		
		Firework f = (Firework)
		e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Firework.class);
        
        FireworkMeta fm = f.getFireworkMeta();
        fm.addEffect(FireworkEffect.builder()
                      .trail(true)
                      .flicker(false)
                      .withColor(Color.GRAY)
                      .withColor(Color.GRAY)
                      .withColor(Color.GRAY)
                      .withColor(Color.GRAY)
                      .withColor(Color.GRAY)
                      .withColor(Color.WHITE)
                      .withColor(Color.WHITE)
                      .withColor(Color.WHITE)
                      .withColor(Color.WHITE)
                      .withColor(Color.BLACK)
                      .withColor(Color.BLACK)
                      .withColor(Color.BLACK)
                      .withColor(Color.BLACK)
                      .withFade(Color.BLACK)
                      .build());
        fm.setPower(0);
        f.setFireworkMeta(fm);
		}*/
		
		e.setCancelled(true);
	}
}
