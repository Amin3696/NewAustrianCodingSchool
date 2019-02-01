package exercises.week11Time.exercise03;

import java.time.LocalTime;

public class Night implements Postfix {
    @Override
    public String addPostfix() {
        return " at night";
    }

    @Override
    public boolean isRightPostfix(LocalTime time) {
        return time.isAfter(LocalTime.parse("20:01:00")) && time.isBefore(LocalTime.parse("05:59:00"));
    }
}
