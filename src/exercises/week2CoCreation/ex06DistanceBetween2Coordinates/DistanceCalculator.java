package exercises.week2CoCreation.ex06DistanceBetween2Coordinates;

public class DistanceCalculator {

    public Double calculateDistance(Coordinate coordinate1, Coordinate coordinate2) {
        Double x1 = coordinate1.getLatitude();
        Double y1 = coordinate1.getLongitude();
        Double x2 = coordinate2.getLatitude();
        Double y2 = coordinate2.getLongitude();
        double sin = Math.sin(x1) * Math.sin(x2);
        double cos = Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        double acos = Math.acos(sin + cos);
        double radius=6371.01;
        return radius * acos;
    }
}
