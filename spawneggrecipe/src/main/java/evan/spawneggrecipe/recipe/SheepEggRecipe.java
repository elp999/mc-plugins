package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class SheepEggRecipe {

    private final JavaPlugin plugin;

    public SheepEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.SHEEP_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "sheep_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "WWW",
                "WEW",
                "WWW"
        );

        recipe.setIngredient('W', Material.WHITE_WOOL);
        recipe.setIngredient('E', Material.EGG);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
