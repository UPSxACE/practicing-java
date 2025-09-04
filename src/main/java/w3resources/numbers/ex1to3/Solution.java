package w3resources.numbers.ex1to3;

import java.util.*;

public class Solution {
    private static boolean isPrime(int num) {
        if (num <= 1) return false; // 1, 0 and negative numbers are not prime
        if (num == 2) return true; // 2 is prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private static int findNextPrime(int lastPrime) {
        for (int i = lastPrime + 1; true; i++) {
            if (isPrime(i)) return i;
        }
    }

    private static Set<Integer> getPrimeFactors(int num) {
        if (num < 2)
            return Set.of();

        List<Integer> primeFactors = new ArrayList<>();

        var remaining = num;
        var currentPrime = 2;
        while (remaining != 1 && currentPrime <= remaining) {
            if (remaining % currentPrime == 0) {
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
    public static boolean checkUglyNumber(int num) {
        if (num == 1) return true;
        return Set.of(2, 3, 5).containsAll(getPrimeFactors(num));
    }

    /**
     * Counts the number of deficient, abundant, and perfect numbers from 1 up to and including the given ceil.<br><br>
     * Returns an array of three integers:<br>
     * - The first element is the count of abundant numbers<br>
     * - The second element is the count of deficient numbers<br>
     * - The third element is the count of perfect numbers<br>
     */
    public static int[] categorizeNumbers(int ceil) {
        // an abundant number is a number for which the sum of its proper divisors is greater than the number itself
        // a deficient number is a positive integer where the sum of its proper divisors is less than the number itself
        // a perfect number is a positive integer that is equal to the sum of its proper positive divisors
        int abundantNums = 0, deficientNums = 0, perfectNums = 0;

        for (int i = 1; i <= ceil; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }

            if (sum > i) abundantNums++;
            else if (sum < i) deficientNums++;
            else perfectNums++;
        }

        return new int[]{abundantNums, deficientNums, perfectNums};
    }

    /**
     * Generates a random integer between given start (inclusive) and given stop (exclusive).
     */
    public static int generateRandomIntegerInRange(int start, int stop){
        var rand = new Random();
        var rangeSize = stop - start;
        return rand.nextInt(rangeSize) + start;
    }
}
