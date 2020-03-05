package week2;

class RemoveLastOccurrenceArray {
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

        // if arr == null return null;
        if (arr == null || arr.length == 0) return arr;

        // return a new array which will be size arr.legnth-1
        int[] res = new int[arr.length - 1];

        // introduce an int tracker which keep tracks of the index of the last occurence of x
        int last_index = -1;

        // traverse through the array to get the index of the last occurrence
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) last_index = i;

        if (last_index == -1) return arr;

        int i = 0, j = 0;
        // copying elements of array from the old one to the new one except last_index
        while (i < arr.length) {
            if (i == last_index) {
                if (i++ < res.length) {
                    res[j++] = arr[i++];
                }
            } else res[j++] = arr[i++];
        }
        return res;
    }
}