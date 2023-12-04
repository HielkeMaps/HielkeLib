package io.github.hielkemaps.api;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public static HielkeAPI API;

    @Override
    public void onEnable() {
        API = new HielkeAPI();
    }
}