package neskj.CiitoTgBot.CiitoBot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class Initializer {

    private final CiitoBot ciitoBot;

    @Autowired
    public Initializer(CiitoBot ciitoBot) {
        this.ciitoBot = ciitoBot;
    }

    @EventListener({ContextRefreshedEvent.class})
    public void init() {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(ciitoBot);
        } catch (TelegramApiException e) {
            System.out.println("API exception");
        }
    }
}
