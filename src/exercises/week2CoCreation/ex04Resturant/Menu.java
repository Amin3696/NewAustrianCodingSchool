package exercises.week2CoCreation.ex04Resturant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Meal> menu = new ArrayList<>();

    public List<Meal> makeTheMenu() {
        menu.add(new Meal("couscous", 8.5));
        menu.add(new Meal("tajin", 9.5));
        menu.add(new Meal("hummus", 3.5));
        menu.add(new Meal("falafel", 4.0));
        return menu;
    }
}
