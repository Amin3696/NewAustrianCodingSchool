package exercises.week2CoCreation.ex05Pedometer;

public class DistanceCalculator {

    public Double calculateDistance(Double steps) {
        Double kilometerPerSteps = 0.000762;
        return steps * kilometerPerSteps;
    }
}
