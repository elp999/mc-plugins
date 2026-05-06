package evan.spawneggrecipe.recipe;

import org.bukkit.plugin.java.JavaPlugin;

public class RecipeManager {

    private final JavaPlugin plugin;

    public RecipeManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void registerRecipes() {
        new CreeperEggRecipe(plugin).register();
        new EndermanEggRecipe(plugin).register();
    }
}