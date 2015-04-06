package org.scimitarpowered.api.world.entity.character.module;

import org.scimitarpowered.api.world.entity.character.CharacterEntity;
import org.scimitarpowered.api.world.entity.character.Hit;

public interface Combatable {
	
	void onInstigate(CharacterEntity entity, Hit hit);

	void onAttack(CharacterEntity entity, Hit hit);
	
	void onBlock(CharacterEntity entity, Hit hit);
	
	void onDeath(CharacterEntity entity, Hit hit);
	
}
