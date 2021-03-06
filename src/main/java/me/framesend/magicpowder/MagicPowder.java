package me.framesend.magicpowder;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class MagicPowder extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

 
        ItemStack categoryItem = new CustomItem(Material.SUGAR, "&bMagic Powders", "", "&a> Click to open");
        NamespacedKey categoryId = new NamespacedKey(this, "magic_powders");
        Category category = new Category(categoryId, categoryItem);

        SlimefunItemStack cocaLeafItem = new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless.");
        ItemStack[] cocaLeafRecipe = {  new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES),
				        		new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES),
				        		new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES)};
        
        SlimefunItem cocaleaf = new CocaLeaf(category, cocaLeafItem, RecipeType.ORE_WASHER, cocaLeafRecipe);
        cocaleaf.register(this);
        
        SlimefunItemStack cocaPowderItem = new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?");
        ItemStack[] cocaPowderRecipe = {new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."),
							        	new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."),
							        	new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&bCoca Leaf", "", "&7It seems useless.")};

        SlimefunItem cocapowder = new SlimefunItem(category, cocaPowderItem, RecipeType.ORE_CRUSHER, cocaPowderRecipe);
        cocapowder.register(this);
        
        SlimefunItemStack unrefinedCocaineItem = new SlimefunItemStack("UNREFINED_COCAINE", Material.SUGAR, "&bUnrefined Cocaine", "", "&7It seems useless.");
        ItemStack[] unrefinedCocaineRecipe = {  new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"),
        		new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"),
        		new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&bCoca Powder", "", "&7What's this for?")};
        
        SlimefunItem unrefinedcocaine = new UnrefinedCocaine(category, unrefinedCocaineItem, RecipeType.PRESSURE_CHAMBER, unrefinedCocaineRecipe);
        unrefinedcocaine.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }
}
