package exercises.week5Interface.ex02moreShapes;

import exercises.week5Interface.ex01Shape.Shape;

public class Square implements Shape {

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
