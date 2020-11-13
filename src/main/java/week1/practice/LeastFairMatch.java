package week1.practice;

import java.util.Arrays;

public class LeastFairMatch {

    public static void main(String[] args) {
        System.out.print("Hello World!");
        int[] skillRatings = {25, 67, 98, 76, 55, 12, 67, 88, 34, 72, 65, 63, 42};
        int leastFairMatchScoreDifference = calculateSkillRatingDiff(skillRatings);
        System.out.print("The SR difference of the least fair match is: " + leastFairMatchScoreDifference);
    }

    /**
     * Return the single biggest absolute difference between integers found in the array.
     *
     * @param skillRatings the array of skillrating integers.
     */
    public static int calculateSkillRatingDiff(int[] skillRatings) {
        Arrays.sort(skillRatings);
        return Math.abs(skillRatings[skillRatings.length - 1] - skillRatings[0]);
    }

}
