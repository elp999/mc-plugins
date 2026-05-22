package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;


public class WolfEggRecipe {
    
    private final JavaPlugin plugin;

    public WolfEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.WOLF_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "wolf_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                " D ",
                "BEB",
                " B "
        );

        recipe.setIngredient('B', Material.BONE);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('E', Material.EGG);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
