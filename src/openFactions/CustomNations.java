package openFactions;

import java.util.ArrayList;
import java.util.Date;

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
		ArrayList<String> pseudoMembers = new ArrayList<String>();
		pseudoMembers.add("ZettaX");
		pseudoMembers.add("Inivican");
		Faction yeet = new Faction("yeet", new Date(), pseudoMembers, null);
		yeet.getName();
		yeet.getMembers();
		//TODO: Run necessary methods
	}
	//////////
	
	
}
