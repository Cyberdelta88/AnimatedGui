package fr.cyberdelta88.AnimatedGui.listener;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickGuiEvent implements Listener {

    @EventHandler
    public  void clickguievnet(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();


        if (e.getClickedInventory().getName().equalsIgnoreCase(ChatColor.GOLD + "Animated Gui")) {
            p.playSound(p.getLocation(), Sound.COW_HURT, 3.0F, 0.533F);
            e.setCancelled(true);
        }



    }
}
