package net.santoshganti.InterviewPrepProblems.amazon;

import java.util.HashSet;
import java.util.Set;

public class TwoSumUniquePairs {
    public static int uniquePairs(int[] nums, int target) {

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> seen = new HashSet<Integer>();

        int count = 0;

        for (int num : nums) {
            if (set.contains(target - num) && !seen.contains(num)) {
                count++;
                seen.add(target - num);
                seen.add(num);
            } else set.add(num);

        }

        return count;
    }
}