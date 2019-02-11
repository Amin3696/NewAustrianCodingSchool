package exercises.Chalenges.Permutation;

import java.util.Arrays;
import java.util.List;

public class IsPermutation {

    public Boolean checkPermutation(String word1, String word2) {

        List<String> letters1 = Arrays.asList(word1.split(""));
        List<String> letters2 = Arrays.asList(word2.split(""));

        if (letters1.size() != letters2.size()) {
            return false;
        }
        for (String letter : letters2) {
            if (!letters1.contains(letter)) {
                return false;
            }
        }

        return true;
    }
}
