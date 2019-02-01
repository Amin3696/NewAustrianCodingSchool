package exercises.week11Time.exercise03;

import java.time.LocalTime;

public class Evening implements Postfix {
    @Override
    public String addPostfix() {
        return " in the evening ";
    }

    @Override
    public boolean isRightPostfix(LocalTime time) {
        return time.isAfter(LocalTime.parse("17:01:00")) && time.isBefore(LocalTime.parse("20:00:00"));
    }
}
