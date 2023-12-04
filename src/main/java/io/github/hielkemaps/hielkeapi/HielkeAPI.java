package io.github.hielkemaps.hielkeapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HielkeAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void Test(){
        Bukkit.getLogger().info("TEST");
    }
}
