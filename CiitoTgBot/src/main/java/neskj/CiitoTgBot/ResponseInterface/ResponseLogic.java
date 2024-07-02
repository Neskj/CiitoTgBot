package neskj.CiitoTgBot.ResponseInterface;


import neskj.CiitoTgBot.Model.ApiResponse;
import neskj.CiitoTgBot.Model.City;
import neskj.CiitoTgBot.Proxy.Proxy;
import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerDrager;
import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerJournal;
import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerStart;
import neskj.CiitoTgBot.ResponseInterface.Answers.AnswerVacation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseLogic implements ResponseInterface {

    private final Proxy proxy;

    @Autowired
    ResponseLogic(Proxy proxy){
        this.proxy=proxy;
    }

    public String getResponse(String message) {

        switch (message) {
            case "/start":
                return new AnswerStart().returnMessage();
            case "/drager":
                return new AnswerDrager().returnMessage();
            case "/weather":
                City city = new City();
                city.setCity("Moscow");
                ApiResponse response = proxy.getFromApi(city);
                return "Согласно погодному сервису http://185.198.152.105:8086/weather, актуальная погода в Москве : "
                        + "\n" + "\n" + response.toString();
            case "/journal":
                return new AnswerJournal().returnMessage();
            case "/vacation":
                return new AnswerVacation().returnMessage();
            default:
                return "Я не понял запроса...";
        }
    }
}
