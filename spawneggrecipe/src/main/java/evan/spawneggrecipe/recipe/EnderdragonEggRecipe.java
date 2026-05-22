package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderdragonEggRecipe {

    private final JavaPlugin plugin;

    public EnderdragonEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.ENDER_DRAGON_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "ender_dragon_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "DMD",
                "MEM",
                "DMD"
        );

        recipe.setIngredient('D', Material.DRAGON_HEAD);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('M', Material.ENDERMAN_SPAWN_EGG);
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}