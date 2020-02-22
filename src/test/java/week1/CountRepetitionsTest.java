package week1;

import static org.junit.Assert.*;

import org.junit.*;

public class CountRepetitionsTest {

    public void testExample() {
        int[] arr = {0, 1, 1, 3, 3, 3, 8, 10};
        int[] result = {1, 2, 0, 3, 0};
        assertArrayEquals(result, CountRepetitions.count(arr, 4));
    }
}
