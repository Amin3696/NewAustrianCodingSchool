package exercises.week8Lambda.exercise04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {

    PowerLevelScouter powerLevelScouter = new PowerLevelScouter();

    @Test
    void testScout() {
        Integer actual = powerLevelScouter.scuter("Susana");

        Integer expected = 619;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testScoutEnhanced() {
        Integer actual = powerLevelScouter.scoutEnhanced("Susana");

        Integer expected = 651;
        Assertions.assertEquals(expected, actual);

    }
}