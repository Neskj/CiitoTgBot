package neskj.CiitoTgBot.Responseinterface.Answers;

import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerStart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnswerStartTest {

    @Test
    public void returnMessageCaseStartSuccess() {

        AnswerStart executeAnswer = new AnswerStart();

        assertNotNull(executeAnswer);
        assertEquals("Привет! Я новый бот Цеха испытаний и техобслуживания! Чем могу помочь ?",
                executeAnswer.returnMessage());
    }
}
