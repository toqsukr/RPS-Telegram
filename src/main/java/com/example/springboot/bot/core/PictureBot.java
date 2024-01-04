package com.example.springboot.bot.core;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Deprecated
public class PictureBot extends TelegramWebhookBot {

    @Override
    public String getBotPath() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBotPath'");
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onWebhookUpdateReceived'");
    }

    @Override
    public String getBotUsername() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBotUsername'");
    }

}