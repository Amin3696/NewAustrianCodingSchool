package exercises.week11Time.exercise03;

import java.time.LocalTime;

public class Noon implements Postfix {
    @Override
    public String addPostfix() {
        return " noon";
    }

    @Override
    public boolean isRightPostfix(LocalTime time) {
        return time.toString().equals("12:00");
    }
}
