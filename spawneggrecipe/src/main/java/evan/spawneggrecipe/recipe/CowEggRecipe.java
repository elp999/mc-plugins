package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CowEggRecipe {

    private final JavaPlugin plugin;

    public CowEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void register() {
        // Implementation for Cow Spawn Egg recipe

        ItemStack result = new ItemStack(Material.COW_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "cow_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "SML",
                "MCM",
                "LMS"
        );

        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('M', Material.MILK_BUCKET);
        recipe.setIngredient('C', Material.EGG);
        recipe.setIngredient('S', Material.COOKED_BEEF);
        Bukkit.addRecipe(recipe);
    }
    
}
