package exercises.week4DateStructure.ex02Set;

import java.util.HashSet;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        HashSet<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String toothpaste = "toothpaste";
        String underwear = "underwear";
        String towel = "towel";
        backpack.add(toothpaste);
        backpack.add(underwear);
        backpack.add(towel);
        System.out.println("the backpack contains: " + backpack);
        if (backpack.contains(underwear)) {
            System.out.println("The backpack contains underwear");
        }
        backpack.remove(toothpaste);
        System.out.println("the backpack contains: " + backpack);
        if (!backpack.contains(toothpaste)) {
            System.out.println("The backpack no longer contains " + toothpaste);
        }
        backpack.add(towel);
        System.out.println("the backpack contains: " + backpack);
        backpack.add(towel);
        System.out.println("the backpack contains: " + backpack);
        backpack.remove(2);
        System.out.println("the backpack size: " + backpack.size());
    }
}
