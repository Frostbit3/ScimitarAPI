package org.scimitarpowered.api.plugin;

import org.scimitarpowered.api.Engine;

public abstract class BasePlugin {
	
	private PluginWrapper wrapper;
	private Engine server;

	/**
     * Called when the server loads
     */
    public abstract void onEnable();

    /**
     * Called when the server unloads
     */
    public abstract void onDisable();

    public PluginWrapper getWrapper() {
		return wrapper;
	}
    
    public void setWrapper(PluginWrapper wrapper) {
    	this.wrapper = wrapper;
    }

	public Engine getServer() {
		return server;
	}
	
    public void setServer(Engine engine) {
    	this.server = engine;
    }
    
}