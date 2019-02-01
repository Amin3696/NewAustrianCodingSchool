package exercises.week11Time.exercise03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlphabetTimeExchangerTest {

    private TimeToAlphabeticFormatChanger timeToAlphabeticFormatChanger = new TimeToAlphabeticFormatChanger();


    @Test
    void testTo() {
        String actual = timeToAlphabeticFormatChanger.getWordFormat(12, 45);
        String expected = "fifteen minutes to thirteen";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testPastTo() {
        String actual = timeToAlphabeticFormatChanger.getWordFormat(12, 15);
        String expected = "fifteen minutes past twelve";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOclock() {
        String actual = timeToAlphabeticFormatChanger.getWordFormat(12, 0);
        String expected = "twelve O'clock";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }


}