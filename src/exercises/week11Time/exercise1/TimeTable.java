package exercises.week11Time.exercise1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTable {

    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("10:00:00");
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm");
        String formatedTime = time.format(formatter);
        System.out.println(formatedTime);

        LocalDate date = LocalDate.parse("2003-03-13");
        System.out.println(date.getDayOfWeek().toString());
// ad to test VCS
    }
}
]