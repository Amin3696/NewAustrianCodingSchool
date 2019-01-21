package exercises.Week10MoreStream.exercise01Pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pokemonexplorer {
    private PokemonReader pokemonReader = new PokemonReader();
    private List<Pokemon> pokemons = pokemonReader.readPokemons();

    public List<Pokemon> allPokemones() {
        return pokemons;
    }

    public Integer amountOfPokemons() {
        return pokemons.size();
    }

    public Long numberOfNoTypeII() {
        return pokemons.stream()
                .filter(e -> e.getType2().equalsIgnoreCase(""))
                .count();
    }

    public List<Pokemon> fastestPokemons() {
        return pokemons.stream()
                .filter(e -> e.getSpeed() == 100)
                .collect(Collectors.toList());
    }


    public Map<String, List<Pokemon>> pokemonsBelongToTypeI() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType1(), Collectors.toList()));
    }

    public Map<String, List<Pokemon>> pokemonsBelongToTypeII() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(pokemon -> pokemon.getType2(), Collectors.toList()));
    }


}
