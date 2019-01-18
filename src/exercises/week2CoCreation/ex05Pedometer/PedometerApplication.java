package exercises.week2CoCreation.ex05Pedometer;

import java.util.List;

public class PedometerApplication {
    public static void main(String[] args) {
        StepGatherer stepGatherer = new StepGatherer();
        List<Integer> ListOfSteps = stepGatherer.gatherTheSteps();
        AverageCalculator averageCalculator = new AverageCalculator();
        Double averageNumberOfSteps = averageCalculator.calculateAverage(ListOfSteps);
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Double averageDistance = distanceCalculator.calculateDistance(averageNumberOfSteps);
        System.out.println("the Average Steps is " + averageNumberOfSteps + " and the average Distance is " + averageDistance + " km");
    }
}
