package a.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class ErrorHandler {
	private static final Logger logger = LoggerFactory
			.getLogger(ErrorHandler.class);

	@ServiceActivator(inputChannel = "errorChannel")
	public void handlerException(Exception e) {
		logger.error("Error", e);

	}

}
