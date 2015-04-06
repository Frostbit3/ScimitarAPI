package org.scimitarpowered.api.plugin;

import java.io.File;

public interface PluginWrapper {

	BasePlugin getPlugin();
	
	String getName();
	
	File getPluginFolder();
	
}
