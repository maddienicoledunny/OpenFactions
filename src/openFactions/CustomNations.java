package openFactions;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author Seth G. R. Herendeen
 *
 */
public class CustomNations extends JavaPlugin{
	
	
	//TODO: Add file return functions for configuration purposes
	
	@Override
	public void onEnable() {
		this.getCommand("of").setExecutor(new Commands(this));
		//TODO: Run necessary methods
	}
	
	//////////
	
	
}
