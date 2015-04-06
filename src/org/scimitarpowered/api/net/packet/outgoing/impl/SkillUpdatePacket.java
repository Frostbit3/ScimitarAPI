package org.scimitarpowered.api.net.packet.outgoing.impl;

import org.scimitarpowered.api.Engine;
import org.scimitarpowered.api.event.character.player.PlayerSkillUpdateEvent;
import org.scimitarpowered.api.net.StreamBuffer;
import org.scimitarpowered.api.net.StreamBuffer.OutBuffer;
import org.scimitarpowered.api.net.packet.outgoing.OutgoingPacketHandler;
import org.scimitarpowered.api.world.entity.character.player.Player;

public class SkillUpdatePacket implements OutgoingPacketHandler {
	
	private final int skill;
	private final int experience;
	private final int level;

	/**
	 * Creates a new skill update packet instance.
	 * @param skill
	 * @param experience
	 * @param level
	 */
	public SkillUpdatePacket(int skill, int experience, int level) {
		this.skill = skill;
		this.experience = experience;
		this.level = level;
	}

	@Override
	public OutBuffer handle(Player player, Engine engine) {
		// dispatch before we send the data, otherwise client disconnects.
		engine.dispatchEvent(new PlayerSkillUpdateEvent(player, skill, level, experience));
		
		StreamBuffer.OutBuffer out = StreamBuffer.newOutBuffer(8);
		out.writeHeader(player.getIO().getEncryptor(), getOpcode());
		out.writeByte(skill);
		out.writeInt(experience, StreamBuffer.ByteOrder.MIDDLE);
		out.writeByte(level);
		return out;
	}

	@Override
	public int getOpcode() {
		return 134;
	}

}
