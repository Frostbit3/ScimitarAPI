package org.scimitarpowered.api.event;

import org.scimitarpowered.api.world.entity.Entity;

public abstract class EntityEvent implements Event {

	private Entity entity;
	
	public EntityEvent(Entity entity) {
		this.entity=  entity;
	}
	
	public Entity getEntity() {
		return entity;
	}
	
}
