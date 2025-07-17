package com.jeongmin.api;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.jeongmin.db")
@EnableJpaRepositories(basePackages = "com.jeongmin.db")
public class JpaConfig {
}
