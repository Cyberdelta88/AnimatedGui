package fr.cyberdelta88.AnimatedGui.commands;

import fr.cyberdelta88.AnimatedGui.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class Cmdanimatedgui implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            Inventory gui = Bukkit.createInventory(p, 18, ChatColor.GOLD + "Animated Gui");

            ItemStack stack = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)14);
            ItemStack stack2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)1);
            ItemStack stack3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)5);
            ItemStack stack4 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)3);
            ItemStack stack5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
            ItemStack stack6 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
            ItemStack stack7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)10);
            ItemStack stack8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)6);
            ItemStack stack9 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);

            ItemMeta stackmeta = stack.getItemMeta();
            stackmeta.setDisplayName(" ");
            stack.setItemMeta(stackmeta);

            ItemMeta stack2meta = stack2.getItemMeta();
            stack2meta.setDisplayName(" ");
            stack2.setItemMeta(stack2meta);

            ItemMeta stack3meta = stack3.getItemMeta();
            stack3meta.setDisplayName(" ");
            stack3.setItemMeta(stack3meta);

            ItemMeta stack4meta = stack4.getItemMeta();
            stack4meta.setDisplayName(" ");
            stack4.setItemMeta(stack4meta);

            ItemMeta stack5meta = stack5.getItemMeta();
            stack5meta.setDisplayName(" ");
            stack5.setItemMeta(stack5meta);

            ItemMeta stack6meta = stack6.getItemMeta();
            stack6meta.setDisplayName(" ");
            stack6.setItemMeta(stack6meta);

            ItemMeta stack7meta = stack7.getItemMeta();
            stack7meta.setDisplayName(" ");
            stack7.setItemMeta(stack7meta);

            ItemMeta stack8meta = stack8.getItemMeta();
            stack8meta.setDisplayName(" ");
            stack8.setItemMeta(stack8meta);

            ItemMeta stack9meta = stack9.getItemMeta();
            stackmeta.setDisplayName(" ");
            stack9.setItemMeta(stack9meta);



            ItemStack[] v1 = {stack, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack};
            ItemStack[] v2 = {stack9, stack, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9};
            ItemStack[] v3 = {stack8, stack9, stack, stack2, stack3, stack4, stack5, stack6, stack7, stack9, stack, stack2, stack3, stack4, stack5, stack6, stack7, stack8};
            ItemStack[] v4 = {stack7, stack8, stack9, stack, stack2, stack3, stack4, stack5, stack6, stack8, stack9, stack, stack2, stack3, stack4, stack5, stack6, stack7};
            ItemStack[] v5 = {stack6, stack7, stack8, stack9, stack, stack2, stack3, stack4, stack5, stack7, stack8, stack9, stack, stack2, stack3, stack4, stack5, stack6};
            ItemStack[] v6 = {stack5, stack6, stack7, stack8, stack9, stack, stack2, stack3, stack4, stack6, stack7, stack8, stack9, stack, stack2, stack3, stack4, stack5};
            ItemStack[] v7 = {stack4, stack5, stack6, stack7, stack8, stack9, stack, stack2, stack3, stack5, stack6, stack7, stack8, stack9, stack, stack2, stack3, stack4};
            ItemStack[] v8 = {stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack, stack2, stack4, stack5, stack6, stack7, stack8, stack9, stack, stack2, stack3};
            ItemStack[] v9 = {stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack, stack2};

            new BukkitRunnable() {
                int i = 1;
                @Override
                public void run() {
                    if (i == 1) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v1);
                    } else if (i == 2) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v2);
                    } else if (i == 3) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v3);
                    } else if (i == 4) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v4);
                    } else if (i == 5) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v5);
                    } else if (i == 6) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v6);
                    } else if (i == 7) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v7);
                    } else if (i == 8) {
                        i = i + 1;
                        gui.clear();
                        gui.setContents(v8);
                    } else if (i == 9) {
                        i = 1;
                        gui.clear();
                        gui.setContents(v9);
                    }
                }
            }.runTaskTimer(Main.getPlugin(Main.class), 0, 5);

            p.openInventory(gui);


    }

            return false;
    }
}
