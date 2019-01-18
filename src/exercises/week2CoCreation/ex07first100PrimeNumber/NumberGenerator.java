package exercises.week2CoCreation.ex07first100PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    List<Integer> generateFirst550Numbers() {
        List<Integer> numberList = new ArrayList<>();
        for (int number = 1; number <= 550; number++) {
            numberList.add(number);
        }
        return numberList;
    }
}
