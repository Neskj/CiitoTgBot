package neskj.CiitoTgBot.ResponseInterface;

import org.springframework.stereotype.Component;

@Component
public class ResponseLogic implements ResponseInterface {

    public String getResponse(String message) {

        switch (message) {
            case "/start":
                return "Привет! Я новый бот Цеха испытаний и техобслуживания! Чем могу помочь ?";
            case "Дрегер":
                return "Вот ссылка на веб-приложение по дрегерам: http://185.198.152.105:9096/drager";
            case "Погода":
                return "Погоду можно посмотреть тут: http://185.198.152.105:8086/weather";
            default:
                return "Я не понял запроса...";
        }
    }
}
