package exercises.week8Lambda.exercise02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberFilterTest {

    private NumberFilter numberFilter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    @Test
    void testGetEven() {

        List<Integer> even = numberFilter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2, 4);

        Assertions.assertEquals(expected, even);

    }

    @Test
    void testGetOdd() {
        List<Integer> odd = numberFilter.getOdd(numbers);
        List<Integer> expected = Arrays.asList(1, 3, 5);

        Assertions.assertEquals(expected, odd);
    }
}