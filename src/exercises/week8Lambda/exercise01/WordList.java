package exercises.week8Lambda.exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(words);

        words.removeIf(e -> e.endsWith("e"));
        System.out.println(words);

        words.replaceAll(e -> e.toUpperCase());
        System.out.println(words);

        words.removeIf(e -> e.length() < 6);
        System.out.println(words);

        words.forEach(e -> System.out.println(e));

    }


}
