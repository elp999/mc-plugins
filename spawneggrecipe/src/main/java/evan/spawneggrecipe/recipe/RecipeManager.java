package evan.spawneggrecipe.recipe;

import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class RecipeManager {

    private final JavaPlugin plugin;

    public static File[] getFiles() {

        String workingDirectory = System.getProperty("user.dir");
        File directory = new File(workingDirectory);

        File[] files = directory.listFiles();
        
        return files;
    }

    public RecipeManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void registerRecipes() {

        getFiles();
        for (File file : getFiles()) {
            String fileName = file.getName();
            try {
                // Remove file extension and construct class name
                String className = fileName.substring(0, fileName.lastIndexOf('.'));
                String fullClassName = "evan.spawneggrecipe.recipe." + className;
                
                // Use reflection to instantiate the recipe class
                Class<?> recipeClass = Class.forName(fullClassName);
                Object recipe = recipeClass.getConstructor(JavaPlugin.class).newInstance(plugin);
                
                // Call register method using reflection
                recipeClass.getMethod("register").invoke(recipe);
            } catch (Exception e) {
                plugin.getLogger().warning("Failed to register recipe from file: " + fileName);
                e.printStackTrace();

                // new CreeperEggRecipe(plugin).register();
                // new EndermanEggRecipe(plugin).register();
            }
        }
    }
}