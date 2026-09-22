package MiniCash.disableRespawnProtection;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RespawnEvent implements Listener {

    private final JavaPlugin plugin;

    public RespawnEvent(JavaPlugin plugin){
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onRespawn(PlayerRespawnEvent event){

        Player player = event.getPlayer();

        Location targetLocation = event.getRespawnLocation();

        Bukkit.getScheduler().runTaskLater(plugin , () ->{

            player.teleport(targetLocation);

        },1L);


    }


}
