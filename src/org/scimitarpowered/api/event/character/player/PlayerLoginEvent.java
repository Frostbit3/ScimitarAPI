package org.scimitarpowered.api.event.character.player;

import org.scimitarpowered.api.world.entity.character.player.Player;

public class PlayerLoginEvent extends PlayerEvent {
	
	public PlayerLoginEvent(final Player player) {
		super(player);
	}
}
