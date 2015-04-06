package org.scimitarpowered.api.event.character;

import org.scimitarpowered.api.event.Event;
import org.scimitarpowered.api.world.entity.character.CharacterEntity;

public abstract class CharacterEntityEvent implements Event {

	private CharacterEntity entity;
	
	public CharacterEntityEvent(CharacterEntity entity) { 
		this.entity = entity;
	}
	
	public CharacterEntity getCharacter() {
		return entity;
	}
	
}
