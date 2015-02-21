package foreverafk.TPplugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class TPplugin extends JavaPlugin{
	
    
	public void onEnable() {
    	// TODO Insert logic to be performed when the plugin is enabled

	}

	public void onDisable() {
		// TODO Insert logic to be performed when the plugin is disabled
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	
		if(cmd.getName().equalsIgnoreCase("mtp")){
			return true;
		}
		
		if(!(sender instanceof Player)){
			sender.sendMessage("How the hell do you teleport console?");
		} else {
			//tp
		}
		
		return false;
		
	}
	
	

}
