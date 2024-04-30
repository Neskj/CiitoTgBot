package neskj.CiitoTgBot.ResponseInterface.Answers;

public class AnswerWeather implements Answer{

    public String returnMessage(){
        return "Погоду можно посмотреть тут: http://185.198.152.105:8086/weather";
    }
}
