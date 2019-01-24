package exercises.Week10MoreStream.exercise02StudentsPerformance;

public class Student {
    private String gender;
    private String parentalEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writtingScorte;

    public Student(String gender, String parentalEducation, Integer mathScore, Integer readingScore, Integer writtingScorte) {
        this.gender = gender;
        this.parentalEducation = parentalEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writtingScorte = writtingScorte;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalLevelOfEducation() {
        return parentalEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWrittingScorte() {
        return writtingScorte;
    }

}
