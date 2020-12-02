package week2.tutorials;

import java.util.*;

public class CardShuffle {

    /**
     * Shuffles a deck of cards. This is done by splitting the existing deck into two halves, L1 and L2.
     * The two halves will be merged back together by taking alternating elements from L1 and L2.
     * Where the order is as follows:
     * first element of L1, first element of L2, second element of L1, second element of L2, and so forth.
     *
     * @param deck
     * @return
     */
    public static List<Card> cardShuffle(List<Card> deck) {
        // if null or size == 0 return deck;
        if (deck == null || deck.size() == 0) return deck;

        int size = deck.size();

        // split deck into l1 and l2

        List<Card> l1 = new ArrayList<>();
        List<Card> l2 = new ArrayList<>();

        for (Card c : deck) {
            if (deck.indexOf(c) < (size + 1) / 2) l1.add(c);
            else l2.add(c);
        }

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        // loop through
        //merge back to deck 1 from l1, 1 from l2
        int j = 0;
        int k = 0;

        // boolean alternating = true;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                deck.set(i, l1.get(j));
                j++;
            } else {
                deck.set(i, l2.get(k));
                k++;
            }

        }
        return deck;
    }

}