package exercises.week5Interface.ex02moreShapes;

import exercises.week5Interface.ex01Shape.Circle;
import exercises.week5Interface.ex01Shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());

        Shape square = new Square();
        System.out.println("Shape: " + square.getName());

        Shape triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());

        // List<Circle> circles = new ArrayList<>();
        //circles.add(circle);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        System.out.println(shapes);

        for (Shape shape : shapes) {
            String name = shape.getName();
            System.out.println("Shape name: " + name);
        }
    }
}
