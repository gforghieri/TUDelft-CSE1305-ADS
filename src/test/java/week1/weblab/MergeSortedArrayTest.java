package week1.weblab;

import static org.junit.Assert.*;

import org.junit.*;
import week1.MergeSortedArray;

public class MergeSortedArrayTest {

    @Test
    public void testSmall() {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {2, 3, 5, 6};
        int[] arr = MergeSortedArray.merge(arr1, arr2);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void testBig() {
        int[] arr1 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20};
        int[] arr2 = {2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20};
        int[] arr = MergeSortedArray.merge(arr1, arr2);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 18, 18, 19, 19, 20, 20}, arr);
    }

    // Exceptional cases.

    // if both arrays are null, the result should be null as well.
    @Test
    public void testBothNull() {
        int[] arr1 = null;
        int[] arr2 = null;
        int[] arr = MergeSortedArray.merge(arr1, arr2);
        assertArrayEquals(null, arr);
    }

    @Test
    public void testFirstNull() {
        int[] arr1 = null;
        int[] arr2 = {2, 3, 5, 6};
        int[] arr3 = {2, 3, 5, 6};
        int[] arr = MergeSortedArray.merge(arr1, arr2);
        assertArrayEquals(arr3, arr);
    }

    @Test
    public void testSecondNull() {
        int[] arr1 = {2, 3, 5, 6};
        int[] arr2 = null;
        int[] arr3 = {2, 3, 5, 6};
        int[] arr = MergeSortedArray.merge(arr1, arr2);
        assertArrayEquals(arr3, arr);
    }
}

