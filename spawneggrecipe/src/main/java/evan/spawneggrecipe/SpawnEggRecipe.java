package evan.spawneggrecipe;

import evan.spawneggrecipe.command.RecipeCommand;
import evan.spawneggrecipe.listener.MyGuiListener;
import evan.spawneggrecipe.recipe.RecipeManager;
import org.bukkit.plugin.java.JavaPlugin;

import evan.spawneggrecipe.potions.PotionOfBlindness;

public class SpawnEggRecipe extends JavaPlugin {
    
    @Override
    public void onEnable() {
        // Registing recipes here
        new RecipeManager(this).registerRecipes();


        // Register command and tab completer
        getCommand("eggrecipe").setExecutor(new RecipeCommand(this));
        getCommand("eggrecipe").setTabCompleter(new RecipeCommand(this));


        // Register the GUI listener
        getServer().getPluginManager().registerEvents(new MyGuiListener(), this);


        // Registering the custom brewing recipe for the Potion of Blindness
        getServer().getPotionBrewer().addPotionMix(new PotionOfBlindness(this).getBlindnessMix());


        // logs
        getLogger().info("SpawnEggRecipe has been enabled!");
    }
    
}
