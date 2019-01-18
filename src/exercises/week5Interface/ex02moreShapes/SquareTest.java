package exercises.week5Interface.ex02moreShapes;

import exercises.week5Interface.ex01Shape.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapesTest {

    @Test
    void testSquare() {
        Shape shape = new Square();
        String expected = "square";
        assertEquals(expected, shape.getName());

        Square square1 = new Square();
        assertEquals(expected, square1.getName());
    }
}