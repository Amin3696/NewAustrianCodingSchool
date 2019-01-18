package exercises.week4DateStructure.ex04Optional;

import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {
        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift box: "+giftBox);
        giftBox = Optional.of("PS4");
        System.out.println("Gift box: "+giftBox);
        if (giftBox.isPresent()) {
            System.out.println("There is a gift in gift box!");
        }
        System.out.println("The gift is a " + giftBox.get());

    }
}
