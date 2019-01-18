package exercises.week8Robomimie;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;

public class TextReader {
    private FileReader fileReader = new FileReader();

    public List<String> readText() {

        List<String> lines = fileReader.asList("exercises/week8Robomimie/robomime.txt");
        return lines;
    }
}
