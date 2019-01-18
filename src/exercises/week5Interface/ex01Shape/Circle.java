package exercises.week5Interface.ex01Shape;

public class Circle implements Shape {
    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
