package exercises.week09Stream.exercise4;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.Comparator;

public class HappinessApplication {

    public static void main(String[] args) {


        new FileReader().asStream("exercises/week09Stream/source/world-happiness-2017.csv")
                .skip(1)
                .map(e -> e.split(";"))
                // .map(e -> Arrays.asList(e))
                .map(columns -> new HappinessRecord(columns[0],
                        Integer.valueOf(columns[1]), Double.valueOf(columns[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .map(e -> e.toString())
                .forEach(e -> System.out.println(e));
    }
}
