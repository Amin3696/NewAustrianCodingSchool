package exercises.week9Stream.reflectionWeek09;

public class studentApp {
    public static void main(String[] args) {
        StudentSummarizer studentSumarizer = new StudentSummarizer();
        System.out.println("Total number of student performance entries:" + studentSumarizer.getTotalStudents());
        System.out.println("Number of female students: " + studentSumarizer.getFemalesPopulation());
        System.out.println("Number of male students: " + studentSumarizer.getMalePopulation());
        System.out.println("Parental education levels sorted alphabetically:");
        System.out.println(studentSumarizer.getParentalEducationsLevel());
        System.out.println("Number of students with scores higher than 90: " + studentSumarizer.getScoreOver90());
        System.out.println("Number of students with scores equal to 100: " + studentSumarizer.getScore100());
        System.out.println("Genders of these students are:" + studentSumarizer.getTopStudentGender());

    }
}
