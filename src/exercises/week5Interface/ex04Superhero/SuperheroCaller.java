package exercises.week5Interface.ex04Superhero;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
    private List<Superhero> superheroes = Arrays.asList(new Batman(), new Superman(), new Spiderman());

    public Superhero call() {
        Random random = new Random();
        int position = random.nextInt(3);
        return superheroes.get(position);
    }
}
