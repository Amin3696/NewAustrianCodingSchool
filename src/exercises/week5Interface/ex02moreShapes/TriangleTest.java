package exercises.week5Interface.ex02moreShapes;

import exercises.week5Interface.ex01Shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    String expected = "triangle";

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(expected, triangle.getName());
    }

    @Test
    void testShape() {
        Shape triangle = new Triangle();
        Assertions.assertEquals(expected, triangle.getName());
    }
}