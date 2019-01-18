package exercises.week5Interface.ex05stopVillain;

import exercises.week5Interface.ex04Superhero.Superhero;
import exercises.week5Interface.ex04Superhero.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();
        Integer number = 10;
        for (int time = 0; time < number; time++) {
            Superhero superhero = superheroCaller.call();
            superhero.fight(joker);
        }
    }
}
