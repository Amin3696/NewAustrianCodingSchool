package exercises.Week10MoreStream.exercise01Pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokemonsApp {


    public static void main(String[] args) {
        Pokemonexplorer pokemonexplorer = new Pokemonexplorer();

        System.out.println("---------list of Pokemons:-------");
        System.out.println(pokemonexplorer.allPokemones());
        System.out.println();

        System.out.println("1-how many pokemons are exict in this file?");
        System.out.println(pokemonexplorer.amountOfPokemons() + " Pokemons are in this List");
        System.out.println();

        System.out.println("2-How many Pokemons don't have a Type2?");
        System.out.println(pokemonexplorer.numberOfNoTypeII() + " don't have typeII");
        System.out.println();

        System.out.println("3-Pokemons with Maximum Speed: ");
        System.out.println(pokemonexplorer.fastestPokemons());
        System.out.println(pokemonexplorer.fastestPokemons().size()+" pokemons have the maximum speed.");
        System.out.println();

        System.out.println("4-6-display the list of TypeI");
        Map<String, List<Pokemon>> typeI = pokemonexplorer.pokemonsBelongToTypeI();
        System.out.println(typeI.keySet());
        System.out.println();

        System.out.println("5-Pokemons belong to TypeI:");
        System.out.println(typeI);
        System.out.println();

        System.out.println("6-display the list of TypeII");
        Map<String, List<Pokemon>> typeII = pokemonexplorer.pokemonsBelongToTypeII();
        List<String> typesII = typeII.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println("TypeII "+typesII);
        System.out.println();

        System.out.println("7-Pokemons related to typeII:");
        System.out.println(typeII);

    }
}
