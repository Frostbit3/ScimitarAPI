package org.scimitarpowered.api.event.character;

import org.scimitarpowered.api.world.entity.character.CharacterEntity;

public class CharacterEntityRespawnEvent extends CharacterEntityEvent {

	public CharacterEntityRespawnEvent(CharacterEntity entity) {
		super(entity);
		entity.setInteractingEntity(null);
	}

}
