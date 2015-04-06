package org.scimitarpowered.api;

import java.io.IOException;

import org.scimitarpowered.api.action.Action;
import org.scimitarpowered.api.event.Event;
import org.scimitarpowered.api.event.EventSubscriber;
import org.scimitarpowered.api.world.entity.Entity;

public interface Engine {

	public String getName();
	
	public int getPort();
	
	public String getIP();
	
	public void startup() throws IOException;
	
	public void tick();
	
	public void sleep() throws InterruptedException;
	
	public boolean isSleeping();
	
	public <E extends Event> void registerEvent(EventSubscriber<E> subscriber);

	public <E extends Event> void deregisterEvent(EventSubscriber<E> subscriber);
	
	public void dispatchEvent(Event event);
	
	public void dispatchAction(Action<?> action);
	
	public void shutdown();
	
}
