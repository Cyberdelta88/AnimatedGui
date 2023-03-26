package fr.cyberdelta88.AnimatedGui;

import fr.cyberdelta88.AnimatedGui.commands.Cmdanimatedgui;

import fr.cyberdelta88.AnimatedGui.listener.ClickGuiEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("animatedgui").setExecutor(new Cmdanimatedgui());

        getServer().getPluginManager().registerEvents(new ClickGuiEvent(), this);
    }
}







