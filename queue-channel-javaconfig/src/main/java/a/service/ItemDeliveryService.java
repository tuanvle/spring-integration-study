package a.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import a.domain.Item;

@MessageEndpoint
public class ItemDeliveryService {
	private static final Logger logger = LoggerFactory
			.getLogger(ItemDeliveryService.class);

	@ServiceActivator
	public void deliverItem(Item item) {

		logger.info("after - item id {}", item.getId());
		logger.info("after - item link {}", item.getLink());
	}

}
