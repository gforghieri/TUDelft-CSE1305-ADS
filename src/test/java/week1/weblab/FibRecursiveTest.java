package week1.weblab;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class FibRecursiveTest {

    @Test
    public void testExample() {
        assertEquals(5, FibRecursive.fibonacci(5));
    }

    @Test
    public void testBaseZero() {
        assertEquals(0, FibRecursive.fibonacci(0));
    }

    @Test
    public void testBaseOne() {
        assertEquals(1, FibRecursive.fibonacci(1));
    }

    @Test
    public void testSmall() {
        assertEquals(13, FibRecursive.fibonacci(7));
    }

    @Test
    public void testMedium() {
        assertEquals(55, FibRecursive.fibonacci(10));
    }

    @Test
    public void testLarge2() {
        assertEquals(267914296, FibRecursive.fibonacci(42));
    }

    @Test
    public void testTime() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 41, 42, 43, 44, 1000));
        for (int n : numbers) {
            runFibWithTime(n);
        }
    }

    public int runFibWithTime(int n) {
        long start = System.currentTimeMillis();
        int res = FibRecursive.fibonacci(n);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Elapsed time for %d: %d ms", n, end - start));
        return res;
    }
}