package org.scimitarpowered.api.event.character;

import org.scimitarpowered.api.world.entity.character.CharacterEntity;
import org.scimitarpowered.api.world.entity.character.Hit;

public class CharacterEntityDeathEvent extends CharacterEntityEvent {
	
	private final CharacterEntity killedBy;

	private final Hit hit;

	public CharacterEntityDeathEvent(CharacterEntity entity, CharacterEntity killedBy, Hit hit) {
		super(entity);
		this.killedBy = killedBy;
		this.hit = hit;
	}

	public CharacterEntity getKilledBy() {
		return killedBy;
	}

	public Hit getHit() {
		return hit;
	}

}
