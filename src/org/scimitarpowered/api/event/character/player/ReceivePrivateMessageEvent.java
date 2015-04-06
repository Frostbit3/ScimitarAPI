package org.scimitarpowered.api.event.character.player;

import org.scimitarpowered.api.world.entity.character.player.Player;

public class ReceivePrivateMessageEvent extends PlayerEvent {
	
	private final String friendName;
	private final String message;
	
	/**
	 * @param player
	 * @param friend
	 * @param message
	 */
	public ReceivePrivateMessageEvent(Player player, String friendName,
			String message) {
		super(player);
		this.friendName = friendName;
		this.message = message;
	}

	public String getFriendName() {
		return friendName;
	}

	public String getMessage() {
		return message;
	}

}
