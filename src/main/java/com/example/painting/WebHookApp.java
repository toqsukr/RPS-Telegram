package com.example.painting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import lombok.extern.slf4j.Slf4j;

import com.example.painting.bot.AppContextProvider;
import com.example.painting.bot.TelegramBot;

@SpringBootApplication
@EnableMongoRepositories
public class WebHookApp {
    public static void main(String[] args) {
        SpringApplication.run(WebHookApp.class, args);
    }
}

@Slf4j
@Component
class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        try {
            TelegramBotsApi telegramBotsApi = createLongPollingTelegramBotsApi();
            try {
                telegramBotsApi.registerBot(
                        AppContextProvider.getApplicationContext().getBean("paintingBot",
                                TelegramBot.class));
            } catch (TelegramApiException e) {
                log.error(e.getMessage());
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    private static TelegramBotsApi createLongPollingTelegramBotsApi() throws TelegramApiException {
        return new TelegramBotsApi(DefaultBotSession.class);
    }
}