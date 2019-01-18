package exercises.week2CoCreation.ex06DistanceBetween2Coordinates;

import java.util.Scanner;

public class CoordinateGatherer {

    Scanner scanner = new Scanner(System.in);

    public Coordinate gatherCoordinates() {
        System.out.println("Please Enter the latitude:");
        double latitude = scanner.nextDouble();
        System.out.println("please Enter the Longitude:");
        double longitude = scanner.nextDouble();
        return new Coordinate(latitude, longitude);
    }
}
