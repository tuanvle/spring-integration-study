package a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

import a.domain.Item;
import a.service.ItemGateway;

@SpringBootApplication
@EnableIntegration
@IntegrationComponentScan
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(
				App.class, args);

		ItemGateway gateway = (ItemGateway) context.getBean("itemGateway");

		Item item = new Item();
		item.setId("ID1");
		
		gateway.placeItem(item);
	}

}
