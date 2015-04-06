package org.scimitarpowered.api.event.character.player;

import org.scimitarpowered.api.world.entity.character.player.Player;
import org.scimitarpowered.api.world.entity.character.player.Rank;

public class SendPrivateMessageEvent extends PlayerEvent {
	
	private final String sender;
	private final String message;
	private final Rank rank;

	public SendPrivateMessageEvent(Player player, String sender, String message, Rank rank) {
		super(player);
		this.sender = sender;
		this.message = message;
		this.rank = rank;
	}

	public String getMessage() {
		return message;
	}

	public Rank getRank() {
		return rank;
	}

	public String getSender() {
		return sender;
	}
	
}
