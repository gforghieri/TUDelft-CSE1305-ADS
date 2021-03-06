package week1.weblab;

import java.util.Arrays;

public class CountRepetitions {

    /**
     * Calculates the number of occurrences of integers from the range
     * {0, ..., r} within a given array of integer elements. Returns
     * the array of counts: a new array of integers of size r + 1, where the
     * element at index i denotes the number occurrences of elements equal
     * to i in the given input array (with i in {0, ..., r}).
     * If the input array is null or of length 0, this will return null.
     *
     * @param arr the array of integer elements to be counted.
     * @param r   the integer indicating the last element of the range.
     * @return a new array containing the number of occurrences of each
     * integer {0, ..., r} in the input array (index i has the
     * count of elements equal to i in the input array, with i
     * in {0, ..., r})
     */
    public static int[] count(int[] arr, int r) {
        // 1. If the input array is null or of length 0, this will return null.
        if (arr == null || arr.length == 0) return null;

        // Initialze result array to r+1 because arrays are 0 indexed, so it needs one more than 1...r range
        int[] result = new int[r + 1];

        // loop through the array
        for (int x : arr)
            // 2. we filter out negative numbers and 3. include scenarios when x = r
            if (x >= 0 && x <= r) result[x]++;
        return result;
    }
}