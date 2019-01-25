package exercises.Week10MoreStream.exercise03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SmsStatisticTest {

    private List<Sms> smsList = new SmsReader().readSms();

    @Test
    void testRatioBetweenHamAndSpam() {
        String actual = getRatioOfHamAndSpam();
        String expected = "ham 86%, spam 13%";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMostUSedWordInHam() {
        String actual = getMostUsedWordInHam();
        String expected = "Most Used word is :to";

        Assertions.assertEquals(expected, actual);

    }


    private String getRatioOfHamAndSpam() {
        return smsList.stream()
                .collect(Collectors.groupingBy(Sms::getV1, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + getPrecentage(e) + "%")
                .collect(Collectors.joining(", "));
    }

    private Long getPrecentage(Map.Entry<String, Long> e) {
        return (e.getValue() * 100) / smsList.size();
    }

    private String getMostUsedWordInHam() {
        return smsList.stream()
                .filter(e -> e.getV1().equalsIgnoreCase("ham"))
                .map(e -> e.getV2().split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> "Most Used word is :" + e.getKey())
                .collect(Collectors.joining());


    }
}