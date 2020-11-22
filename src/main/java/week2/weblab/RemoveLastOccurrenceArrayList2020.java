package week2.weblab;

import java.util.*;

public class RemoveLastOccurrenceArrayList2020 {
    /**
     * Removes all elements from the ArrayList, using the removeLastOccurrence method.
     *
     * @param list to remove the elements from.
     */
    public static void removeAll(ArrayList<Integer> list) {
        // for each element in the arraylist remove the last occurence
        if (list == null || list.size() == 0) return;
        else {
            while (list.size() != 0) {
                removeLastOccurrence(list.get(0), list);
            }
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
        // check from the back
        // if we have found X, the index of X is the lastIndex
        // remove last index
        if (list == null || list.size() == 0 || x == 0) return;
        int lastIndexOfX = list.lastIndexOf(x);
        if (lastIndexOfX == -1) return;
        else list.remove(lastIndexOfX);
    }
}

