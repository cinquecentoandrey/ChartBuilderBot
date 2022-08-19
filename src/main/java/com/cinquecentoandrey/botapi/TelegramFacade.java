package com.cinquecentoandrey.botapi;

import com.cinquecentoandrey.botapi.botstate.BotState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
@Component
public class TelegramFacade {

    public TelegramFacade() {}

    public SendMessage handleUpdate(Update update) {
        SendMessage replyMessage;
        return null;
    }

    private SendMessage handleInputMessage(Message message) {
        String inputMessage = message.getText();
        long userId = message.getFrom().getId();
        BotState botState;
        SendMessage sendMessage;

        switch (inputMessage) {
            case "/start":
                botState = BotState.ASK_TYPE;
                break;
            case "Помощь":
                botState = BotState.SHOW_HELP_MENU;
            default:
                break;
        }

        return null;
    }
}
