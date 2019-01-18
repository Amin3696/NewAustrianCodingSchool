package exercises.week09Stream.exercise03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {


    public String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split("")).map(letter -> cipherLetter(letter, key)).collect(Collectors.joining());
    }

    private String cipherLetter(String letter, Integer key) {
        int valueOfLetter = letter.charAt(0);
        if (!Character.isAlphabetic(valueOfLetter)) {
            return letter;
        }
        int shiftedValue = valueOfLetter + key;
        if (Character.isUpperCase(valueOfLetter)) {
            shiftedValue = (shiftedValue - 65) % 26 + 65;
        } else {
            shiftedValue = (shiftedValue - 97) % 26 + 97;
        }
        Character newletter = (char) shiftedValue;
        return newletter.toString();
    }

}

