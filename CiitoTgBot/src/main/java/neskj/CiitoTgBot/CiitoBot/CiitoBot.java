package neskj.CiitoTgBot.CiitoBot;

import neskj.CiitoTgBot.ResponseInterface.ResponseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class CiitoBot extends TelegramLongPollingBot {

    @Value("${bot.name}")
    private String botUsername;
    @Value("${bot.token}")
    private String botToken;

    private final ResponseInterface response;

    @Autowired
    CiitoBot(ResponseInterface response) {
        this.response = response;
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()&&update.getMessage().hasText()){
            String message=update.getMessage().getText();
            long chatId=update.getMessage().getChatId();
            sendMessage(chatId, response.getResponse(message));

/*
            if(message.equals("/start")){
                sendMessage(chatId,"Привет! Я новый бот Цеха испытаний и техобслуживания! Чем могу помочь ?");
            } else {
                sendMessage(chatId,"Я не понял запроса...");
            }

 */
        }
    }

    private void sendMessage(long chatId,String text){

        SendMessage message=new SendMessage();
        message.setChatId(chatId);
        message.setText(text);

        try{
            execute(message);
        }catch (TelegramApiException e){
            System.out.println("Exeption on try to send message");
        } finally {
            System.out.println("I send a message: " + message.getText());
        }
    }
}

