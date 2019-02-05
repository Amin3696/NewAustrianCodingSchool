package exercises.week11Time.exercise04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

class OneEditAwayTest {
    private OneEditAway oneEditAway = new OneEditAway();

    @Test
    void isPleEditable() {
        Instant start = Instant.now();
        Boolean actual = oneEditAway.isEditable("pale", "ple");
        Assertions.assertTrue(actual);
        Instant end = Instant.now();
        System.out.println("the process time is " + Duration.between(start, end).toMillis() + "mS");
    }

    @Test
    void isPalesEditable() {

        Instant start = Instant.now();
        Boolean actual = oneEditAway.isEditable("pale", "pales");
        Assertions.assertTrue(actual);
        Instant end = Instant.now();
        System.out.println("the process time is " + Duration.between(start, end).toMillis() + "mS");

    }

    @Test
    void isBaleEditable() {

        Instant start = Instant.now();
        Boolean actual = oneEditAway.isEditable("pale", "bale");
        Assertions.assertTrue(actual);
        Instant end = Instant.now();
        System.out.println("the process time is " + Duration.between(start, end).toMillis() + "mS");

    }

     @Test
    void isBakeEditable() {

        Instant start = Instant.now();
        Boolean actual = oneEditAway.isEditable("pale", "bake");
        Assertions.assertFalse(actual);
        Instant end = Instant.now();
        System.out.println("the process time is " + Duration.between(start, end).toMillis() + "mS");

    }



}