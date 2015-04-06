package org.scimitarpowered.api.event.character;

import org.scimitarpowered.api.world.entity.character.CharacterEntity;
import org.scimitarpowered.api.world.entity.character.Hit;

public class CharacterEntityCombatEvent extends CharacterEntityEvent {

	private final CharacterEntity otherEntity;

	private final Hit hit;

	public CharacterEntityCombatEvent(CharacterEntity entity, CharacterEntity otherEntity, Hit hit) {
		super(entity);
		this.otherEntity = otherEntity;
		this.hit = hit;
	}

	public CharacterEntity getOtherEntity() {
		return otherEntity;
	}

	public Hit getHit() {
		return hit;
	}
}
