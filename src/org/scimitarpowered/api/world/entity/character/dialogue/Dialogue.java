package org.scimitarpowered.api.world.entity.character.dialogue;

/**
 * An abstract representation of a dialogue.
 * @author Austin
 *
 */
public class Dialogue {

	private final String[] text;
	private final int interfaceId;
	private final int textOffset;
	private final DialogueEmotion emotion;
	
	public static class DialogueBuilder {
		private String[] text;
		private int interfaceId;
		private int textOffset;
		private DialogueEmotion emotion;
		
		public DialogueBuilder text(String... text) {
			this.text = text;
			return this;
		}
		
		public DialogueBuilder interfaceId(int interfaceId) {
			this.interfaceId = interfaceId;
			return this;
		}
		
		public Dialogue build() {
			return new Dialogue(this);
		}
	}
	
	/**
	 * Creates a new dialogue.
	 * @param emotion
	 * @param text
	 * @param interfaceId
	 */
	private Dialogue(final DialogueBuilder builder) {
		this.emotion = builder.emotion;
		this.text = builder.text;
		this.interfaceId = builder.interfaceId;
		this.textOffset = builder.interfaceId + 2;
	}

	/**
	 * @return the text
	 */
	public String[] getText() {
		return text;
	}

	/**
	 * @return the interfaceId
	 */
	public int getInterfaceId() {
		return interfaceId;
	}

	/**
	 * @return the textOffset
	 */
	public int getTextOffset() {
		return textOffset;
	}

	public DialogueEmotion getEmotion() {
		return emotion;
	}
	
}
