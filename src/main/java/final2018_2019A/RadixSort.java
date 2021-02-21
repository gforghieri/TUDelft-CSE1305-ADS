package final2018_2019A;

import java.util.*;

public class RadixSort {

    /**
     * Sorts a list of words using MSD radix sort.
     *
     * @param words The list of words to sort.
     * @return The sorted list of words.
     * @throws NullPointerException If `words` equals `null`.
     */
    static List<String> radixSortMSD(List<String> words) {
        if (words == null) throw new NullPointerException();
        // recursive sub-routine bucketsort
        return bucketSort(words, 0);

    }

    private static List<String> bucketSort(List<String> words, int pos) {
        if (words.size() < 2) {
            return words;
        }

        // extra data structure an array or arraylist
        List<List<String>> buckets = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            // create new array at each index where there more than 1 element starting with same char
            buckets.add(new ArrayList<>());
        }

        List<String> res = new ArrayList<>(words.size());
        for (String word : words) {
            if (pos < word.length()) {
                // based on assigned integer value to each char from alphabet
                // put it in the correct positions e.g. letter 'a' to 0
                int bucketIndex = word.charAt(pos) - 'a';
                buckets.get(bucketIndex).add(word);
            } else {
                // if the word does not have more letters add it
                res.add(word);
            }
        }
        for (List<String> bucket : buckets) {
            // 2nd looping or recursive and after only update within the array where more than 1 element started with the same char
            res.addAll(bucketSort(bucket, pos + 1));
        }
        return res;
    }
}
