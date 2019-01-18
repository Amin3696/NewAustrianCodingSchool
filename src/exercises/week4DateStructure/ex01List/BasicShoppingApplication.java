package exercises.week4DateStructure.ex01List;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {

        List<String> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        String apple = "apples";
        String banana = "bananas";
        String bread = "Bread";
        groceries.add(apple);
        groceries.add(banana);
        groceries.add(bread);
        System.out.println("Groceries: " + groceries);
        groceries.remove(banana);
        System.out.println("Groceries: " + groceries);
        groceries.add(apple);
        groceries.add(apple);
        System.out.println("Groceries: " + groceries);
        groceries.remove(3);
        System.out.println("Groceries: " + groceries);
        System.out.println("Groceries size: " + groceries.size());
    }
}
