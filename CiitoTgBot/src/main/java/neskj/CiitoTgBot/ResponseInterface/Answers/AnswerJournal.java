package neskj.CiitoTgBot.ResponseInterface.Answers;

public class AnswerJournal implements Answer{
    @Override
    public String returnMessage() {
        return "Открыть журнал ремонта http://185.198.152.105:6066/journal";
    }
}
