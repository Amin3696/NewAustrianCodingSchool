package exercises.Chalenges.Permutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsPermutationTest {

    private IsPermutation isPermutation = new IsPermutation();


    @Test
    void testNonEqualWords() {

        Boolean actual = isPermutation.checkPermutation("123", "1234");
        Assertions.assertFalse(actual);
    }
    @Test
    void testNonepermuteWords(){
        Boolean actual = isPermutation.checkPermutation("123", "134");
        Assertions.assertFalse(actual);

    }
    @Test
    void testPermuteWords() {
        Boolean actual = isPermutation.checkPermutation("amin", "nima");
        Assertions.assertTrue(actual);
    }
}