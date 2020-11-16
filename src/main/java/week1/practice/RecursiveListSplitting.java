package week1.practice;

import javax.sound.sampled.Line;
import java.sql.Array;
import java.util.*;

public class RecursiveListSplitting {

    public static void main(String[] args) {
        List<Integer> skillRatings = new ArrayList<>(List.of(25, 67, 98, 76, 55, 12, 67, 88, 34, 72, 65, 63, 42));
        Collections.sort(skillRatings);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List[] splitLists = {a, b};
        int splitVal = 50;
        int low = 0;
        int high = skillRatings.size() - 1;
        splitLists = splitListRecur(skillRatings, splitLists, low, high, splitVal);

        System.out.println(splitLists[0]);
        System.out.println(splitLists[1]);
    }

    public static List[] splitListRecur(List<Integer> skillRatings, List[] splitLists, int low, int high, int splitVal) {
        if (low == high) {
            splitLists[0] = skillRatings.subList(0, low);
            splitLists[1] = skillRatings.subList(low, skillRatings.size());
            return splitLists;
        }
        int mid = (low + high) / 2;
        if (skillRatings.get(mid) < splitVal) {
            return splitListRecur(skillRatings, splitLists, mid+1, high,splitVal);
        } else if (skillRatings.get(mid)  >= splitVal) {
            return splitListRecur(skillRatings, splitLists, low, mid, splitVal);
        }
        return splitLists;
    }
}
