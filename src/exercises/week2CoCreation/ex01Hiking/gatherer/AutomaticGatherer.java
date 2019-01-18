package exercises.week2CoCreation.ex01Hiking.gatherer;

import exercises.week2CoCreation.ex01Hiking.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {
    private List<Hiker> confirmedList = new ArrayList<>();

     List<Hiker> getConfirmedHikers() {
        Hiker mateo = new Hiker("Mateo");
        confirmedList.add(mateo);

        Hiker maria = new Hiker("Maria");
        confirmedList.add(maria);

        Hiker anton = new Hiker("Anton");
        confirmedList.add(anton);

        Hiker sara = new Hiker("Sara");
        confirmedList.add(sara);

        Hiker sirvan = new Hiker("Sirvan");
        confirmedList.add(sirvan);

        return confirmedList;
    }
}
