package org.scimitarpowered.api.event;

import com.google.common.eventbus.EventBus;


/**
 * A wrapper for {@link EventBus} which dispatches {@link Event}s and provides a
 * way for {@link EventSubscriber}s to be registered and unregistered.
 * 
 * @author Ryley Kimmel <ryley.kimmel@live.com>
 */
public interface EventDispatcher {

	<E extends Event> void register(EventSubscriber<E> subscriber);
	
	<E extends Event> void deregister(EventSubscriber<E> subscriber);
	
	void dispatch(Event event);
	
}
