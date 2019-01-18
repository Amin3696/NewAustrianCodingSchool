package exercises.week5Interface.ex04Superhero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SuperheroCallerTest {
    private SuperheroCaller superheroCaller = new SuperheroCaller();

    @Test
    void testSuperhero() {
        Assertions.assertNotNull(superheroCaller.call());
    }

}