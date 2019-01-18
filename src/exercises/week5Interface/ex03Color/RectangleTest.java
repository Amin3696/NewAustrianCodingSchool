package exercises.week5Interface.ex03Color;

import exercises.week5Interface.ex01Shape.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    private Rectangle rectangle = new Rectangle();
    private String expectedColor = "yellow";
    private String expectedName = "rectangle";

    @Test
    void testRectangle() {
        assertEquals(expectedColor, rectangle.getColor());
        assertEquals(expectedName, rectangle.getName());
    }

    @Test
    void testShape() {
        Shape shape = (Shape) rectangle;
        assertEquals(expectedName, shape.getName());
    }

    @Test
    void testColored() {
        Colored colored = (Colored) rectangle;
        assertEquals(expectedColor, colored.getColor());
    }
}