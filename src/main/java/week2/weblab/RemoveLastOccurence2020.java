package week2.weblab;

import java.util.Arrays;

public class RemoveLastOccurence2020 {

    /**
     * Takes the array and the last occurring element x,
     * shifting the rest of the elements left. I.e.
     * [1, 4, 7, 9], with x=7 would result in:
     * [1, 4, 9].
     *
     * @param x   the entry to remove from the array
     * @param arr to remove an entry from
     * @return the updated array, without the last occurrence of x
     */
    public static int[] removeLastOccurrence(int x, int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        int indexToRemove = -1;
        int i = arr.length - 1;
        while (i >= 0) {
            if (x == arr[i]) {
                indexToRemove = i;
                i--;
            }
            i--;
        }
        int[] res = null;
        if (indexToRemove == -1) {
            res = Arrays.copyOf(arr, arr.length);
        } else {
            res = new int[arr.length - 1];
            i = 0;
            for (int j = 0; j <= res.length; j++) {
                if (j != indexToRemove) {
                    res[i] = arr[j];
                    i++;
                }
            }
        }
        return res;
    }
}
