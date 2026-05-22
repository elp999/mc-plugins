package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ZombiepigmanEggRecipe {

    private final JavaPlugin plugin;

    public ZombiepigmanEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "zombified_piglin_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "RGR",
                "NES",
                "RRR"
        );

        recipe.setIngredient('E', Material.PIG_SPAWN_EGG);
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('R', Material.ROTTEN_FLESH);
        recipe.setIngredient('N', Material.GOLD_NUGGET);
        recipe.setIngredient('S', Material.GOLDEN_SWORD);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
    
}
