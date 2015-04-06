package org.scimitarpowered.api.world.entity.character.player;

import org.scimitarpowered.api.net.ISAACCipher;
import org.scimitarpowered.api.net.packet.outgoing.OutgoingPacketHandler;

public interface PlayerIO {

	void login() throws Exception;
	
	void logout() throws Exception;
	
	void disconnect();
	
	Player getPlayer();
	
	void sendMessage(String message);
	
	void sendPacket(OutgoingPacketHandler packet);
	
	/**
	 * Sets the encryptor.
	 * 
	 * @param encryptor
	 *            the encryptor
	 */
	public void setEncryptor(ISAACCipher encryptor);

	/**
	 * Gets the encryptor.
	 * 
	 * @return the encryptor
	 */
	public ISAACCipher getEncryptor();
	
}
