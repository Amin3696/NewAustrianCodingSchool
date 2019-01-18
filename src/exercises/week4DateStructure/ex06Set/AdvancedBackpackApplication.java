package exercises.week4DateStructure.ex06Set;

import java.util.HashSet;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        HashSet<Item> backpack = new HashSet<>();
        System.out.println("The backpack contains: " + backpack);
        Item toothbrush = new Item("Toothbrush");
        Item tShirt = new Item("T-shirt");
        Item towel = new Item("Towel");
        backpack.add(toothbrush);
        backpack.add(tShirt);
        backpack.add(towel);
        System.out.println("The backpack contains: " + backpack);
        Item newTowel = new Item("Towel");
        if (backpack.contains(newTowel)) {
            System.out.println("The backpack contains: " + newTowel.getName());
        }
        backpack.remove(newTowel);
        if (!backpack.contains(newTowel)) {
            System.out.println("The backpack no longer contains towel!");
        }
        backpack.add(tShirt);
        backpack.add(tShirt);
        System.out.println("The backpack contains: " + backpack);
        System.out.println("back pack size: " + backpack.size());
    }
}
