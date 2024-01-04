package com.example.springboot.bot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.bot.dto.User;
import com.example.springboot.bot.repository.IUserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Producer {

    private static final String TOPIC = "users";
    protected final IUserRepository repo;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public Producer(IUserRepository repo) {
        this.repo = repo;
    }

    public void sendMessage(User user) {
        if (user.getName() == null || user.getDescription().isEmpty())
            log.info("#### Empty name/description message");
        log.info("#### Producing message [user={}]", user);
        kafkaTemplate.send(TOPIC, "Writing in log -> " + user);
    }
}