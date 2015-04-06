package org.scimitarpowered.api.world.entity.character;

public interface SkillSet {
	
	int getExpForLevel(int level);
	
	int getLevelForExp(int exp);
	
	void addExp(int id, int exp);
	
	void calculateCombatLevel();
	
	void refresh();
	
	int getExp(int id);
	
	int getMaxLevel(int id);
	
	Skill getSkill(int id);
	
	int getTotalLevel();
	
	void normalize();

}
