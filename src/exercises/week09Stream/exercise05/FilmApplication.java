package exercises.week09Stream.exercise05;

public class FilmApplication {


    public static void main(String[] args) {

        FilmSummarizer filmSummarizer = new FilmSummarizer();

        System.out.println("Top 3 with highest rating, sorted by rating:");
        System.out.println("---------------------------------------------");
        System.out.println(filmSummarizer.highestRating());
        System.out.println();
        System.out.println("Top 4 most expensive, sorted by budget:");
        System.out.println("----------------------------------------");
        System.out.println(filmSummarizer.mostExpensive());
        System.out.println();
        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating:");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(filmSummarizer.highestRatingAndLongerThanThree());
        System.out.println();
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget:");
        System.out.println("----------------------------------------------------------------");
        System.out.println(filmSummarizer.mostExpensiveShorFilm());
        System.out.println();
        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(filmSummarizer.mostRatedAndCheapFilm());

    }
}
