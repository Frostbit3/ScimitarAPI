package org.scimitarpowered.api.event.character.player;

import org.scimitarpowered.api.event.Event;
import org.scimitarpowered.api.world.entity.character.player.Player;

public abstract class PlayerEvent implements Event {

	private Player player;
	
	public PlayerEvent(final Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
}
