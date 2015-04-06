package org.scimitarpowered.api.world.entity.character.dialogue;

import org.scimitarpowered.api.world.entity.character.MovementHandler;

public interface Moveable {

	MovementHandler getMovementHandler();
	
	int getPrimaryDirection();
	
	void setPrimaryDirection(int primaryDirection);
	
	int getSecondaryDirection();
	
	void setSecondaryDirection(int secondaryDirection);
}
