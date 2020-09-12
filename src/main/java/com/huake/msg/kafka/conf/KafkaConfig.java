package com.huake.msg.kafka.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "spring.boot.kafka", name = "enabled", matchIfMissing = false, havingValue = "true")
public class KafkaConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.boot.kafka.cfg", ignoreUnknownFields = true)
	public ChannelDefinitionConfig setChannelDefinitionConfig() {
		return new ChannelDefinitionConfig();
	}
}