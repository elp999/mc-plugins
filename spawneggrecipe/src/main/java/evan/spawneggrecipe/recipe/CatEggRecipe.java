package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CatEggRecipe {

    private final JavaPlugin plugin;

    public CatEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.CAT_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "cat_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "FMF",
                "CEC",
                "SCS"
        );

        recipe.setIngredient('F', Material.STRING);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('M', Material.MILK_BUCKET);
        recipe.setIngredient('C', Material.COD);
        recipe.setIngredient('S', Material.SALMON);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
    
}
