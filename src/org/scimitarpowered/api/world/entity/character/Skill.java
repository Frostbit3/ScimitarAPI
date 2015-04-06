package org.scimitarpowered.api.world.entity.character;

/**
 * Represents a single skill.
 * @author Austin
 *
 */
public interface Skill {
	
	/**
	 * The total experience for the skill.
	 * @return The experience value.
	 */
	public int getExperience();
	
	/**
	 * The current level for the skill.
	 * @return The level value.
	 */
	public int getLevel();

}
