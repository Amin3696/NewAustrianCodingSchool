package exercises.week2CoCreation.ex05Pedometer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {
    private Scanner scanner = new Scanner(System.in);

    public List<Integer> gatherTheSteps() {
        List<Integer> stepsFromeEveryone = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Integer steps = askForSteps();
            stepsFromeEveryone.add(steps);
        }
        return stepsFromeEveryone;
    }
    private Integer askForSteps() {
        System.out.println("Plese Enter your Steps: ");
        return scanner.nextInt();
    }
}
