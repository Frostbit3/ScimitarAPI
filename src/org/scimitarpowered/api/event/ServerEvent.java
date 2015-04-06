package org.scimitarpowered.api.event;

import org.scimitarpowered.api.Engine;

public abstract class ServerEvent implements Event {
	
	private Engine server;
	
	public ServerEvent(Engine server) {
		this.server = server;
	}
	
	public Engine getServer() {
		return server;
	}

}
