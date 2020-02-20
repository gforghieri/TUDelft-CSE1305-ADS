package week1;

import static org.junit.Assert.*;

import org.junit.*;

public class MergeSortedArrayTest {

    @Test
    public void testSmall() {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {2, 3, 5, 6};
        int[] arr = MergeSortedArray.merge(arr1, arr2);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6}, arr);
    }
}

