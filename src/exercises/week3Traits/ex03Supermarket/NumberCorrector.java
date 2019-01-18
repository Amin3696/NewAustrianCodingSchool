package exercises.week3Traits.ex03Supermarket;

public class NumberCorrector {
    public Integer correct(Double number) {

        number = Math.abs(number);
        number = Math.floor(number);

        int correctNumber = number.intValue();
        return correctNumber;
    }
}
