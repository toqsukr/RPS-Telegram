package com.example.painting.bot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class EnvConfig {
    @Bean
    public Dotenv getEnv() {
        return Dotenv.configure().load();
    }
}
