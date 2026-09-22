package MiniCash.disableRespawnProtection;

import org.bukkit.plugin.java.JavaPlugin;

public final class DisableRespawnProtection extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new RespawnEvent(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
