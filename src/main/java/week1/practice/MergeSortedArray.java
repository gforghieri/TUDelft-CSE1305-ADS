package week1.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.Arrays;

public class MergeSortedArray {

    /**
     * Merges two sorted arrays such that the resulting array has all elements
     * from both arrays and is also sorted. Assumes that the elements in the
     * given arrays are sorted in non-decreasing order. If there are duplicate
     * elements in the input arrays, these should also be present in the
     * resulting array. If both arrays are null the result should be null, or a
     * copy of the non-null array if only one is null.
     * <p>
     * Efficiency requirements: merge the two arrays in a single pass.
     *
     * @param arr1 first sorted array to be merged
     * @param arr2 second sorted array to be merged
     * @return sorted array containing all elements from both arrays
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return null;
        else if (arr1 == null) return Arrays.copyOf(arr2, arr2.length);
        else if (arr2 == null) return Arrays.copyOf(arr1, arr1.length);

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < merged.length; k++) {
            if (j >= arr2.length) merged[k] = arr1[i++];
            else if (i >= arr1.length) merged[k] = arr2[j++];
            else if (arr1[i] <= arr2[j]) merged[k] = arr1[i++];
            else if (arr2[j] < arr1[i]) merged[k] = arr2[j++];
        }
        return merged;
    }
}

