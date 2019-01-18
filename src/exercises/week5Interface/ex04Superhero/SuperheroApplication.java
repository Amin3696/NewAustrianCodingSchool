package exercises.week5Interface.ex04Superhero;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Superhero superhero = superheroCaller.call();
        System.out.println("Superhero: " + superhero.getName());

        List<Superhero> superheroes = new ArrayList<>();
        int numberOfSuperheros = 6;
        for (int time = 0; time < numberOfSuperheros; time++) {
            Superhero newSuperhero = superheroCaller.call();
            superheroes.add(newSuperhero);
        }
        int orderOfSuperhero = 1;
        for (Superhero superhero1 : superheroes) {
            System.out.println("Superhero " + orderOfSuperhero + ": " + superhero1.getName());
            orderOfSuperhero++;
        }
        System.out.println("Number of superheroes: " + superheroes.size());
    }
}
