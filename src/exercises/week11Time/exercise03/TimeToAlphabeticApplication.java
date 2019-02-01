package exercises.week11Time.exercise03;

import java.time.LocalTime;
import java.util.Scanner;

public class TimeToAlphabeticApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the hour:");
        int hour = scanner.nextInt();
        System.out.println("Please enter the minute:");
        int minute = scanner.nextInt();
        String timeValue = String.valueOf(hour) + ":" + String.valueOf(minute);

        LocalTime time = LocalTime.parse(timeValue);


        TimeToAlphabeticFormatChanger timeToAlphabeticFormatChanger = new TimeToAlphabeticFormatChanger();
        String wordFormat = timeToAlphabeticFormatChanger.getWordFormat(hour, minute);

        TimeToAlphabetWithPostfix timeToAlphabetWithPostfix = new TimeToAlphabetWithPostfix();
        String postfix = timeToAlphabetWithPostfix.getPostfix(time);
        System.out.println(wordFormat + postfix);
    }
}
