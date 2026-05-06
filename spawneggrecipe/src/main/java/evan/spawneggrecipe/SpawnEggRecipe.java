package evan.spawneggrecipe;
import evan.spawneggrecipe.command.RecipeCommand;
import evan.spawneggrecipe.recipe.RecipeManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnEggRecipe extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("SpawnEggRecipe has been enabled!");
        // Register your recipes and event listeners here
        new RecipeManager(this).registerRecipes();
        getCommand("eggrecipe").setExecutor(new RecipeCommand());
    }
    
}
