package exercises.week5Interface.ex02moreShapes;

import exercises.week5Interface.ex01Shape.Shape;

public class Triangle implements Shape {

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
