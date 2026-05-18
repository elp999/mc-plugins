package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BlazeEggRecipe {
 
    private final JavaPlugin plugin;

    public BlazeEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.BLAZE_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "blaze_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "FRF",
                "FEF",
                "FSF"
        );

        recipe.setIngredient('F', Material.FIRE_CHARGE);
        recipe.setIngredient('R', Material.BLAZE_ROD);
        recipe.setIngredient('S', Material.FLINT_AND_STEEL);
        recipe.setIngredient('E', Material.EGG);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
