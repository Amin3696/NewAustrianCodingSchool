package exercises.Week10MoreStream.ReflectionWeek10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceStatistics {

    public static void main(String[] args) {
        List<String> aliceInwonderland = (List<String>) new AliceReader();
        getTheNumberOfWordsInAliceBook(aliceInwonderland);
        getTheDistinictWordInAlicBook(aliceInwonderland);
        getTheMostApearing5Words(aliceInwonderland);
        getTheMostApearing5Letters(aliceInwonderland);
        getTheNumerOfAliceApearingInAliceBook(aliceInwonderland);

    }

    private static void getTheNumberOfWordsInAliceBook(List<String> aliceInwonderland) {
        Long wordsNumber = aliceInwonderland.stream()
                .collect(Collectors.counting());
        System.out.println(wordsNumber);
    }

    private static void getTheDistinictWordInAlicBook(List<String> aliceInwonderland) {
        List<String> distinctWords = aliceInwonderland.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctWords);
    }



    private static void getTheMostApearing5Words(List<String> aliceInwonderland) {
        List<String> mostAppearingWords = aliceInwonderland.stream()
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        System.out.println(mostAppearingWords);


    }

    private static void getTheMostApearing5Letters(List<String> aliceInwonderland) {
        List<String> mostApearing5Letter = aliceInwonderland.stream()
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " | " + e)
                .collect(Collectors.toList());
        System.out.println(mostApearing5Letter);


    }

    private static void getTheNumerOfAliceApearingInAliceBook(List<String> aliceInwonderland) {
        Long alice = aliceInwonderland.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .collect(Collectors.counting());
        System.out.println("Alice appearances: "+alice);
    }
}
