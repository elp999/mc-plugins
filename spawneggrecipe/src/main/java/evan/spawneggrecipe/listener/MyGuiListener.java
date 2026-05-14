package evan.spawneggrecipe.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MyGuiListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§8Custom Recipe Creator")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInventoryDrag(org.bukkit.event.inventory.InventoryDragEvent event) {
        if (event.getView().getTitle().equals("§8Custom Recipe Creator")) {
            event.setCancelled(true);
        }
    }
}