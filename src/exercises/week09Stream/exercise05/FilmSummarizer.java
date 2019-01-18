package exercises.week09Stream.exercise05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {
    private FilmReader filmReader = new FilmReader();
    List<Film> films = filmReader.getFilm();

    public List<Film> highestRating() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                //          .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public List<Film> highestRatingAndLongerThanThree() {
        return films.stream()
                .filter(e -> e.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                //         .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public List<Film> mostExpensive() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                //  .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public List<Film> mostExpensiveShorFilm() {
        return films.stream()
                .filter(e -> e.getRuntime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                //    .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public List<Film> mostRatedAndCheapFilm() {
        return films.stream()
                .filter(e -> e.getScore() > 7)
                .filter(e -> e.getBudget() > 50000)
                .filter(e -> e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(4)
                // .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }
}
