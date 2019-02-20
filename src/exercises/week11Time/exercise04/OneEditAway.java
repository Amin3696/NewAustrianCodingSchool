package exercises.week11Time.exercise04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneEditAway {

    public Boolean isEditable(String word1, String word2) {
        List<String> letterOfWord1 = getLetters(word1);
        List<String> letterOfWord2 = getLetters(word2);
        int letterDifferenz = (word1.length()) - (word2.length());
        if (Math.abs(letterDifferenz) > 1) {
            return false;
        }




        return letterOfWord1.stream()
                .filter(e -> !letterOfWord2.contains(e))
                .count() > 2;

    }

    private List<String> getLetters(String word) {
        return Stream.of(word.split("")).collect(Collectors.toList());
    }
}
