package exercises.week09Stream.exercise02;

import exercises.week4DateStructure.ex09File.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    private FileReader fileReader = new FileReader();
    private List<String> names = fileReader.asList("exercises/week09Stream/source/names.txt");


    @Test
    void shorterThanFour() {
        List<String> shortNames = names.stream().filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, shortNames);

        System.out.println(shortNames);
    }

    @Test
    void endWithM() {
        List<String> capitalized = names.stream().filter(e -> e.endsWith("m")).map(e -> e.toUpperCase()).collect(Collectors.toList());

        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertEquals(expected, capitalized);
        System.out.println(capitalized);
    }

    @Test
    void findEAndR() {
        List<String> namesWithER = names.stream().filter(e -> e.contains("e")).filter(e -> e.contains("r")).collect(Collectors.toList());

        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, namesWithER);
        System.out.println(namesWithER);

    }

    @Test
    void findANames() {
        List<String> nameWithAAndM = names.stream()
                .filter(e -> e.length() == 4).map(e -> e.toLowerCase())
                .filter(e -> e.contains("a")).filter(e -> e.contains("m"))
                .map(e -> e.replace("a", "aa"))
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected, nameWithAAndM);
        System.out.println(nameWithAAndM);

    }


}
