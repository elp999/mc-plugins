package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class MooshroomEggRecipe {

    private final JavaPlugin plugin;

    public MooshroomEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    
    ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.MOOSHROOM_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "mooshroom_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                " M ",
                " E ",
                "LLL"
        );

        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('E', Material.COW_SPAWN_EGG);
        recipe.setIngredient('M', Material.RED_MUSHROOM);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
