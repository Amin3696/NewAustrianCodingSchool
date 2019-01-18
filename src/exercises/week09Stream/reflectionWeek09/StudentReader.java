package exercises.week09Stream.reflectionWeek09;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    private FileReader fileReader = new FileReader();

    public List<Student> getStudent() {
        return fileReader.asStream("exercises/week09Stream/source/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(culomn -> new Student(culomn[0], culomn[1], Double.valueOf(culomn[2])
                        , Double.valueOf(culomn[3]), Double.valueOf(culomn[4])))
                .collect(Collectors.toList());

    }
}
