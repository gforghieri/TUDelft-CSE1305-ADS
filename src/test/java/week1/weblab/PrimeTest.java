package week1.weblab;

import static org.junit.Assert.*;
import org.junit.*;
import week1.weblab.Prime;


public class PrimeTest {
    @Test
    public void isPrimeTestLessThanOne1() {
        boolean res = Prime.isPrime(0);
        assertEquals(res, false);
    }

    @Test
    public void isPrimeTestLessThanOne2() {
        boolean res = Prime.isPrime(-1);
        assertEquals(res, false);
    }

    @Test
    public void isPrimeTestOne() {
        boolean res = Prime.isPrime(1);
        assertEquals(res, false);
    }

    @Test
    public void isPrimeTestTwo() {
        boolean res = Prime.isPrime(2);
        assertEquals(res, true);
    }

    @Test
    public void isPrimeTestEvent() {
        boolean res = Prime.isPrime(4);
        assertEquals(res, false);
    }

    @Test
    public void isPrimeTestRandomODD() {
        boolean res = Prime.isPrime(15);
        assertEquals(res, false);
    }

    @Test
    public void isPrimeTestSeven() {
        boolean res = Prime.isPrime(7);
        assertEquals(res, true);
    }

    @Test
    public void isPrimeTestThree() {
        boolean res = Prime.isPrime(3);
        assertEquals(res, true);
    }

    @Test
    public void isPrimeTestFive() {
        boolean res = Prime.isPrime(5);
        assertEquals(res, true);
    }

    @Test
    public void isPrimeTestEleven() {
        boolean res = Prime.isPrime(11);
        assertEquals(res, true);
    }

    @Test
    public void isPrimeTest97() {
        boolean res = Prime.isPrime(97);
        assertEquals(res, true);
    }

    @Test
    public void isPrimeTest9797() {
        boolean res = Prime.isPrime(9797);
        assertEquals(res, false);
    }


    @Test
    public void checkTotalPNumbers1() {
        int res = Prime.numPrimes(10);
        assertEquals(4, res);
    }

    @Test
    public void checkTotalPNumbersLessThanEqualtoOne() {
        int res = Prime.numPrimes(-1);
        assertEquals(0, res);
    }

    @Test
    public void checkTotalPNumbersRandomNumber() {
        int res = Prime.numPrimes(11);
        assertEquals(5, res);
    }

}
