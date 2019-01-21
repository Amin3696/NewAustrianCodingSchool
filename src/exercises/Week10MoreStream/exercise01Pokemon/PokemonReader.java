package exercises.Week10MoreStream.exercise01Pokemon;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {
    private FileReader fileReader = new FileReader();

    public List<Pokemon> readPokemons() {
        return fileReader.asStream("exercises/Week10MoreStream/exercise01Pokemon/pokemon.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(column -> new Pokemon(column[1], column[2], column[3],
                        Integer.valueOf(column[4]), Integer.valueOf(column[5]), Integer.valueOf(column[6])
                        , Integer.valueOf(column[7]), Integer.valueOf(column[8]), Integer.valueOf(column[9])
                        , Integer.valueOf(column[10]), Integer.valueOf(column[11]), Boolean.valueOf(column[12])))
                .collect(Collectors.toList());

    }

}
