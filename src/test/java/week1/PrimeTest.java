package week1;

import static org.junit.Assert.*;
import org.junit.*;
import week1.Prime;


public class PrimeTest {
    @Test
    public void checkPrime1() {
        boolean res = Prime.isPrime(0);
        assertEquals(res, false);
    }

    @Test
    public void checkTotalPNumbers1() {
        int res = Prime.numPrimes(10);
        assertEquals(4, res);
    }
}
