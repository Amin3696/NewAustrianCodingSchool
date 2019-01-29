package exercises.week11Time.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class TimeTableTest {

    @Test
    void testInstantTime() {

        LocalTime time = LocalTime.parse("10:00:00");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String actualTime = time.format(formatter);
        String expectedTime = "10:00";

        Assertions.assertEquals(expectedTime, actualTime);

        LocalDate date = LocalDate.parse("2003-03-13");
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        DayOfWeek expected = DayOfWeek.THURSDAY;

        Assertions.assertEquals(expected, dayOfWeek);

        LocalTime pickUpTime = time.plus(37, ChronoUnit.MINUTES).plus(21, ChronoUnit.SECONDS);
        DateTimeFormatter newFormater = DateTimeFormatter.ofPattern("HH:mm:ss");
        String actualPickUpTime = pickUpTime.format(newFormater);
        String expectedPickUpTime = "10:37:21";

        Assertions.assertEquals(expectedPickUpTime, actualPickUpTime);
        System.out.println("Pick up time is:" + actualPickUpTime);

        LocalTime arrivingToAirport = pickUpTime.plus(1, ChronoUnit.HOURS).plus(30, ChronoUnit.MINUTES);
        String arrivingToAirportFormatted = arrivingToAirport.format(newFormater);
        String expectedArriveTime = "12:07:21";

        Assertions.assertEquals(expectedArriveTime, arrivingToAirportFormatted);
        System.out.println("arrive in airport:" + arrivingToAirportFormatted);

        LocalTime departureFlightTime = LocalTime.parse("11:04:00");
        boolean whetherCanCatchHisFlight = departureFlightTime.isAfter(arrivingToAirport);
        boolean expectedCatchFlight = false;

        Assertions.assertEquals(expectedCatchFlight, whetherCanCatchHisFlight);
        System.out.println("Mugatu can catch his flight? " + whetherCanCatchHisFlight);

        LocalTime nextFlight = LocalTime.parse("18:45:00");
        System.out.println("DepartureTime: " + nextFlight);

        Duration waitingToNextFlight = Duration.between(arrivingToAirport, nextFlight);
        long waitingHours = waitingToNextFlight.toHours();
        long waitingMinutes = waitingToNextFlight.minusHours(waitingHours).toMinutes();
        String waitingAnauncment = "Mugatu should wait " + waitingHours + " hours and " + waitingMinutes + " minutes for next Flight.";
        String expectedWaitingAnauncment = "Mugatu should wait 6 hours and 37 minutes for next Flight.";

        System.out.println(waitingAnauncment);
        Assertions.assertEquals(expectedWaitingAnauncment, waitingAnauncment);

        LocalDateTime departure = LocalDateTime.of(date, nextFlight);
        LocalDateTime arrival = departure.plusHours(11).plusMinutes(50);
        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime arrivalLondonTime = arrival.atZone(london);
        ZonedDateTime expectedArrivalLondon = ZonedDateTime.parse("2003-03-14T06:35Z[Europe/London]");

        Assertions.assertEquals(expectedArrivalLondon, arrivalLondonTime);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime arrivalTokyoTime = arrivalLondonTime.withZoneSameInstant(tokyo);
        ZonedDateTime expectedArrivalTokyo = ZonedDateTime.parse("2003-03-14T15:35+09:00[Asia/Tokyo]");
        System.out.println("arriveTimeInTokyo  " + arrivalTokyoTime);
        System.out.println("arriveTimeInLondon  " + arrivalLondonTime);

        Assertions.assertEquals(expectedArrivalTokyo, arrivalTokyoTime);


        LocalDateTime timeInTokyo = arrivalTokyoTime.toLocalDateTime();


        LocalDateTime wakesUpTimeInTokyo = timeInTokyo.plusHours(11);
        String wakeUp = formatter.format(wakesUpTimeInTokyo);
        System.out.println("Mugatu is waked up at " + wakeUp);
        String expectedWakeUp = "02:35";

        Assertions.assertEquals(expectedWakeUp, wakeUp);

        LocalDateTime advertisementTime = wakesUpTimeInTokyo.plusMinutes(47);
        String advertisement = newFormater.format(advertisementTime);
        String expectedAdvertisement = "03:22:00";

        Assertions.assertEquals(expectedAdvertisement, advertisement);
        System.out.println("Advertisement time is: " + advertisement);

        LocalDateTime endTimeInLimousine = wakesUpTimeInTokyo.plusSeconds(546);

        Duration preparationInLimousine = Duration.between(wakesUpTimeInTokyo, endTimeInLimousine);
        long preparationMinutes = preparationInLimousine.toMinutes();
        Duration preparationSecond = preparationInLimousine.minusMinutes(preparationMinutes);
        long seconds = preparationSecond.getSeconds();
        String preparationInMinutAndSeconds = "Mugatu has " + preparationMinutes + " minutes and " + seconds + " second for preparation.";
        String expectedPreparation = "Mugatu has 9 minutes and 6 second for preparation.";

        Assertions.assertEquals(expectedPreparation, preparationInMinutAndSeconds);
        System.out.println(preparationInMinutAndSeconds);

        LocalTime lunchTime = LocalTime.parse("13:00:00");
        LocalTime dinnerTime = LocalTime.parse("20:00:00");

        LocalTime startingTime = endTimeInLimousine.toLocalTime();
        boolean isLunchTime = startingTime.isBefore(lunchTime);
        // boolean isDinnerTime = startingTime.isBefore(dinnerTime);

        if (isLunchTime) {
            System.out.println("Mugatu should have lunch.");
        } else {

            System.out.println("Mugatu should have dinner.");
        }


        LocalDateTime overTimeInTokyo = endTimeInLimousine.plusHours(7)
                .plusDays(3).plusHours(12).plusHours(11).plusMinutes(50);
        String landingInLondonWithTokyoTime = overTimeInTokyo.format(newFormater);
        ZonedDateTime tokyoLandingTime = overTimeInTokyo.atZone(tokyo);
        ZonedDateTime expectedTokyoLandingTime = ZonedDateTime.parse("2003-03-19T09:34:06+09:00[Asia/Tokyo]");

        Assertions.assertEquals(expectedTokyoLandingTime, tokyoLandingTime);

        ZonedDateTime landTimeInLondon = tokyoLandingTime.withZoneSameInstant(london);
        ZonedDateTime expectedLondonLandingTime = ZonedDateTime.parse("2003-03-19T00:34:06Z[Europe/London]");
        String landingLocalTimeInLondon = landTimeInLondon.format(newFormater);

        Assertions.assertEquals(expectedLondonLandingTime, landTimeInLondon);
        System.out.println("landing in London with Tokyo Time:  " + landingInLondonWithTokyoTime);
        System.out.println("Local time of landing in London:  " + landingLocalTimeInLondon);

        long dispatchingTime = 173 * 12;
        Instant begin = Instant.now();
        Instant end = begin.plusSeconds(dispatchingTime);
        Duration dispatchingDuration = Duration.between(begin, end);
        long hours = dispatchingDuration.toHours();

        Assertions.assertEquals(0, hours);

        Duration remainingMinutes = dispatchingDuration.minusHours(hours);
        long minutes = remainingMinutes.toMinutes();

        Assertions.assertEquals(34, minutes);

        Duration remainingSeconds = remainingMinutes.minusMinutes(minutes);
        long seconds1 = remainingSeconds.getSeconds();

        Assertions.assertEquals(36, seconds1);

        String dispatchduration = "Mugatu dispatch with his fans " + hours + " hours and " + minutes
                + " minutes and " + seconds1 + " Seconds";
        System.out.println(dispatchduration);

        LocalTime hotelInLondon = landTimeInLondon.plusSeconds(dispatchingTime).plusHours(1).toLocalTime();
        System.out.println(hotelInLondon);

        boolean isAfter09 = hotelInLondon.isAfter(LocalTime.parse("09:00:00"));
        boolean isbefore14Ending = hotelInLondon.isBefore(LocalTime.parse("13:30:00"));

        boolean isAfter16 = hotelInLondon.isAfter(LocalTime.parse("16:00:00"));
        boolean isBefore20Ending = hotelInLondon.isBefore(LocalTime.parse("19:30:00"));

        if (isAfter09 && isbefore14Ending) {
            System.out.println("he can spend half an hour in sauna!");
        } else if (isAfter16 && isBefore20Ending) {
            System.out.println("he can spend half an hour in sauna!");
        } else {
            System.out.println("he can not spend half an hour in sauna!");

        }
        LocalDateTime londonHotel = landTimeInLondon.plusSeconds(dispatchingTime).plusHours(1).toLocalDateTime();
        DayOfWeek dayOfWeekInHotel = londonHotel.getDayOfWeek();
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;

        Assertions.assertEquals(expectedDayOfWeek, dayOfWeekInHotel);

        System.out.println(dayOfWeekInHotel);
        String dayOfWeek1 = dayOfWeekInHotel.toString();
        LocalDate localDateInHotel = landTimeInLondon.plusSeconds(dispatchingTime).plusHours(1).toLocalDate();
        boolean leapYear = localDateInHotel.isLeapYear();
        boolean expectedLeapYear = false;

        Assertions.assertEquals(expectedLeapYear, leapYear);

        if (dayOfWeek1.equalsIgnoreCase("Thursda") && dayOfWeek1.equalsIgnoreCase("Sunday") || leapYear && dayOfWeek1.equalsIgnoreCase("Saturday")) {
            System.out.println("he is lucky and get one hour massage!");
        } else {
            System.out.println("he is not lucky to get one hour massage!");
        }

        LocalDateTime timeInLondonInDayOfAdvertisment = londonHotel.plusWeeks(1);
        System.out.println("time in london :" + timeInLondonInDayOfAdvertisment);

        ZonedDateTime timeAtZoneLondon = timeInLondonInDayOfAdvertisment.atZone(london);
        ZonedDateTime timeAZoneTokyo = timeAtZoneLondon.withZoneSameInstant(tokyo);

        Duration timeToAdvertisment = Duration.between(timeAZoneTokyo.toLocalTime(), LocalTime.parse("18:30:00"));
        LocalDateTime adShowTimeInLondon = timeInLondonInDayOfAdvertisment.plus(timeToAdvertisment);

        System.out.println("Ad show in Tokyo: 18:30");
        System.out.println("Ad show in London " + adShowTimeInLondon.toLocalTime());

        LocalDateTime congratsCallTime = adShowTimeInLondon.plusSeconds(29).plusSeconds(15);
        System.out.println("Congrats call time: " + congratsCallTime.toLocalTime());
        System.out.println("Weekday is: "+congratsCallTime.getDayOfWeek());

        Period daysFromBeginToEnd = Period.between(date,congratsCallTime.toLocalDate());
        System.out.println("it takes "+daysFromBeginToEnd.getDays()+" days");

        LocalDateTime endOfTimeTable = congratsCallTime.minusSeconds(15);
        Duration timeSheet = Duration.between(LocalDateTime.of(date, time), endOfTimeTable);
        long workingMinutes = timeSheet.toMinutes();
        System.out.println("he worked "+workingMinutes+" minutes");

        double salary = workingMinutes * 1.39;
        System.out.println("his salary is :"+salary+" €");

    }


}