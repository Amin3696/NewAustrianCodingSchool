package exercises.Week10MoreStream.ReflectionWeek10;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceReader {


    public List<String> readAliceWords(String filePath) {
        return  new FileReader().asStream(filePath)
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll("’s", " "))
                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("‘", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
    }
}

