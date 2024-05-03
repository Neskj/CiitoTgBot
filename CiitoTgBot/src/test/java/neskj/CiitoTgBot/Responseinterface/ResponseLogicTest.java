package neskj.CiitoTgBot.Responseinterface;

import neskj.CiitoTgBot.ResponseInterface.ResponseLogic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ResponseLogicTest {

    @InjectMocks
    ResponseLogic responseLogic;

    @Test
    public void getResponseTestStartSuccess() {

        String messageStart = "/start";
        String responseStart = "Привет! Я новый бот Цеха испытаний и техобслуживания! Чем могу помочь ?";

        assertEquals(responseStart, responseLogic.getResponse(messageStart));
    }

    @Test
    public void getResponseTestDragerSuccess() {

        String messageDrager = "/drager";
        String responseDrager = "Вот ссылка на веб-приложение по дрегерам: http://185.198.152.105:9096/drager";

        assertEquals(responseDrager, responseLogic.getResponse(messageDrager));
    }

    @Test
    public void getResponseTestVacationSuccess() {

        String messageVacation = "/vacation";
        String responseVacation = "Вот график отпусков на 2024 год: " + "\n" +
                "\n Волков Д.В. :\n 22.07.2024 - 04.08.2024 \n 05.11.2024 - 18.11.2024 " + "\n" +
                "\n Маркелов А.С. :\n 08.04.2024 - 14.04.2024 \n 03.06.2024 - 09.06.2024 \n 29.07.2024 - 11.08.2024" + "\n" +
                "\n Пронин П.П. :\n 25.03.2024 - 31.03.2024 \n 15.07.2024 - 21.07.2024 \n 09.09.2024 - 22.09.2024" + "\n" +
                "\n Рыжов А.Д. :\n 04.03.2024 - 06.03.2024 \n 22.04.2024 - 28.04.2024 \n 05.08.2024 - 25.08.2024" + "\n" +
                "\n Сапожников И.В. :\n 11.03.2024 - 24.03.2024 \n 26.08.2024 - 08.09.2024" + "\n" +
                "\n Терешин С.В. :\n 11.03.2024 - 24.03.2024 \n 01.07.2024 - 14.07.2024" + "\n" +
                "\n Головко С.В. :\n 22.01.2024 - 04.02.2024 \n 17.05.2024 - 23.05.2024 \n 22.06.2024 - 28.06.2024" + "\n" +
                "\n Измайлов И.Р. :\n 08.07.2024 - 21.07.2024 \n 07.10.2024 - 20.10.2024" + "\n";

        assertEquals(responseVacation, responseLogic.getResponse(messageVacation));
    }

    @Test
    public void getResponseTestWrongMessage() {

        String wrongMessage = "/whoisyourdaddy";
        String responseWrongMessage = "Я не понял запроса...";

        assertEquals(responseWrongMessage, responseLogic.getResponse(wrongMessage));
    }

/*  Не знаю как заглушить Feign Client, тест валится с ошибкой
    @Test
    public void getResponseTestWeatherSuccess(){

    }
 */

}
