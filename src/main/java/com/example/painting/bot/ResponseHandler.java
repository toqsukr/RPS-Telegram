package com.example.painting.bot;

import java.util.ArrayList;
import java.util.List;

import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.webapp.WebAppInfo;

import com.example.painting.utils.Constants;

public class ResponseHandler {
    private final SilentSender sender;

    public ResponseHandler(SilentSender sender, DBContext db) {
        this.sender = sender;
    }

    public void replyToStart(long chatID) {
        SendMessage message = new SendMessage();
        message.setChatId(chatID);
        message.setText(Constants.START_MESSAGE);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();

        InlineKeyboardButton keyboardButton = new InlineKeyboardButton();

        keyboardButton.setText("Let try web app!");
        keyboardButton.setWebApp(new WebAppInfo(Constants.TWA_URL));

        rowInline.add(keyboardButton);
        rowsInline.add(rowInline);

        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);
        sender.execute(message);
    }
}
