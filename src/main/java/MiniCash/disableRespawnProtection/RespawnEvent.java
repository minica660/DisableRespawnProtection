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


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onRespawn(PlayerRespawnEvent event){

        // ベットかリスポーンアンカーにリスポーンする際は処理は行わない
        if(event.isBedSpawn() || event.isAnchorSpawn()){
            return;
        }

        Player player = event.getPlayer();


        event.setRespawnLocation(player.getWorld().getSpawnLocation());


    }


}
