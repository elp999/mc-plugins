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

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.PIG_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "pig_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "CGC",
                "PEP",
                "CGC"
        );

        recipe.setIngredient('P', Material.PORKCHOP);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('C', Material.CARROT);
        recipe.setIngredient('G', Material.GOLD_INGOT);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}