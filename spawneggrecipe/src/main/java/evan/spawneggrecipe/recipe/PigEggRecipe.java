package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class PigEggRecipe {

    private final JavaPlugin plugin;

    public PigEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void register() {

        // Result item (Pig Spawn Egg)
        ItemStack result = new ItemStack(Material.PIG_SPAWN_EGG);

        // Unique recipe key
        NamespacedKey key = new NamespacedKey(plugin, "pig_spawn_egg");

        // Create shaped recipe
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        // Shape (3x3 crafting table)
        recipe.shape(
                "CGC",
                "PEP",
                "CGC"
        );

        // Ingredients
        recipe.setIngredient('P', Material.PORKCHOP);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('C', Material.CARROT);
        recipe.setIngredient('G', Material.GOLD_INGOT);

        // Register recipe
        Bukkit.addRecipe(recipe);
    }
    
}
