package exercises.week4DateStructure.ex012Got;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterReader {
    private FileReader reader = new FileReader();

    public List<Character> toCharacters() {
        List<String> lines = readFile();
        List<Character> characters = toCharacters(lines);

        return characters;
    }

    private List<String> readFile() {
        List<String> lines = reader.asList("exercises/week4DateStructure/ex012Got/got-characters.csv");
        return lines;
    }

    private List<Character> toCharacters(List<String> lines) {
        lines.remove(0);
        List<Character> characters = new ArrayList<>();
        for (String line : lines) {
            characters.add(toCharacter(line));
        }
        return characters;
    }

    private Character toCharacter(String line) {
        String[] split = line.split(";");
        List<String> column = Arrays.asList(split);
        String name = column.get(0);
        String bookOfDeath = column.get(3);
        String gender = column.get(6);
        if (gender.equals("1")) {
            gender = "man";
        } else {
            gender = "woman";
        }

        return new Character(name, bookOfDeath, gender);
    }
}
