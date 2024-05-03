package neskj.CiitoTgBot.CiitoBot;

import neskj.CiitoTgBot.ResponseInterface.ResponseInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CiitoBotTest {

    @Mock
    ResponseInterface response;

    @InjectMocks
    CiitoBot bot;

    @Test
    public void getBotUsernameHappyFlow(){

        assertEquals("testBotName",bot.getBotUsername());
    }

    @Test
    public void getBotTokenHappyFlow(){

        assertEquals("7463523662:FSBJFgTgRbR5GSRGDh42fges63g0w5CtDEj",bot.getBotToken());
    }

    @Test
    public void onUpdateReceivedTestHappyFlow(){

        Long testChatId=123456789L;
        String text="/start";

        Chat testChat=new Chat();
        testChat.setId(testChatId);

        Message testMessage = new Message();
        testMessage.setChat(testChat);
        testMessage.setText(text);

        Update testUpdate = new Update();
        testUpdate.setMessage(testMessage);

        when(response.getResponse(text)).thenReturn("Привет! Я новый бот Цеха испытаний и техобслуживания! Чем могу помочь ?");

        bot.onUpdateReceived(testUpdate);
        verify(response).getResponse(text);

        //как проверить, что bot корректно вызвал свой приватный метод sendMessage и отправил сообщение??
    }
}
