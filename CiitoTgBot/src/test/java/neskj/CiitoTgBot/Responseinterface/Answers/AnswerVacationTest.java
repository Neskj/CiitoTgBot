package neskj.CiitoTgBot.Responseinterface.Answers;

import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerVacation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnswerVacationTest {

    @Test
    public void returnMessageCaseVacationSuccess() {

        String expectData = "Вот график отпусков на 2024 год: " + "\n" +
                "\n Волков Д.В. :\n 22.07.2024 - 04.08.2024 \n 05.11.2024 - 18.11.2024 " + "\n" +
                "\n Маркелов А.С. :\n 08.04.2024 - 14.04.2024 \n 03.06.2024 - 09.06.2024 \n 29.07.2024 - 11.08.2024" + "\n" +
                "\n Пронин П.П. :\n 25.03.2024 - 31.03.2024 \n 15.07.2024 - 21.07.2024 \n 09.09.2024 - 22.09.2024" + "\n" +
                "\n Рыжов А.Д. :\n 04.03.2024 - 06.03.2024 \n 22.04.2024 - 28.04.2024 \n 05.08.2024 - 25.08.2024" + "\n" +
                "\n Сапожников И.В. :\n 11.03.2024 - 24.03.2024 \n 26.08.2024 - 08.09.2024" + "\n" +
                "\n Терешин С.В. :\n 11.03.2024 - 24.03.2024 \n 01.07.2024 - 14.07.2024" + "\n" +
                "\n Головко С.В. :\n 22.01.2024 - 04.02.2024 \n 17.05.2024 - 23.05.2024 \n 22.06.2024 - 28.06.2024" + "\n" +
                "\n Измайлов И.Р. :\n 08.07.2024 - 21.07.2024 \n 07.10.2024 - 20.10.2024" + "\n";

        AnswerVacation executeAnswer = new AnswerVacation();

        assertNotNull(executeAnswer);
        assertEquals(expectData, executeAnswer.returnMessage());
    }
}
