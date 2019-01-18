package exercises.week9Stream.exercise05;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {
    FileReader fileReader = new FileReader();

    public List<Film> getFilm() {
        return fileReader.asStream("exercises/week9Stream/source/films.csv")
                .skip(1)
                .map(e -> e.split(";"))
                //  .map(e -> Arrays.asList(e))
                .map(column -> new Film(
                        column[8], Double.valueOf(column[9]),
                        Integer.valueOf(column[10]),
                        Integer.valueOf(column[6]),
                        Long.valueOf(column[0]),
                        Long.valueOf(column[5])))
                .collect(Collectors.toList());
    }
}
