package org.scimitarpowered.api.world.entity.character.dialogue;

public enum DialogueEmotion {

	HAPPY(588);
	
	final int id;
	
	private DialogueEmotion(final int id) {
		this.id = id;
	}
	
	public int getId() { 
		return id;
	}
	
}
