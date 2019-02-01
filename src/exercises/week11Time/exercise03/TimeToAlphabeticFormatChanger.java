package exercises.week11Time.exercise03;

import java.util.Arrays;
import java.util.List;

public class TimeToAlphabeticFormatChanger {

    private static List<Minutes> minutesList = Arrays.asList(new toClockTime(), new OclockTime(), new Ispast());

    public String getWordFormat(Integer hour, Integer minutes) {

        return minutesList.stream()
                .filter(e -> e.isRightTime(hour, minutes))
                .map(e -> e.getWordOfTime(hour, minutes))
                .findFirst().get();

    }

}
