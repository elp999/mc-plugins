package evan.spawneggrecipe;
import evan.spawneggrecipe.command.RecipeCommand;
import evan.spawneggrecipe.listener.MyGuiListener;
import evan.spawneggrecipe.recipe.RecipeManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnEggRecipe extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("SpawnEggRecipe has been enabled!");
        // Register your recipes and event listeners here
        new RecipeManager(this).registerRecipes();
        getCommand("eggrecipe").setExecutor(new RecipeCommand());
        this.getCommand("eggrecipe").setTabCompleter(new RecipeCommand());

        getServer().getPluginManager().registerEvents(new MyGuiListener(), this);
        this.getLogger().info("Plugin enabled and listener registered!");
    }
    
}
