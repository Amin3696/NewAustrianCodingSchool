package exercises.week8Lambda.exercise03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class KeywordFinderTest {

    private KeywordFinder keywordFinder = new KeywordFinder();

    @Test
    void testGetElegantWords() {
        List<String> elegantWords = keywordFinder.getElegantWords("The most elegant word in english language is electronic and elements of electromechanics");
        List<String> expected = Arrays.asList("elegant", "electronic", "elements", "electromechanics");

        Assertions.assertEquals(expected, elegantWords);
    }


    @Test
    void TestGetFulWords() {
        List<String> elegantWords = keywordFinder.getFulWords("The most useful word in english language is successful and joyful of colorful vision");
        List<String> expected = Arrays.asList("useful", "successful", "joyful", "colorful");

        Assertions.assertEquals(expected, elegantWords);

    }
}