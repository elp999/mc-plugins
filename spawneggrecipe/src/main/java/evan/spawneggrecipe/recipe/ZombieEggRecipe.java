package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ZombieEggRecipe {

    private final JavaPlugin plugin;

    public ZombieEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.ZOMBIE_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "zombie_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "RCR",
                "FEF",
                "RRR"
        );

        recipe.setIngredient('R', Material.ROTTEN_FLESH);
        recipe.setIngredient('C', Material.CARROT);
        recipe.setIngredient('F', Material.FEATHER);
        recipe.setIngredient('E', Material.EGG);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
    
}
