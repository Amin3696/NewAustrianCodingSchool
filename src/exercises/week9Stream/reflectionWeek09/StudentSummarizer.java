package exercises.week9Stream.reflectionWeek09;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {

    private StudentReader studentReader = new StudentReader();
    private List<Student> students = studentReader.getStudent();

    public Long getTotalStudents() {
        return students.stream()
                .count();
    }

    public Long getMalePopulation() {
        return students.stream()
                .filter(e -> e.getGender().equals("male"))
                .count();
    }

    public Long getFemalesPopulation() {
        return students.stream()
                .filter(e -> e.getGender().equals("female"))
                .count();
    }

    public List<String> getParentalEducationsLevel() {
        return students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Long getScoreOver90() {
        return students.stream()
                .filter(e -> e.getMathScore() > 90)
                .filter(e -> e.getReadingScore() > 90)
                .filter(e -> e.getWritingScore() > 90)
                .count();

    }

    public Long getScore100() {
        return students.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getWritingScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .count();
    }

    public List<String> getTopStudentGender() {
        return students.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getWritingScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .map(e -> e.getGender())
                .collect(Collectors.toList());
    }
}
