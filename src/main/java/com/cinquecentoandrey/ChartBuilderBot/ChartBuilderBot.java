package com.cinquecentoandrey.ChartBuilderBot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.validation.Valid;

@PropertySource("classpath:application.properties")
public class ChartBuilderBot extends TelegramWebhookBot {

    @Value("${telegrambot.botToken}")
    private String TOKEN;
    @Value("${telegrambot.username}")
    private String USERNAME;

    @Value("${telegrambot.webHookPath}")
    private String PATH;

    public ChartBuilderBot(DefaultBotOptions defaultBotOptions) {super(defaultBotOptions);}

    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override
    public String getBotPath() {
        return PATH;
    }
}
