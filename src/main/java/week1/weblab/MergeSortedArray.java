package week1.weblab;

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
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] arr3 = new int[arr1Length + arr2Length];
        int i = 0, j = 0, k = 0;

        // looping until we reach the end of the smaller array
        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        // populate the new array with the remaining elements of the bigger array
        while (i < arr1Length) // until we have not reached the end of the first array
            arr3[k++] = arr1[i++];
        while (j < arr2Length) // until we have not reached the end of the second array
            arr3[k++] = arr2[j++];
        return arr3;
    }
}