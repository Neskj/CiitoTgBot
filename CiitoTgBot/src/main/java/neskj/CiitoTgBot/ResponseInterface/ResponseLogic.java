package neskj.CiitoTgBot.ResponseInterface;

import neskj.CiitoTgBot.ResponseInterface.Answers.*;
import org.springframework.stereotype.Service;

@Service
public class ResponseLogic implements ResponseInterface {

    public String getResponse(String message) {

        switch (message) {
            case "/start":
                return new AnswerStart().returnMessage();
            case "/drager":
                return new AnswerDrager().returnMessage();
            case "/weather":
                return new AnswerWeather().returnMessage();
            case "/vacation":
                return new AnswerVacation().returnMessage();
            default:
                return "Я не понял запроса...";
        }
    }
}
