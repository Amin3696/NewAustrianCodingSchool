package exercises.week8Robomimie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class SensorTest {
    private Sensor sensor = new Sensor();

    @Test
    void testSensor() {
        Optional<String> actualdecrypted = sensor.decrypt("#r#obo#mime##cook");

        Assertions.assertEquals(actualdecrypted.isPresent(), true);
    }

    @Test
    void testNoOutput() {
        Optional<String> actualdecrypted = sensor.decrypt("");
        Assertions.assertFalse(actualdecrypted.isPresent());
    }

}
