package com.thoughtworks.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class DatabaseConfig {
    @Bean
    @Primary
    @Profile("prod")
    @ConfigurationProperties( prefix = "spring.datasource" )
    public javax.sql.DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}