package org.scimitarpowered.api.world.entity.character;

import java.util.List;
import java.util.Map;

import org.scimitarpowered.api.world.entity.Entity;
import org.scimitarpowered.api.world.entity.character.dialogue.Moveable;
import org.scimitarpowered.api.world.entity.character.module.Combatable;
import org.scimitarpowered.api.world.entity.character.npc.NPC;
import org.scimitarpowered.api.world.entity.character.player.Player;
import org.scimitarpowered.api.world.entity.module.Positionable;

public interface CharacterEntity extends Entity, Combatable, Moveable, Positionable {
	
	Skill[] getSkill();
	
	UpdateFlags getUpdateFlags();
	
	Map<Integer, Player> getPlayers();
	
	List<NPC> getNpcs();
	
}
