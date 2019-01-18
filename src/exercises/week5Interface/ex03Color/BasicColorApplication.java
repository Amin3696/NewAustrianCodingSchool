package exercises.week5Interface.ex03Color;

import exercises.week5Interface.ex01Shape.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("color: " + rectangle.getColor());
        System.out.println("name: " + rectangle.getName());

        Colored colored = (Colored) rectangle;
        System.out.println("colored: " + colored.getColor());

        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape.getName());

        List<Rectangle> rectangles = Arrays.asList(rectangle);

        List<Colored> coloreds = Arrays.asList(colored, rectangle);

        List<Shape> shapes = Arrays.asList(shape, rectangle);

        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);
    }
}
