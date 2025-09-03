package w3resources.numbers.ex1to3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private static boolean isPrime(int num){
        if(num <= 1) return false; // 1, 0 and negative numbers are not prime
        if(num == 2) return true; // 2 is prime
        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    private static int findNextPrime(int lastPrime){
        for(int i = lastPrime + 1; true; i++){
            if(isPrime(i)) return i;
        }
    }

    private static Set<Integer> getPrimeFactors(int num){
        if(num < 2)
            return Set.of();

        List<Integer> primeFactors = new ArrayList<>();

        var remaining = num;
        var currentPrime = 2;
        while(remaining != 1 && currentPrime <= remaining){
            if(remaining % currentPrime == 0){
                primeFactors.add(currentPrime);
                remaining = remaining / currentPrime;
                continue;
            }

            currentPrime = findNextPrime(currentPrime);
        }

        return new HashSet<>(primeFactors);
    }


    /**
     * Checks if the given number's only prime factors are 2, 3 and 5 (or if the number is 1).
     */
    public static boolean checkUglyNumber(int num){
        if(num == 1) return true;
        return Set.of(2, 3, 5).containsAll(getPrimeFactors(num));
    }
}
