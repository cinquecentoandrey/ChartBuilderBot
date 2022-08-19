package com.cinquecentoandrey.controller;

import com.cinquecentoandrey.ChartBuilderBot.ChartBuilderBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebHookController {
    private final ChartBuilderBot chartBuilderBot;

    @Autowired
    public WebHookController(ChartBuilderBot chartBuilderBot) {
        this.chartBuilderBot = chartBuilderBot;
    }

    @PostMapping("/")
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return chartBuilderBot.onWebhookUpdateReceived(update);
    }

}
