package a.channel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.scheduling.support.PeriodicTrigger;

@Configuration
public class ChannelConfig {
	@Bean
	public QueueChannel itemChannel() {
		return new QueueChannel(10);
	}

	@Bean
	public QueueChannel processedItemChannel() {
		return new QueueChannel(10);
	}

	@Bean(name = PollerMetadata.DEFAULT_POLLER)
	public PollerMetadata defaultPoller() {
		PollerMetadata meta = new PollerMetadata();
		meta.setTrigger(new PeriodicTrigger(1000));

		return meta;
	}

}
