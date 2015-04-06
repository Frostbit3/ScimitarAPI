package org.scimitarpowered.api.net.packet.outgoing;

import org.scimitarpowered.api.Engine;
import org.scimitarpowered.api.net.StreamBuffer;
import org.scimitarpowered.api.world.entity.character.player.Player;

public interface OutgoingPacketHandler {

	public StreamBuffer.OutBuffer handle(Player player, Engine engine);
	
	public int getOpcode();
	
}
