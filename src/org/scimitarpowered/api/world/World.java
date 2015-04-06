package org.scimitarpowered.api.world;

import org.scimitarpowered.api.world.entity.character.npc.NPC;
import org.scimitarpowered.api.world.entity.character.player.Player;

/**
 * An abstract representation of the game world.
 * @author Austin
 *
 */
public interface World {
	
	void process() throws Exception;

	void register(final Player player);
	
	void unregister(final Player player);
	
	void register(final NPC npc);
	
	/**
	 * Deregisters an NPC from the game world.
	 * @param npc The NPC being unregistered.
	 */
	void unregister(final NPC npc);
	
	int getPlayerCount();
	
	int getNPCCount();
	
	int getItemCount();
	
	int getEntityCount();
	
	int getCharacterEntityCount();
	
	Player[] getPlayers();
	
	NPC[] getNPCs();
	
	Player getPlayerByName(String name);
	
}
