package evan.spawneggrecipe.recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;


public class WardenEggRecipe {

    private final JavaPlugin plugin;

    public WardenEggRecipe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public ItemStack getPotion() {
        ItemStack potion = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setBasePotionType(PotionType.AWKWARD);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 0), true);

        meta.setDisplayName("Potion of Blindness");
        meta.setColor(Color.fromRGB(31, 31, 31)); // Dark grey/black color

        potion.setItemMeta(meta);
        return potion;
    }

    public ShapedRecipe getRecipe() {
        ItemStack result = new ItemStack(Material.WARDEN_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(plugin, "warden_spawn_egg");
        ShapedRecipe recipe = new ShapedRecipe(key, result);

        recipe.shape(
                "SKS",
                "SES",
                "SPS"
        );

        recipe.setIngredient('S', Material.SCULK_SHRIEKER);
        recipe.setIngredient('K', Material.SCULK_SENSOR);
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(getPotion()));
        recipe.setIngredient('E', Material.EGG);
        
        return recipe;
    }

    public void register() {
        Bukkit.addRecipe(getRecipe());
    }
}