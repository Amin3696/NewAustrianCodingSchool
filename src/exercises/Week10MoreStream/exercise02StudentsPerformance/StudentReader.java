package exercises.Week10MoreStream.exercise02StudentsPerformance;

import exercises.week4DateStructure.ex09File.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    private FileReader fileReader = new FileReader();

    public List<Student> readStudents() {
        return fileReader.asStream("exercises/Week10MoreStream/exercise02StudentsPerformance/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(line -> getStudent(line))
                .collect(Collectors.toList());
    }

    private Student getStudent(String[] line) {
        return new Student(line[0], line[1], Integer.valueOf(line[2]), Integer.valueOf(line[3]), Integer.valueOf(line[4]));
    }
}

