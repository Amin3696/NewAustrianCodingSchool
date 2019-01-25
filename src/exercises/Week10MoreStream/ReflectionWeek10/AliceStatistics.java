package exercises.Week10MoreStream.ReflectionWeek10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceStatistics {

    public static void main(String[] args) {
        List<String> words = new AliceReader().readAliceWords("exercises/Week10MoreStream/ReflectionWeek10/alice.txt");

        getTheNumberOfWordsInAliceBook(words);
        getTheNumberOfDistinctWords(words);
        getLongestWord(words);
        getTheMostApearing5Words(words);
        getTheMostApearing5Letters(words);
        getTheNumerOfAliceApearingInAliceBook(words);

    }


    private static void getTheNumberOfWordsInAliceBook(List<String> words) {
        Long wordsNumber = words.stream()
                .collect(Collectors.counting());
        System.out.println("Number of words:"+wordsNumber+"\n");
    }

    private static void getTheNumberOfDistinctWords(List<String> words) {
        Long distinctWords = words.stream()
                .distinct()
                .collect(Collectors.counting());
        System.out.println("Number of distinct words:"+distinctWords+"\n");
    }
    private static void getLongestWord(List<String> words) {
        List<String> longestWord = words.stream()
                .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .limit(1)
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Longest words:" +longestWord+"\n");
    }



    private static void getTheMostApearing5Words(List<String> words) {
        List<String> mostAppearingWords = words.stream()
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        System.out.println("Most appearing 5 words:"+mostAppearingWords +"\n");


    }

    private static void getTheMostApearing5Letters(List<String> words) {
        List<String> mostApearing5Letter = words.stream()
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e)
                .collect(Collectors.toList());
        System.out.println("Most appearing 5 Letters:"+mostApearing5Letter+"\n");


    }

    private static void getTheNumerOfAliceApearingInAliceBook(List<String> words) {
        Long alice = words.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .collect(Collectors.counting());
        System.out.println("Alice appearances: "+alice);
    }
}
