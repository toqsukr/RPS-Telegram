package com.example.painting.bot;

import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import com.example.painting.utils.Constants;

public class ResponseHandler {
    private final SilentSender sender;

    public ResponseHandler(SilentSender sender, DBContext db) {
        this.sender = sender;
    }

    public void replyToStart(long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(Constants.START_MESSAGE);
        sender.execute(message);
    }
}
