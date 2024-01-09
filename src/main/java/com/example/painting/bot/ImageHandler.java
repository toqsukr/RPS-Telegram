package com.example.painting.bot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.example.painting.dao.ImageResponse;

@Component
public class ImageHandler {
    private final TelegramBot telegramBot;

    @Autowired
    public ImageHandler(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    public void replyImage(long chatId, ImageResponse image) {
        SendPhoto sendPhoto = new SendPhoto();
        String description = image.getDescription() != null ? image.getDescription() : "Нет информации D:";
        String imageText = image.getTitle() + '\n' + image.getAuthor().getFullName() + "\n\n"
                + description;
        sendPhoto.setChatId(String.valueOf(chatId));
        sendPhoto.setCaption(imageText);
        sendPhoto.setPhoto(new InputFile(image.getSrc()));
        try {
            telegramBot.execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
