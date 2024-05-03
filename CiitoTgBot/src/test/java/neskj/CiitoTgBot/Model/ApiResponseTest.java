package neskj.CiitoTgBot.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApiResponseTest {

    private ApiResponse response;

    @BeforeEach
    public void init() {
        response = new ApiResponse();
        response.setTemp("30.2");
        response.setFeelsLike("35.5");
        response.setTempMin("28.3");
        response.setTempMax("36.8");
    }

    @Test
    public void createApiResponseHappyFlow() {

        assertNotNull(response);
    }

    @Test
    public void gettersTestHappyFlow() {

        assertEquals("30.2", response.getTemp());
        assertEquals("35.5", response.getFeelsLike());
        assertEquals("28.3", response.getTempMin());
        assertEquals("36.8", response.getTempMax());
    }

    @Test
    public void returnStringHappyFlow() {

        assertEquals("Температура : " + "30.2" + "\n" + "Ощущается как : " + "35.5" + "\n" + "Минимум : " + "28.3" +
                "\n" + "Максимум : " + "36.8" + "\n", response.toString());
    }
}
