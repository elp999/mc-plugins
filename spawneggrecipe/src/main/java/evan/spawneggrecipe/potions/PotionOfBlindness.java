
package evan.spawneggrecipe.potions;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionType;

import io.papermc.paper.potion.PotionMix;

import evan.spawneggrecipe.recipe.WardenEggRecipe;

public class PotionOfBlindness {

    private final JavaPlugin plugin;

    public PotionOfBlindness(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public PotionMix getBlindnessMix() {

        NamespacedKey key = new NamespacedKey(plugin, "potion_of_blindness");
        ItemStack result = new WardenEggRecipe(plugin).getPotion();
        RecipeChoice ingredient = new RecipeChoice.MaterialChoice(Material.GOLDEN_CARROT);

        RecipeChoice input =
                PotionMix.createPredicateChoice(item -> {

                    if (item == null)
                        return false;

                    if (item.getType() != Material.POTION)
                        return false;

                    if (!(item.getItemMeta() instanceof PotionMeta meta))
                        return false;

                    return meta.getBasePotionType()
                            == PotionType.NIGHT_VISION;
                });

        return new PotionMix(
            key,
            result,
            input,
            ingredient
        );
    }
}