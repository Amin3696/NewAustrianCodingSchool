package exercises.week2CoCreation.ex07first100PrimeNumber;

import java.util.List;

public class PrimesApplication {
    public static void main(String[] args) {
        First100PrimeNumber first100PrimeNumber = new First100PrimeNumber();
        List<Integer> primes = first100PrimeNumber.findPrimes();

        Accumulator accumulator = new Accumulator();
        Integer summation = accumulator.accumulate(primes);

        System.out.println("The summation of first 100 prim numbers is: "+summation);
    }
}
