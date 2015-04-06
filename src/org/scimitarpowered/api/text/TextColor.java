package org.scimitarpowered.api.text;

public enum TextColor {

	BLACK("@bla@"),
	RED("@red@"),
	GREEN("@gre@"),
	CYAN("@cya@");
	
	private final String symbol;
	
	private TextColor(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
}
