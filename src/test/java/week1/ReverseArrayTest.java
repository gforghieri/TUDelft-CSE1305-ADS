package week1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArrayTest {

    @Test
    public void testExample() {
        int[] arr = { 1, 2, 3, 4, 5 };
        ReverseArray.reverse(arr);
        int[] result = { 5, 4, 3, 2, 1 };
        assertArrayEquals(result, arr);
    }
}
