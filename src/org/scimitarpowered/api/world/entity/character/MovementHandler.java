package org.scimitarpowered.api.world.entity.character;

import org.scimitarpowered.api.world.entity.Position;

public interface MovementHandler {

	void tick();
	
	void reset();
	
	void finish();
	
	void addToPath(Position position);
	
	void setRunToggled(boolean runToggled);
	
	boolean isRunToggled();
	
	void setRunPath(boolean runPath);

	boolean isRunPath();
	
}
