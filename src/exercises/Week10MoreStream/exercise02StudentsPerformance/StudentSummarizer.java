package exercises.Week10MoreStream.exercise02StudentsPerformance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentSummarizer {

    public static void main(String[] args) {
        List<Student> students = new StudentReader().readStudents();
        getStatisticOfParentalEducations(students);
        getNrOfStudentsWithMasterParentAndGradeLessThan60(students);
        getTheTopAvaragesWithGender(students);
        getWhetherStudentWithMoreThan95InEveryTopicAndParentalEducationSomeHighSchool(students);
    }


    private static void getStatisticOfParentalEducations(List<Student> students) {

        List<Map.Entry<String, Long>> parentalEducationStatistic = new ArrayList<>(students.stream()
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation, Collectors.counting()))
                .entrySet());

        System.out.println("How many times does each parent level of education appear?");
        System.out.println(parentalEducationStatistic + "\n");

        System.out.println("Parent education level appearances sorted top bottom:");
        parentalEducationStatistic.stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
    }

    private static void getNrOfStudentsWithMasterParentAndGradeLessThan60(List<Student> students) {

        long weakStudentsWithHighParentalEducation = students.stream()
                .filter(e -> Integer.valueOf(e.getMathScore()) < 60)
                .filter(e -> Integer.valueOf(e.getReadingScore()) < 60)
                .filter(e -> Integer.valueOf(e.getWrittingScorte()) < 60)
                .filter(e -> "master's degree".equalsIgnoreCase(e.getParentalLevelOfEducation()))
                .count();
        System.out.println("Number of students with high parent education and lower scores than 60:" + weakStudentsWithHighParentalEducation + "\n");

    }

    private static void getTheTopAvaragesWithGender(List<Student> students) {
        students.stream()
                .flatMap(Stream::of)
                .map(e -> getAverage(e) + "  " + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(6)
                .forEach(e -> System.out.println(e + "\n"));
    }

    private static Integer getAverage(Student e) {
        return (e.getMathScore() + e.getReadingScore() + e.getWrittingScorte()) / 3;
    }

    private static void getWhetherStudentWithMoreThan95InEveryTopicAndParentalEducationSomeHighSchool(List<Student> students) {
        boolean some_high_school = students.stream()
                .filter(e -> e.getWrittingScorte() > 95)
                .filter(e -> e.getReadingScore() > 95)
                .filter(e -> e.getMathScore() > 95)
                .anyMatch(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("some high school"));
        System.out.println("Is there any student with a parent education level of some high school that has at least 95 in every topic? " + some_high_school);

    }

}
