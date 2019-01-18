package exercises.week2CoCreation.ex07first100PrimeNumber;

import java.util.List;

public class Accumulator {
    Integer accumulate(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
