package exercises.week8Lambda.ReflectionThermostat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {

    Thermostat thermostat = new Thermostat();

    @Test
    void testSauna() {
        String sauna = thermostat.sauna(79.0);

        String expected = "352.15 degrees Kelvin!";
        Assertions.assertEquals(expected, sauna);


    }
    @Test
    void testSaunaWarning() {
        String sauna = thermostat.sauna(80.0);

        String expected = "Warning!";
        Assertions.assertEquals(expected, sauna);

    }
    @Test
    void testSkiAlaram() {
        String actualAlarm = thermostat.skiAlaram(12.3);

        String expected = "12.3 degrees Celsius!";
        Assertions.assertEquals(expected, actualAlarm);

    }
    @Test
    void testSkiAlaramWarning() {
        String actualAlarm = thermostat.skiAlaram(-2.0);

        String expected = "Warning!";
        Assertions.assertEquals(expected, actualAlarm);

    }
}