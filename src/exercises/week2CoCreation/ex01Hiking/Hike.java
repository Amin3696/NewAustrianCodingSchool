package exercises.week2CoCreation.ex01Hiking;

import exercises.week2CoCreation.ex01Hiking.gatherer.Gatherer;

import java.util.ArrayList;
import java.util.List;

public class Hike {
    private List<Hiker> hikers = new ArrayList<>();
    private Gatherer gatherer = new Gatherer();

    public void signUp() {
        hikers = gatherer.signUp();
    }

    public void showHikers() {
        for (Hiker hiker : hikers) {
            System.out.println("Hiker: " + hiker.getName());
        }
    }
}
