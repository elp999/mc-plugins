package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class EndermanEggRecipe {

    private final JavaPlugin plugin;

    public EndermanEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.ENDERMAN_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "enderman_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "ROR",
                "ESE",
                "ROR"
        );

        recipe.setIngredient('R', Material.END_ROD);
        recipe.setIngredient('E', Material.ENDER_PEARL);
        recipe.setIngredient('S', Material.EGG);
        recipe.setIngredient('O', Material.ENDER_EYE);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
    
}
