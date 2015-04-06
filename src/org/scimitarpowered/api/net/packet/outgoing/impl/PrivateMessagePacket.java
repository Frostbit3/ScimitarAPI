package org.scimitarpowered.api.net.packet.outgoing.impl;

import java.util.Random;

import org.scimitarpowered.api.Engine;
import org.scimitarpowered.api.event.character.player.SendPrivateMessageEvent;
import org.scimitarpowered.api.net.StreamBuffer;
import org.scimitarpowered.api.net.StreamBuffer.OutBuffer;
import org.scimitarpowered.api.net.packet.outgoing.OutgoingPacketHandler;
import org.scimitarpowered.api.utility.ScimitarUtility;
import org.scimitarpowered.api.world.entity.character.player.Player;
import org.scimitarpowered.api.world.entity.character.player.Rank;

public class PrivateMessagePacket implements OutgoingPacketHandler {
	
	private final String sender;
	private final Rank rank;
	private final String message;

	/**
	 * Creates a new private message.
	 * @param sender
	 * @param rank
	 * @param message
	 */
	public PrivateMessagePacket(String sender, Rank rank, String message) {
		this.sender = sender;
		this.rank = rank;
		this.message = message;
	}

	@Override
	public OutBuffer handle(Player player, Engine engine) {
		engine.dispatchEvent(new SendPrivateMessageEvent(player, sender, message, rank));
		
		StreamBuffer.OutBuffer out = StreamBuffer.newOutBuffer(15 + message.getBytes().length);
		out.writeVariablePacketHeader(player.getIO().getEncryptor(), getOpcode());
		out.writeLong(ScimitarUtility.nameToLong(sender));
		out.writeInt(new Random().nextInt());
		out.writeByte(rank.asByte());
		for(int i = 0; i < message.getBytes().length; i++) {
			out.writeByte(message.getBytes()[i]);
		}
		out.finishVariablePacketHeader();
		return out;
	}

	@Override
	public int getOpcode() {
		return 196;
	}

}
