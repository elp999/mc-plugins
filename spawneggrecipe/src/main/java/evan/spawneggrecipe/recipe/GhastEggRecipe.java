package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class GhastEggRecipe {

    private final JavaPlugin plugin;

    public GhastEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.GHAST_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "ghast_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "GFG",
                "TET",
                "TTT"
        );

        recipe.setIngredient('G', Material.GUNPOWDER);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('T', Material.GHAST_TEAR);
        recipe.setIngredient('F', Material.FIRE_CHARGE);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}