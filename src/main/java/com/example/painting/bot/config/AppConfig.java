package com.example.painting.bot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class AppConfig {
    @Bean
    ObjectMapper customObjectMapper() {
        return new ObjectMapper();
    }
}
