package exercises.Week10MoreStream.exercise01Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokemonsApp {


    public static void main(String[] args) {
        Pokemonexplorer pokemonexplorer = new Pokemonexplorer();

        System.out.println("---------list of Pokemons:-------");
        System.out.println(pokemonexplorer.getListOfPokemones() + "\n");

        System.out.println("1-how many pokemons are exist in this file?");
        System.out.println(pokemonexplorer.getNumberOfPokemons() + " Pokemons are in this List" + "\n");

        System.out.println("2-How many Pokemons don't have a Type2?");
        System.out.println(pokemonexplorer.getNumberOfPokemonsWithoutTypeII() + " don't have typeII" + "\n");

        System.out.println("3-Pokemons with Maximum Speed: ");
        System.out.println(pokemonexplorer.getFastestPokemons());
        System.out.println(pokemonexplorer.getFastestPokemons().size() + " pokemons have the maximum speed." + "\n");

        System.out.println("4-display the list of TypeI");
        Map<String, List<Pokemon>> typeI = pokemonexplorer.getTypeI();
        System.out.println(typeI.keySet() + "\n");

        System.out.println("5-Pokemons belong to TypeI:");
        System.out.println(typeI + "\n");

        System.out.println("6-display the list of TypeII");
        Map<String, List<Pokemon>> typeII = pokemonexplorer.getTypeII();
        List<String> typesII = typeII.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println("TypeII " + typesII + "\n");

        System.out.println("7-Pokemons related to typeII:");
        System.out.println(typeII + "\n");

        System.out.println("8-List the first 5 Pokemons with maximum of Total");
        System.out.println(pokemonexplorer.findFirstFiveTotal() + "\n");

        System.out.println("9-How many Pokemons are Legendary with speed of at least 80? ");
        System.out.println(pokemonexplorer.getNumberOfLegendaryPokemonsWithSpeedFrom80() + "\n");

        System.out.println("10-List of 5 Legendary Pokemons:");
        System.out.println(pokemonexplorer.find5LegendaryPokemons() + "\n");

        System.out.println("11-Number of Non-Legendary and Legendary Pokemons:");
        System.out.println(pokemonexplorer.getNonLegendary() + "\n");

        System.out.println("12-Please List the 5 Legendary with Defence more than 100:");
        System.out.println(pokemonexplorer.showTheDefensiveLegendarys() + "\n");

        System.out.println("13-The most 5 powerful Legendary in defence :");
        pokemonexplorer.showTheDefensiveLegendarys().stream()
                .sorted(Comparator.comparing(Pokemon::getDefense).reversed())
                .forEach(e -> System.out.println(e + " with defence: " + e.getDefense() + "\n"));

        System.out.println("14-The most powerful in Attack:");
        System.out.println(pokemonexplorer.showTheMostPowerfulInAttack() + "\n");

        System.out.println("15-getThe Total Amount Of 10 Hp");
        System.out.println(pokemonexplorer.getTheTotalAmountOfHp() + "\n");

        System.out.println("16-Isn't any Pokemon with Total more than 800?");
        System.out.println(pokemonexplorer.isNotAnyPokemonWithTotalMoreThan800() + "\n");

        System.out.println("17-is Any Pokemon With Total More THan700");
        System.out.println(pokemonexplorer.isAnyPokemonWithTotalMoreThanValue() + "\n");

        System.out.println("18-do have all Pokemons Total more than 150");
        System.out.println(pokemonexplorer.haveAllPokemonsTotalMoreThan150() + "\n");

        System.out.println("19-Which letters are most appearing in Pokemons name?");
        System.out.println(pokemonexplorer.whichLettersAreMostAppearing()+"\n");

        System.out.println("20.Which letters are least in pokemons name?");
        System.out.println(pokemonexplorer.whichLettersAreLeastAppearing() + "\n");

    }
}
