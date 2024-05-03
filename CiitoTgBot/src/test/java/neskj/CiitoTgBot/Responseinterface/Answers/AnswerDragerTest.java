package neskj.CiitoTgBot.Responseinterface.Answers;

import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerDrager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnswerDragerTest {

    @Test
    public void returnMessageCaseDragerSuccess() {

        AnswerDrager executeAnswer = new AnswerDrager();

        assertNotNull(executeAnswer);
        assertEquals("Вот ссылка на веб-приложение по дрегерам: http://185.198.152.105:9096/drager",
                executeAnswer.returnMessage());
    }
}
