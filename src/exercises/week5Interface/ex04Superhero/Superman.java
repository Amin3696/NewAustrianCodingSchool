package exercises.week5Interface.ex04Superhero;

import exercises.week5Interface.ex05stopVillain.Villain;

public class Superman implements Superhero {
    @Override
    public String getName() {
        return "Superman";
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
