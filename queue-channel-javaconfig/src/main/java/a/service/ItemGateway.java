package a.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import a.domain.Item;

@MessagingGateway(name = "itemGateway")
public interface ItemGateway {

	@Gateway(requestChannel = "itemChannel")
	public void placeItem(Item item);

}
