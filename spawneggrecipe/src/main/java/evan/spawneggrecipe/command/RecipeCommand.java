package evan.spawneggrecipe.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.StringUtil;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class RecipeCommand implements TabExecutor {

    //public String greenText(String text) {
    //        return Component.text(text).color(NamedTextColor.GREEN).toString();
    //    }
//
    //public String redText(String text) {
    //        return Component.text(text).color(NamedTextColor.RED).toString();
    //    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(Component.text("Usage: /eggrecipe <help|creeper|ghast|sheep|witherskeleton|enderman|pig|warden|cow|blaze|enderdragon|villager|pillager>")
                    .color(NamedTextColor.RED));
            return true;
        }

        String type = args[0].toLowerCase();

        Inventory gui = Bukkit.createInventory(null, InventoryType.WORKBENCH, "§8Custom Recipe Creator");
                ((org.bukkit.entity.Player) sender).openInventory(gui);

        switch (type) {

            case "help":
                sender.sendMessage("Available recipes:");
                sender.sendMessage("- Creeper");
                sender.sendMessage("- Chicken");
                sender.sendMessage("- Wither Skeleton");
                sender.sendMessage("- Ghast");
                sender.sendMessage("- Enderman");
                sender.sendMessage("- Pig");
                sender.sendMessage("- Warden");
                sender.sendMessage("- Cow");
                sender.sendMessage("- Blaze");
                sender.sendMessage("- Enderdragon");
                sender.sendMessage("- Villager");
                sender.sendMessage("- Pillager");
                sender.sendMessage("- Sheep");
                break;

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
                sender.sendMessage("Pig Spawn Egg Recipe:");
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
                sender.sendMessage("Warden Spawn Egg Recipe:");
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
                sender.sendMessage("Cow Spawn Egg Recipe:");
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
                sender.sendMessage("Blaze Spawn Egg Recipe:");
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

            case "witherskeleton":
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
                sender.sendMessage("Unknown recipe: " + type);
                break;
        }

        return true;
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> suggestions = new ArrayList<>();

        // If the player is on the first argument
        if (args.length == 1) {
            suggestions.add("creeper");
            suggestions.add("chicken");
            suggestions.add("witherskeleton");
            suggestions.add("ghast");
            suggestions.add("enderman");
            suggestions.add("pig");
            suggestions.add("warden");
            suggestions.add("cow");
            suggestions.add("blaze");
            suggestions.add("enderdragon");
            suggestions.add("villager");
            suggestions.add("pillager");
            suggestions.add("sheep");
        } 
        
        // Use StringUtil to filter the results based on what the user has started typing
        List<String> result = new ArrayList<>();
        StringUtil.copyPartialMatches(args[args.length - 1], suggestions, result);
        
        // Sort alphabetically and return
        Collections.sort(result);
        return result;
    }
}