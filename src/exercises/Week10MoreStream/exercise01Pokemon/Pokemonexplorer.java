package exercises.Week10MoreStream.exercise01Pokemon;

import java.util.*;
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
                .filter(e -> e.getSpeed() > 80)
                .count();

    }

    public Map<Boolean, Long> getNonLegendary() {
        return pokemons.stream()
                .collect(Collectors.groupingBy(e -> e.getLegendary(), Collectors.counting()));
    }

    public Set<Pokemon> showTheDefensiveLegendarys() {
        return pokemons.stream()
                .filter(e -> Boolean.valueOf(e.getLegendary()) == true)
                .filter(e -> Integer.valueOf(e.getDefense()) > 100)
                .limit(5)
                .collect(Collectors.toSet());

    }


    public Optional<Pokemon> showTheMostPowerfulInAttack() {
        return pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getAttack).reversed())
                .findFirst();
    }

    public Optional<Integer> getTheTotalAmountOfHp() {
        return pokemons.stream()
                .map(e -> Integer.valueOf(e.getHp()))
                .limit(10)
                .reduce((e1, e2) -> e1 + e2);
    }

    public boolean isNotAnyPokemonWithTotalMoreThan800() {
        return pokemons.stream()
                .noneMatch(e -> e.getTotal() > 800);


    }
    public boolean isAnyPokemonWithTotalMoreThanValue() {
        return pokemons.stream()
                .anyMatch(e -> e.getTotal() > 700);
    }
}
