package exercises.week5Interface.ex01Shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {
    Circle circle = new Circle();
    Shape anotherShape = new Circle();
    String expected = "circle";

    @Test
    void testCircle() {
        String name = circle.getName();
        Assertions.assertEquals(expected, name);
    }

    @Test
    void testShape() {
        String name = anotherShape.getName();
        Assertions.assertEquals(expected, name);
    }
}