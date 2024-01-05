package com.example.painting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import com.example.painting.bot.AppContextProvider;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableMongoRepositories
public class WebHookApp {

    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = createLongPollingTelegramBotsApi();
            try {
                telegramBotsApi.registerBot(
                        AppContextProvider.getApplicationContext().getBean("paintingBot",
                                TelegramLongPollingBot.class));
            } catch (TelegramApiException e) {
                log.error(e.getMessage());
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        SpringApplication.run(WebHookApp.class, args);

    }

    private static TelegramBotsApi createLongPollingTelegramBotsApi() throws TelegramApiException {
        return new TelegramBotsApi(DefaultBotSession.class);
    }
}
