package exercises.week8Lambda.exercise04;

import java.util.function.Function;


public class PowerLevelScouter {
    public Integer scuter(String name) {
        return powerLevelFinder(name, letter -> (int) letter.charAt(0));
    }

    public Integer scoutEnhanced(String name) {
        return powerLevelFinder(name, letter -> (int) letter.toLowerCase().charAt(0));
    }


    private Integer powerLevelFinder(String name, Function<String, Integer> transformation) {

        Integer result = 0;
        String[] split = name.split("");
        for (String letter : split) {
            Integer ascii = transformation.apply(letter);
            result += ascii;
        }
        return result;
    }

}







