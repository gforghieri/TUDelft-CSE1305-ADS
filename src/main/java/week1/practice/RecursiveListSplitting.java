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
        int i = skillRatings.size() / 2;
        splitLists = splitListRecur(skillRatings, splitLists, splitVal, i);

        System.out.println(splitLists[0]);
        System.out.println(splitLists[1]);
    }

    public static List[] splitListRecur(List<Integer> skillRatings, List[] splitLists, int splitVal, int i) {
        if ((splitLists[0].size() + splitLists[1].size()) == skillRatings.size()) return splitLists;
        else if (skillRatings.get(i) > splitVal) {
            splitLists[1] = (skillRatings.subList(i, skillRatings.size()));
            return splitListRecur(skillRatings, splitLists, splitVal, i - 1);
        } else if (skillRatings.get(i) <= splitVal) {
            splitLists[0] = skillRatings.subList(0, i+1);
            return splitListRecur(skillRatings, splitLists, splitVal, i + 1);
        }
        return splitLists;
    }
}
