package neskj.CiitoTgBot.Model;

public class ApiResponse {

    private String temp;
    private String feelsLike;
    private String tempMin;
    private String tempMax;

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getTemp() {
        return temp;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public String getTempMin() {
        return tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    @Override
    public String toString() {
        return "Температура : "+temp+"\n"+"Ощущается как : "+feelsLike+"\n"+"Минимум : "+tempMin+"\n"+"Максимум : "+tempMax+"\n";
    }
}
