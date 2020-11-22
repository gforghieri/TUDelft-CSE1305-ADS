package week2.weblab;

import java.util.*;

class RemoveLastOccurrenceArrayList {
    /**
     * Removes all elements from the ArrayList, using the removeLastOccurrence method.
     *
     * @param list to remove the elements from.
     */
    public static void removeAll(ArrayList<Integer> list) {
        // if the ArrayList is empty
        if (list == null || list.size() == 0) {
            return;
        }
        int originalSize = list.size();

        // loop through the array and target the 0th element in the ArrayList to remove the last occurrence of
        for (int i = 0; i < originalSize ; i++) {
            removeLastOccurrence(list.get(0), list);
        }
    }

    /**
     * Takes an ArrayList and removes last occurrence of x,
     * shifting the rest of the elements left.
     * I.e. [5, 1, 5, 9, 8], with x = 5
     * would result in: [5, 1, 9, 8].
     * Note that this method does not return a new list.
     * Instead, the list that is passed as a parameter is changed.
     *
     * @param list to remove an element from.
     * @param x    element value to look for
     */
    public static void removeLastOccurrence(int x, ArrayList<Integer> list) {

        // if the ArrayList is empty
        if (list == null || list.size() == 0) {
            return;
        }

        int lastIndex = -1;

        // loop through the ArrayList find last_index of x
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                lastIndex = i;
            }
        }

        // if x was not part of the ArrayList return
        if (lastIndex == -1) return;

        // remove list[last_index]
        list.remove(lastIndex);
    }
}
