package org.scimitarpowered.api.world.entity.character.player;

/**
 * Relatively simple permissions interface.
 * @author Austin
 *
 */
public interface Permission {

	/**
	 * Checks to see if the player has the corresponding rank.
	 * @param player The player that is being tested against.
	 * @param rank The rank we are testing for.
	 * @return Whether or not the player has permission.
	 */
	boolean hasPermission(Player player, Rank rank);
	
}
