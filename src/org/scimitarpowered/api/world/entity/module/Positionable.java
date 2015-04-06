package org.scimitarpowered.api.world.entity.module;

import org.scimitarpowered.api.world.entity.Position;

public interface Positionable {

	Position getPosition();
	
	/**
	 * Sets the player's Position. <b>Please use this method with caution</b>,
	 * as reference conflicts may lead this player to move when they shouldn't.
	 * Consider using position.setAs(other) instead of this method if you wish
	 * to set the current players <b>coordinates</b> (not actual position
	 * reference) to that of another position.
	 * 
	 * @param position
	 *            the new Position
	 */
	void setPosition(Position position);
	
	Position getCurrentRegion();
	
}
