package org.scimitarpowered.api.world.entity;

import org.scimitarpowered.api.world.World;
import org.scimitarpowered.api.world.entity.module.Positionable;
import org.scimitarpowered.api.world.entity.module.Respawnable;

public interface Entity extends Positionable, Respawnable {
	
	void tick() throws Exception;
	
	void reset();
	
	int getIndex();
	
	void setIndex(int index);
	
	World getWorld();

	Entity getInteractingEntity();
	
	void setInteractingEntity(Entity entity);
	
	boolean isBusy();
	
	void setBusy(boolean busy);
	
	EntityType getType();
	
}
