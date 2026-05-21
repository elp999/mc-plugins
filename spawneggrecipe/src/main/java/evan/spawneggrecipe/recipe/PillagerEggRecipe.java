package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class PillagerEggRecipe {

    private final JavaPlugin plugin;

    public PillagerEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.PILLAGER_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "pillager_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "ECE",
                "SES",
                "ECE"
        );

        recipe.setIngredient('E', Material.EMERALD);
        recipe.setIngredient('C', Material.CROSSBOW);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('S', Material.STONE_SPEAR);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
