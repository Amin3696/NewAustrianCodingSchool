package exercises.week11Time.exercise02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MilitaryTimeExchangerTest {
    private MilitaryTimeExchanger militaryTimeExchanger = new MilitaryTimeExchanger();


    @Test
    void testMidnight() {
        String actual = militaryTimeExchanger.toMilitaryTime("12:00:00AM");
        String expected = "00:00:00";

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testNoon(){
        String actual = militaryTimeExchanger.toMilitaryTime("12:00:00PM");
        String expected = "12:00:00";

        Assertions.assertEquals(expected,actual);
    }
}