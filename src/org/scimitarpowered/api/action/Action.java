package org.scimitarpowered.api.action;

/**
 * Represents an action, executed by a character.
 * @author Austin
 *
 */
public abstract class Action<T> {
	
	private boolean running;
	private T attachment;
	private int delay;
	
	/**
	 * Creates a new Action.
	 * @param attachment
	 * @param delay
	 */
	public Action(T attachment, int delay) {
		this.attachment = attachment;
		this.delay = delay;
	}
	
	public abstract void execute();
	
	public abstract void onDestroy();
	
	public boolean tick() {
		if (!isRunning()) {
			execute();
			setRunning(true);
		}
		
		return running;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public T getAttachment() {
		return attachment;
	}

	public void setAttachment(T attachment) {
		this.attachment = attachment;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
	
}
