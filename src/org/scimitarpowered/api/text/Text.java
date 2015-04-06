package org.scimitarpowered.api.text;

public class Text {
	
	protected final TextColor color;
	protected final String type;
	
	protected Text(TextBuilder builder) {
		this.color = builder.color;
		this.type = builder.type;
	}

}
