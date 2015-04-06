package org.scimitarpowered.api.world;

/**
 * Thrown when a game exception has occurred in the game world.
 * @author Austin
 *
 */
public class WorldException extends Exception {

	/**
	 * A generated serial UID.
	 */
	private static final long serialVersionUID = 1621948673456554984L;

	/**
	 * Creates a new exception <b>without</b> a detail message.
	 */
	public WorldException() {}
	
	/**
	 * Creates a new exception <b>with</b> a detail message.
	 * @param message The error message details.
	 */
	public WorldException(String message) {
		super(message);
	}
	
}
