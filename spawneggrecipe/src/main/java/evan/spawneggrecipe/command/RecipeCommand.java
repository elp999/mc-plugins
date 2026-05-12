package evan.spawneggrecipe.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RecipeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /eggrecipe <creeper|enderman|pig|warden|cow|blaze>");
            return true;
        }

        String type = args[0].toLowerCase();

        switch (type) {

            case "enderman":
                sender.sendMessage(ChatColor.GREEN + "Enderman Spawn Egg Recipe:");
                sender.sendMessage("R = End Rod");
                sender.sendMessage("E = Ender Pearl");
                sender.sendMessage("S = Egg");
                sender.sendMessage("O = Ender Eye");
                sender.sendMessage("");
                sender.sendMessage("ROR");
                sender.sendMessage("ESE");
                sender.sendMessage("ROR");
                break;

            case "creeper":
                sender.sendMessage(ChatColor.GREEN + "Creeper Spawn Egg Recipe:");
                sender.sendMessage("T = TNT");
                sender.sendMessage("E = Egg");
                sender.sendMessage("G = Gunpowder");
                sender.sendMessage("");
                sender.sendMessage("TGT");
                sender.sendMessage("TET");
                sender.sendMessage("TGT");
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

            default:
                sender.sendMessage(ChatColor.RED + "Unknown recipe: " + type);
                break;
        }

        return true;
    }
}