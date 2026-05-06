package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CreeperEggRecipe {

    private final JavaPlugin plugin;

    public CreeperEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void register() {

        // Result item (Creeper Spawn Egg)
        ItemStack result = new ItemStack(Material.CREEPER_SPAWN_EGG);

        // Unique recipe key
        NamespacedKey key = new NamespacedKey(plugin, "creeper_spawn_egg");

        // Create shaped recipe
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        // Shape (3x3 crafting table)
        recipe.shape(
                "TGT",
                "TET",
                "TGT"
        );

        // Ingredients
        recipe.setIngredient('G', Material.GUNPOWDER);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('T', Material.TNT);

        // Register recipe
        Bukkit.addRecipe(recipe);
    }
}
