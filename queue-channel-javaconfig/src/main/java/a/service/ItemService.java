package a.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import a.domain.Item;

@MessageEndpoint
public class ItemService {
	private static final Logger logger = LoggerFactory
			.getLogger(ItemService.class);

	@ServiceActivator(inputChannel = "itemChannel", outputChannel = "processedItemChannel")
	public Item processDefect(Item item) {
		logger.info("processing defect...");

		logger.info("before - item id {}", item.getId());
		logger.info("before - item link {}", item.getLink());

		item.setLink("new link");

		return item;
	}

}
