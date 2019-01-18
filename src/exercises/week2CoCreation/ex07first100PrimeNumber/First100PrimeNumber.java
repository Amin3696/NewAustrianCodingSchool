package exercises.week2CoCreation.ex07first100PrimeNumber;

import java.util.List;

public class First100PrimeNumber {
   private NumberGenerator numberGenerator = new NumberGenerator();

    List<Integer> findPrimes() {
        List<Integer> numbers = numberGenerator.generateFirst550Numbers();

        PrimeFinder primeFinder = new PrimeFinder();
        List<Integer> primes = primeFinder.findPrimes(numbers);
        return primes;
    }
}
