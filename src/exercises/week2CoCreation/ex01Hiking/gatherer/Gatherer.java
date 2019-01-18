package exercises.week2CoCreation.ex01Hiking.gatherer;

import exercises.week2CoCreation.ex01Hiking.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {
    private Scanner scanner = new Scanner(System.in);
    private AutomaticGatherer automaticGatherer = new AutomaticGatherer();

    public List<Hiker> signUp() {
        List<Hiker> hikers = new ArrayList<>();
        hikers=automaticGatherer.getConfirmedHikers();

        String name = askForName();
        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name = askForName();
        }
        return hikers;
    }

    private String askForName() {
        System.out.println("Write your neme: ");
        return scanner.nextLine();
    }
}
