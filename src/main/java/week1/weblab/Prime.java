package week1.weblab;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Prime {

    /**
     * Checks whether the given integer value is a prime number.
     *
     * @param n integer value to be checked if it is a prime number or not
     * @return returns true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // a prime number can only be divided by 1 and itself has to be integer larger than 1

        if (n <= 1) { // 1 and smaller numbers are not prime
            return false;
        } else if (n == 2) { // 2 is prime
            return true;
        } else if (n % 2 == 0) { // all even numbers besides 2 are not prime
            return false;
        }
        int divisor = 3;

        for (int i = 0; i < 100; i++) {
            if (divisor * divisor > n) { // if the squared odd divisor is greater than n and n not divisible by
                // the previous divisor it must be prime
                return true;
            } else if (n % divisor == 0) { // if n is divisible by a divisor which is not itself and 1 at this point
                return false;
            }
            divisor += 2;
        }
        return false;
    }

    /**
     * Counts and returns the number of prime numbers that are less or equal
     * than the given integer value.
     *
     * @param n integer value defining an upper bound on the set of prime number to count
     * @return returns the number of prime numbers that are less or equal than n
     */
    public static int numPrimes(int n) {
        int counter = 0;
        if (n <= 1) {
            return counter;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        return counter;
    }
}