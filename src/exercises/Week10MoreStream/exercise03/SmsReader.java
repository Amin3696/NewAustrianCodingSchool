package exercises.Week10MoreStream.exercise03;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {
    private FileReader fileReader = new FileReader();

    public List<Sms> readSms() {
        return fileReader.asStream("exercises/Week10MoreStream/exercise03/sms.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Sms(e[0], e[1]))
                .collect(Collectors.toList());
    }
}
