package exercises.week11Time.reflectionWeek11;

import java.time.LocalDate;
import java.time.Period;

public class Solstics {

    public String getSummerSolsticeCountdown(LocalDate localDate) {

        if (localDate.isLeapYear() && localDate.isAfter(localDate.withMonth(6).withDayOfMonth(20))) {
            return localDate.getYear() + 1 + "-06-21";

        } else if (localDate.isLeapYear() && localDate.isBefore(localDate.withMonth(6).withDayOfMonth(20))) {
            return localDate.getYear() + "-06-20";

        } else if (!(localDate.isLeapYear()) && localDate.isAfter(localDate.withMonth(6).withDayOfMonth(21)) && (localDate.plusYears(1).isLeapYear())) {
            return localDate.getYear() + 1 + "-06-20";
        }

        return localDate.getYear() + "-06-21";


    }

    public String getWinterSolstice(LocalDate localDate) {
        if (localDate.plusYears(1).isLeapYear() && localDate.isAfter(localDate.withMonth(12).withDayOfMonth(22))) {
            return localDate.getYear() + 1 + "-12-21";

        } else if (localDate.plusYears(1).isLeapYear() && localDate.isBefore(localDate.withMonth(12).withDayOfMonth(22))) {
            return localDate.getYear() + "-12-22";

        } else if (!(localDate.plusYears(1).isLeapYear()) && localDate.isAfter(localDate.withMonth(12).withDayOfMonth(21))) {
            return localDate.getYear() + 1 + "-12-21";
        }

        return localDate.getYear() + "-12-21";

    }

    public String calculateSummerSolistice(LocalDate localDate) {
        String date = getSummerSolsticeCountdown(localDate);
        LocalDate dateOfNextSummerSolistice = LocalDate.parse(date);
        int days = Period.between(localDate, dateOfNextSummerSolistice).getDays();

        return "The Summer Solstice " + localDate.getYear() + " is on " + dateOfNextSummerSolistice.getDayOfWeek() + ", " + dateOfNextSummerSolistice.getMonth()
                + " " + dateOfNextSummerSolistice.getDayOfMonth() + " " + dateOfNextSummerSolistice.getYear()
                + " " + "(in " + days + " days).";


    }

    public String calculateWinterSolostice(LocalDate localDate){
        String date = getWinterSolstice(localDate);
        LocalDate dateOfNextSummerSolistice = LocalDate.parse(date);
        int days = Period.between(localDate, dateOfNextSummerSolistice).getDays();

        return "The Winter Solstice " + localDate.getYear() + " is on " + dateOfNextSummerSolistice.getDayOfWeek() + ", " + dateOfNextSummerSolistice.getMonth()
                + " " + dateOfNextSummerSolistice.getDayOfMonth() + " " + dateOfNextSummerSolistice.getYear()
                + " " + "(in " + days + " days).";

    }

}