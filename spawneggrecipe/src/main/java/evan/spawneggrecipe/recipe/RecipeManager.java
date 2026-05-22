package evan.spawneggrecipe.recipe;

import org.bukkit.plugin.java.JavaPlugin;

public class RecipeManager {

    private final JavaPlugin plugin;

    public RecipeManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void registerRecipes() {

        new CreeperEggRecipe(plugin).register(); //works
        new EndermanEggRecipe(plugin).register(); //works
        new PigEggRecipe(plugin).register(); //works
        new WardenEggRecipe(plugin).register(); //need to add recipe for potion
        new CowEggRecipe(plugin).register(); //works
        new BlazeEggRecipe(plugin).register(); //works
        new VillagerEggRecipe(plugin).register(); //works
        new EnderdragonEggRecipe(plugin).register(); // should work
        new PillagerEggRecipe(plugin).register(); // should work
        new SheepEggRecipe(plugin).register(); //works
        new ChickenEggRecipe(plugin).register(); //works
        new WitherSkeletonEggRecipe(plugin).register(); //works
        new GhastEggRecipe(plugin).register(); // works
    }
}