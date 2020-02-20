package week1;

public class ReverseArray {
    /**
     * Reverses the order of the elements of the given array.
     *
     * @param arr the array to reverse
     */
    public static void reverse(int[] arr) {
        if (arr == null) {
            return;
        }
        // reverse an array in-place
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (1 + i)];
            arr[arr.length - (1 + i)] = temp;
        }
    }
}
