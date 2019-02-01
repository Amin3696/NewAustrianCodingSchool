package exercises.week11Time.reflectionWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class summerSolsticsTest {
    private Solstics solstice = new Solstics();


    @Test
    void testSummerSolstice() {
        String actual = solstice.getSummerSolsticeCountdown(LocalDate.parse("2019-02-01"));
        String expected="2019-06-21";
        System.out.println(actual);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testSummerSolstice1() {
        String actual = solstice.getSummerSolsticeCountdown(LocalDate.parse("2019-10-01"));
        String expected="2020-06-20";
        System.out.println(actual);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testSummerSolstice2() {
        String actual = solstice.getSummerSolsticeCountdown(LocalDate.parse("2022-02-01"));
        String expected="2022-06-21";
        System.out.println(actual);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testSummerSolstice3() {
        String actual = solstice.getSummerSolsticeCountdown(LocalDate.parse("2023-02-01"));
        String expected="2023-06-21";
        System.out.println(actual);

        Assertions.assertEquals(expected,actual);
    }
}