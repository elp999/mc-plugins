package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class SkeletonEggRecipe {

    private final JavaPlugin plugin;
    public SkeletonEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.SKELETON_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "skeleton_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "AWA",
                "BEB",
                "BBB"
        );

        recipe.setIngredient('B', Material.BONE);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('W', Material.BOW);
        recipe.setIngredient('A', Material.ARROW);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
