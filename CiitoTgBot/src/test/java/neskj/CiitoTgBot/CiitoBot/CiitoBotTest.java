package neskj.CiitoTgBot.CiitoBot;

import neskj.CiitoTgBot.ResponseInterface.ResponseInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
