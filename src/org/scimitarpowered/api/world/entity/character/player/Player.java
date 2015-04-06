package org.scimitarpowered.api.world.entity.character.player;

import java.util.UUID;

import org.scimitarpowered.api.world.entity.character.CharacterEntity;
import org.scimitarpowered.api.world.entity.item.Item;

/**
 * An abstract representation of a Player.
 * @author Austin
 *
 */
public interface Player extends CharacterEntity {
	
	/**
	 * Returns the UUID of the player.
	 * @return The UUID.
	 */
	UUID getUUID();
	
	/**
	 * Sets the UUID of the player.
	 * @param uuid The new UUID.
	 */
	void setUUID(UUID uuid);
	
	/**
	 * Returns the username of the player.
	 * @return The username.
	 */
	String getUsername();
	
	/**
	 * Sets the username of the player.
	 * @param username The new username.
	 */
	void setUsername(String username);
	
	/**
	 * Returns the password of the player.
	 * @return The password.
	 */
	String getPassword();
	
	void handleCommand(String keyword, String[] args);
	
	/**
	 * Sets the password of the player.
	 * @param password The new password.
	 */
	void setPassword(String password);

	/**
	 * Returns the Input/Output operations for the player.
	 * @return The {@link PlayerIO} instance.
	 */
	PlayerIO getIO();
	
	/**
	 * Returns the current rank of the player.
	 * @return The rank of the player.
	 */
	Rank getRank();
	
	/**
	 * Sets a new rank value.
	 * @param newRank The new rank.
	 */
	void setRank(Rank newRank);
	
	/**
	 * Returns the friend chat privacy settings.
	 * @return The state of friend chat.
	 */
	Privacy getFriendChatPrivacy();
	
	void setFriendChatPrivacy(Privacy friendChatPrivacy);
	
	/**
	 * Returns the public chat privacy settings.
	 * @return The state of public chat.
	 */
	Privacy getPublicChatPrivacy();
	
	void setPublicChatPrivacy(Privacy publicChatPrivacy);
	
	/**
	 * Returns the request chat privacy settings.
	 * @return The state of request chat.
	 */
	Privacy getRequestPrivacy();
	
	void setRequestPrivacy(Privacy requestPrivacy);
	
	boolean needsPlacement();
	
	void setNeedsPlacement(boolean placement);
	
	void setResetMovementQueue(boolean resetMovementQueue);
	
	boolean isResetMovementQueue();
	
	/**
	 * Sends a message to the player.
	 * @param message The message being sent.
	 * 
	 * THIS IS TEMPORARY.
	 */
	@Deprecated
	void sendMessage(String message);
	
	byte[] getChatText();
	
	void setChatText(byte[] chatText);
	
	int getChatEffects();

	void setChatEffects(int chatEffects);
	
	int getChatColor();
	
	void setChatColor(int chatColor);
	
	public Item[] getInventory();
	
	public Item[] getEquipment();
	
	public int[] getSkills();

	public int[] getExperience();

	public int[] getAppearance();

	public int[] getColors();
	
	public void setGender(int gender);

	public int getGender();
	
}
