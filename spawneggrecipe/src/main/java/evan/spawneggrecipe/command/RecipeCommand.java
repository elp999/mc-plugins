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
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import evan.spawneggrecipe.recipe.WardenEggRecipe;


public class RecipeCommand implements TabExecutor {
    private final JavaPlugin plugin;

    public RecipeCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(Component.text("Usage: /eggrecipe <help|zombiepigman|skeleton|zombie|wolf|cat|creeper|ghast|sheep|witherskeleton|enderman|pig|warden|cow|blaze|enderdragon|villager|pillager>")
                    .color(NamedTextColor.RED));
            return true;
        }

        String type = args[0].toLowerCase();
        
        if (type.equals("help")) {
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
                sender.sendMessage("- Wolf");
                sender.sendMessage("- Cat");
                sender.sendMessage("- Skeleton");
                sender.sendMessage("- Zombie");
                sender.sendMessage("- Zombiepigman");

        } else {
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

            case "wolf":
                gui.setItem(1, new ItemStack(org.bukkit.Material.AIR)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.DIAMOND)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.AIR)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.BONE)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block
                gui.setItem(6, new ItemStack(org.bukkit.Material.BONE)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.AIR)); //block
                gui.setItem(8, new ItemStack(org.bukkit.Material.BONE)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.AIR)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.WOLF_SPAWN_EGG)); // crafting result
                break;

            case "cat":
                gui.setItem(1, new ItemStack(org.bukkit.Material.STRING)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.MILK_BUCKET)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.STRING)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.COD)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.COD)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.SALMON)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.COD)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.SALMON)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.CAT_SPAWN_EGG)); // crafting result
                break;

            case "zombie":
                gui.setItem(1, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.CARROT)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.FEATHER)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.FEATHER)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.ZOMBIE_SPAWN_EGG)); // crafting result
                break;

            case "skeleton":
                gui.setItem(1, new ItemStack(org.bukkit.Material.ARROW)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.BOW)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.ARROW)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.BONE)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.BONE)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.BONE)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.BONE)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.BONE)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.SKELETON_SPAWN_EGG)); // crafting result
                break;

            case "zombiepigman":
                gui.setItem(1, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 1
                gui.setItem(2, new ItemStack(org.bukkit.Material.GOLD_INGOT)); //block 2
                gui.setItem(3, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 3
                gui.setItem(4, new ItemStack(org.bukkit.Material.GOLD_NUGGET)); //block 4
                gui.setItem(5, new ItemStack(org.bukkit.Material.PIG_SPAWN_EGG)); //block 5
                gui.setItem(6, new ItemStack(org.bukkit.Material.GOLDEN_SWORD)); //block 6
                gui.setItem(7, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 7
                gui.setItem(8, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 8
                gui.setItem(9, new ItemStack(org.bukkit.Material.ROTTEN_FLESH)); //block 9

                gui.setItem(0, new ItemStack(org.bukkit.Material.ZOMBIFIED_PIGLIN_SPAWN_EGG)); // crafting result
                break;

            default:
                sender.sendMessage("Unknown recipe: " + type);
                break;
            }
        }
        return true;
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> suggestions = new ArrayList<>();

        // If the player is on the first argument
        if (args.length == 1) {
            suggestions.add("help");
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
            suggestions.add("wolf");
            suggestions.add("cat");
            suggestions.add("zombie");
            suggestions.add("skeleton");
            suggestions.add("zombiepigman");
        } 
        
        // Use StringUtil to filter the results based on what the user has started typing
        List<String> result = new ArrayList<>();
        StringUtil.copyPartialMatches(args[args.length - 1], suggestions, result);
        
        // Sort alphabetically and return
        Collections.sort(result);
        return result;
    }
}