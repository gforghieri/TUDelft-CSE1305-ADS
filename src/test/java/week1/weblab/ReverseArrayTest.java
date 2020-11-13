package week1.weblab;

import org.junit.Test;
import week1.weblab.ReverseArray;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArrayTest {


    @Test
    public void nullTest() {
        int[] arr = null;
        ReverseArray.reverse(arr);
        assertArrayEquals(null, arr);
    }

    @Test
    public void testExample() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ReverseArray.reverse(arr);
        int[] result = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(result, arr);
    }
}
