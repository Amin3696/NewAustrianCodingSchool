package exercises.Week10MoreStream.exercise01Pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokemonsApp {


    public static void main(String[] args) {
        Pokemonexplorer pokemonexplorer = new Pokemonexplorer();

        System.out.println("---------list of Pokemons:-------");
        System.out.println(pokemonexplorer.getListOfPokemones());
        System.out.println();

        System.out.println("1-how many pokemons are exist in this file?");
        System.out.println(pokemonexplorer.getNumberOfPokemons() + " Pokemons are in this List");
        System.out.println();

        System.out.println("2-How many Pokemons don't have a Type2?");
        System.out.println(pokemonexplorer.getNumberOfPokemonsWithoutTypeII() + " don't have typeII");
        System.out.println();

        System.out.println("3-Pokemons with Maximum Speed: ");
        System.out.println(pokemonexplorer.getFastestPokemons());
        System.out.println(pokemonexplorer.getFastestPokemons().size()+" pokemons have the maximum speed.");
        System.out.println();

        System.out.println("4-display the list of TypeI");
        Map<String, List<Pokemon>> typeI = pokemonexplorer.getTypeI();
        System.out.println(typeI.keySet());
        System.out.println();

        System.out.println("5-Pokemons belong to TypeI:");
        System.out.println(typeI);
        System.out.println();

        System.out.println("6-display the list of TypeII");
        Map<String, List<Pokemon>> typeII = pokemonexplorer.getTypeII();
        List<String> typesII = typeII.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println("TypeII "+typesII);
        System.out.println();

        System.out.println("7-Pokemons related to typeII:");
        System.out.println(typeII);
        System.out.println();

        System.out.println("8-List the first 5 Pokemons with maximum of Total");
        System.out.println(pokemonexplorer.findFirstFiveTotal());
        System.out.println();

        System.out.println("9-How many Pokemons are Legendary with speed of at least 80? ");
        System.out.println(pokemonexplorer.getNumberOfLegendaryPokemonsWithSpeedFrom80());
        System.out.println();

        System.out.println("10-List of 5 Legendary Pokemons:");
        System.out.println(pokemonexplorer.find5LegendaryPokemons());
        System.out.println();

        System.out.println("11-Number of Non-Legendary and Legendary Pokemons:");
        System.out.println(pokemonexplorer.getNonLegendary());

    }
}
