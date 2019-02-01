package exercises.week11Time.exercise03;

import java.time.LocalTime;

public class Morning implements Postfix {
    @Override
    public String addPostfix() {
        return " in the morning";
    }

    @Override
    public boolean isRightPostfix(LocalTime time) {
        return time.isAfter(LocalTime.parse("06:00:00")) && time.isBefore(LocalTime.parse("11:59:00"));
    }
}
