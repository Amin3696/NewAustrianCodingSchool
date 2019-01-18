package exercises.week4DateStructure.ex011WordHapp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HappinessApplication {
    public static void main(String[] args) {
        HappinesRecordReader reader = new HappinesRecordReader();
        List<HappinessRecord> records = reader.getList();
        Collections.sort(records, Comparator.comparing(HappinessRecord::getRank));

        int time = 5;
        for (int position = 0; position < time; position++) {
            HappinessRecord record = records.get(position);
            System.out.println("Rank: " + record.getRank() + " | Country: " + record.getCountry() + " | Score: " + record.getScore());

        }
    }
}

