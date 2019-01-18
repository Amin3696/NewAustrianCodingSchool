package exercises.week9Stream.reflectionWeek09;

public class Student {
    private String gender;
    private String parentalLevelOfEducation;
    private Double mathScore;
    private Double readingScore;
    private Double writingScore;

    public Student(String gender, String parentalLevelOfEducation, Double mathScore, Double readingScore, Double writingScore) {
        this.gender = gender;
        this.parentalLevelOfEducation = parentalLevelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalLevelOfEducation() {
        return parentalLevelOfEducation;
    }

    public Double getMathScore() {
        return mathScore;
    }

    public Double getReadingScore() {
        return readingScore;
    }

    public Double getWritingScore() {
        return writingScore;
    }

    @Override
    public String toString() {

        return "Student{" +
                "gender='" + gender + '\'' +
                ", parentalLevelOfEducation='" + parentalLevelOfEducation + '\'' +
                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }
}
