package exercises.week2CoCreation.ex04Resturant;

public class Meal {
    private String name;
    private Double price;

    public Meal(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
