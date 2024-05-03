package neskj.CiitoTgBot.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CityTest {

    @Test
    public void getterAndCreateCityHappyFlow() {

        City city = new City();
        city.setCity("Сочи");

        assertNotNull(city);
        assertEquals("Сочи", city.getCity());

    }
}
