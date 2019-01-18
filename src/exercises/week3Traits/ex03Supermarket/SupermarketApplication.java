package exercises.week3Traits.ex03Supermarket;

import java.util.Scanner;

public class SupermarketApplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the decimal number: ");
        double number = scanner.nextDouble();

        NumberCorrector numberCorrector = new NumberCorrector();
        Integer correctNumber = numberCorrector.correct(number);

        System.out.println("the correct number is: "+correctNumber);
    }
}
