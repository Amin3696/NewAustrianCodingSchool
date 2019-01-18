package exercises.week5Interface.ex04Superhero;

import exercises.week5Interface.ex05stopVillain.Villain;

public class Batman implements Superhero {
    @Override
    public String getName() {
        return "Batman";
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
