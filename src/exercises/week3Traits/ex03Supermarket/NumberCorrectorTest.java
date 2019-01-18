package exercises.week3Traits.ex03Supermarket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberCorrectorTest {
    NumberCorrector numberCorrector = new NumberCorrector();

    @Test
    void testPositiv() {
        Integer correct = numberCorrector.correct(4.567);
        Integer expected = 4;

        Assertions.assertEquals(expected, correct);
    }

    @Test
    void testNegative() {
        Integer correct = numberCorrector.correct(-3.78);
        Integer expected = 3;

        Assertions.assertEquals(expected, correct);
    }

    @Test
    void testZero() {
        Integer correct = numberCorrector.correct(0.78);
        Integer expected = 0;

        Assertions.assertEquals(expected, correct);
    }
}