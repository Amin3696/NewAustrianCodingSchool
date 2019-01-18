package exercises.week8Robomimie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobomimeApplication {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        List<String> tricks = sensor.returnCleanTricks();
        Set<String> tricksArchive = archive(tricks);

        System.out.println(tricks);
        System.out.println("Number of unique tricks: "+tricksArchive.size());
        System.out.println(tricksArchive);
    }

    private static Set<String> archive(List<String> tricks) {
        HashSet<String> tricksArchive = new HashSet<>();
        for (String trick : tricks) {
            tricksArchive.add(trick);
        }
        return tricksArchive;
    }
}
