package exercises.week11Time.reflectionWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CalculateSolsticsMessageTest {
    private Solstics solstics = new Solstics();


    @Test
    void testCalculateMessage() {
        String actual = solstics.calculateSummerSolistice(LocalDate.parse("2019-02-01"));
        String expected = "The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 140 days).";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateMessageWinter() {
        String actual = solstics.calculateWinterSolostice(LocalDate.parse("2019-02-01"));
        String expected = "The Winter Solstice 2019 is on SUNDAY, DECEMBER 22, 2019 (in 324 days).";

        Assertions.assertEquals(expected, actual);
    }

}