package exercises.Week10MoreStream.exercise01Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pokemonexplorer {
    private PokemonReader pokemonReader = new PokemonReader();
    private List<Pokemon> pokemons = pokemonReader.readPokemons();

    public List<Pokemon> getListOfPokemones() {
        return pokemons;
    }

    public Integer getNumberOfPokemons() {
        return pokemons.size();
    }


    public Long getNumberOfPokemonsWithoutTypeII() {
        return pokemons.stream()
                .filter(e -> e.getType2().equalsIgnoreCase(""))
                .count();
    }

    public List<Pokemon> getFastestPokemons() {
        return pokemons.stream()
                .filter(e -> e.getSpeed() == 100)
                .collect(Collectors.toList());
    }


    public Map<String, List<Pokemon>> getTypeI() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType1(), Collectors.toList()));
    }

    public Map<String, List<Pokemon>> getTypeII() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType2(), Collectors.toList()));
    }

    public Map<Integer, List<Pokemon>> findFirstFiveTotal() {
        return pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getTotal).reversed())
                .limit(5)
                .collect(Collectors.groupingBy(e -> e.getTotal(), Collectors.toList()));
    }

    public List<Pokemon> find5LegendaryPokemons() {
        return pokemons.stream()
                .filter(e -> Boolean.valueOf(e.getLegendary()) == true)
                .limit(5)
                .collect(Collectors.toList());
    }

    public Long getNumberOfLegendaryPokemonsWithSpeedFrom80() {
        return pokemons.stream()
                .filter(e -> Boolean.valueOf(e.getLegendary()) == true)
                .filter(e->e.getSpeed()>80)
                .count();
    }

    public Map<Boolean, Long> getNonLegendary() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(e -> e.getLegendary(), Collectors.counting()));
    }
}
