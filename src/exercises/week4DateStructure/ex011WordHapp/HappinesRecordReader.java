package exercises.week4DateStructure.ex011WordHapp;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappinesRecordReader {
    private FileReader reader = new FileReader();

    public List<HappinessRecord> getList() {
        List<String> lines = getLines();
        List<HappinessRecord> records = toHappinessRecords(lines);
        return records;
    }

    private List<String> getLines() {
        List<String> lines = reader.asList("exercise/week4/worldhappiness/world-happiness-2017.csv");
        return lines;
    }

    private List<HappinessRecord> toHappinessRecords(List<String> lines) {
        ArrayList<HappinessRecord> records = new ArrayList<>();
        lines.remove(0);
        for (String line : lines) {
            records.add(toHappinessRecord(line));
        }

        return records;
    }

    private HappinessRecord toHappinessRecord(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String country = columns.get(0);
        String rank = columns.get(1);
        String score = columns.get(2);
        return new HappinessRecord(country, Integer.valueOf(rank), Double.valueOf(score));
    }
}
