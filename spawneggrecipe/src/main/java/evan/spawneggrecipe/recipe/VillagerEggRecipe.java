package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class VillagerEggRecipe {

    private final JavaPlugin plugin;

    public VillagerEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.VILLAGER_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "villager_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "MHM",
                "MEM",
                "MAM"
        );

        recipe.setIngredient('M', Material.EMERALD);
        recipe.setIngredient('E', Material.EGG);
        recipe.setIngredient('A', Material.GOLDEN_AXE);
        recipe.setIngredient('H', Material.GOLDEN_HOE);
        return recipe;
    }
    
    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}
