package exercises.week2CoCreation.ex06DistanceBetween2Coordinates;

public class DistanceFromCoordinatorApplication {
    public static void main(String[] args) {
        CoordinateGatherer coordinateGatherer = new CoordinateGatherer();
        Coordinate coordinate1 = coordinateGatherer.gatherCoordinates();
        Coordinate coordinate2 = coordinateGatherer.gatherCoordinates();
        System.out.println("Calculating....");
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Double distance = distanceCalculator.calculateDistance(coordinate1, coordinate2);
        System.out.println("The distance between those points is: " + distance + " km");
    }
}
