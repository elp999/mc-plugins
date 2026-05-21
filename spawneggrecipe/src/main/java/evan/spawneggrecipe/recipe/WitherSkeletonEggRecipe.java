package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class WitherSkeletonEggRecipe {

    private final JavaPlugin plugin;

    public WitherSkeletonEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "wither_skeleton_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "CSC",
                "CEC",
                "CBC"
        );

        recipe.setIngredient('B', Material.BONE);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('C', Material.COAL);
        recipe.setIngredient('S', Material.STONE_SWORD);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
