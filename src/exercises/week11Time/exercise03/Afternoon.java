package exercises.week11Time.exercise03;

import java.time.LocalTime;

public class Afternoon implements Postfix {
    @Override
    public String addPostfix() {
        return " in the afternoon";
    }

    @Override
    public boolean isRightPostfix(LocalTime time) {
        return time.isAfter(LocalTime.parse("12:01:00")) && time.isBefore(LocalTime.parse("17:00:00"));
    }
}
