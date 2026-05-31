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
        new WardenEggRecipe(plugin).register(); //works
        new CowEggRecipe(plugin).register(); //works
        new BlazeEggRecipe(plugin).register(); //works
        new VillagerEggRecipe(plugin).register(); //works
        new EnderdragonEggRecipe(plugin).register(); // works
        new PillagerEggRecipe(plugin).register(); // works
        new SheepEggRecipe(plugin).register(); //works
        new ChickenEggRecipe(plugin).register(); //works
        new WitherSkeletonEggRecipe(plugin).register(); //works
        new GhastEggRecipe(plugin).register(); // works
        new WolfEggRecipe(plugin).register(); //works
        new CatEggRecipe(plugin).register(); //works
        new ZombieEggRecipe(plugin).register(); //works
        new SkeletonEggRecipe(plugin).register(); //works
        new ZombiepigmanEggRecipe(plugin).register(); //works
        new MooshroomEggRecipe(plugin).register(); //works
    }
}