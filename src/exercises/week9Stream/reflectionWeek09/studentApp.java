package exercises.week9Stream.reflectionWeek09;

public class studentApp {
    public static void main(String[] args) {
        StudentSummarizer studentSumarizer = new StudentSummarizer();
        System.out.println("Total number of student performance entries:" + studentSumarizer.getTotalStudents());
        System.out.println("Number of female students: " + studentSumarizer.girls());
        System.out.println("Number of male students: " + studentSumarizer.getBoys());
        System.out.println("Parental education levels sorted alphabetically:");
        System.out.println(studentSumarizer.ParentalEducation());
        System.out.println("Number of students with scores higher than 90: " + studentSumarizer.getMoreThan90());
        System.out.println("Number of students with scores equal to 100: " + studentSumarizer.get100());
        System.out.println("Genders of these students are:" + studentSumarizer.getTopStudentGender());

    }
}
