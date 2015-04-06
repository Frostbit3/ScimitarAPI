package org.scimitarpowered.api.world.entity.item;

import org.scimitarpowered.api.cache.definition.ItemDefinition;
import org.scimitarpowered.api.world.entity.Entity;

public interface Item extends Entity {

	void incrementAmount();
	
	void decrementAmount();
	
	void incrementAmountBy(int amount);
	
	void decrementAmountBy(int amount);
	
	ItemDefinition getDefinition();
	
	int getAmount();
	
	void setAmount(int amount);
	
}
