/**
 * 
 */
package org.scimitarpowered.api.event.character.player;

import org.scimitarpowered.api.world.entity.character.player.Player;

/**
 * @author Austin
 *
 */
public class PlayerSkillUpdateEvent extends PlayerEvent {
	
	private final int skillId;
	
	private final int level;
	
	private final int exp;

	public PlayerSkillUpdateEvent(Player player, int skillId, int level,
			int exp) {
		super(player);
		this.skillId = skillId;
		this.level = level;
		this.exp = exp;
	}

	public int getSkillId() {
		return skillId;
	}

	public int getLevel() {
		return level;
	}

	public int getExp() {
		return exp;
	}
	
}
