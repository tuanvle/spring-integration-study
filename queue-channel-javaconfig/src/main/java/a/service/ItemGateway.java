package a.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import a.domain.Item;

@MessagingGateway(name = "itemGateway", defaultRequestChannel = "itemChannel")
public interface ItemGateway {

	@Gateway(requestChannel = "itemChannel", replyChannel="processedItemChannel")
	public void placeItem(Item item);

}
