package exercises.Week10MoreStream.ReflectionWeek10;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class AliceReader {

    private FileReader fileReader = new FileReader();

    public List<String[]> readAlice() {
        return  fileReader.asStream("exercises/Week10MoreStream/ReflectionWeek10/alice.txt")

                .map(e -> e.toLowerCase())
                .map(line -> line.replaceAll(",", " "))
                .map(line -> line.replaceAll(";", " "))
                .map(line -> line.replaceAll("'s", " "))
                .map(line -> line.replaceAll("'", " "))
                .map(line -> line.replaceAll("‘", " "))
                .map(line -> line.replaceAll(":", " "))
                .map(line -> line.replaceAll("#", " "))
                .map(line -> line.replaceAll("/", " "))
                .map(line -> line.replaceAll("-", " "))
                .map(e -> e.split(" "))
                .collect(Collectors.toList());
    }
}
