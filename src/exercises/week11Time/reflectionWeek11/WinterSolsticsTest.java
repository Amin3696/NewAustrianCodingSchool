package exercises.week11Time.reflectionWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class WinterSolsticsTest {
    private Solstics solstice = new Solstics();

    @Test
    void testSummerSolstice() {
        String actual = solstice.getWinterSolstice(LocalDate.parse("2019-02-01"));
        String expected = "2019-12-22";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSummerSolstice1() {
        String actual = solstice.getWinterSolstice(LocalDate.parse("2019-12-23"));
        String expected = "2020-12-21";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSummerSolstice2() {
        String actual = solstice.getWinterSolstice(LocalDate.parse("2022-02-01"));
        String expected = "2022-12-21";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSummerSolstice3() {
        String actual = solstice.getWinterSolstice(LocalDate.parse("2023-02-01"));
        String expected = "2023-12-22";
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

}