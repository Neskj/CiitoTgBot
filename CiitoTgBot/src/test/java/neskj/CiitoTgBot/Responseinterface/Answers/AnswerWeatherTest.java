package neskj.CiitoTgBot.Responseinterface.Answers;

import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerWeather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnswerWeatherTest {

    @Test
    public void returnMessageCaseWeatherSuccess() {

        AnswerWeather executeAnswer = new AnswerWeather();

        assertNotNull(executeAnswer);
        assertEquals("Погоду можно посмотреть тут: http://185.198.152.105:8086/weather", executeAnswer.returnMessage());
    }
}
