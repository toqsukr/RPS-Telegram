package com.example.painting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WebHookApp {
    public static void main(String[] args) {
        SpringApplication.run(WebHookApp.class, args);
    }
}
