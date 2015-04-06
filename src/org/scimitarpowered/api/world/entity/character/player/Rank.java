package org.scimitarpowered.api.world.entity.character.player;

/**
 * Represents a rank in the game.
 * @author Austin
 *
 */
public enum Rank {

	PLAYER(0),
	MODERATOR(1),
	ADMINISTRATOR(2);
	
	/**
	 * The value of a rank.
	 */
	private final int value;
	
	private Rank(final int value) {
		this.value = value;
	}
	
	public byte asByte() {
		return (byte) value;
	}
	
	public int asInteger() {
		return value;
	}
}
