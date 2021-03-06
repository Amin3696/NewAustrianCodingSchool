package exercises.week5Interface.ex04Superhero;

import exercises.week5Interface.ex05stopVillain.Villain;

public class Spiderman implements Superhero {
    @Override
    public String getName() {
        return "Spiderman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());

    }

    @Override
    public String toString() {
        return getName();
    }
}
