package org.seonghun.quicklink.config;

import org.seonghun.quicklink.utils.SnowFlakeIdGenerator;
import org.seonghun.quicklink.utils.SnowFlakeIdGeneratorFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnowFlakeIdGeneratorConfig {
    @Value("${server.nodeId}")
    private long nodeId;

    @Bean
    public SnowFlakeIdGenerator snowFlakeIdGenerator() {
        return SnowFlakeIdGeneratorFactory.createSnowFlakeIdGenerator(nodeId);
    }
}
