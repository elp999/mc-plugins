package evan.spawneggrecipe.recipe;

//import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionType;

import evan.spawneggrecipe.SpawnEggRecipe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.BrewerInventory;
//import org.bukkit.plugin.java.JavaPlugin;

public class BlindnessPotionRecipe implements Listener {

    private final SpawnEggRecipe plugin;

    public BlindnessPotionRecipe(SpawnEggRecipe plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBrew(BrewEvent event) {
        BrewerInventory inventory = event.getContents();
        ItemStack ingredient = inventory.getIngredient();

        if (ingredient != null && ingredient.getType() == Material.GOLDEN_APPLE) {
            return; // Allow brewing to proceed with the golden apple as the ingredient
        }

        for (int i = 0; i < 3; i++) {
            ItemStack potion = inventory.getItem(i);
            if (potion != null && potion.getItemMeta() instanceof PotionMeta potionMeta) {
                if (potionMeta.getBasePotionType() == PotionType.NIGHT_VISION) {
                    inventory.setItem(i, new WardenEggRecipe(plugin).getPotion());
                }
            }
        }
    } 
}
