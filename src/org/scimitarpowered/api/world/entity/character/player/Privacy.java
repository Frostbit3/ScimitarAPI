package org.scimitarpowered.api.world.entity.character.player;
public enum Privacy {
	
	ON(0),
	FRIENDS(1),
	HIDDEN(2),
	OFF(3);
	
	private final int value;
	
	private Privacy(final int value) {
		this.value = value;
	}
	
	public int getValueAsInt() {
		return value;
	}
	
	public byte asByte() {
		return (byte) value;
	}
	
}