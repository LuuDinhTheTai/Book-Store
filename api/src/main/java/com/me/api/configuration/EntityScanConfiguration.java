package com.me.api.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = {"com.me.domain.entity"})
public class EntityScanConfiguration {
}
