package eu.mysterycloud;

import eu.mysterycloud.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override()
    public void onDisable() {
        super.onDisable();
    }

    @Override()
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§b[Stoplag]§7 Plugin Stoplag wurde geladen...");
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

}