package exercises.week5Interface.ex03Color;

import exercises.week5Interface.ex01Shape.Shape;

public class Rectangle implements Colored, Shape {
    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getName()+" "+getColor();
    }
}
