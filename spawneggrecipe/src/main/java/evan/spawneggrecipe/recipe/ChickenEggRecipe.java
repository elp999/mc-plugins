package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ChickenEggRecipe {

    private final JavaPlugin plugin;

    public ChickenEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.CHICKEN_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "chicken_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "FCF",
                "EEE",
                "FEF"
        );

        recipe.setIngredient('F', Material.FEATHER);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('C', Material.COOKED_CHICKEN);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
