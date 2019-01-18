package exercises.week4DateStructure.ex08Optinal;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift: " + giftBox);
        Box tablet = new Box("Tablet");
        giftBox = Optional.of(tablet);
        System.out.println("Gift: " + giftBox);
        if (giftBox.isPresent()) {
            System.out.println("There is a present in gift box.");
        }
        Box present = giftBox.get();
        System.out.println("gift box value: " + present);
    }
}
