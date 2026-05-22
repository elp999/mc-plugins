package evan.spawneggrecipe.potions;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import io.papermc.paper.potion.PotionMix;

import evan.spawneggrecipe.recipe.WardenEggRecipe;

import org.bukkit.inventory.RecipeChoice;

public class PotionOfBlindness {

    private final JavaPlugin plugin;

    public PotionOfBlindness(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public PotionMix getBlindnessMix() {
        NamespacedKey key = new NamespacedKey(plugin, "potion_of_blindness");
        ItemStack potion = new ItemStack(Material.POTION);
        RecipeChoice choice = new RecipeChoice.MaterialChoice(Material.GOLDEN_APPLE);
        RecipeChoice potionChoice = new RecipeChoice.ExactChoice(new WardenEggRecipe(plugin).getPotion());

        return new PotionMix(key, potion, choice, potionChoice);
    }
}
