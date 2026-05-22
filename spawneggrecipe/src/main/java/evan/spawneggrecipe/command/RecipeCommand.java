package evan.spawneggrecipe.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import evan.spawneggrecipe.recipe.WardenEggRecipe;

//import evan.spawneggrecipe.recipe.BlazeEggRecipe;
//import evan.spawneggrecipe.recipe.CreeperEggRecipe;
//import evan.spawneggrecipe.recipe.EndermanEggRecipe;

public class RecipeCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public RecipeCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /eggrecipe <creeper|enderman|pig|warden|cow|blaze>");
            return true;
        }

        String type = args[0].toLowerCase();

        Inventory gui = Bukkit.createInventory(null, InventoryType.WORKBENCH, "§8Custom Recipe Creator");
                ((org.bukkit.entity.Player) sender).openInventory(gui);

        switch (type) {

            case "enderman":

                gui.setItem(1, new ItemStack(org.bukkit.Material.END_ROD)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.ENDER_EYE)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.END_ROD)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.ENDER_PEARL)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.ENDER_PEARL)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.END_ROD)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.ENDER_EYE)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.END_ROD)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.ENDERMAN_SPAWN_EGG)); // crafting result
                break;

            case "creeper":

                gui.setItem(1, new ItemStack(org.bukkit.Material.TNT)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.GUNPOWDER)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.TNT)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.TNT)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.TNT)); //block
                gui.setItem(7, new ItemStack(org.bukkit.Material.TNT)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.GUNPOWDER)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.TNT)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.CREEPER_SPAWN_EGG)); // crafting result

                break;

            case "pig":
                gui.setItem(1, new ItemStack(org.bukkit.Material.CARROT)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.GOLD_INGOT)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.CARROT)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.PORKCHOP)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.PORKCHOP)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.CARROT)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.GOLD_INGOT)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.CARROT)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.PIG_SPAWN_EGG)); // crafting result

                break;

            case "warden":
                WardenEggRecipe wardenRecipe = new WardenEggRecipe(plugin);

                gui.setItem(1, new ItemStack(org.bukkit.Material.SCULK_SHRIEKER)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.SCULK_SENSOR)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.SCULK_SHRIEKER)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.SCULK_SHRIEKER)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.SCULK_SHRIEKER)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.SCULK_SHRIEKER)); //block 7
                gui.setItem(8, wardenRecipe.getPotion()); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.SCULK_SHRIEKER)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.WARDEN_SPAWN_EGG)); // crafting result

                break;

            case "cow":
                gui.setItem(1, new ItemStack(org.bukkit.Material.COOKED_BEEF)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.MILK_BUCKET)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.LEATHER)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.MILK_BUCKET)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.MILK_BUCKET)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.LEATHER)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.MILK_BUCKET)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.COOKED_BEEF)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.COW_SPAWN_EGG)); // crafting result
                break;

            case "blaze":
                gui.setItem(1, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.BLAZE_ROD)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.FLINT_AND_STEEL)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.BLAZE_SPAWN_EGG)); // crafting result

                break;

            default:
                sender.sendMessage(ChatColor.RED + "Unknown recipe: " + type);
                break;
        }

        return true;
    }
}