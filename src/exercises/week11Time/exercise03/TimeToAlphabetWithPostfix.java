package exercises.week11Time.exercise03;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class TimeToAlphabetWithPostfix {

    private static List<Postfix> postfixes = Arrays.asList(new Morning(), new Noon(), new Afternoon(), new Evening(), new Night());

    public String getPostfix(LocalTime time) {
        return postfixes.stream()
                .filter(e -> e.isRightPostfix(time))
                .map(e -> e.addPostfix())
                .findFirst().get();

    }

}
