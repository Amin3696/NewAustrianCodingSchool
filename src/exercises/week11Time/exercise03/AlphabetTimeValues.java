package exercises.week11Time.exercise03;

import java.util.HashMap;

public class AlphabetTimeValues {

    public static String toWord(Integer clockValue) {
        HashMap<Integer, String> clockValues = new HashMap<>();
        clockValues.put(0, "Zero");
        clockValues.put(1, "one");
        clockValues.put(2, "two");
        clockValues.put(3, "three");
        clockValues.put(4, "four");
        clockValues.put(5, "five");
        clockValues.put(6, "six");
        clockValues.put(7, "seven");
        clockValues.put(8, "eight");
        clockValues.put(9, "nine");
        clockValues.put(10, "ten");
        clockValues.put(11, "eleven");
        clockValues.put(12, "twelve");
        clockValues.put(13, "thirteen");
        clockValues.put(14, "fourteen");
        clockValues.put(15, "fifteen");
        clockValues.put(16, "sixteen");
        clockValues.put(17, "seventeen");
        clockValues.put(18, "eighteen");
        clockValues.put(19, "nineteen");
        clockValues.put(20, "twenty");
        clockValues.put(21, "twenty one");
        clockValues.put(22, "twenty two");
        clockValues.put(23, "twenty three");
        clockValues.put(24, "twenty four");
        clockValues.put(25, "twenty five");
        clockValues.put(26, "twenty six");
        clockValues.put(27, "twenty seven");
        clockValues.put(28, "twenty eight");
        clockValues.put(29, "twenty nine");
        clockValues.put(30, "thirty");
        return clockValues.get(clockValue);

    }


}



