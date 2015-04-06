package org.scimitarpowered.api.action;

import java.util.List;
import java.util.Queue;

import org.scimitarpowered.api.world.entity.Entity;

public interface ActionDispatcher {
	
	void schedule(final Action<Entity> action);
	
	void tick();
	
	void destroy();

	List<Action<Entity>> getActiveActions();
	
	Queue<Action<Entity>> getQueuedActions();
	
}
