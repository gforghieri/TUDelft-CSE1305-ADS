package week1;

import java.lang.reflect.Array;
import java.util.*;

class MergeSortedArray {

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

        // Exceptional cases.

        // if both arrays are null, the result should be null as well.
        if (arr1 == null && arr2 == null) {
            return null;
        }

        // If either one of the arrays are null, return the non-null array as a copy
        else if (arr2 == null) {
            int[] arrCopy = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arrCopy[i] = arr1[i];
            }
            return arrCopy;
        }
        // If either one of the arrays are null, return the non-null array as a copy
        else if (arr1 == null) {
            int[] arrCopy = new int[arr2.length];
            for (int i = 0; i < arr2.length; i++) {
                arrCopy[i] = arr2[i];
            }
            return arrCopy;
        }

        // Normal case
        int[] mergedArray = new int[arr1.length + arr2.length];

        int newPositionCounter = 0;
        int oldPositionCounter = 0;

        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            oldPositionCounter = i;
            mergedArray[newPositionCounter] = Math.min(arr1[i], arr2[i]);
            newPositionCounter++;
            mergedArray[newPositionCounter] = Math.max(arr1[i], arr2[i]);
            newPositionCounter++;
        }
        oldPositionCounter++;

        for (int i = oldPositionCounter; i < newPositionCounter; i++) {
            if (Math.max(arr1.length, arr2.length) == arr1.length) {
                mergedArray[newPositionCounter] = arr1[oldPositionCounter];
            } else {
                mergedArray[newPositionCounter] = arr2[oldPositionCounter];
            }
        }
        return mergedArray;
    }
}

