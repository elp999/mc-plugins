package evan.spawneggrecipe.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

//import evan.spawneggrecipe.recipe.BlazeEggRecipe;
//import evan.spawneggrecipe.recipe.CreeperEggRecipe;
//import evan.spawneggrecipe.recipe.EndermanEggRecipe;

public class RecipeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /eggrecipe <creeper|ghast|sheep|witherSkeleton|enderman|pig|warden|cow|blaze|enderdragon|villager|pillager>");
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
                sender.sendMessage(ChatColor.GREEN + "Pig Spawn Egg Recipe:");
                sender.sendMessage("C = Carrot");
                sender.sendMessage("G = Gold Ingot");
                sender.sendMessage("P = Porkchop");
                sender.sendMessage("E = Egg");
                sender.sendMessage("");
                sender.sendMessage("CGC");
                sender.sendMessage("PEP");
                sender.sendMessage("CGC");
                break;

            case "warden":
                sender.sendMessage(ChatColor.GREEN + "Warden Spawn Egg Recipe:");
                sender.sendMessage("S = Sculk Shrieker");
                sender.sendMessage("K = Sculk Sensor");
                sender.sendMessage("P = Potion of Blindness");
                sender.sendMessage("E = Egg");
                sender.sendMessage("");
                sender.sendMessage("SKS");
                sender.sendMessage("SES");
                sender.sendMessage("SPS");
                break;

            case "cow":
                sender.sendMessage(ChatColor.GREEN + "Cow Spawn Egg Recipe:");
                sender.sendMessage("L = Leather");
                sender.sendMessage("M = Milk Bucket");
                sender.sendMessage("C = Egg");
                sender.sendMessage("S = Cooked Beef");
                sender.sendMessage("");
                sender.sendMessage("SML");
                sender.sendMessage("MCM");
                sender.sendMessage("LMS");
                break;

            case "blaze":
                sender.sendMessage(ChatColor.GREEN + "Blaze Spawn Egg Recipe:");
                sender.sendMessage("F = Fire Charge");
                sender.sendMessage("R = Blaze Rod");
                sender.sendMessage("S = Flint and Steel");
                sender.sendMessage("E = Egg");
                sender.sendMessage("");
                sender.sendMessage("FRF");
                sender.sendMessage("FEF");
                sender.sendMessage("FSF");
                break;
            
            case "villager":
                gui.setItem(1, new ItemStack(org.bukkit.Material.EMERALD)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.GOLDEN_HOE)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.EMERALD)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.EMERALD)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.EMERALD)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.EMERALD)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.GOLDEN_AXE)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.EMERALD)); //block 9
                
                gui.setItem(0, new ItemStack(org.bukkit.Material.VILLAGER_SPAWN_EGG)); // crafting result
                break;

            case "enderdragon":
                gui.setItem(1, new ItemStack(org.bukkit.Material.DRAGON_HEAD)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.ENDERMAN_SPAWN_EGG)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.DRAGON_HEAD)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.ENDERMAN_SPAWN_EGG)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.ENDERMAN_SPAWN_EGG)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.DRAGON_HEAD)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.ENDERMAN_SPAWN_EGG)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.DRAGON_HEAD)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.ENDER_DRAGON_SPAWN_EGG)); // crafting result
                break;

            case "pillager":
                gui.setItem(1, new ItemStack(org.bukkit.Material.EMERALD)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.CROSSBOW)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.EMERALD)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.STONE_SPEAR)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.STONE_SPEAR)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.EMERALD)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.CROSSBOW)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.EMERALD)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.PILLAGER_SPAWN_EGG)); // crafting result
                break;

            case "sheep":
                gui.setItem(1, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.WHITE_WOOL)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.SHEEP_SPAWN_EGG)); // crafting result
                break;

            case "chicken":
                gui.setItem(1, new ItemStack(org.bukkit.Material.FEATHER)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.COOKED_CHICKEN)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.FEATHER)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.EGG)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.EGG)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.FEATHER)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.EGG)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.FEATHER)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.CHICKEN_SPAWN_EGG)); // crafting result
                break;

            case "witherSkeleton":
                gui.setItem(1, new ItemStack(org.bukkit.Material.COAL)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.STONE_SWORD)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.COAL)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.COAL)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.COAL)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.COAL)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.BONE)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.COAL)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.WITHER_SKELETON_SPAWN_EGG)); // crafting result
                break;

            case "ghast":
                gui.setItem(1, new ItemStack(org.bukkit.Material.GUNPOWDER)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.FIRE_CHARGE)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.GUNPOWDER)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.GHAST_TEAR)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.GHAST_TEAR)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.GHAST_TEAR)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.GHAST_TEAR)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.GHAST_TEAR)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.GHAST_SPAWN_EGG)); // crafting result
                break;

            default:
                sender.sendMessage(ChatColor.RED + "Unknown recipe: " + type);
                break;
        }

        return true;
    }
}