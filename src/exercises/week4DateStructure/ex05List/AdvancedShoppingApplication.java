package exercises.week4DateStructure.ex05List;

import java.util.ArrayList;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        ArrayList<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        Grocery apple = new Grocery("apple");
        Grocery milk = new Grocery("milk");
        Grocery egg = new Grocery("egg");
        groceries.add(apple);
        groceries.add(milk);
        groceries.add(egg);
        System.out.println("Groceries: " + groceries);
        Grocery milkProduct = new Grocery("butter");
        System.out.println("The index of " + milkProduct.getName() + " is " + groceries.indexOf(milkProduct));
        if (groceries.contains(milkProduct)) {
            System.out.println("The grocery list contains " + milkProduct.getName() + "!");
        } else {
            System.out.println("The grocery list does not contain " + milkProduct.getName() + "!");
        }
        Grocery newApple = new Grocery("apple");
        groceries.remove(newApple);
        System.out.println("Groceries: " + groceries);
        groceries.add(milk);
        groceries.add(milk);
        System.out.println("the index of milk is:" + groceries.indexOf(milk));
        System.out.println("Groceries: " + groceries);
        groceries.remove(2);
        System.out.println("Groceries: " + groceries);
        System.out.println("size of Groceries=" + groceries.size());
    }
}
