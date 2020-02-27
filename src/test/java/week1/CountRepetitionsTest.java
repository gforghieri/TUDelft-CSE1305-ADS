package week1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountRepetitionsTest {

    @Test
    public void testOrderedPositive() {
        int[] arr = {0, 1, 1, 3, 3, 3, 8, 10};
        int[] result = {1, 2, 0, 3, 0};
        assertArrayEquals(result, CountRepetitions.count(arr, 4));
    }

    @Test
    public void testNotOrderedPositive() {
        int[] arr = {0, 8, 1, 3, 1, 3, 10, 3};
        int[] result = {1, 2, 0, 3, 0};
        assertArrayEquals(result, CountRepetitions.count(arr, 4));
    }

    @Test
    public void testExampleNull() {
        int[] arr = null;
        int[] result = null;
        assertArrayEquals(result, CountRepetitions.count(arr, -3));
    }

    @Test
    public void testExampleLength0() {
        int[] arr = {};
        int[] result = null;
        assertArrayEquals(result, CountRepetitions.count(arr, 4));
    }

    @Test
    public void testNegativeOrdered() {
        int[] arr = {-2, -1, 0, 1, 1, 3, 3, 10};
        int[] result = {1, 2, 0, 2, 0};
        assertArrayEquals(result, CountRepetitions.count(arr, 4));
    }

    @Test
    public void testNegativeNotOrdered() {
        int[] arr = {-2, -1, 0, 1, 1, 3, 3, 10};
        int[] result = {1, 2, 0, 2, 0};
        assertArrayEquals(result, CountRepetitions.count(arr, 4));
    }

    @Test
    public void testXequalR() {
        int[] arr = {2};
        int[] result = {0, 0, 1};
        assertArrayEquals(result, CountRepetitions.count(arr, 2));
    }




}
