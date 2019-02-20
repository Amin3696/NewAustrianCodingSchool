package exercises.week11Time.exercise04;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class OneWayEditable {

    public Boolean isEditable(String word1, String word2) {
        Integer diferences = getDiferences(word1, word2);
        return diferences < 2;

    }

    private Integer getDiferences(String word1, String word2) {
        Stack<String> firstword = getStackOfWord(word1);
        Stack<String> secondtword = getStackOfWord(word2);
        Integer checkTheDifference = getCheck(firstword,secondtword);
        return checkTheDifference;
    }

    private Stack<String> getStackOfWord(String word1) {
        Stack<String> stackOfLetters = new Stack();
        List<String> letters1 = Arrays.asList(word1.split(""));
        for (String letter : letters1) {
            stackOfLetters.push(letter);
        }
        return stackOfLetters;
    }

    private Integer getCheck(Stack firstWord, Stack secondWord) {
        int difference = 0;
        for (Object letter : firstWord) {
            Object letter1 = firstWord.pop();
            Object letter2 = secondWord.pop();
            if (!letter1.equals(letter2)) {
                difference++;


            }
        }
        Object peek = firstWord.peek();


        return null;
    }


}
