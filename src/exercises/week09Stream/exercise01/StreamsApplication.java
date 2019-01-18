package exercises.week09Stream.exercise01;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {

    public static void main(String[] args) {


        List<Integer> numbers = numberGenerator(21);
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> divisibleByThree = numbers.stream().filter(e -> e > 10).filter(e -> e % 3 == 0).collect(Collectors.toList());
        System.out.println(divisibleByThree);

        List<Integer> productOfThree = numbers.stream().filter(e -> e < 5).map(e -> e *= 3).collect(Collectors.toList());
        System.out.println(productOfThree);

        List<String> showTheDigits = numbers.stream().filter(e -> e > 8).filter(e -> e < 12).map(e -> ("number " + e.toString() + " has " + e.toString().length() + " digits")).collect(Collectors.toList());
        System.out.println(showTheDigits);
    }


    private static List<Integer> numberGenerator(Integer limit) {
        List<Integer> numbers = new ArrayList<>();
        for (int time = 1; time < limit; time++) {
            numbers.add(time);
        }
        return numbers;
    }
}
