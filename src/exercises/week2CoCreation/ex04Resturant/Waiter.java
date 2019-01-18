package exercises.week2CoCreation.ex04Resturant;

import java.util.List;
import java.util.Scanner;

public class Waiter {
    private Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();
    private List<Meal> mealsList = menu.makeTheMenu();

    public void showTheMeals() {
        System.out.println("There you go our Menu:");
        for (Meal meal : mealsList) {
            System.out.println("Meal: "+meal.getName());
        }
    }

    public void showPrice() {
        System.out.println("yes Please, what do you want to eat?");
        String meal = scanner.nextLine();

        for (Meal meal1 : mealsList) {
            String nameOfMeal = meal1.getName();
            if (nameOfMeal.equalsIgnoreCase(meal)) {
                System.out.println(meal1.getName() + " Cousts " + meal1.getPrice()+" Euros");
                return;
            }
        }
    }
}
