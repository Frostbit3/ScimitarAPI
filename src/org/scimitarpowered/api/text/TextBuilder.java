package org.scimitarpowered.api.text;

public class TextBuilder {
	
	protected TextColor color;
	protected String type;

	public TextBuilder(Text text) {
		this.color = text.color;
		this.type = text.type;
	}

	public TextBuilder color(TextColor color) {
		this.color = color;
		return this;
	}
	
	public TextBuilder append(String... newType) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < newType.length; i++) {
			sb.append(newType[i]);
		}
		return this;
	}
	
	public TextBuilder insert(int position, String... newType) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < newType.length; i++) {
			sb.insert(position, newType[i]);
		}
		return this;
	}
	
	public TextBuilder prepend(String... newType) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < newType.length; i++) {
			sb.insert(0, newType[i]);
		}
		return this;
	}
	
	public Text build() {
		return new Text(this);
	}
	
}
