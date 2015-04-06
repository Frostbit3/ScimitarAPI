package org.scimitarpowered.api.world.entity.character.npc;

import org.scimitarpowered.api.world.entity.Entity;
import org.scimitarpowered.api.world.entity.character.CharacterEntity;

public interface NPC extends CharacterEntity, Entity {
	
	/**
	 * Sets the NPC ID.
	 * 
	 * @param npcId
	 *            the npcId
	 */
	public void setNpcId(int npcId);

	/**
	 * Gets the NPC ID.
	 * 
	 * @return the npcId
	 */
	public int getNpcId();
	
	public void setVisible(boolean isVisible);

	public boolean isVisible();

}
