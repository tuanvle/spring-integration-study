package a.channel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.support.PeriodicTrigger;

@Configuration
public class ChannelConfig {
	@Bean
	MessageChannel defectsChannel() {
		return new QueueChannel(10);
	}

	@Bean
	MessageChannel processedItemChannel() {
		return new QueueChannel(10);
	}
	
	@Bean(name = PollerMetadata.DEFAULT_POLLER)
	public PollerMetadata defaultPoller(){
		PollerMetadata meta = new PollerMetadata();
		meta.setTrigger(new PeriodicTrigger(1000));
		
		return meta;
	}

}
