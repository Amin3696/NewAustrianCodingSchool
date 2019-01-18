package exercises.week3Traits.ex04MessageEncrypting;

import java.util.*;

public class Encryptor {
    private Random random = new Random();
    private List<String> symbol = Arrays.asList("!@#$%&*+-=".split(""));

    public String encrypt(String message) {
        // String digitsReplacement = replaceDigits(message);
        String vowelsReplacement = replaceVowels(message);
        String withRubbish = addRubbish(vowelsReplacement);

        return withRubbish;
    }

    private String addRubbish(String message) {
        List<String> encrypted = new ArrayList<>();
        List<String> letters = Arrays.asList(message.split(""));
        for (String letter : letters) {
            encrypted.add(letter);
            encrypted.add(getRubish());
        }

        return String.join("", encrypted);
    }

    private String getRubish() {
        int amount = random.nextInt(5) + 1;
        String rubbish = "";
        for (int time = 0; time < amount; time++) {
            Collections.shuffle(symbol);
            rubbish += symbol.get(0);
        }

        return rubbish;
    }

    private String replaceVowels(String message) {
        message = message.replaceAll("a", "4");
        message = message.replaceAll("e", "3");
        message = message.replaceAll("i", "1");
        message = message.replaceAll("o", "8");
        message = message.replaceAll("u", "9");
        return message;
    }
 /*private String replaceDigits(String message) {
        message = message.toLowerCase();
        message = message.replaceAll("1", "one");
        message = message.replaceAll("2", "two");
        message = message.replaceAll("3", "three");
        message = message.replaceAll("4", "four");
        message = message.replaceAll("5", "five");
        message = message.replaceAll("6", "six");
        message = message.replaceAll("7", "seven");
        message = message.replaceAll("8", "eight");
        message = message.replaceAll("9", "nine");
        return message;
    }*/
}
