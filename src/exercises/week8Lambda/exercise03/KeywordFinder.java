package exercises.week8Lambda.exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> getElegantWords(String sentence) {
        return findeword(sentence, word -> word.startsWith("ele"));
    }

    public List<String> getFulWords(String sentence) {
        return findeword(sentence, word -> word.endsWith("ful"));
    }


    private List<String> findeword(String sentence, Predicate<String> condition) {

        List<String> result = new ArrayList<>();
        String[] split = sentence.split(" ");
        List<String> words = Arrays.asList(split);
        for (String word : words) {
            if (condition.test(word)) {
                result.add(word);
            }
        }

        return result;
    }
}
