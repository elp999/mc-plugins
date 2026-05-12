package evan.spawneggrecipe.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RecipeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /eggrecipe <creeper|enderman>");
            return true;
        }

        String type = args[0].toLowerCase();

        Inventory gui = Bukkit.createInventory(null, InventoryType.WORKBENCH, "§8Custom Recipe Creator");
                ((org.bukkit.entity.Player) sender).openInventory(gui);

        switch (type) {

            case "enderman":

                gui.setItem(0, new ItemStack(org.bukkit.Material.END_ROD)); //block 1
                gui.setItem(1, new ItemStack(org.bukkit.Material.ENDER_PEARL)); //block 2
                gui.setItem(2, new ItemStack(org.bukkit.Material.EGG)); //block 3
                gui.setItem(3, new ItemStack(org.bukkit.Material.ENDER_EYE)); //block 4
                gui.setItem(4, new ItemStack(org.bukkit.Material.END_ROD)); //block 5
                gui.setItem(5, new ItemStack(org.bukkit.Material.ENDER_PEARL)); //block 6
                gui.setItem(6, new ItemStack(org.bukkit.Material.EGG)); //block 7
                gui.setItem(7, new ItemStack(org.bukkit.Material.ENDER_EYE)); //block 8
                gui.setItem(8, new ItemStack(org.bukkit.Material.END_ROD)); //block 9

                gui.setItem(9, new ItemStack(org.bukkit.Material.ENDERMAN_SPAWN_EGG)); // crafting result
                break;

            case "creeper":
                
                gui.setItem(0, new ItemStack(org.bukkit.Material.TNT)); //block 1
                gui.setItem(1, new ItemStack(org.bukkit.Material.GUNPOWDER)); //block 2
                gui.setItem(2, new ItemStack(org.bukkit.Material.TNT)); //block 3
                gui.setItem(3, new ItemStack(org.bukkit.Material.TNT)); //block 4
                gui.setItem(4, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(5, new ItemStack(org.bukkit.Material.TNT)); //block
                gui.setItem(6, new ItemStack(org.bukkit.Material.TNT)); //block 7
                gui.setItem(7, new ItemStack(org.bukkit.Material.GUNPOWDER)); //block 8
                gui.setItem(8, new ItemStack(org.bukkit.Material.TNT)); //block 9

                gui.setItem(9, new ItemStack(org.bukkit.Material.CREEPER_SPAWN_EGG)); // crafting result

                break;

            default:
                sender.sendMessage(ChatColor.RED + "Unknown recipe: " + type);
                break;
        }

        return true;
    }
}